package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class ServerSetSubscriptionsRequest {
	private ServerService[] subscriptions;

	public ServerSetSubscriptionsRequest() {
	}

	public ServerSetSubscriptionsRequest(ServerService[] subscriptions) {
		this.subscriptions = subscriptions;
	}

	public ServerService[] getSubscriptions() {
		return this.subscriptions;
	}

	public void setSubscriptions(ServerService[] subscriptions) {
		this.subscriptions = subscriptions;
	}
}
