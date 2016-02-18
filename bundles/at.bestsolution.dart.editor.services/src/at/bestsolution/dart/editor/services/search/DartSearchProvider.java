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
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.CodeReference;
import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.services.SearchProvider;
import org.eclipse.fx.code.editor.services.URIProvider;
import org.eclipse.fx.core.event.EventBus;
import org.eclipse.fx.core.log.Log;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

import at.bestsolution.dart.editor.services.doc.DartInput;
import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.Registration;
import at.bestsolution.dart.server.api.model.SearchFindElementReferencesResult;
import at.bestsolution.dart.server.api.model.SearchId;
import at.bestsolution.dart.server.api.model.SearchResult;
import at.bestsolution.dart.server.api.model.SearchResultsNotification;
import at.bestsolution.dart.server.api.services.ServiceSearch;

public class DartSearchProvider implements SearchProvider {

	private Input<?> fInput;
	private IDocument fDocument;
	private DartServer fServer;
	private ServiceSearch fSearchService;
	private Logger fLogger;

	private Registration fSearchServiceResultsRegistration;

	private Map<SearchId, CompletableFuture> awaitingResult = Collections.synchronizedMap(new HashMap<>());
	private Map<SearchId, List<SearchResult>> intermediateResult = Collections.synchronizedMap(new HashMap<>());

	@Inject
	private EventBus eventBus;

	@Inject
	public DartSearchProvider(IDocument document, DartServer server, @Log Logger logger) {
		this.fLogger = logger;
		this.fLogger.debug("Creating proposal computer");
		this.fServer = server;
		this.fSearchService = server.getService(ServiceSearch.class);

		fSearchServiceResultsRegistration = this.fSearchService.results(this::handleResults);
	}

	private CodeReference mapTo(SearchResult r) {

		Path path = Paths.get(r.getLocation().getFile());
		Input input = new DartInput(fServer, eventBus, path);

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

	private synchronized void handleResults(SearchResultsNotification notification) {
		SearchId id = notification.getId();

		// save result
		List<SearchResult> all = intermediateResult.get(id);
		if (all == null) {
			all = new ArrayList<SearchResult>();
			intermediateResult.put(notification.getId(), all);
		}

		all.addAll(notification.getResults());

		if (notification.getIsLast()) {
			// last notification -> complete future
			CompletableFuture<Object> f = awaitingResult.get(id);
			if (f != null) {
				System.err.println("done:");
				for (SearchResult s : notification.getResults()) {
					System.err.println(" * " + s);
				}
				f.complete(all.stream().map(this::mapTo).collect(Collectors.toList()));
				awaitingResult.remove(id);
				intermediateResult.remove(id);
			}
		}


		System.err.println("got search result isLast: " + notification.getIsLast());
		for (SearchResult s : notification.getResults()) {
			System.err.println(" * " + s);
		}
	}

	@Override
	public Future<CodeReference> findDeclaration(int offset) {
		fLogger.info("DART findDeclaration - not implemented");
		return null;
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
		Path file = Paths.get(java.net.URI.create(p.getURI().toString())).toAbsolutePath();

		SearchFindElementReferencesResult result = this.fSearchService.findElementReferences(file.toString(), offset, false);

		CompletableFuture<List<CodeReference>> future = new CompletableFuture<List<CodeReference>>();
		awaitingResult.put(result.getId(), (CompletableFuture) future);

		return future;
	}

}
