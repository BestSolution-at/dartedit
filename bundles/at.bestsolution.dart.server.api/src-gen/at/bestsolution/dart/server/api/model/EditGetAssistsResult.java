package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class EditGetAssistsResult {
	private SourceChange[] assists;

	public EditGetAssistsResult() {
	}

	public SourceChange[] getAssists() {
		return this.assists;
	}

	public void setAssists(SourceChange[] assists) {
		this.assists = assists;
	}
}
