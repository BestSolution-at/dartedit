package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class NavigationRegion  {
	private int offset ;
	private int length ;
	private int[] targets ;

	public NavigationRegion() {
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
	public int[] getTargets() {
		return this.targets;
	}

	public void setTargets(int[] targets) {
		this.targets = targets;
	}

	public String toString() {
		return "NavigationRegion@"+hashCode()+"[offset = "+offset+", length = "+length+", targets = "+targets+"]";
	}
}
