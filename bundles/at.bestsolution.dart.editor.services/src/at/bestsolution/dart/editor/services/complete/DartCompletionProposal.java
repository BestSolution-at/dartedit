package at.bestsolution.dart.editor.services.complete;

import org.eclipse.fx.code.editor.services.CompletionProposal.BaseCompletetionProposal;
import org.eclipse.fx.code.editor.services.ContextInformation;

import at.bestsolution.dart.server.api.model.CompletionResultsNotification;
import at.bestsolution.dart.server.api.model.CompletionSuggestion;

@SuppressWarnings("restriction")
public class DartCompletionProposal extends BaseCompletetionProposal implements Comparable<DartCompletionProposal> {
	public final CompletionResultsNotification notification;
	public final CompletionSuggestion proposal;

	public DartCompletionProposal(CompletionResultsNotification notification, CompletionSuggestion proposal, ContextInformation contextInformation) {
		super(proposal.getCompletion(),notification.getReplacementOffset(),notification.getReplacementLength(),proposal.getCompletion(), contextInformation);
		this.notification = notification;
		this.proposal = proposal;
	}

	@Override
	public int compareTo(DartCompletionProposal o) {
		int compare = Integer.compare(o.proposal.getRelevance(), proposal.getRelevance());
		if( compare == 0 ) {
			compare = getLabel().toString().compareTo(o.getLabel().toString());
		}
		return compare;
	}
}
