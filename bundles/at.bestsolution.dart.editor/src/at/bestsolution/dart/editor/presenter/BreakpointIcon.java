package at.bestsolution.dart.editor.presenter;

import java.util.Set;

import org.eclipse.fx.core.URI;
import org.eclipse.fx.text.ui.source.ILineRulerAnnotationPresenter;
import org.eclipse.fx.ui.services.resources.GraphicsLoader;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;

import at.bestsolution.dart.editor.services.marker.DartBreakpointAnnotation;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Node;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class BreakpointIcon implements ILineRulerAnnotationPresenter {

	private GraphicsLoader loader;
	private IAnnotationModel model;
	private IDocument document;

	private DoubleProperty width = new SimpleDoubleProperty(16);

	public BreakpointIcon(GraphicsLoader loader, IAnnotationModel model, IDocument document) {
		this.loader = loader;
		this.model = model;
		this.document = document;
	}

	@Override
	public DoubleProperty getWidth() {
		return width;
	}

	@Override
	public LayoutHint getLayoutHint() {
		return LayoutHint.ALIGN_CENTER;
	}

	@Override
	public int getOrder() {
		return 40;
	}

	@Override
	public boolean isApplicable(Annotation annotation) {
		return annotation instanceof DartBreakpointAnnotation;
	}

	private ImageView getImageView(Node node) {
		return (ImageView) ((BorderPane)node).getCenter();
	}

	@Override
	public Node createNode() {
		BorderPane area = new BorderPane();
		area.setMinWidth(16);
		area.setMinHeight(16);
		ImageView i = new ImageView();
		Tooltip tt = new Tooltip();
		Tooltip.install(i, tt);
		i.setUserData(tt);

		area.setCenter(i);

		return area;
	}

	private Image image;

	private Image getImage() {
		if (image == null) {
			image = loader.getImage(URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/brkp_obj.png"));
		}
		return image;
	}

	private void updateImageView(ImageView view, DartBreakpointAnnotation a) {
		view.setImage(getImage());
	}

	private void updateNode(Node node, DartBreakpointAnnotation a) {
		updateImageView(getImageView(node), a);
		node.setOnMouseClicked(e-> {
			if (e.getClickCount() == 2) {
				model.removeAnnotation(a);
				e.consume();
			}
		});
	}

	@Override
	public void updateNode(Node node, Set<Annotation> annotation) {
		annotation.stream().map(a->(DartBreakpointAnnotation) a).findFirst().ifPresent(a->
			updateNode(node, a)
		);
	}

	@Override
	public String toString() {
		return "DartStatusIconAP@" + hashCode();
	}

	private Position computePosition(int lineIdx) throws BadLocationException{
		IRegion lineInformation = document.getLineInformation(lineIdx);
		return new Position(lineInformation.getOffset(), lineInformation.getLength());
	}

	private void onLineRulerClick(int lineIdx, MouseEvent e) {
		if (e.getClickCount() == 2) {
			try {
				DartBreakpointAnnotation a = new DartBreakpointAnnotation();
				System.err.println("adding annotation " + a + "   " + System.identityHashCode(a));
				model.addAnnotation(a, computePosition(lineIdx));
			}
			catch (BadLocationException x) {
				// no add
			}
		}
	}

	@Override
	public void initialize(LineRuler lineRuler) {
		lineRuler.subscribeMouseClicked(this::onLineRulerClick);
	}
}
