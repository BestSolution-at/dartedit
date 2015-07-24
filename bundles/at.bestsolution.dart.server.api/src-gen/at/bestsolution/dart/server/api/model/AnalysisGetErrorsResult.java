package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisGetErrorsResult {
	private AnalysisError[] errors;

	public AnalysisGetErrorsResult() {
	}

	public AnalysisError[] getErrors() {
		return this.errors;
	}

	public void setErrors(AnalysisError[] errors) {
		this.errors = errors;
	}
}
