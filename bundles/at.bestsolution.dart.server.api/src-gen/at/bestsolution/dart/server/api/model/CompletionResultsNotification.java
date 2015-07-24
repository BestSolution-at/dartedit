package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class CompletionResultsNotification {
	private java.lang.String id;
	private int replacementOffset;
	private int replacementLength;
	private CompletionSuggestion[] results;
	private boolean isLast;

	public CompletionResultsNotification() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}
	public int getReplacementOffset() {
		return this.replacementOffset;
	}

	public void setReplacementOffset(int replacementOffset) {
		this.replacementOffset = replacementOffset;
	}
	public int getReplacementLength() {
		return this.replacementLength;
	}

	public void setReplacementLength(int replacementLength) {
		this.replacementLength = replacementLength;
	}
	public CompletionSuggestion[] getResults() {
		return this.results;
	}

	public void setResults(CompletionSuggestion[] results) {
		this.results = results;
	}
	public boolean getIsLast() {
		return this.isLast;
	}

	public void setIsLast(boolean isLast) {
		this.isLast = isLast;
	}
}
