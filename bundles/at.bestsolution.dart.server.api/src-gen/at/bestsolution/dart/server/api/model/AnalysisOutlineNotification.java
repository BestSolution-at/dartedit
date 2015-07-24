package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisOutlineNotification {
	private java.lang.String file;
	private Outline outline;

	public AnalysisOutlineNotification() {
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public Outline getOutline() {
		return this.outline;
	}

	public void setOutline(Outline outline) {
		this.outline = outline;
	}
}
