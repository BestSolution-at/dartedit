package at.bestsolution.dart.editor.services.marker;

import org.eclipse.jface.text.source.Annotation;

import at.bestsolution.dart.server.api.model.AnalysisError;

public class DartBreakpointAnnotation extends Annotation {

	private boolean active = false;

	public DartBreakpointAnnotation() {
		super("dart.annotation.breakpoint", false, "");
	}

	@Override
	public String toString() {
		return "DartBreakpointAnnotation("+getType()+")";
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}


}
