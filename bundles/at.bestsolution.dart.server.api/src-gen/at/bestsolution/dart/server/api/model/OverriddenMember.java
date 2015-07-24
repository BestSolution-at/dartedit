package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class OverriddenMember  {
	private Element element ;
	private String className ;

	public OverriddenMember() {
	}

	public Element getElement() {
		return this.element;
	}

	public void setElement(Element element) {
		this.element = element;
	}
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String toString() {
		return "OverriddenMember@"+hashCode()+"[element = "+element+", className = "+className+"]";
	}
}
