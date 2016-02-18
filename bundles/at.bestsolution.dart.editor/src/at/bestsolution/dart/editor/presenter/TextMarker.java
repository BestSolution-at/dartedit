package at.bestsolution.dart.editor.presenter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.fx.text.ui.source.ITextAnnotationPresenter;
import org.eclipse.jface.text.source.Annotation;

import at.bestsolution.dart.editor.services.marker.DartAnnotation;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

public class TextMarker implements ITextAnnotationPresenter {

	@Override
	public boolean isApplicable(Annotation annotation) {
		return annotation instanceof DartAnnotation;
	}

	private Map<Node, Tooltip> blub = new HashMap<>();

	@Override
	public Node createNode() {
		Region r = new Region();
		Tooltip t = new Tooltip();
		Tooltip.install(r, t);
		blub.put(r, t);
		return r;
	}

	@Override
	public void updateNode(Node node, Annotation annotation) {
		Region r = (Region) node;

		DartAnnotation a = (DartAnnotation) annotation;

		Color c;
		switch (a.getError().getSeverity()) {
		case ERROR: c = Color.RED; break;
		case WARNING: c = Color.DARKORANGE; break;
		default:
		case INFO: c = Color.BLANCHEDALMOND; break;
		}
		r.setBorder(new Border(new BorderStroke(c, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(0, 0, 1.5, 0))));

		Tooltip t = blub.get(node);
		t.setText(a.getError().getMessage());
	}

}
