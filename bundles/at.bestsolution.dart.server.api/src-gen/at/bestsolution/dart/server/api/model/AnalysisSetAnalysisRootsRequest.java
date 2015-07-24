package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisSetAnalysisRootsRequest {
	private java.lang.String[] included;
	private java.lang.String[] excluded;
	private Map<java.lang.String,java.lang.String> packageRoots;

	public AnalysisSetAnalysisRootsRequest() {
	}

	public AnalysisSetAnalysisRootsRequest(java.lang.String[] included,java.lang.String[] excluded,Map<java.lang.String,java.lang.String> packageRoots) {
		this.included = included;
		this.excluded = excluded;
		this.packageRoots = packageRoots;
	}

	public java.lang.String[] getIncluded() {
		return this.included;
	}

	public void setIncluded(java.lang.String[] included) {
		this.included = included;
	}
	public java.lang.String[] getExcluded() {
		return this.excluded;
	}

	public void setExcluded(java.lang.String[] excluded) {
		this.excluded = excluded;
	}
	public Map<java.lang.String,java.lang.String> getPackageRoots() {
		return this.packageRoots;
	}

	public void setPackageRoots(Map<java.lang.String,java.lang.String> packageRoots) {
		this.packageRoots = packageRoots;
	}
}
