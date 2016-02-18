package at.bestsolution.dart.server.api.internal.local;

import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.util.concurrent.ExecutionException;
import at.bestsolution.dart.server.api.RequestErrorException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public class LocalCompletionService implements at.bestsolution.dart.server.api.services.ServiceCompletion {
	private boolean disposed = false;
	private final LocalDartServer server;
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.CompletionResultsNotification>> resultsConsumerList = new ArrayList<>();

	public LocalCompletionService(LocalDartServer server) {
		this.server = server;
	}

	public void dispose() {
		this.disposed = true;
		synchronized(resultsConsumerList) {
			resultsConsumerList.clear();
		}
	}

	public void dispatchEvent(JsonObject root) {
		switch(root.get("event").getAsString()) {
			case "completion.results": {
				System.err.println("dispatch=" + root);
				at.bestsolution.dart.server.api.model.CompletionResultsNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.CompletionResultsNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.CompletionResultsNotification>> l;

				// patch o for now
				Arrays.stream(o.getResults()).forEach(e->{
					if (e.getDocSummary() == null) {
						e.setDocSummary("Doc Summary missing");
					}
					if (e.getDocComplete() == null) {
						e.setDocComplete("Doc Complete missing");
					}
				});

				synchronized(resultsConsumerList) {
					l = new ArrayList<>(resultsConsumerList);
				}

				l.stream().forEach( c -> c.accept(o));
				break;
			}
		}
	}

	// Requests
	public at.bestsolution.dart.server.api.model.CompletionGetSuggestionsResult getSuggestions(java.lang.String file,int offset) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "completion.getSuggestions", new CompletionGetSuggestionsRequest(file, offset)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.CompletionGetSuggestionsResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}

	// Notifications
	public at.bestsolution.dart.server.api.Registration results( java.util.function.Consumer<at.bestsolution.dart.server.api.model.CompletionResultsNotification> consumer) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		synchronized(resultsConsumerList) {
			resultsConsumerList.add(consumer);
		}
		return () -> {
			synchronized(resultsConsumerList) {
				resultsConsumerList.remove(consumer);
			}
		};
	}
}
