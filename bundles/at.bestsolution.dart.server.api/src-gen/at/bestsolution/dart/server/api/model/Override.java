package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class Override  {
	private int offset ;
	private int length ;
	private OverriddenMember superclassMember ;
	private OverriddenMember[] interfaceMembers ;

	public Override() {
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
	public OverriddenMember getSuperclassMember() {
		return this.superclassMember;
	}

	public void setSuperclassMember(OverriddenMember superclassMember) {
		this.superclassMember = superclassMember;
	}
	public OverriddenMember[] getInterfaceMembers() {
		return this.interfaceMembers;
	}

	public void setInterfaceMembers(OverriddenMember[] interfaceMembers) {
		this.interfaceMembers = interfaceMembers;
	}

	public String toString() {
		return "Override@"+hashCode()+"[offset = "+offset+", length = "+length+", superclassMember = "+superclassMember+", interfaceMembers = "+interfaceMembers+"]";
	}
}
