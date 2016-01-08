package at.bestsolution.dart.server.api.services;

import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public interface ServiceSearch extends at.bestsolution.dart.server.api.DartService {
	// Requests
	public at.bestsolution.dart.server.api.model.SearchFindElementReferencesResult findElementReferences(java.lang.String file,int offset,boolean includePotential);
	public at.bestsolution.dart.server.api.model.SearchFindMemberDeclarationsResult findMemberDeclarations(String name);
	public at.bestsolution.dart.server.api.model.SearchFindMemberReferencesResult findMemberReferences(String name);
	public at.bestsolution.dart.server.api.model.SearchFindTopLevelDeclarationsResult findTopLevelDeclarations(String pattern);
	public at.bestsolution.dart.server.api.model.SearchGetTypeHierarchyResult getTypeHierarchy(java.lang.String file,int offset);

	// Notifications
	public at.bestsolution.dart.server.api.Registration results( java.util.function.Consumer<at.bestsolution.dart.server.api.model.SearchResultsNotification> consumer);
}
