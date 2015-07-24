package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class ServerStatusNotification {
	private AnalysisStatus analysis;
	private PubStatus pub;

	public ServerStatusNotification() {
	}

	public AnalysisStatus getAnalysis() {
		return this.analysis;
	}

	public void setAnalysis(AnalysisStatus analysis) {
		this.analysis = analysis;
	}
	public PubStatus getPub() {
		return this.pub;
	}

	public void setPub(PubStatus pub) {
		this.pub = pub;
	}
}
