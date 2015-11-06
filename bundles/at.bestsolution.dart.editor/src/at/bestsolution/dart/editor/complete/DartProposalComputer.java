package at.bestsolution.dart.editor.complete;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.fx.code.editor.services.CompletionProposal;
import org.eclipse.fx.code.editor.services.ProposalComputer;
import org.eclipse.fx.code.editor.services.URIProvider;
import org.eclipse.fx.core.URI;
import org.eclipse.fx.core.log.Log;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.ui.controls.styledtext.StyledString;
import org.eclipse.fx.ui.services.resources.AdornedImageDescriptor;
import org.eclipse.fx.ui.services.resources.AdornedImageDescriptor.Adornment;
import org.eclipse.fx.ui.services.resources.AdornedImageDescriptor.Location;
import org.eclipse.fx.ui.services.resources.GraphicsLoader;
import org.eclipse.jface.text.IDocument;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.Registration;
import at.bestsolution.dart.server.api.model.CompletionGetSuggestionsResult;
import at.bestsolution.dart.server.api.model.CompletionResultsNotification;
import at.bestsolution.dart.server.api.model.CompletionSuggestion;
import at.bestsolution.dart.server.api.model.CompletionSuggestionKind;
import at.bestsolution.dart.server.api.model.ElementKind;
import at.bestsolution.dart.server.api.services.ServiceCompletion;
import javafx.scene.Node;

public class DartProposalComputer implements ProposalComputer {

	private GraphicsLoader graphicsLoader;
	private String requestId;
	private ServiceCompletion completionService;
	private Registration proposalRegistration;
	private CompletableFuture<List<CompletionProposal>> future;
	private List<CompletionProposal> completions = new ArrayList<>();

	private Logger logger;

	@Inject
	public DartProposalComputer(GraphicsLoader graphicsLoader, IDocument document, DartServer server, @Log Logger logger) {
		this.logger = logger;
		this.logger.debug("Creating proposal computer");
		this.graphicsLoader = graphicsLoader;
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
		StyledString s = new StyledString();

		URI baseImage;
		List<Adornment> adornments = new ArrayList<>();

		if( proposal.getKind() == CompletionSuggestionKind.KEYWORD ) {
			baseImage = null;
			s.appendSegment(proposal.getCompletion(), "dart-element-name");
		} else if( proposal.getKind() == CompletionSuggestionKind.INVOCATION ) {
			if( proposal.getElement() != null ) {
				if( proposal.getElement().getKind() == ElementKind.FUNCTION
						|| proposal.getElement().getKind() == ElementKind.METHOD
						|| proposal.getElement().getKind() == ElementKind.GETTER
						|| proposal.getElement().getKind() == ElementKind.SETTER) {
					if( proposal.getElement().getKind() == ElementKind.GETTER ) {
						s.appendSegment(proposal.getElement().getName() + " \u2192 " + proposal.getReturnType(), "dart-element-name");
						adornments.add(new Adornment(Location.LEFT_TOP,URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/7/property.png")));
					} else {
						s.appendSegment(proposal.getElement().getName() + (proposal.getElement().getParameters() == null ? "()": proposal.getElement().getParameters()) + " \u2192 " + proposal.getReturnType(), "dart-element-name");
					}

					if( proposal.getDeclaringType() != null ) {
						s.appendSegment(" \u2014 " + proposal.getDeclaringType(), "dart-type-info");
					}

					if( (proposal.getElement().getFlags() & 0x10) == 0x10 ) {
						baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/methpri_obj.png");
					} else {
						baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/methpub_obj.png");
					}
				} else if( proposal.getElement().getKind() == ElementKind.FIELD ) {
					s.appendSegment(proposal.getElement().getName() + " \u2192 " + proposal.getReturnType(), "dart-element-name");

					if( proposal.getDeclaringType() != null ) {
						s.appendSegment(" \u2014 " + proposal.getDeclaringType(), "dart-type-info");
					}

					if( (proposal.getElement().getFlags() & 0x10) == 0x10 ) {
						baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/field_private_obj.png");
					} else {
						baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/field_public_obj.png");
					}
				} else {
					s.appendSegment(proposal.getElement().getKind() + " => " + proposal.getCompletion(), "dart-element-name");
					baseImage = null;
				}
			} else {
				baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/methpub_obj.png");
				s.appendSegment(proposal.getKind() + " => " + proposal.getCompletion(), "dart-element-name");
			}
		} else {
			baseImage = null;
			s.appendSegment(proposal.getCompletion(), "java-element-name");
		}

//		if( proposal.getKind() == .getType() == Type.CLASS ) {
//			baseImage = URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/16/classpub_obj.png");
//
//			if( isStatic(cp.getModifiers()) ) {
//				adornments.add(new Adornment(Location.RIGHT_TOP,URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/7/static_co.png")));
//			} else if( isFinal(cp.getModifiers()) ) {
//				adornments.add(new Adornment(Location.RIGHT_TOP,URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/7/final_co.png")));
//			}
//		} else if( cp.getType() == Type.METHOD ) {
//			switch (cp.getVisibility()) {
//			case PACKAGE_PRIVATE:
//				baseImage = URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/16/methdef_obj.png");
//				break;
//			case PRIVATE:
//				baseImage = URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/16/methpri_obj.png");
//				break;
//			case PROTECTED:
//				baseImage = URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/16/methpro_obj.png");
//				break;
//			default:
//				baseImage = URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/16/methpub_obj.png");
//				break;
//			}
//
//			if( isStatic(cp.getModifiers()) ) {
//				adornments.add(new Adornment(Location.RIGHT_TOP,URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/7/static_co.png")));
//			} else if( isFinal(cp.getModifiers()) ) {
//				adornments.add(new Adornment(Location.RIGHT_TOP,URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/7/final_co.png")));
//			}
//		} else if( cp.getType() == Type.FIELD ) {
//			switch (cp.getVisibility()) {
//			case PACKAGE_PRIVATE:
//				baseImage = URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/16/field_default_obj.png");
//				break;
//			case PRIVATE:
//				baseImage = URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/16/field_private_obj.png");
//				break;
//			case PROTECTED:
//				baseImage = URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/16/field_protected_obj.png");
//				break;
//			default:
//				baseImage = URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/16/field_public_obj.png");
//				break;
//			}
//
//			if( isStatic(cp.getModifiers()) ) {
//				adornments.add(new Adornment(Location.RIGHT_TOP,URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/7/static_co.png")));
//			} else if( isFinal(cp.getModifiers()) ) {
//				adornments.add(new Adornment(Location.RIGHT_TOP,URI.createPlatformPluginURI("org.eclipse.fx.code.compensator.jdt", "css/icons/7/final_co.png")));
//			}
//
//		} else {
//			baseImage = null;
//		}

		Supplier<Node> supplier;
		if( baseImage != null ) {
			if( adornments.isEmpty() ) {
				supplier = () -> graphicsLoader.getGraphicsNode(baseImage);
			} else {
				supplier = () -> graphicsLoader.getGraphicsNode(new AdornedImageDescriptor(baseImage, adornments));
			}
		} else {
			supplier = () -> null;
		}

		DartCompletionProposal completetionProposal = new DartCompletionProposal(proposal.getRelevance(), proposal.getCompletion(), notification.getReplacementOffset(), notification.getReplacementLength(),s, supplier);
		return completetionProposal;
	}

	@Override
	public CompletableFuture<List<CompletionProposal>> compute(ProposalContext context) {
		URIProvider p = (URIProvider) context.input;
		Path file = Paths.get(java.net.URI.create(p.getURI().toString())).toAbsolutePath();

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
