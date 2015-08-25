package at.bestsolution.dart.server.api.internal.local;

import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.util.concurrent.ExecutionException;
import at.bestsolution.dart.server.api.RequestErrorException;
import java.util.List;
import java.util.ArrayList;
import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public class LocalServerService implements at.bestsolution.dart.server.api.services.ServiceServer {
	private boolean disposed = false;
	private final LocalDartServer server;
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerConnectedNotification>> connectedConsumerList = new ArrayList<>();
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerErrorNotification>> errorConsumerList = new ArrayList<>();
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerStatusNotification>> statusConsumerList = new ArrayList<>();

	public LocalServerService(LocalDartServer server) {
		this.server = server;
	}

	public void dispose() {
		this.disposed = true;
		synchronized(connectedConsumerList) {
			connectedConsumerList.clear();
		}
		synchronized(errorConsumerList) {
			errorConsumerList.clear();
		}
		synchronized(statusConsumerList) {
			statusConsumerList.clear();
		}
	}

	public void dispatchEvent(JsonObject root) {
		switch(root.get("event").getAsString()) {
			case "server.connected": {
				at.bestsolution.dart.server.api.model.ServerConnectedNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.ServerConnectedNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerConnectedNotification>> l;
				synchronized(connectedConsumerList) {
					l = new ArrayList<>(connectedConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
			case "server.error": {
				at.bestsolution.dart.server.api.model.ServerErrorNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.ServerErrorNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerErrorNotification>> l;
				synchronized(errorConsumerList) {
					l = new ArrayList<>(errorConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
			case "server.status": {
				at.bestsolution.dart.server.api.model.ServerStatusNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.ServerStatusNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerStatusNotification>> l;
				synchronized(statusConsumerList) {
					l = new ArrayList<>(statusConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
		}
	}

	// Requests
	public at.bestsolution.dart.server.api.model.ServerGetVersionResult getVersion() {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "server.getVersion", null).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.ServerGetVersionResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void shutdown() {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "server.shutdown", null).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void setSubscriptions(ServerService[] subscriptions) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "server.setSubscriptions", new ServerSetSubscriptionsRequest(subscriptions)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}

	// Notifications
	public at.bestsolution.dart.server.api.Registration connected( java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerConnectedNotification> consumer) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		synchronized(connectedConsumerList) {
			connectedConsumerList.add(consumer);
		}
		return () -> {
			synchronized(connectedConsumerList) {
				connectedConsumerList.remove(consumer);
			}
		};
	}
	public at.bestsolution.dart.server.api.Registration error( java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerErrorNotification> consumer) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		synchronized(errorConsumerList) {
			errorConsumerList.add(consumer);
		}
		return () -> {
			synchronized(errorConsumerList) {
				errorConsumerList.remove(consumer);
			}
		};
	}
	public at.bestsolution.dart.server.api.Registration status( java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerStatusNotification> consumer) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		synchronized(statusConsumerList) {
			statusConsumerList.add(consumer);
		}
		return () -> {
			synchronized(statusConsumerList) {
				statusConsumerList.remove(consumer);
			}
		};
	}
}
