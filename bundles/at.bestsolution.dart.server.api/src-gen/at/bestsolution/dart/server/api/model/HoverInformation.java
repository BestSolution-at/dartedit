package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class HoverInformation  {
	private int offset ;
	private int length ;
	private String containingLibraryPath ;
	private String containingLibraryName ;
	private String containingClassDescription ;
	private String dartdoc ;
	private String elementDescription ;
	private String elementKind ;
	private String parameter ;
	private String propagatedType ;
	private String staticType ;

	public HoverInformation() {
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
	public String getContainingLibraryPath() {
		return this.containingLibraryPath;
	}

	public void setContainingLibraryPath(String containingLibraryPath) {
		this.containingLibraryPath = containingLibraryPath;
	}
	public String getContainingLibraryName() {
		return this.containingLibraryName;
	}

	public void setContainingLibraryName(String containingLibraryName) {
		this.containingLibraryName = containingLibraryName;
	}
	public String getContainingClassDescription() {
		return this.containingClassDescription;
	}

	public void setContainingClassDescription(String containingClassDescription) {
		this.containingClassDescription = containingClassDescription;
	}
	public String getDartdoc() {
		return this.dartdoc;
	}

	public void setDartdoc(String dartdoc) {
		this.dartdoc = dartdoc;
	}
	public String getElementDescription() {
		return this.elementDescription;
	}

	public void setElementDescription(String elementDescription) {
		this.elementDescription = elementDescription;
	}
	public String getElementKind() {
		return this.elementKind;
	}

	public void setElementKind(String elementKind) {
		this.elementKind = elementKind;
	}
	public String getParameter() {
		return this.parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public String getPropagatedType() {
		return this.propagatedType;
	}

	public void setPropagatedType(String propagatedType) {
		this.propagatedType = propagatedType;
	}
	public String getStaticType() {
		return this.staticType;
	}

	public void setStaticType(String staticType) {
		this.staticType = staticType;
	}

	public String toString() {
		return "HoverInformation@"+hashCode()+"[offset = "+offset+", length = "+length+", containingLibraryPath = "+containingLibraryPath+", containingLibraryName = "+containingLibraryName+", containingClassDescription = "+containingClassDescription+", dartdoc = "+dartdoc+", elementDescription = "+elementDescription+", elementKind = "+elementKind+", parameter = "+parameter+", propagatedType = "+propagatedType+", staticType = "+staticType+"]";
	}
}
