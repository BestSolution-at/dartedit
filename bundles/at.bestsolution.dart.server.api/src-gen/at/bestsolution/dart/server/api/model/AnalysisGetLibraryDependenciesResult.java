package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisGetLibraryDependenciesResult {
	private java.lang.String[] libraries;
	private Map<String,Map<String,java.lang.String[]>> packageMap;

	public AnalysisGetLibraryDependenciesResult() {
	}

	public java.lang.String[] getLibraries() {
		return this.libraries;
	}

	public void setLibraries(java.lang.String[] libraries) {
		this.libraries = libraries;
	}
	public Map<String,Map<String,java.lang.String[]>> getPackageMap() {
		return this.packageMap;
	}

	public void setPackageMap(Map<String,Map<String,java.lang.String[]>> packageMap) {
		this.packageMap = packageMap;
	}
}
