package at.bestsolution.dart.editor.presenter;

import org.eclipse.fx.text.ui.source.ITextAnnotationPresenter;
import org.eclipse.jface.text.source.Annotation;

import at.bestsolution.dart.editor.services.marker.SameWordAnnotation;
import javafx.scene.Node;
import javafx.scene.layout.Region;

public class SameWordMarker implements ITextAnnotationPresenter {

	@Override
	public boolean isApplicable(Annotation annotation) {
		return annotation instanceof SameWordAnnotation;
	}

	@Override
	public Node createNode() {
		Region r = new Region();
		r.getStyleClass().add("same-word-annotation");
		return r;
	}

	@Override
	public void updateNode(Node node, Annotation annotation) {
	}

	@Override
	public String toString() {
		return "SameWordMarkerAP@" + hashCode();
	}
}
