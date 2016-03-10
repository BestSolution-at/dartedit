package at.bestsolution.dart.editor.services.complete;

import org.eclipse.fx.code.editor.services.CompletionProposal.BaseCompletetionProposal;
import org.eclipse.fx.code.editor.services.CompletionProposal.TextSelection;
import org.eclipse.jface.text.IDocument;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.fx.code.editor.services.ContextInformation;

import at.bestsolution.dart.server.api.model.CompletionResultsNotification;
import at.bestsolution.dart.server.api.model.CompletionSuggestion;
import at.bestsolution.dart.server.api.model.CompletionSuggestionKind;
import at.bestsolution.dart.server.api.model.ElementKind;

@SuppressWarnings("restriction")
public class DartCompletionProposal extends BaseCompletetionProposal implements Comparable<DartCompletionProposal> {
	public final CompletionResultsNotification notification;
	public final CompletionSuggestion proposal;

	private static int getSelectionOffset(CompletionSuggestion proposal) {
		String completion = proposal.getCompletion();
		if (proposal.getElement() != null && proposal.getElement().getKind() == ElementKind.METHOD) {
				return completion.length() + 1;
		}

		if (proposal.getKind() == CompletionSuggestionKind.ARGUMENT_LIST) {
			return 0;
		}

		return completion.length();
	}

	private static String fixCompletion(CompletionSuggestion proposal) {
		// fix completion string for method invocations
		String completion = proposal.getCompletion();
		if (proposal.getElement() != null && proposal.getElement().getKind() == ElementKind.METHOD) {
			if (proposal.getRequiredParameterCount() == 0) {
				completion += "()";
			}
			else {
				completion += "()";
//				completion += "(" + Arrays.stream(proposal.getParameterNames()).collect(Collectors.joining(", ")) + ")";
			}
		}


		if (proposal.getKind() == CompletionSuggestionKind.ARGUMENT_LIST) {
			completion = "";
		}

		return completion;
	}

	@Override
	public TextSelection getSelection(IDocument document) {
		return new TextSelection(getReplacementOffset()+getSelectionOffset(proposal), 0);
	}

	public DartCompletionProposal(CompletionResultsNotification notification, CompletionSuggestion proposal, ContextInformation contextInformation) {
		super(fixCompletion(proposal),notification.getReplacementOffset(),notification.getReplacementLength(), proposal.getCompletion(), contextInformation);
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
