package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class ExecutionSetSubscriptionsRequest {
	private ExecutionService[] subscriptions;

	public ExecutionSetSubscriptionsRequest() {
	}

	public ExecutionSetSubscriptionsRequest(ExecutionService[] subscriptions) {
		this.subscriptions = subscriptions;
	}

	public ExecutionService[] getSubscriptions() {
		return this.subscriptions;
	}

	public void setSubscriptions(ExecutionService[] subscriptions) {
		this.subscriptions = subscriptions;
	}
}
