package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class AddContentOverlay extends Overlay {
	private String content ;
	private String type  = "add";

	public AddContentOverlay() {
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "AddContentOverlay@"+hashCode()+"[content = "+content+", type = "+type+"]";
	}
}
