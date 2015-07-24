package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class Location  {
	private java.lang.String file ;
	private int offset ;
	private int length ;
	private int startLine ;
	private int startColumn ;

	public Location() {
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
	public int getStartLine() {
		return this.startLine;
	}

	public void setStartLine(int startLine) {
		this.startLine = startLine;
	}
	public int getStartColumn() {
		return this.startColumn;
	}

	public void setStartColumn(int startColumn) {
		this.startColumn = startColumn;
	}

	public String toString() {
		return "Location@"+hashCode()+"[file = "+file+", offset = "+offset+", length = "+length+", startLine = "+startLine+", startColumn = "+startColumn+"]";
	}
}
