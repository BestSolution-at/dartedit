package at.bestsolution.dart.editor.services.marker;

import org.eclipse.jface.text.source.Annotation;

import at.bestsolution.dart.server.api.model.AnalysisError;

public class DartAnnotation extends Annotation {
	private final AnalysisError error;

	public DartAnnotation(AnalysisError error) {
		super("dart.annotation."+error.getSeverity(), false, error.getMessage());
		this.error = error;
	}

	public AnalysisError getError() {
		return error;
	}

	@Override
	public String toString() {
		return "DartAnnotation("+getType()+")";
	}

}
