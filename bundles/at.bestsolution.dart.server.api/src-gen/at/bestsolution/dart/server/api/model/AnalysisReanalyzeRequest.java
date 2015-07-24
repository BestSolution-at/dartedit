package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisReanalyzeRequest {
	private java.lang.String[] roots;

	public AnalysisReanalyzeRequest() {
	}

	public AnalysisReanalyzeRequest(java.lang.String[] roots) {
		this.roots = roots;
	}

	public java.lang.String[] getRoots() {
		return this.roots;
	}

	public void setRoots(java.lang.String[] roots) {
		this.roots = roots;
	}
}
