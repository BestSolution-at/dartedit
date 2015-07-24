package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class EditGetRefactoringResult {
	private RefactoringProblem[] initialProblems;
	private RefactoringProblem[] optionsProblems;
	private RefactoringProblem[] finalProblems;
	private RefactoringFeedback feedback;
	private SourceChange change;
	private String[] potentialEdits;

	public EditGetRefactoringResult() {
	}

	public RefactoringProblem[] getInitialProblems() {
		return this.initialProblems;
	}

	public void setInitialProblems(RefactoringProblem[] initialProblems) {
		this.initialProblems = initialProblems;
	}
	public RefactoringProblem[] getOptionsProblems() {
		return this.optionsProblems;
	}

	public void setOptionsProblems(RefactoringProblem[] optionsProblems) {
		this.optionsProblems = optionsProblems;
	}
	public RefactoringProblem[] getFinalProblems() {
		return this.finalProblems;
	}

	public void setFinalProblems(RefactoringProblem[] finalProblems) {
		this.finalProblems = finalProblems;
	}
	public RefactoringFeedback getFeedback() {
		return this.feedback;
	}

	public void setFeedback(RefactoringFeedback feedback) {
		this.feedback = feedback;
	}
	public SourceChange getChange() {
		return this.change;
	}

	public void setChange(SourceChange change) {
		this.change = change;
	}
	public String[] getPotentialEdits() {
		return this.potentialEdits;
	}

	public void setPotentialEdits(String[] potentialEdits) {
		this.potentialEdits = potentialEdits;
	}
}
