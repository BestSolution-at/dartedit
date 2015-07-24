package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class FoldingRegion  {
	private FoldingKind kind ;
	private int offset ;
	private int length ;

	public FoldingRegion() {
	}

	public FoldingKind getKind() {
		return this.kind;
	}

	public void setKind(FoldingKind kind) {
		this.kind = kind;
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

	public String toString() {
		return "FoldingRegion@"+hashCode()+"[kind = "+kind+", offset = "+offset+", length = "+length+"]";
	}
}
