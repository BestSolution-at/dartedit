package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class Element  {
	private ElementKind kind ;
	private String name ;
	private Location location ;
	private int flags ;
	private String parameters ;
	private String returnType ;
	private String typeParameters ;

	public Element() {
	}

	public ElementKind getKind() {
		return this.kind;
	}

	public void setKind(ElementKind kind) {
		this.kind = kind;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	public int getFlags() {
		return this.flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}
	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	public String getReturnType() {
		return this.returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public String getTypeParameters() {
		return this.typeParameters;
	}

	public void setTypeParameters(String typeParameters) {
		this.typeParameters = typeParameters;
	}

	public String toString() {
		return "Element@"+hashCode()+"[kind = "+kind+", name = "+name+", location = "+location+", flags = "+flags+", parameters = "+parameters+", returnType = "+returnType+", typeParameters = "+typeParameters+"]";
	}
}
