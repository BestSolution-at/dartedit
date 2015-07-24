package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class EditGetFixesResult {
	private AnalysisErrorFixes[] fixes;

	public EditGetFixesResult() {
	}

	public AnalysisErrorFixes[] getFixes() {
		return this.fixes;
	}

	public void setFixes(AnalysisErrorFixes[] fixes) {
		this.fixes = fixes;
	}
}
