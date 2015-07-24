package at.bestsolution.dart.server.api.internal.local;

import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.util.concurrent.ExecutionException;
import at.bestsolution.dart.server.api.RequestErrorException;
import java.util.List;
import java.util.ArrayList;
import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public class LocalAnalysisService implements at.bestsolution.dart.server.api.services.ServiceAnalysis {

	private final LocalDartServer server;
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisErrorsNotification>> errorsConsumerList = new ArrayList<>();
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisFlushResultsNotification>> flushResultsConsumerList = new ArrayList<>();
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisFoldingNotification>> foldingConsumerList = new ArrayList<>();
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisHighlightsNotification>> highlightsConsumerList = new ArrayList<>();
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisInvalidateNotification>> invalidateConsumerList = new ArrayList<>();
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisNavigationNotification>> navigationConsumerList = new ArrayList<>();
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOccurrencesNotification>> occurrencesConsumerList = new ArrayList<>();
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOutlineNotification>> outlineConsumerList = new ArrayList<>();
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOverridesNotification>> overridesConsumerList = new ArrayList<>();

	public LocalAnalysisService(LocalDartServer server) {
		this.server = server;
	}

	public void dispatchEvent(JsonObject root) {
		switch(root.get("event").getAsString()) {
			case "analysis.errors": {
				at.bestsolution.dart.server.api.model.AnalysisErrorsNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.AnalysisErrorsNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisErrorsNotification>> l;
				synchronized(errorsConsumerList) {
					l = new ArrayList<>(errorsConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
			case "analysis.flushResults": {
				at.bestsolution.dart.server.api.model.AnalysisFlushResultsNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.AnalysisFlushResultsNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisFlushResultsNotification>> l;
				synchronized(flushResultsConsumerList) {
					l = new ArrayList<>(flushResultsConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
			case "analysis.folding": {
				at.bestsolution.dart.server.api.model.AnalysisFoldingNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.AnalysisFoldingNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisFoldingNotification>> l;
				synchronized(foldingConsumerList) {
					l = new ArrayList<>(foldingConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
			case "analysis.highlights": {
				at.bestsolution.dart.server.api.model.AnalysisHighlightsNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.AnalysisHighlightsNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisHighlightsNotification>> l;
				synchronized(highlightsConsumerList) {
					l = new ArrayList<>(highlightsConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
			case "analysis.invalidate": {
				at.bestsolution.dart.server.api.model.AnalysisInvalidateNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.AnalysisInvalidateNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisInvalidateNotification>> l;
				synchronized(invalidateConsumerList) {
					l = new ArrayList<>(invalidateConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
			case "analysis.navigation": {
				at.bestsolution.dart.server.api.model.AnalysisNavigationNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.AnalysisNavigationNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisNavigationNotification>> l;
				synchronized(navigationConsumerList) {
					l = new ArrayList<>(navigationConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
			case "analysis.occurrences": {
				at.bestsolution.dart.server.api.model.AnalysisOccurrencesNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.AnalysisOccurrencesNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOccurrencesNotification>> l;
				synchronized(occurrencesConsumerList) {
					l = new ArrayList<>(occurrencesConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
			case "analysis.outline": {
				at.bestsolution.dart.server.api.model.AnalysisOutlineNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.AnalysisOutlineNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOutlineNotification>> l;
				synchronized(outlineConsumerList) {
					l = new ArrayList<>(outlineConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
			case "analysis.overrides": {
				at.bestsolution.dart.server.api.model.AnalysisOverridesNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.AnalysisOverridesNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOverridesNotification>> l;
				synchronized(overridesConsumerList) {
					l = new ArrayList<>(overridesConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
		}
	}

	// Requests
	public at.bestsolution.dart.server.api.model.AnalysisGetErrorsResult getErrors(java.lang.String file) {
		try {
			JsonObject o = server.sendRequest( "analysis.getErrors", new AnalysisGetErrorsRequest(file)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.AnalysisGetErrorsResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.AnalysisGetHoverResult getHover(java.lang.String file,int offset) {
		try {
			JsonObject o = server.sendRequest( "analysis.getHover", new AnalysisGetHoverRequest(file, offset)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.AnalysisGetHoverResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.AnalysisGetLibraryDependenciesResult getLibraryDependencies() {
		try {
			JsonObject o = server.sendRequest( "analysis.getLibraryDependencies", null).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.AnalysisGetLibraryDependenciesResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.AnalysisGetNavigationResult getNavigation(java.lang.String file,int offset,int length) {
		try {
			JsonObject o = server.sendRequest( "analysis.getNavigation", new AnalysisGetNavigationRequest(file, offset, length)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.AnalysisGetNavigationResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void reanalyze(java.lang.String[] roots) {
		try {
			JsonObject o = server.sendRequest( "analysis.reanalyze", new AnalysisReanalyzeRequest(roots)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void setAnalysisRoots(java.lang.String[] included,java.lang.String[] excluded,Map<java.lang.String,java.lang.String> packageRoots) {
		try {
			JsonObject o = server.sendRequest( "analysis.setAnalysisRoots", new AnalysisSetAnalysisRootsRequest(included, excluded, packageRoots)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void setPriorityFiles(java.lang.String[] files) {
		try {
			JsonObject o = server.sendRequest( "analysis.setPriorityFiles", new AnalysisSetPriorityFilesRequest(files)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void setSubscriptions(Map<AnalysisService,java.lang.String[]> subscriptions) {
		try {
			JsonObject o = server.sendRequest( "analysis.setSubscriptions", new AnalysisSetSubscriptionsRequest(subscriptions)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void updateContent(Map<java.lang.String,Overlay> files) {
		try {
			JsonObject o = server.sendRequest( "analysis.updateContent", new AnalysisUpdateContentRequest(files)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void updateOptions(AnalysisOptions options) {
		try {
			JsonObject o = server.sendRequest( "analysis.updateOptions", new AnalysisUpdateOptionsRequest(options)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}

	// Notifications
	public at.bestsolution.dart.server.api.Registration errors( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisErrorsNotification> consumer) {
		synchronized(errorsConsumerList) {
			errorsConsumerList.add(consumer);
		}
		return () -> {
			synchronized(errorsConsumerList) {
				errorsConsumerList.remove(consumer);
			}
		};
	}
	public at.bestsolution.dart.server.api.Registration flushResults( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisFlushResultsNotification> consumer) {
		synchronized(flushResultsConsumerList) {
			flushResultsConsumerList.add(consumer);
		}
		return () -> {
			synchronized(flushResultsConsumerList) {
				flushResultsConsumerList.remove(consumer);
			}
		};
	}
	public at.bestsolution.dart.server.api.Registration folding( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisFoldingNotification> consumer) {
		synchronized(foldingConsumerList) {
			foldingConsumerList.add(consumer);
		}
		return () -> {
			synchronized(foldingConsumerList) {
				foldingConsumerList.remove(consumer);
			}
		};
	}
	public at.bestsolution.dart.server.api.Registration highlights( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisHighlightsNotification> consumer) {
		synchronized(highlightsConsumerList) {
			highlightsConsumerList.add(consumer);
		}
		return () -> {
			synchronized(highlightsConsumerList) {
				highlightsConsumerList.remove(consumer);
			}
		};
	}
	public at.bestsolution.dart.server.api.Registration invalidate( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisInvalidateNotification> consumer) {
		synchronized(invalidateConsumerList) {
			invalidateConsumerList.add(consumer);
		}
		return () -> {
			synchronized(invalidateConsumerList) {
				invalidateConsumerList.remove(consumer);
			}
		};
	}
	public at.bestsolution.dart.server.api.Registration navigation( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisNavigationNotification> consumer) {
		synchronized(navigationConsumerList) {
			navigationConsumerList.add(consumer);
		}
		return () -> {
			synchronized(navigationConsumerList) {
				navigationConsumerList.remove(consumer);
			}
		};
	}
	public at.bestsolution.dart.server.api.Registration occurrences( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOccurrencesNotification> consumer) {
		synchronized(occurrencesConsumerList) {
			occurrencesConsumerList.add(consumer);
		}
		return () -> {
			synchronized(occurrencesConsumerList) {
				occurrencesConsumerList.remove(consumer);
			}
		};
	}
	public at.bestsolution.dart.server.api.Registration outline( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOutlineNotification> consumer) {
		synchronized(outlineConsumerList) {
			outlineConsumerList.add(consumer);
		}
		return () -> {
			synchronized(outlineConsumerList) {
				outlineConsumerList.remove(consumer);
			}
		};
	}
	public at.bestsolution.dart.server.api.Registration overrides( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOverridesNotification> consumer) {
		synchronized(overridesConsumerList) {
			overridesConsumerList.add(consumer);
		}
		return () -> {
			synchronized(overridesConsumerList) {
				overridesConsumerList.remove(consumer);
			}
		};
	}
}
