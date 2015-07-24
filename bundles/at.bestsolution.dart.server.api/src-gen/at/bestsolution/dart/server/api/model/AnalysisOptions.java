package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisOptions  {
	private boolean enableAsync ;
	private boolean enableDeferredLoading ;
	private boolean enableEnums ;
	private boolean enableNullAwareOperators ;
	private boolean generateDart2jsHints ;
	private boolean generateHints ;
	private boolean generateLints ;

	public AnalysisOptions() {
	}

	public boolean getEnableAsync() {
		return this.enableAsync;
	}

	public void setEnableAsync(boolean enableAsync) {
		this.enableAsync = enableAsync;
	}
	public boolean getEnableDeferredLoading() {
		return this.enableDeferredLoading;
	}

	public void setEnableDeferredLoading(boolean enableDeferredLoading) {
		this.enableDeferredLoading = enableDeferredLoading;
	}
	public boolean getEnableEnums() {
		return this.enableEnums;
	}

	public void setEnableEnums(boolean enableEnums) {
		this.enableEnums = enableEnums;
	}
	public boolean getEnableNullAwareOperators() {
		return this.enableNullAwareOperators;
	}

	public void setEnableNullAwareOperators(boolean enableNullAwareOperators) {
		this.enableNullAwareOperators = enableNullAwareOperators;
	}
	public boolean getGenerateDart2jsHints() {
		return this.generateDart2jsHints;
	}

	public void setGenerateDart2jsHints(boolean generateDart2jsHints) {
		this.generateDart2jsHints = generateDart2jsHints;
	}
	public boolean getGenerateHints() {
		return this.generateHints;
	}

	public void setGenerateHints(boolean generateHints) {
		this.generateHints = generateHints;
	}
	public boolean getGenerateLints() {
		return this.generateLints;
	}

	public void setGenerateLints(boolean generateLints) {
		this.generateLints = generateLints;
	}

	public String toString() {
		return "AnalysisOptions@"+hashCode()+"[enableAsync = "+enableAsync+", enableDeferredLoading = "+enableDeferredLoading+", enableEnums = "+enableEnums+", enableNullAwareOperators = "+enableNullAwareOperators+", generateDart2jsHints = "+generateDart2jsHints+", generateHints = "+generateHints+", generateLints = "+generateLints+"]";
	}
}
