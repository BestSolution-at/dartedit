package at.bestsolution.dart.editor.services.complete;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.LocalFile;
import org.eclipse.fx.code.editor.services.CompletionProposal;
import org.eclipse.fx.code.editor.services.ContextInformation;
import org.eclipse.fx.code.editor.services.EditingContext;
import org.eclipse.fx.code.editor.services.ProposalComputer;
import org.eclipse.fx.code.editor.services.URIProvider;
import org.eclipse.fx.core.log.Log;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.jface.text.IDocument;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.Registration;
import at.bestsolution.dart.server.api.model.CompletionGetSuggestionsResult;
import at.bestsolution.dart.server.api.model.CompletionResultsNotification;
import at.bestsolution.dart.server.api.model.CompletionSuggestion;
import at.bestsolution.dart.server.api.model.CompletionSuggestionKind;
import at.bestsolution.dart.server.api.model.ElementKind;
import at.bestsolution.dart.server.api.services.ServiceCompletion;

@SuppressWarnings("restriction")
public class DartProposalComputer implements ProposalComputer {

	private final Input<?> input;
	private final EditingContext editingContext;

	private String requestId;
	private ServiceCompletion completionService;
	private Registration proposalRegistration;
	private CompletableFuture<List<CompletionProposal>> future;
	private List<CompletionProposal> completions = new ArrayList<>();

	private Logger logger;

	@Inject
	public DartProposalComputer(IDocument document, Input<?> input, EditingContext editingContext, DartServer server, @Log Logger logger) {
		this.logger = logger;
		this.logger.debug("Creating proposal computer");
		this.input = input;
		this.editingContext = editingContext;
		completionService = server.getService(ServiceCompletion.class);

		proposalRegistration = completionService.results(this::handleHandleResults);
	}

	private synchronized void handleHandleResults(CompletionResultsNotification notification) {
		System.err.println("handleResult("+notification.getId()+")");
		if( requestId != null && requestId.equals(notification.getId()) ) {
			completions.addAll(Stream.of(notification.getResults()).map( e -> mapToCompletion(notification, e)).collect(Collectors.toList()));
			if( notification.getIsLast() ) {
				List<CompletionProposal> tmp = completions;
				completions = new ArrayList<>();
				if( ! future.isDone() ) {
					Collections.sort(tmp, new Comparator<CompletionProposal>() {

						@Override
						public int compare(CompletionProposal o1, CompletionProposal o2) {
							return ((DartCompletionProposal)o1).compareTo((DartCompletionProposal) o2);
						}
					});
//					for (CompletionProposal p : tmp) {
//						System.err.println(" * " + p.getLabel() + " -> " + p.getContextInformation());
//					}
					future.complete(tmp);
				} else {
					System.err.println("Received informations after the last item has been sent");
				}
			}
		}
		else {
			System.err.println("dropping result for request " + notification.getId());
		}
	}

	private ContextInformation createContextInformation(CompletionResultsNotification notification, CompletionSuggestion proposal) {
//		System.err.println(" - " + proposal.getCompletion());
//		System.err.println("kind: " + proposal.getKind());
//		System.err.println(proposal.getHasNamedParameters());
//		System.err.println(proposal.getElement());


		if (proposal.getElement() != null && proposal.getElement().getKind() == ElementKind.METHOD) {
			return new ContextInformation.BaseContextInformation(0, proposal.getElement().getParameters());
		}

		if (proposal.getKind() == CompletionSuggestionKind.ARGUMENT_LIST) {
			String paramString = "";
			for (int i = 0; i < proposal.getParameterTypes().length; i++) {
				paramString += proposal.getParameterTypes()[i] + " " + proposal.getParameterNames()[i];
				if (i < proposal.getParameterTypes().length - 1) {
					paramString +=", ";
				}
			}
			return new ContextInformation.BaseContextInformation(0, paramString);
		}
		return null;
	}

	private DartCompletionProposal mapToCompletion(CompletionResultsNotification notification, CompletionSuggestion proposal) {

//		System.err.println("notification " + notification.getReplacementOffset() + " - " + notification.getReplacementLength());
//		System.err.println("mapping " + proposal);
//		System.err.println(" el: " + proposal.getElement());
//
//		System.err.println(" " + proposal.getSelectionOffset() + " - " + proposal.getSelectionLength());

		return new DartCompletionProposal(notification, proposal, createContextInformation(notification, proposal));
	}

	@Override
	public CompletableFuture<List<CompletionProposal>> compute() {
		System.err.println("compute " + this);
		LocalFile p = (LocalFile) this.input;
		System.err.println(p.getPath());
		Path file = p.getPath().toAbsolutePath();

		CompletionGetSuggestionsResult result = completionService.getSuggestions(file.toString(), editingContext.getCaretOffset());
		requestId = result.getId();

		future = new CompletableFuture<>();

		return future;
	}

	@PreDestroy
	void cleanup() {
		if( proposalRegistration != null ) {
			proposalRegistration.dispose();
		}
	}
}
