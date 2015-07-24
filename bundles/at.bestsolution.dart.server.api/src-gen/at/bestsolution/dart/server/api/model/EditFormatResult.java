package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class EditFormatResult {
	private SourceEdit[] edits;
	private int selectionOffset;
	private int selectionLength;

	public EditFormatResult() {
	}

	public SourceEdit[] getEdits() {
		return this.edits;
	}

	public void setEdits(SourceEdit[] edits) {
		this.edits = edits;
	}
	public int getSelectionOffset() {
		return this.selectionOffset;
	}

	public void setSelectionOffset(int selectionOffset) {
		this.selectionOffset = selectionOffset;
	}
	public int getSelectionLength() {
		return this.selectionLength;
	}

	public void setSelectionLength(int selectionLength) {
		this.selectionLength = selectionLength;
	}
}
