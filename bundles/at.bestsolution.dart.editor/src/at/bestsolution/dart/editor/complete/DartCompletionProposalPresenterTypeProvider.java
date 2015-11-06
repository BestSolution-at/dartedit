package at.bestsolution.dart.editor.complete;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.fx.services.CompletionProposalPresenter;
import org.eclipse.fx.code.editor.fx.services.CompletionProposalPresenterTypeProvider;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.dart.editor.doc.DartInput;

@SuppressWarnings("restriction")
@Component
public class DartCompletionProposalPresenterTypeProvider implements CompletionProposalPresenterTypeProvider {

	@Override
	public Class<? extends CompletionProposalPresenter> getType(Input<?> s) {
		return DartCompletionProposalPresenter.class;
	}

	@Override
	public boolean test(Input<?> t) {
		return t instanceof DartInput;
	}

}
