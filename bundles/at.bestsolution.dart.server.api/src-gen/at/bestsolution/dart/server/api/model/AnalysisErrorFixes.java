package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisErrorFixes  {
	private AnalysisError error ;
	private SourceChange[] fixes ;

	public AnalysisErrorFixes() {
	}

	public AnalysisError getError() {
		return this.error;
	}

	public void setError(AnalysisError error) {
		this.error = error;
	}
	public SourceChange[] getFixes() {
		return this.fixes;
	}

	public void setFixes(SourceChange[] fixes) {
		this.fixes = fixes;
	}

	public String toString() {
		return "AnalysisErrorFixes@"+hashCode()+"[error = "+error+", fixes = "+fixes+"]";
	}
}
