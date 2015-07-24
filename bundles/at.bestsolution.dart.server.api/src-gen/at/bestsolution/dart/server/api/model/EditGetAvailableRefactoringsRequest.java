package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class EditGetAvailableRefactoringsRequest {
	private java.lang.String file;
	private int offset;
	private int length;

	public EditGetAvailableRefactoringsRequest() {
	}

	public EditGetAvailableRefactoringsRequest(java.lang.String file,int offset,int length) {
		this.file = file;
		this.offset = offset;
		this.length = length;
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
	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
