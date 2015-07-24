package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisHighlightsNotification {
	private java.lang.String file;
	private HighlightRegion[] regions;

	public AnalysisHighlightsNotification() {
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public HighlightRegion[] getRegions() {
		return this.regions;
	}

	public void setRegions(HighlightRegion[] regions) {
		this.regions = regions;
	}
}
