package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SearchFindMemberReferencesRequest {
	private String name;

	public SearchFindMemberReferencesRequest() {
	}

	public SearchFindMemberReferencesRequest(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
