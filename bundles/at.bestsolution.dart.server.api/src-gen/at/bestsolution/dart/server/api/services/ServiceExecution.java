package at.bestsolution.dart.server.api.services;

import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public interface ServiceExecution extends at.bestsolution.dart.server.api.DartService {
	// Requests
	public at.bestsolution.dart.server.api.model.ExecutionCreateContextResult createContext(java.lang.String contextRoot);
	public void deleteContext(ExecutionContextId id);
	public at.bestsolution.dart.server.api.model.ExecutionMapUriResult mapUri(ExecutionContextId id,java.lang.String file,String uri);
	public void setSubscriptions(ExecutionService[] subscriptions);

	// Notifications
	public at.bestsolution.dart.server.api.Registration launchData( java.util.function.Consumer<at.bestsolution.dart.server.api.model.ExecutionLaunchDataNotification> consumer);
}
