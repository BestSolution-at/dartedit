package at.bestsolution.dart.server.api.internal.local;

import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.util.concurrent.ExecutionException;
import at.bestsolution.dart.server.api.RequestErrorException;
import java.util.List;
import java.util.ArrayList;
import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public class LocalExecutionService implements at.bestsolution.dart.server.api.services.ServiceExecution {
	private boolean disposed = false;
	private final LocalDartServer server;
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.ExecutionLaunchDataNotification>> launchDataConsumerList = new ArrayList<>();

	public LocalExecutionService(LocalDartServer server) {
		this.server = server;
	}

	public void dispose() {
		this.disposed = true;
		synchronized(launchDataConsumerList) {
			launchDataConsumerList.clear();
		}
	}

	public void dispatchEvent(JsonObject root) {
		switch(root.get("event").getAsString()) {
			case "execution.launchData": {
				at.bestsolution.dart.server.api.model.ExecutionLaunchDataNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.ExecutionLaunchDataNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.ExecutionLaunchDataNotification>> l;
				synchronized(launchDataConsumerList) {
					l = new ArrayList<>(launchDataConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
		}
	}

	// Requests
	public at.bestsolution.dart.server.api.model.ExecutionCreateContextResult createContext(java.lang.String contextRoot) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "execution.createContext", new ExecutionCreateContextRequest(contextRoot)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.ExecutionCreateContextResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void deleteContext(ExecutionContextId id) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "execution.deleteContext", new ExecutionDeleteContextRequest(id)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.ExecutionMapUriResult mapUri(ExecutionContextId id,java.lang.String file,String uri) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "execution.mapUri", new ExecutionMapUriRequest(id, file, uri)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.ExecutionMapUriResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void setSubscriptions(ExecutionService[] subscriptions) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "execution.setSubscriptions", new ExecutionSetSubscriptionsRequest(subscriptions)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}

	// Notifications
	public at.bestsolution.dart.server.api.Registration launchData( java.util.function.Consumer<at.bestsolution.dart.server.api.model.ExecutionLaunchDataNotification> consumer) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		synchronized(launchDataConsumerList) {
			launchDataConsumerList.add(consumer);
		}
		return () -> {
			synchronized(launchDataConsumerList) {
				launchDataConsumerList.remove(consumer);
			}
		};
	}
}
