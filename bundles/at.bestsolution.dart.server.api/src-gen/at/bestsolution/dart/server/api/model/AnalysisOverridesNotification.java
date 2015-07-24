package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisOverridesNotification {
	private java.lang.String file;
	private Override[] overrides;

	public AnalysisOverridesNotification() {
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public Override[] getOverrides() {
		return this.overrides;
	}

	public void setOverrides(Override[] overrides) {
		this.overrides = overrides;
	}
}
