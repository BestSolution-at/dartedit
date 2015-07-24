package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AnalysisError  {
	private AnalysisErrorSeverity severity ;
	private AnalysisErrorType type ;
	private Location location ;
	private String message ;
	private String correction ;

	public AnalysisError() {
	}

	public AnalysisErrorSeverity getSeverity() {
		return this.severity;
	}

	public void setSeverity(AnalysisErrorSeverity severity) {
		this.severity = severity;
	}
	public AnalysisErrorType getType() {
		return this.type;
	}

	public void setType(AnalysisErrorType type) {
		this.type = type;
	}
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getCorrection() {
		return this.correction;
	}

	public void setCorrection(String correction) {
		this.correction = correction;
	}

	public String toString() {
		return "AnalysisError@"+hashCode()+"[severity = "+severity+", type = "+type+", location = "+location+", message = "+message+", correction = "+correction+"]";
	}
}
