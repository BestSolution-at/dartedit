package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class NavigationTarget  {
	private ElementKind kind ;
	private int fileIndex ;
	private int offset ;
	private int length ;
	private int startLine ;
	private int startColumn ;

	public NavigationTarget() {
	}

	public ElementKind getKind() {
		return this.kind;
	}

	public void setKind(ElementKind kind) {
		this.kind = kind;
	}
	public int getFileIndex() {
		return this.fileIndex;
	}

	public void setFileIndex(int fileIndex) {
		this.fileIndex = fileIndex;
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
		return "NavigationTarget@"+hashCode()+"[kind = "+kind+", fileIndex = "+fileIndex+", offset = "+offset+", length = "+length+", startLine = "+startLine+", startColumn = "+startColumn+"]";
	}
}
