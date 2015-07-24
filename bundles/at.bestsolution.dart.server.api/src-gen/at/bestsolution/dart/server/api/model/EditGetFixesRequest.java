package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class EditGetFixesRequest {
	private java.lang.String file;
	private int offset;

	public EditGetFixesRequest() {
	}

	public EditGetFixesRequest(java.lang.String file,int offset) {
		this.file = file;
		this.offset = offset;
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public int getOffset() {
		return this.offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
}
