package at.bestsolution.dart.editor.presenter;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.fx.text.ui.source.AnnotationPresenter;
import org.eclipse.fx.text.ui.source.ILineRulerAnnotationPresenter;
import org.eclipse.fx.text.ui.source.ITextAnnotationPresenter;
import org.eclipse.fx.ui.services.resources.GraphicsLoader;

public class DartAnnotationPresenter implements AnnotationPresenter {

	@Inject
	GraphicsLoader loader;

	private Set<ITextAnnotationPresenter> textAnnotationPresenter = new HashSet<>();
	private Set<ILineRulerAnnotationPresenter> lineRulerAnnotationPresenter = new HashSet<>();


	@PostConstruct
	public void init() {
		lineRulerAnnotationPresenter.add(new LineRulerStatusIcon(loader));
		textAnnotationPresenter.add(new TextMarker());
	}


	@Override
	public Set<ITextAnnotationPresenter> getTextAnnotationPresenter() {
		return this.textAnnotationPresenter;
	}

	@Override
	public Set<ILineRulerAnnotationPresenter> getLineRulerAnnotationPresenter() {
		return this.lineRulerAnnotationPresenter;
	}

}
