package at.bestsolution.dart.server.api.services;

import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public interface ServiceEdit extends at.bestsolution.dart.server.api.DartService {
	// Requests
	public at.bestsolution.dart.server.api.model.EditFormatResult format(java.lang.String file,int selectionOffset,int selectionLength);
	public at.bestsolution.dart.server.api.model.EditGetAssistsResult getAssists(java.lang.String file,int offset,int length);
	public at.bestsolution.dart.server.api.model.EditGetAvailableRefactoringsResult getAvailableRefactorings(java.lang.String file,int offset,int length);
	public at.bestsolution.dart.server.api.model.EditGetFixesResult getFixes(java.lang.String file,int offset);
	public at.bestsolution.dart.server.api.model.EditGetRefactoringResult getRefactoring(RefactoringKind kind,java.lang.String file,int offset,int length,int validateOnly,RefactoringOptions options);
	public at.bestsolution.dart.server.api.model.EditSortMembersResult sortMembers(java.lang.String file);

	// Notifications
}
