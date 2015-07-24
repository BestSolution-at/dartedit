package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SourceFileEdit  {
	private java.lang.String file ;
	private long fileStamp ;
	private SourceEdit[] edits ;

	public SourceFileEdit() {
	}

	public java.lang.String getFile() {
		return this.file;
	}

	public void setFile(java.lang.String file) {
		this.file = file;
	}
	public long getFileStamp() {
		return this.fileStamp;
	}

	public void setFileStamp(long fileStamp) {
		this.fileStamp = fileStamp;
	}
	public SourceEdit[] getEdits() {
		return this.edits;
	}

	public void setEdits(SourceEdit[] edits) {
		this.edits = edits;
	}

	public String toString() {
		return "SourceFileEdit@"+hashCode()+"[file = "+file+", fileStamp = "+fileStamp+", edits = "+edits+"]";
	}
}
