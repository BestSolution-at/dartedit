package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisUpdateContentRequest {
	private Map<java.lang.String,Overlay> files;

	public AnalysisUpdateContentRequest() {
	}

	public AnalysisUpdateContentRequest(Map<java.lang.String,Overlay> files) {
		this.files = files;
	}

	public Map<java.lang.String,Overlay> getFiles() {
		return this.files;
	}

	public void setFiles(Map<java.lang.String,Overlay> files) {
		this.files = files;
	}
}
