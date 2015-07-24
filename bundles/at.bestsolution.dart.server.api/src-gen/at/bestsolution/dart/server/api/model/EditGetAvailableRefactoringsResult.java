package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class EditGetAvailableRefactoringsResult {
	private RefactoringKind[] kinds;

	public EditGetAvailableRefactoringsResult() {
	}

	public RefactoringKind[] getKinds() {
		return this.kinds;
	}

	public void setKinds(RefactoringKind[] kinds) {
		this.kinds = kinds;
	}
}
