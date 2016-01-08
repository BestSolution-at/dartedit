package at.bestsolution.dart.server.api.services;

import at.bestsolution.dart.server.api.model.*;
import java.util.Map;

public interface ServiceAnalysis extends at.bestsolution.dart.server.api.DartService {
	// Requests
	public at.bestsolution.dart.server.api.model.AnalysisGetErrorsResult getErrors(java.lang.String file);
	public at.bestsolution.dart.server.api.model.AnalysisGetHoverResult getHover(java.lang.String file,int offset);
	public at.bestsolution.dart.server.api.model.AnalysisGetLibraryDependenciesResult getLibraryDependencies();
	public at.bestsolution.dart.server.api.model.AnalysisGetNavigationResult getNavigation(java.lang.String file,int offset,int length);
	public void reanalyze(java.lang.String[] roots);
	public void setAnalysisRoots(java.lang.String[] included,java.lang.String[] excluded,Map<java.lang.String,java.lang.String> packageRoots);
	public void setPriorityFiles(java.lang.String[] files);
	public void setSubscriptions(Map<AnalysisService,java.lang.String[]> subscriptions);
	public void updateContent(Map<java.lang.String,Overlay> files);
	public void updateOptions(AnalysisOptions options);

	// Notifications
	public at.bestsolution.dart.server.api.Registration errors( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisErrorsNotification> consumer);
	public at.bestsolution.dart.server.api.Registration flushResults( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisFlushResultsNotification> consumer);
	public at.bestsolution.dart.server.api.Registration folding( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisFoldingNotification> consumer);
	public at.bestsolution.dart.server.api.Registration highlights( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisHighlightsNotification> consumer);
	public at.bestsolution.dart.server.api.Registration invalidate( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisInvalidateNotification> consumer);
	public at.bestsolution.dart.server.api.Registration navigation( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisNavigationNotification> consumer);
	public at.bestsolution.dart.server.api.Registration occurrences( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOccurrencesNotification> consumer);
	public at.bestsolution.dart.server.api.Registration outline( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOutlineNotification> consumer);
	public at.bestsolution.dart.server.api.Registration overrides( java.util.function.Consumer<at.bestsolution.dart.server.api.model.AnalysisOverridesNotification> consumer);
}
