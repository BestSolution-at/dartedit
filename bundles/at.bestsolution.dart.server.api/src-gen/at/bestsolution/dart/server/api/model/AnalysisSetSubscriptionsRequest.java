package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisSetSubscriptionsRequest {
	private Map<AnalysisService,java.lang.String[]> subscriptions;

	public AnalysisSetSubscriptionsRequest() {
	}

	public AnalysisSetSubscriptionsRequest(Map<AnalysisService,java.lang.String[]> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public Map<AnalysisService,java.lang.String[]> getSubscriptions() {
		return this.subscriptions;
	}

	public void setSubscriptions(Map<AnalysisService,java.lang.String[]> subscriptions) {
		this.subscriptions = subscriptions;
	}
}
