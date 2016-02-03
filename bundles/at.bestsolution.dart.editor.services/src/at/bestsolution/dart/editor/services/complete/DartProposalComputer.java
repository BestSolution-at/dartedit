package at.bestsolution.dart.editor.services.complete;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.fx.code.editor.LocalFile;
import org.eclipse.fx.code.editor.services.CompletionProposal;
import org.eclipse.fx.code.editor.services.ProposalComputer;
import org.eclipse.fx.core.log.Log;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.jface.text.IDocument;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.Registration;
import at.bestsolution.dart.server.api.model.CompletionGetSuggestionsResult;
import at.bestsolution.dart.server.api.model.CompletionResultsNotification;
import at.bestsolution.dart.server.api.model.CompletionSuggestion;
import at.bestsolution.dart.server.api.services.ServiceCompletion;

@SuppressWarnings("restriction")
public class DartProposalComputer implements ProposalComputer {

	private String requestId;
	private ServiceCompletion completionService;
	private Registration proposalRegistration;
	private CompletableFuture<List<CompletionProposal>> future;
	private List<CompletionProposal> completions = new ArrayList<>();

	private Logger logger;

	@Inject
	public DartProposalComputer(IDocument document, DartServer server, @Log Logger logger) {
		this.logger = logger;
		this.logger.debug("Creating proposal computer");
		completionService = server.getService(ServiceCompletion.class);

		proposalRegistration = completionService.results(this::handleHandleResults);
	}

	private synchronized void handleHandleResults(CompletionResultsNotification notification) {
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
					future.complete(tmp);
				} else {
					System.err.println("Received informations after the last item has been sent");
				}
			}
		}
	}

	private DartCompletionProposal mapToCompletion(CompletionResultsNotification notification, CompletionSuggestion proposal) {
		return new DartCompletionProposal(notification,proposal);
	}

	@Override
	public CompletableFuture<List<CompletionProposal>> compute(ProposalContext context) {
		LocalFile p = (LocalFile) context.input;
		Path file = p.getPath();

		CompletionGetSuggestionsResult result = completionService.getSuggestions(file.toString(), context.location);
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
