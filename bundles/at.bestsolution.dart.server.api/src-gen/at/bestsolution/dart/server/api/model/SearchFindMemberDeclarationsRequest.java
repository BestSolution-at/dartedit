package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SearchFindMemberDeclarationsRequest {
	private String name;

	public SearchFindMemberDeclarationsRequest() {
	}

	public SearchFindMemberDeclarationsRequest(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
