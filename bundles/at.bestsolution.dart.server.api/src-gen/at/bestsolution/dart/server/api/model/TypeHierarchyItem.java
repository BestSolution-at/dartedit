package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class TypeHierarchyItem  {
	private Element classElement ;
	private String displayName ;
	private Element memberElement ;
	private int superclass ;
	private int[] interfaces ;
	private int[] mixins ;
	private int[] subclasses ;

	public TypeHierarchyItem() {
	}

	public Element getClassElement() {
		return this.classElement;
	}

	public void setClassElement(Element classElement) {
		this.classElement = classElement;
	}
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public Element getMemberElement() {
		return this.memberElement;
	}

	public void setMemberElement(Element memberElement) {
		this.memberElement = memberElement;
	}
	public int getSuperclass() {
		return this.superclass;
	}

	public void setSuperclass(int superclass) {
		this.superclass = superclass;
	}
	public int[] getInterfaces() {
		return this.interfaces;
	}

	public void setInterfaces(int[] interfaces) {
		this.interfaces = interfaces;
	}
	public int[] getMixins() {
		return this.mixins;
	}

	public void setMixins(int[] mixins) {
		this.mixins = mixins;
	}
	public int[] getSubclasses() {
		return this.subclasses;
	}

	public void setSubclasses(int[] subclasses) {
		this.subclasses = subclasses;
	}

	public String toString() {
		return "TypeHierarchyItem@"+hashCode()+"[classElement = "+classElement+", displayName = "+displayName+", memberElement = "+memberElement+", superclass = "+superclass+", interfaces = "+interfaces+", mixins = "+mixins+", subclasses = "+subclasses+"]";
	}
}
