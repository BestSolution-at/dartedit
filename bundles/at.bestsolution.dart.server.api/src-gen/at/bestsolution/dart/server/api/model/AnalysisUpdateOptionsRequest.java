package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisUpdateOptionsRequest {
	private AnalysisOptions options;

	public AnalysisUpdateOptionsRequest() {
	}

	public AnalysisUpdateOptionsRequest(AnalysisOptions options) {
		this.options = options;
	}

	public AnalysisOptions getOptions() {
		return this.options;
	}

	public void setOptions(AnalysisOptions options) {
		this.options = options;
	}
}
