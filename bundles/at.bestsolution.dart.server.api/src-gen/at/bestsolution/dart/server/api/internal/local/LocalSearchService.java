package at.bestsolution.dart.server.api.internal.local;

import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.util.concurrent.ExecutionException;
import at.bestsolution.dart.server.api.RequestErrorException;
import java.util.List;
import java.util.ArrayList;
import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public class LocalSearchService implements at.bestsolution.dart.server.api.services.ServiceSearch {
	private boolean disposed = false;
	private final LocalDartServer server;
	private final List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.SearchResultsNotification>> resultsConsumerList = new ArrayList<>();

	public LocalSearchService(LocalDartServer server) {
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
			case "search.results": {
				at.bestsolution.dart.server.api.model.SearchResultsNotification o = new Gson().fromJson(root.get("params"), at.bestsolution.dart.server.api.model.SearchResultsNotification.class);
				List<java.util.function.Consumer<at.bestsolution.dart.server.api.model.SearchResultsNotification>> l;
				synchronized(resultsConsumerList) {
					l = new ArrayList<>(resultsConsumerList);
				}
				l.stream().forEach( c -> c.accept(o));
				break;
			}
		}
	}

	// Requests
	public at.bestsolution.dart.server.api.model.SearchFindElementReferencesResult findElementReferences(java.lang.String file,int offset,boolean includePotential) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "search.findElementReferences", new SearchFindElementReferencesRequest(file, offset, includePotential)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.SearchFindElementReferencesResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.SearchFindMemberDeclarationsResult findMemberDeclarations(String name) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "search.findMemberDeclarations", new SearchFindMemberDeclarationsRequest(name)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.SearchFindMemberDeclarationsResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.SearchFindMemberReferencesResult findMemberReferences(String name) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "search.findMemberReferences", new SearchFindMemberReferencesRequest(name)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.SearchFindMemberReferencesResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.SearchFindTopLevelDeclarationsResult findTopLevelDeclarations(String pattern) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "search.findTopLevelDeclarations", new SearchFindTopLevelDeclarationsRequest(pattern)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.SearchFindTopLevelDeclarationsResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.SearchGetTypeHierarchyResult getTypeHierarchy(java.lang.String file,int offset) {
		if( disposed ) {
			throw new IllegalStateException("The server is disposed");
		}
		try {
			JsonObject o = server.sendRequest( "search.getTypeHierarchy", new SearchGetTypeHierarchyRequest(file, offset)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.SearchGetTypeHierarchyResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}

	// Notifications
	public at.bestsolution.dart.server.api.Registration results( java.util.function.Consumer<at.bestsolution.dart.server.api.model.SearchResultsNotification> consumer) {
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
