package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SearchFindElementReferencesRequest {
	private java.lang.String file;
	private int offset;
	private boolean includePotential;

	public SearchFindElementReferencesRequest() {
	}

	public SearchFindElementReferencesRequest(java.lang.String file,int offset,boolean includePotential) {
		this.file = file;
		this.offset = offset;
		this.includePotential = includePotential;
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public int getOffset() {
		return this.offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	public boolean getIncludePotential() {
		return this.includePotential;
	}

	public void setIncludePotential(boolean includePotential) {
		this.includePotential = includePotential;
	}
}
