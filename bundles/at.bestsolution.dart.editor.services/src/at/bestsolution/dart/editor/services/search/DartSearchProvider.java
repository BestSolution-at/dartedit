package at.bestsolution.dart.editor.services.search;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.CodeReference;
import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.LocalSourceFileInput;
import org.eclipse.fx.code.editor.SourceFileInput;
import org.eclipse.fx.code.editor.services.SearchProvider;
import org.eclipse.fx.code.editor.services.URIProvider;
import org.eclipse.fx.core.event.EventBus;
import org.eclipse.fx.core.log.Log;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.Registration;
import at.bestsolution.dart.server.api.model.SearchFindElementReferencesResult;
import at.bestsolution.dart.server.api.model.SearchFindTopLevelDeclarationsResult;
import at.bestsolution.dart.server.api.model.SearchId;
import at.bestsolution.dart.server.api.model.SearchResult;
import at.bestsolution.dart.server.api.model.SearchResultsNotification;
import at.bestsolution.dart.server.api.services.ServiceSearch;

public class DartSearchProvider implements SearchProvider {

	private Input<?> fInput;
	private final IDocument fDocument;
	private DartServer fServer;
	private ServiceSearch fSearchService;
	private Logger fLogger;

	private Registration fSearchServiceResultsRegistration;

	private Map<String, CompletableFuture> awaitingResult = Collections.synchronizedMap(new HashMap<>());
	private Map<String, List<SearchResult>> intermediateResult = Collections.synchronizedMap(new HashMap<>());

	@Inject
	private EventBus eventBus;

	@Inject
	public DartSearchProvider(IDocument document, DartServer server, Input<?> input, @Log Logger logger) {
		this.fLogger = logger;
		this.fLogger.debug("Creating proposal computer");
		this.fServer = server;
		this.fSearchService = server.getService(ServiceSearch.class);
		this.fDocument = document;
		this.fInput = input;
		fSearchServiceResultsRegistration = this.fSearchService.results(this::handleResults);
	}

	private CodeReference mapTo(SearchResult r) {

		Path path = Paths.get(r.getLocation().getFile());

		// TODO update to inputless api
//		Input input = new DartInput(fServer, eventBus, path);

//		((SourceFileInput)input).getURI().endsWith(".dart");

		IRegion region = new IRegion() {

			@Override
			public int getOffset() {
				return r.getLocation().getOffset();
			}

			@Override
			public int getLength() {
				return r.getLocation().getLength();
			}
		};

		Input<?> input = new LocalSourceFileInput(path, null);

		return new CodeReference() {

			@Override
			public IRegion getRegion() {
				return region;
			}

			@Override
			public Input<?> getInput() {
				return input;
			}
		};
	}

	private void handleResults(SearchResultsNotification notification) {
		String id = notification.getId();
		System.err.println("id to finish: " + id);
		// save result
		List<SearchResult> all = intermediateResult.get(id);
		if (all == null) {
			all = new ArrayList<SearchResult>();
			intermediateResult.put(notification.getId(), all);
		}

		all.addAll(notification.getResults());

		if (notification.getIsLast()) {
			synchronized (awaitingResult) {
				// last notification -> complete future
				CompletableFuture<Object> f = this.awaitingResult.get(id);
				if (f != null) {
					System.err.println("done:");
					for (SearchResult s : notification.getResults()) {
						System.err.println(" * " + s);
					}
					f.complete(all.stream().map(this::mapTo).collect(Collectors.toList()));
					awaitingResult.remove(id);
					intermediateResult.remove(id);
				}
				else {
					System.err.println("got no future - this will deadlock -.-");
				}
			}
		}


		System.err.println("got search result isLast: " + notification.getIsLast());
		for (SearchResult s : notification.getResults()) {
			System.err.println(" * " + s);
		}
	}

	private String findStringAtOffset(int offset) {
		if (offset >= 0 && offset < fDocument.getLength()) {
			try {
				String result = "" + fDocument.getChar(offset);

				String validChars = "[a-zA-Z0-9]+";

				int next = offset + 1;
				String nextChar = "" + fDocument.getChar(next);
				while (nextChar.matches(validChars) && next + 1 < fDocument.getLength()) {
					result += nextChar;
					next += 1;
					nextChar = "" + fDocument.getChar(next);
				}

				int prev = offset - 1;
				String prevChar = "" + fDocument.getChar(prev);
				while (prevChar.matches(validChars) && prev - 1 > 0) {
					result = prevChar + result;
					prev -= 1;
					prevChar = "" + fDocument.getChar(prev);
				}

				return result;
			}
			catch (BadLocationException e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}

	@Override
	public Future<CodeReference> findDeclaration(int offset) {

		fLogger.info("DART findDeclaration");
		String pattern = findStringAtOffset(offset);

		CompletableFuture<List<CodeReference>> future = new CompletableFuture<List<CodeReference>>();
		synchronized (awaitingResult) {
			SearchFindTopLevelDeclarationsResult result = fSearchService.findTopLevelDeclarations(pattern);
			awaitingResult.put(result.getId(), (CompletableFuture) future);
			System.err.println("id to wait: " + result.getId());
		}
		return future.<CodeReference>thenApply(x->x.isEmpty()?null:x.get(0));
	}

	@Override
	public Future<List<CodeReference>> findImplementations(int offset) {
		fLogger.info("DART findImplementations - not implemented");

		return null;
	}

	@Override
	public Future<List<CodeReference>> findReferences(int offset) {
		fLogger.debug("DART findReferences");

		URIProvider p = (URIProvider) fInput;
		System.err.println("p = " + p);
		Path file = Paths.get(java.net.URI.create(p.getURI().toString())).toAbsolutePath();

		CompletableFuture<List<CodeReference>> future = new CompletableFuture<List<CodeReference>>();

		synchronized (awaitingResult) {
			System.err.println("calling findElementReferences " + file.toString() + " " + offset + " false");
			SearchFindElementReferencesResult result = this.fSearchService.findElementReferences(file.toString(), offset, false);
			if (result.getElement() == null) {
				future.complete(Collections.emptyList());
				return future;
			}
			awaitingResult.put(result.getId(), (CompletableFuture) future);
		}

		return future;
	}

}
