package at.bestsolution.dart.editor.marker;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.fx.services.AnnotationPresenterTypeProvider;
import org.eclipse.fx.text.ui.source.AnnotationPresenter;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.dart.editor.doc.DartInput;

@Component
public class DartAnnotationPresenterTypeProvider implements AnnotationPresenterTypeProvider {

	@Override
	public Class<? extends AnnotationPresenter> getType(Input<?> s) {
		return DartAnnotationPresenter.class;
	}

	@Override
	public boolean test(Input<?> t) {
		return t instanceof DartInput;
	}

}
