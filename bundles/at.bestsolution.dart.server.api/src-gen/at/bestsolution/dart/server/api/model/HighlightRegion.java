package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class HighlightRegion  {
	private HighlightRegionType type ;
	private int offset ;
	private int length ;

	public HighlightRegion() {
	}

	public HighlightRegionType getType() {
		return this.type;
	}

	public void setType(HighlightRegionType type) {
		this.type = type;
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
		return "HighlightRegion@"+hashCode()+"[type = "+type+", offset = "+offset+", length = "+length+"]";
	}
}
