package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisErrorsNotification {
	private java.lang.String file;
	private AnalysisError[] errors;

	public AnalysisErrorsNotification() {
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public AnalysisError[] getErrors() {
		return this.errors;
	}

	public void setErrors(AnalysisError[] errors) {
		this.errors = errors;
	}
}
