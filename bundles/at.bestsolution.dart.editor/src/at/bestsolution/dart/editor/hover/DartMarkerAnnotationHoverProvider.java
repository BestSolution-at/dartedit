package at.bestsolution.dart.editor.hover;


import org.eclipse.fx.text.hover.AnnotationHoverProvider;
import org.eclipse.fx.text.hover.DefaultHoverInfoType;
import org.eclipse.fx.text.hover.HoverInfo;
import org.eclipse.fx.text.hover.HoverInfoType;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.source.Annotation;

import at.bestsolution.dart.editor.services.marker.DartAnnotation;
import at.bestsolution.dart.server.api.model.AnalysisErrorSeverity;

public class DartMarkerAnnotationHoverProvider implements AnnotationHoverProvider {

	@Override
	public boolean isApplicable(Class<? extends Annotation> annotationType) {
		return DartAnnotation.class.isAssignableFrom(annotationType);
	}

	private HoverInfoType map(AnalysisErrorSeverity severity) {
		switch(severity) {
			case ERROR: return DefaultHoverInfoType.ERROR;
			case WARNING: return DefaultHoverInfoType.WARNING;
			case INFO: return DefaultHoverInfoType.INFO;
		}
		return null;
	}

	@Override
	public HoverInfo getHoverInfo(Annotation annotation) {
		DartAnnotation dartAnnotation = (DartAnnotation) annotation;

		String message = dartAnnotation.getError().getMessage();

		return new HoverInfo(map(dartAnnotation.getError().getSeverity()), null, message, null);
	}

}
