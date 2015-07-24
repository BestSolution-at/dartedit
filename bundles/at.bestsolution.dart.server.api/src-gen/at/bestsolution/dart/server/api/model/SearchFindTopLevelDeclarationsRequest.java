package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SearchFindTopLevelDeclarationsRequest {
	private String pattern;

	public SearchFindTopLevelDeclarationsRequest() {
	}

	public SearchFindTopLevelDeclarationsRequest(String pattern) {
		this.pattern = pattern;
	}

	public String getPattern() {
		return this.pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
}
