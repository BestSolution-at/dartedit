package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class RefactoringMethodParameter  {
	private String id ;
	private RefactoringMethodParameterKind kind ;
	private String type ;
	private String name ;
	private String parameters ;

	public RefactoringMethodParameter() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public RefactoringMethodParameterKind getKind() {
		return this.kind;
	}

	public void setKind(RefactoringMethodParameterKind kind) {
		this.kind = kind;
	}
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String toString() {
		return "RefactoringMethodParameter@"+hashCode()+"[id = "+id+", kind = "+kind+", type = "+type+", name = "+name+", parameters = "+parameters+"]";
	}
}
