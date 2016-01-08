package at.bestsolution.dart.server.api.services;

import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public interface ServiceCompletion extends at.bestsolution.dart.server.api.DartService {
	// Requests
	public at.bestsolution.dart.server.api.model.CompletionGetSuggestionsResult getSuggestions(java.lang.String file,int offset);

	// Notifications
	public at.bestsolution.dart.server.api.Registration results( java.util.function.Consumer<at.bestsolution.dart.server.api.model.CompletionResultsNotification> consumer);
}
