package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SearchResult  {
	private Location location ;
	private SearchResultKind kind ;
	private boolean isPotential ;
	private Element[] path ;

	public SearchResult() {
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	public SearchResultKind getKind() {
		return this.kind;
	}

	public void setKind(SearchResultKind kind) {
		this.kind = kind;
	}
	public boolean getIsPotential() {
		return this.isPotential;
	}

	public void setIsPotential(boolean isPotential) {
		this.isPotential = isPotential;
	}
	public Element[] getPath() {
		return this.path;
	}

	public void setPath(Element[] path) {
		this.path = path;
	}

	public String toString() {
		return "SearchResult@"+hashCode()+"[location = "+location+", kind = "+kind+", isPotential = "+isPotential+", path = "+path+"]";
	}
}
