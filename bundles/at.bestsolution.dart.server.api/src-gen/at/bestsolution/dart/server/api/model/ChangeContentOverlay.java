package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class ChangeContentOverlay extends Overlay {
	private SourceEdit[] edits ;
	private String type  = "change";

	public ChangeContentOverlay() {
	}

	public SourceEdit[] getEdits() {
		return this.edits;
	}

	public void setEdits(SourceEdit[] edits) {
		this.edits = edits;
	}
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "ChangeContentOverlay@"+hashCode()+"[edits = "+edits+", type = "+type+"]";
	}
}
