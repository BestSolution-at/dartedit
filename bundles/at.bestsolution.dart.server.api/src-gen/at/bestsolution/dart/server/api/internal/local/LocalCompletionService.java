package at.bestsolution.dart.server.api.internal.local;

import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.util.concurrent.ExecutionException;
import at.bestsolution.dart.server.api.RequestErrorException;
import java.util.List;
import java.util.ArrayList;
import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public class LocalCompletionService implements at.bestsolution.dart.server.api.services.ServiceCompletion {

	private final LocalDartServer server;
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.CompletionResultsNotification>> resultsConsumerList = new ArrayList<>();

	public LocalCompletionService(LocalDartServer server) {
		this.server = server;
	}

	public void dispatchEvent(JsonObject root) {
		switch(root.get("event").getAsString()) {
			case "completion.results": {
				at.bestsolution.dart.server.api.model.CompletionResultsNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.CompletionResultsNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.CompletionResultsNotification>> l;
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
