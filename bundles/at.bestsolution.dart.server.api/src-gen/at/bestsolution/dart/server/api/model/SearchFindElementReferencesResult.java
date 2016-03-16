package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SearchFindElementReferencesResult {
	private String id;
	private Element element;

	public SearchFindElementReferencesResult() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public Element getElement() {
		return this.element;
	}

	public void setElement(Element element) {
		this.element = element;
	}
}
