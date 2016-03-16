package at.bestsolution.dart.editor.services.navigation;

import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.services.NavigationProvider;
import org.eclipse.fx.code.editor.services.URIProvider;
import org.eclipse.fx.core.event.EventBus;
import org.eclipse.fx.core.log.Log;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.text.navigation.NavigationRegion;
import org.eclipse.fx.text.navigation.NavigationTarget;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.Registration;
import at.bestsolution.dart.server.api.model.AnalysisGetNavigationResult;
import at.bestsolution.dart.server.api.model.SearchResult;
import at.bestsolution.dart.server.api.services.ServiceAnalysis;

public class DartNavigationProvider implements NavigationProvider {

	private Input<?> fInput;
	private final IDocument fDocument;
	private DartServer fServer;
	private ServiceAnalysis fAnalysisService;
	private Logger fLogger;

	private Registration fSearchServiceResultsRegistration;

	private Map<String, CompletableFuture> awaitingResult = Collections.synchronizedMap(new HashMap<>());
	private Map<String, List<SearchResult>> intermediateResult = Collections.synchronizedMap(new HashMap<>());

	@Inject
	private EventBus eventBus;

	@Inject
	public DartNavigationProvider(IDocument document, DartServer server, Input<?> input, @Log Logger logger) {
		this.fLogger = logger;
		this.fLogger.debug("Creating proposal computer");
		this.fServer = server;
		this.fAnalysisService = server.getService(ServiceAnalysis.class);
		this.fDocument = document;
		this.fInput = input;
	}

	private Path getInputPath() {
		URIProvider p = (URIProvider) fInput;
		return Paths.get(java.net.URI.create(p.getURI().toString())).toAbsolutePath();
	}

	private NavigationRegion convertRegion(AnalysisGetNavigationResult dartResult, at.bestsolution.dart.server.api.model.NavigationRegion dartRegion) {
		return new NavigationRegion() {
			@Override
			public IRegion getRegion() {
				return new Region(dartRegion.getOffset(), dartRegion.getLength());
			}

			@Override
			public List<NavigationTarget> getTargets() {
				return Arrays.stream(dartRegion.getTargets()).mapToObj(i->dartResult.getTargets()[i]).map(r->convertTarget(dartResult, r)).collect(Collectors.toList());
			}

		};
	}

	private NavigationTarget convertTarget(AnalysisGetNavigationResult dartResult, at.bestsolution.dart.server.api.model.NavigationTarget dartTarget) {
		return new NavigationTarget() {
			@Override
			public IRegion getRegion() {
				return new Region(dartTarget.getOffset(), dartTarget.getLength());
			}
			@Override
			public String getFile() {
				try {
					return Paths.get(dartResult.getFiles()[dartTarget.getFileIndex()]).toUri().toURL().toExternalForm();
				}
				catch (MalformedURLException e) {
					throw new RuntimeException(e);
				}
			}
		};
	}



	@Override
	public Future<List<NavigationRegion>> getNavigationRegions() {
		return CompletableFuture.supplyAsync(()-> {
			AnalysisGetNavigationResult dartResult = this.fAnalysisService.getNavigation(getInputPath().toString(), 0, this.fDocument.getLength());
			List<NavigationRegion> regions = Arrays.stream(dartResult.getRegions()).map(dartRegion->convertRegion(dartResult, dartRegion)).collect(Collectors.toList());
			return regions;
		});
	}
}
