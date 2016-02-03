package at.bestsolution.dart.editor.complete;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.SourceFileInput;
import org.eclipse.fx.code.editor.fx.services.CompletionProposalPresenter;
import org.eclipse.fx.code.editor.fx.services.CompletionProposalPresenterTypeProvider;
import org.osgi.service.component.annotations.Component;

@SuppressWarnings("restriction")
@Component
public class DartCompletionProposalPresenterTypeProvider implements CompletionProposalPresenterTypeProvider {

	@Override
	public Class<? extends CompletionProposalPresenter> getType(Input<?> s) {
		return DartCompletionProposalPresenter.class;
	}

	@Override
	public boolean test(Input<?> input) {
		return input instanceof SourceFileInput && ((SourceFileInput)input).getURI().endsWith(".dart");
	}

}
