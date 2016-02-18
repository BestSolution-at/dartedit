package at.bestsolution.dart.editor.complete;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.fx.services.ContextInformationPresenterTypeProvider;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.dart.editor.services.doc.DartInput;

@SuppressWarnings("restriction")
@Component
public class DartContextInformationPresenterTypeProvider implements ContextInformationPresenterTypeProvider {

	@Override
	public Class<? extends DartContextInformationPresenter> getType(Input<?> s) {
		return DartContextInformationPresenter.class;
	}

	@Override
	public boolean test(Input<?> t) {
		return t instanceof DartInput;
	}

}
