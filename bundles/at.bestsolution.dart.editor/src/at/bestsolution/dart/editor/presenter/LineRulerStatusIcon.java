package at.bestsolution.dart.editor.presenter;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.fx.core.URI;
import org.eclipse.fx.text.ui.source.ILineRulerAnnotationPresenter;
import org.eclipse.fx.ui.services.resources.GraphicsLoader;
import org.eclipse.jface.text.source.Annotation;

import at.bestsolution.dart.editor.services.marker.DartAnnotation;
import at.bestsolution.dart.server.api.model.AnalysisError;
import at.bestsolution.dart.server.api.model.AnalysisErrorType;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LineRulerStatusIcon implements ILineRulerAnnotationPresenter {

	private GraphicsLoader loader;

	public LineRulerStatusIcon(GraphicsLoader loader) {
		this.loader = loader;
	}

	@Override
	public LayoutHint getLayoutHint() {
		return LayoutHint.ALIGN_CENTER;
	}

	@Override
	public int getOrder() {
		return 50;
	}

	@Override
	public boolean isApplicable(Annotation annotation) {
		return annotation instanceof DartAnnotation;
	}

	private Map<ImageView, Tooltip> tooltips = new HashMap<>();

	@Override
	public Node createNode() {
		ImageView i = new ImageView();
		Tooltip tt = new Tooltip();
		Tooltip.install(i, tt);
		tooltips.put(i, tt);
		return i;

//		Label label = new Label();
//		label.setGraphic(new ImageView());
//		label.setTooltip(new Tooltip());
//		return label;
	}

	private Comparator<AnalysisError> importance = (AnalysisError o1, AnalysisError o2) -> {
		return o2.getSeverity().compareTo(o1.getSeverity());
	};

	private Image taskImage;
	private Image errorImage;
	private Image warningImage;
	private Image infoImage;

	private Image getTaskImage() {
		if (taskImage == null) {
			taskImage = loader.getImage(URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/showtsk_tsk.png"));
		}
		return taskImage;
	}

	private Image getErrorImage() {
		if (errorImage == null) {
			errorImage = loader.getImage(URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/message_error.png"));
		}
		return errorImage;
	}

	private Image getWarningImage() {
		if (warningImage == null) {
			warningImage = loader.getImage(URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/message_warning.png"));
		}
		return warningImage;
	}

	private Image getInfoImage() {
		if (infoImage == null) {
			infoImage = loader.getImage(URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/message_info.png"));
		}
		return infoImage;
	}

	private Image getImage(AnalysisError error) {
		Image image = null;
		if( error.getType() == AnalysisErrorType.TODO ) {
			image = getTaskImage();
		} else {
			switch (error.getSeverity()) {
			case ERROR:
				image = getErrorImage();
				break;
			case INFO:
				image = getInfoImage();
				break;
			case WARNING:
				image = getWarningImage();
				break;
			default:
				break;
			}
		}
		return image;
	}

	private void updateLabel(Label node, Set<DartAnnotation> annotation) {
		Image image = null;

		List<AnalysisError> byImportance = annotation.stream().map(DartAnnotation::getError).sorted(importance).collect(Collectors.toList());

		if (!byImportance.isEmpty()) {
			image = getImage(byImportance.get(0));
		}
		((ImageView)node.getGraphic()).setImage(image);

		String message = computeMessage(byImportance);
		if (message == null || message.isEmpty()) {
			node.setTooltip(null);
		}
		else {
			// attaching and detaching is expensive - but there is no api to hide empty tooltips -.-
			Tooltip tt = node.getTooltip();
			if (tt == null){
				tt = new Tooltip(message);
				node.setTooltip(tt);
			}
			else {
				tt.setText(message);
			}
		}

	}

	private void updateImageView(ImageView node, Set<DartAnnotation> annotation) {
		Image image = null;

		List<AnalysisError> byImportance = annotation.stream().map(DartAnnotation::getError).sorted(importance).collect(Collectors.toList());

		if (!byImportance.isEmpty()) {
			image = getImage(byImportance.get(0));
		}
		node.setImage(image);



		String message = computeMessage(byImportance);
		if (message == null || message.isEmpty()) {
			tooltips.get(node).setText("");
		}
		else {
			// attaching and detaching is expensive - but there is no api to hide empty tooltips -.-
			Tooltip tt = tooltips.get(node);
			tt.setText(message);
		}

	}

	@Override
	public void updateNode(Node node, Set<Annotation> annotation) {
		updateImageView((ImageView) node, annotation.stream().map(a->(DartAnnotation) a).collect(Collectors.toSet()));
//		updateLabel((Label) node, annotation.stream().map(a->(DartAnnotation) a).collect(Collectors.toSet()));
	}

	private String computeMessage(List<AnalysisError> byImportance) {
		return byImportance.stream().map(e-> e.getSeverity() + ": " + e.getMessage()).collect(Collectors.joining("\n"));
	}

}
