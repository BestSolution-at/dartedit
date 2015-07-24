package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class RefactoringProblem  {
	private RefactoringProblemSeverity severity ;
	private String message ;
	private Location location ;

	public RefactoringProblem() {
	}

	public RefactoringProblemSeverity getSeverity() {
		return this.severity;
	}

	public void setSeverity(RefactoringProblemSeverity severity) {
		this.severity = severity;
	}
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String toString() {
		return "RefactoringProblem@"+hashCode()+"[severity = "+severity+", message = "+message+", location = "+location+"]";
	}
}
