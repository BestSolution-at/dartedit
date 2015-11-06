package at.bestsolution.dart.editor.complete;

import org.eclipse.fx.code.editor.fx.services.CompletionProposalPresenter;
import org.eclipse.fx.code.editor.fx.services.FXCompletionProposal;
import org.eclipse.fx.code.editor.services.CompletionProposal;
import org.eclipse.fx.text.ui.contentassist.ICompletionProposal;

@SuppressWarnings("restriction")
public class DartCompletionProposalPresenter implements CompletionProposalPresenter {

	@Override
	public ICompletionProposal createProposal(CompletionProposal proposal) {
		DartCompletionProposal prop = (DartCompletionProposal) proposal;
		return new FXCompletionProposal(proposal, prop.getGraphicSupplier());
	}

}
