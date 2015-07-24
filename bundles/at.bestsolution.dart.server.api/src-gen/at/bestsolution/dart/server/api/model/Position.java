package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class Position  {
	private java.lang.String file ;
	private int offset ;

	public Position() {
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

	public String toString() {
		return "Position@"+hashCode()+"[file = "+file+", offset = "+offset+"]";
	}
}
