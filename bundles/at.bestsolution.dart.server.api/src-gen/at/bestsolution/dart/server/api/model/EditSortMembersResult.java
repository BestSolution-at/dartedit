package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class EditSortMembersResult {
	private SourceFileEdit edit;

	public EditSortMembersResult() {
	}

	public SourceFileEdit getEdit() {
		return this.edit;
	}

	public void setEdit(SourceFileEdit edit) {
		this.edit = edit;
	}
}
