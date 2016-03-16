package at.bestsolution.dart.server.api.model;

import java.util.List;
import java.util.Map;

public class SearchResultsNotification {
	private String id;
	private List<SearchResult> results;
	private boolean isLast;

	public SearchResultsNotification() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public List<SearchResult> getResults() {
		return this.results;
	}

	public void setResults(List<SearchResult> results) {
		this.results = results;
	}
	public boolean getIsLast() {
		return this.isLast;
	}

	public void setIsLast(boolean isLast) {
		this.isLast = isLast;
	}
}
