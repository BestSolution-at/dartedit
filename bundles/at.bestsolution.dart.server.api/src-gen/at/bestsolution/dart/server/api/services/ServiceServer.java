package at.bestsolution.dart.server.api.services;

import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public interface ServiceServer extends at.bestsolution.dart.server.api.DartService {
	// Requests
	public at.bestsolution.dart.server.api.model.ServerGetVersionResult getVersion();
	public void shutdown();
	public void setSubscriptions(ServerService[] subscriptions);

	// Notifications
	public at.bestsolution.dart.server.api.Registration connected( java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerConnectedNotification> consumer);
	public at.bestsolution.dart.server.api.Registration error( java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerErrorNotification> consumer);
	public at.bestsolution.dart.server.api.Registration status( java.util.function.Consumer<at.bestsolution.dart.server.api.model.ServerStatusNotification> consumer);
}
