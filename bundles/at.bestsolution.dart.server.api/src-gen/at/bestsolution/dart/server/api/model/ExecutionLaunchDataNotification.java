package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class ExecutionLaunchDataNotification {
	private java.lang.String file;
	private ExecutableKind kind;
	private java.lang.String[] referencedFiles;

	public ExecutionLaunchDataNotification() {
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public ExecutableKind getKind() {
		return this.kind;
	}

	public void setKind(ExecutableKind kind) {
		this.kind = kind;
	}
	public java.lang.String[] getReferencedFiles() {
		return this.referencedFiles;
	}

	public void setReferencedFiles(java.lang.String[] referencedFiles) {
		this.referencedFiles = referencedFiles;
	}
}
