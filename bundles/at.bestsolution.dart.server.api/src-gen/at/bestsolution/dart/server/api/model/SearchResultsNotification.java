package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SearchResultsNotification {
	private SearchId id;
	private SearchResult results;
	private boolean isLast;

	public SearchResultsNotification() {
	}

	public SearchId getId() {
		return this.id;
	}

	public void setId(SearchId id) {
		this.id = id;
	}
	public SearchResult getResults() {
		return this.results;
	}

	public void setResults(SearchResult results) {
		this.results = results;
	}
	public boolean getIsLast() {
		return this.isLast;
	}

	public void setIsLast(boolean isLast) {
		this.isLast = isLast;
	}
}
