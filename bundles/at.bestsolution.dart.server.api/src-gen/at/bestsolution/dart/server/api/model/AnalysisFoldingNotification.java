package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisFoldingNotification {
	private java.lang.String file;
	private FoldingRegion regions;

	public AnalysisFoldingNotification() {
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public FoldingRegion getRegions() {
		return this.regions;
	}

	public void setRegions(FoldingRegion regions) {
		this.regions = regions;
	}
}
