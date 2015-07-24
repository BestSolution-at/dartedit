package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class LinkedEditGroup  {
	private Position[] positions ;
	private int length ;
	private LinkedEditSuggestion[] suggestions ;

	public LinkedEditGroup() {
	}

	public Position[] getPositions() {
		return this.positions;
	}

	public void setPositions(Position[] positions) {
		this.positions = positions;
	}
	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	public LinkedEditSuggestion[] getSuggestions() {
		return this.suggestions;
	}

	public void setSuggestions(LinkedEditSuggestion[] suggestions) {
		this.suggestions = suggestions;
	}

	public String toString() {
		return "LinkedEditGroup@"+hashCode()+"[positions = "+positions+", length = "+length+", suggestions = "+suggestions+"]";
	}
}
