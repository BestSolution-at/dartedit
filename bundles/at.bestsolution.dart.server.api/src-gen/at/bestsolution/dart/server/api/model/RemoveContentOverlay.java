package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class RemoveContentOverlay extends Overlay {
	private String type  = "remove";

	public RemoveContentOverlay() {
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "RemoveContentOverlay@"+hashCode()+"[type = "+type+"]";
	}
}
