package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class Occurrences  {
	private Element element ;
	private int[] offsets ;
	private int length ;

	public Occurrences() {
	}

	public Element getElement() {
		return this.element;
	}

	public void setElement(Element element) {
		this.element = element;
	}
	public int[] getOffsets() {
		return this.offsets;
	}

	public void setOffsets(int[] offsets) {
		this.offsets = offsets;
	}
	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String toString() {
		return "Occurrences@"+hashCode()+"[element = "+element+", offsets = "+offsets+", length = "+length+"]";
	}
}
