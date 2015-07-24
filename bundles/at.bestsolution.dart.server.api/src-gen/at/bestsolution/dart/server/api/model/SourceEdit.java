package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SourceEdit  {
	private int offset ;
	private int length ;
	private String replacement ;
	private String id ;

	public SourceEdit() {
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
	public String getReplacement() {
		return this.replacement;
	}

	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return "SourceEdit@"+hashCode()+"[offset = "+offset+", length = "+length+", replacement = "+replacement+", id = "+id+"]";
	}
}
