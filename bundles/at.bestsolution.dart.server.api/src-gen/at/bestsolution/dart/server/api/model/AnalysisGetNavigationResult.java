package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisGetNavigationResult {
	private java.lang.String[] files;
	private NavigationTarget[] targets;
	private NavigationRegion[] regions;

	public AnalysisGetNavigationResult() {
	}

	public java.lang.String[] getFiles() {
		return this.files;
	}

	public void setFiles(java.lang.String[] files) {
		this.files = files;
	}
	public NavigationTarget[] getTargets() {
		return this.targets;
	}

	public void setTargets(NavigationTarget[] targets) {
		this.targets = targets;
	}
	public NavigationRegion[] getRegions() {
		return this.regions;
	}

	public void setRegions(NavigationRegion[] regions) {
		this.regions = regions;
	}
}
