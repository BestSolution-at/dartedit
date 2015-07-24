package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class Outline  {
	private Element element ;
	private int offset ;
	private int length ;
	private Outline[] children ;

	public Outline() {
	}

	public Element getElement() {
		return this.element;
	}

	public void setElement(Element element) {
		this.element = element;
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
	public Outline[] getChildren() {
		return this.children;
	}

	public void setChildren(Outline[] children) {
		this.children = children;
	}

	public String toString() {
		return "Outline@"+hashCode()+"[element = "+element+", offset = "+offset+", length = "+length+", children = "+children+"]";
	}
}
