package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SearchFindElementReferencesResult {
	private SearchId id;
	private Element element;

	public SearchFindElementReferencesResult() {
	}

	public SearchId getId() {
		return this.id;
	}

	public void setId(SearchId id) {
		this.id = id;
	}
	public Element getElement() {
		return this.element;
	}

	public void setElement(Element element) {
		this.element = element;
	}
}
