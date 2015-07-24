package at.bestsolution.dart.server.api.internal.local;

import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.util.concurrent.ExecutionException;
import at.bestsolution.dart.server.api.RequestErrorException;
import java.util.List;
import java.util.ArrayList;
import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public class LocalEditService implements at.bestsolution.dart.server.api.services.ServiceEdit {

	private final LocalDartServer server;

	public LocalEditService(LocalDartServer server) {
		this.server = server;
	}

	public void dispatchEvent(JsonObject root) {
		switch(root.get("event").getAsString()) {
		}
	}

	// Requests
	public at.bestsolution.dart.server.api.model.EditFormatResult format(java.lang.String file,int selectionOffset,int selectionLength) {
		try {
			JsonObject o = server.sendRequest( "edit.format", new EditFormatRequest(file, selectionOffset, selectionLength)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.EditFormatResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.EditGetAssistsResult getAssists(java.lang.String file,int offset,int length) {
		try {
			JsonObject o = server.sendRequest( "edit.getAssists", new EditGetAssistsRequest(file, offset, length)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.EditGetAssistsResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.EditGetAvailableRefactoringsResult getAvailableRefactorings(java.lang.String file,int offset,int length) {
		try {
			JsonObject o = server.sendRequest( "edit.getAvailableRefactorings", new EditGetAvailableRefactoringsRequest(file, offset, length)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.EditGetAvailableRefactoringsResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.EditGetFixesResult getFixes(java.lang.String file,int offset) {
		try {
			JsonObject o = server.sendRequest( "edit.getFixes", new EditGetFixesRequest(file, offset)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.EditGetFixesResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.EditGetRefactoringResult getRefactoring(RefactoringKind kind,java.lang.String file,int offset,int length,int validateOnly,RefactoringOptions options) {
		try {
			JsonObject o = server.sendRequest( "edit.getRefactoring", new EditGetRefactoringRequest(kind, file, offset, length, validateOnly, options)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.EditGetRefactoringResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public at.bestsolution.dart.server.api.model.EditSortMembersResult sortMembers(java.lang.String file) {
		try {
			JsonObject o = server.sendRequest( "edit.sortMembers", new EditSortMembersRequest(file)).get();
			if( o.has("error") ) {
				throw new RequestErrorException(new Gson().fromJson(o.get("error"), at.bestsolution.dart.server.api.model.RequestError.class));
			}
			if( o.has("result") ) {
				return new Gson().fromJson(o.get("result"), at.bestsolution.dart.server.api.model.EditSortMembersResult.class);
			}
			throw new IllegalStateException("The request did not return a result");
		} catch (InterruptedException | ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}

	// Notifications
}
