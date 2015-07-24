package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisInvalidateNotification {
	private java.lang.String file;
	private int offset;
	private int length;
	private int delta;

	public AnalysisInvalidateNotification() {
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
	public int getDelta() {
		return this.delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
