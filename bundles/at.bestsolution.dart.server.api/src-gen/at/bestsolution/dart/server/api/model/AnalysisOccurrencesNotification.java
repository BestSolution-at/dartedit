package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisOccurrencesNotification {
	private java.lang.String file;
	private Occurrences[] occurences;

	public AnalysisOccurrencesNotification() {
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public Occurrences[] getOccurences() {
		return this.occurences;
	}

	public void setOccurences(Occurrences[] occurences) {
		this.occurences = occurences;
	}
}
