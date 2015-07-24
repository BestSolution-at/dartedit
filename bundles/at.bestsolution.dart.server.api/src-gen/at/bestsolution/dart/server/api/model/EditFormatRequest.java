package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class EditFormatRequest {
	private java.lang.String file;
	private int selectionOffset;
	private int selectionLength;

	public EditFormatRequest() {
	}

	public EditFormatRequest(java.lang.String file,int selectionOffset,int selectionLength) {
		this.file = file;
		this.selectionOffset = selectionOffset;
		this.selectionLength = selectionLength;
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
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
