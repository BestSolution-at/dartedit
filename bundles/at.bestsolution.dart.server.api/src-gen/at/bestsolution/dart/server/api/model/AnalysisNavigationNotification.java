package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisNavigationNotification {
	private java.lang.String file;
	private NavigationRegion[] regions;
	private NavigationTarget[] targets;
	private java.lang.String[] files;

	public AnalysisNavigationNotification() {
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public NavigationRegion[] getRegions() {
		return this.regions;
	}

	public void setRegions(NavigationRegion[] regions) {
		this.regions = regions;
	}
	public NavigationTarget[] getTargets() {
		return this.targets;
	}

	public void setTargets(NavigationTarget[] targets) {
		this.targets = targets;
	}
	public java.lang.String[] getFiles() {
		return this.files;
	}

	public void setFiles(java.lang.String[] files) {
		this.files = files;
	}
}
