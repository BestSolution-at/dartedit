package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisGetErrorsRequest {
	private java.lang.String file;

	public AnalysisGetErrorsRequest() {
	}

	public AnalysisGetErrorsRequest(java.lang.String file) {
		this.file = file;
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
}
