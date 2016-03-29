package at.bestsolution.dart.editor.presenter;

import org.eclipse.fx.text.ui.source.ITextAnnotationPresenter;
import org.eclipse.jface.text.source.Annotation;

import at.bestsolution.dart.editor.services.marker.ActivePairAnnotation;
import javafx.scene.Node;
import javafx.scene.layout.Region;

public class PairMarker implements ITextAnnotationPresenter {

	@Override
	public boolean isApplicable(Annotation annotation) {
		return annotation instanceof ActivePairAnnotation;
	}

	@Override
	public Node createNode() {
		Region r = new Region();
		r.getStyleClass().add("pair-annotation");
		return r;
	}

	@Override
	public void updateNode(Node node, Annotation annotation) {
	}

	@Override
	public String toString() {
		return "DartPairMarkerAP@" + hashCode();
	}
}
