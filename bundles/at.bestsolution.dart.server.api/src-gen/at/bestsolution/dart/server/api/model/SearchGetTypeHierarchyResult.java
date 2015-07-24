package at.bestsolution.dart.server.api.model;

import java.util.Map;

public class SearchGetTypeHierarchyResult {
	private TypeHierarchyItem[] hierarchyItems;

	public SearchGetTypeHierarchyResult() {
	}

	public TypeHierarchyItem[] getHierarchyItems() {
		return this.hierarchyItems;
	}

	public void setHierarchyItems(TypeHierarchyItem[] hierarchyItems) {
		this.hierarchyItems = hierarchyItems;
	}
}
