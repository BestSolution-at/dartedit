package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisStatus  {
	private boolean isAnalyzing ;
	private String analysisTarget ;

	public AnalysisStatus() {
	}

	public boolean getIsAnalyzing() {
		return this.isAnalyzing;
	}

	public void setIsAnalyzing(boolean isAnalyzing) {
		this.isAnalyzing = isAnalyzing;
	}
	public String getAnalysisTarget() {
		return this.analysisTarget;
	}

	public void setAnalysisTarget(String analysisTarget) {
		this.analysisTarget = analysisTarget;
	}

	public String toString() {
		return "AnalysisStatus@"+hashCode()+"[isAnalyzing = "+isAnalyzing+", analysisTarget = "+analysisTarget+"]";
	}
}
