package at.bestsolution.dart.editor.complete;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.SourceFileInput;
import org.eclipse.fx.code.editor.fx.services.ContextInformationPresenterTypeProvider;
import org.osgi.service.component.annotations.Component;

@SuppressWarnings("restriction")
@Component
public class DartContextInformationPresenterTypeProvider implements ContextInformationPresenterTypeProvider {

	@Override
	public Class<? extends DartContextInformationPresenter> getType(Input<?> s) {
		return DartContextInformationPresenter.class;
	}

	@Override
	public boolean test(Input<?> input) {
		return input instanceof SourceFileInput && ((SourceFileInput)input).getURI().endsWith(".dart");
	}

}
