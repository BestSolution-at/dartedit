package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class LinkedEditSuggestion  {
	private String value ;
	private LinkedEditSuggestionKind kind ;

	public LinkedEditSuggestion() {
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public LinkedEditSuggestionKind getKind() {
		return this.kind;
	}

	public void setKind(LinkedEditSuggestionKind kind) {
		this.kind = kind;
	}

	public String toString() {
		return "LinkedEditSuggestion@"+hashCode()+"[value = "+value+", kind = "+kind+"]";
	}
}
