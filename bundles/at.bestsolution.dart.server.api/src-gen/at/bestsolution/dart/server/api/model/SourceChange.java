package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SourceChange  {
	private String message ;
	private SourceFileEdit[] edits ;
	private LinkedEditGroup[] linkedEditGroups ;
	private Position selection ;

	public SourceChange() {
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public SourceFileEdit[] getEdits() {
		return this.edits;
	}

	public void setEdits(SourceFileEdit[] edits) {
		this.edits = edits;
	}
	public LinkedEditGroup[] getLinkedEditGroups() {
		return this.linkedEditGroups;
	}

	public void setLinkedEditGroups(LinkedEditGroup[] linkedEditGroups) {
		this.linkedEditGroups = linkedEditGroups;
	}
	public Position getSelection() {
		return this.selection;
	}

	public void setSelection(Position selection) {
		this.selection = selection;
	}

	public String toString() {
		return "SourceChange@"+hashCode()+"[message = "+message+", edits = "+edits+", linkedEditGroups = "+linkedEditGroups+", selection = "+selection+"]";
	}
}
