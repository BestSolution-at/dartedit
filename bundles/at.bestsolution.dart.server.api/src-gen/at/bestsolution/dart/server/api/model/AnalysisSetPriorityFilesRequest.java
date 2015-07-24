package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisSetPriorityFilesRequest {
	private java.lang.String[] files;

	public AnalysisSetPriorityFilesRequest() {
	}

	public AnalysisSetPriorityFilesRequest(java.lang.String[] files) {
		this.files = files;
	}

	public java.lang.String[] getFiles() {
		return this.files;
	}

	public void setFiles(java.lang.String[] files) {
		this.files = files;
	}
}
