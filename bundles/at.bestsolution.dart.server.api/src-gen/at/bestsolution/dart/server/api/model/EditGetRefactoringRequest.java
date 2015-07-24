package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class EditGetRefactoringRequest {
	private RefactoringKind kind;
	private java.lang.String file;
	private int offset;
	private int length;
	private int validateOnly;
	private RefactoringOptions options;

	public EditGetRefactoringRequest() {
	}

	public EditGetRefactoringRequest(RefactoringKind kind,java.lang.String file,int offset,int length,int validateOnly,RefactoringOptions options) {
		this.kind = kind;
		this.file = file;
		this.offset = offset;
		this.length = length;
		this.validateOnly = validateOnly;
		this.options = options;
	}

	public RefactoringKind getKind() {
		return this.kind;
	}

	public void setKind(RefactoringKind kind) {
		this.kind = kind;
	}
	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public int getOffset() {
		return this.offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	public int getValidateOnly() {
		return this.validateOnly;
	}

	public void setValidateOnly(int validateOnly) {
		this.validateOnly = validateOnly;
	}
	public RefactoringOptions getOptions() {
		return this.options;
	}

	public void setOptions(RefactoringOptions options) {
		this.options = options;
	}
}
