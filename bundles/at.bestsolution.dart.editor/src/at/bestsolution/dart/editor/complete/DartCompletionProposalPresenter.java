package at.bestsolution.dart.editor.complete;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.fx.services.CompletionProposalPresenter;
import org.eclipse.fx.code.editor.fx.services.ContextInformationPresenter;
import org.eclipse.fx.code.editor.fx.services.FXCompletionProposal;
import org.eclipse.fx.code.editor.services.CompletionProposal;
import org.eclipse.fx.core.URI;
import org.eclipse.fx.text.ui.contentassist.ICompletionProposal;
import org.eclipse.fx.ui.controls.styledtext.StyledString;
import org.eclipse.fx.ui.services.resources.AdornedImageDescriptor;
import org.eclipse.fx.ui.services.resources.AdornedImageDescriptor.Adornment;
import org.eclipse.fx.ui.services.resources.AdornedImageDescriptor.Location;
import org.eclipse.fx.ui.services.resources.GraphicsLoader;

import at.bestsolution.dart.editor.services.complete.DartCompletionProposal;
import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.model.AnalysisGetHoverResult;
import at.bestsolution.dart.server.api.model.CompletionResultsNotification;
import at.bestsolution.dart.server.api.model.CompletionSuggestion;
import at.bestsolution.dart.server.api.model.CompletionSuggestionKind;
import at.bestsolution.dart.server.api.model.ElementKind;
import at.bestsolution.dart.server.api.services.ServiceAnalysis;
import javafx.scene.Node;

@SuppressWarnings("restriction")
public class DartCompletionProposalPresenter implements CompletionProposalPresenter {
	private final GraphicsLoader graphicsLoader;

	@Inject
	private ContextInformationPresenter contextInformationPresenter;

	private DartServer server;

	private ServiceAnalysis analysis;

	@Inject
	public DartCompletionProposalPresenter(DartServer server, GraphicsLoader graphicsLoader) {
		this.graphicsLoader = graphicsLoader;
		this.analysis = server.getService(ServiceAnalysis.class);
	}

	@Override
	public ICompletionProposal createProposal(CompletionProposal proposal) {
		DartCompletionProposal p = (DartCompletionProposal) proposal;

		return mapToCompletion(p, p.notification,p.proposal);
	}

	private FXCompletionProposal<DartCompletionProposal> mapToCompletion(DartCompletionProposal proposal, CompletionResultsNotification notification, CompletionSuggestion suggestion) {
		StyledString s = new StyledString();

		URI baseImage;
		List<Adornment> adornments = new ArrayList<>();


		if( suggestion.getKind() == CompletionSuggestionKind.KEYWORD ) {
			baseImage = null;
			s.appendSegment(suggestion.getCompletion(), "dart-element-name");
		} else if( suggestion.getKind() == CompletionSuggestionKind.INVOCATION ) {
			if( suggestion.getElement() != null ) {
				if (suggestion.getElement().getKind() == ElementKind.LOCAL_VARIABLE) {
					baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/local_field_obj.png");;
					s.appendSegment(suggestion.getElement().getName() + " \u2192 " + suggestion.getReturnType(), "dart-element-name");
				}
				else if (suggestion.getElement().getKind() == ElementKind.CLASS) {
					baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/classpub_obj.png");
					s.appendSegment(suggestion.getElement().getName(), "dart-element-name");
				}
				else if( suggestion.getElement().getKind() == ElementKind.FUNCTION
						|| suggestion.getElement().getKind() == ElementKind.METHOD
						|| suggestion.getElement().getKind() == ElementKind.GETTER
						|| suggestion.getElement().getKind() == ElementKind.SETTER) {
					if( suggestion.getElement().getKind() == ElementKind.GETTER ) {
						s.appendSegment(suggestion.getElement().getName() + " \u2192 " + suggestion.getReturnType(), "dart-element-name");
						adornments.add(new Adornment(Location.LEFT_TOP,URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/7/property.png")));
					} else {
						s.appendSegment(suggestion.getElement().getName() + (suggestion.getElement().getParameters() == null ? "()": suggestion.getElement().getParameters()) + " \u2192 " + suggestion.getReturnType(), "dart-element-name");
					}

					if( suggestion.getDeclaringType() != null ) {
						s.appendSegment(" \u2014 " + suggestion.getDeclaringType(), "dart-type-info");
					}

					if( (suggestion.getElement().getFlags() & 0x10) == 0x10 ) {
						baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/methpri_obj.png");
					} else {
						baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/methpub_obj.png");
					}
				} else if( suggestion.getElement().getKind() == ElementKind.FIELD ) {
					s.appendSegment(suggestion.getElement().getName() + " \u2192 " + suggestion.getReturnType(), "dart-element-name");

					if( suggestion.getDeclaringType() != null ) {
						s.appendSegment(" \u2014 " + suggestion.getDeclaringType(), "dart-type-info");
					}

					if( (suggestion.getElement().getFlags() & 0x10) == 0x10 ) {
						baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/field_private_obj.png");
					} else {
						baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/field_public_obj.png");
					}
				} else {
					s.appendSegment(suggestion.getElement().getKind() + " => " + suggestion.getCompletion(), "dart-element-name");
					baseImage = null;
				}
			} else {
				baseImage = URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/methpub_obj.png");
				s.appendSegment(suggestion.getKind() + " => " + suggestion.getCompletion(), "dart-element-name");
			}
		} else {
			baseImage = null;
			s.appendSegment(suggestion.getCompletion(), "java-element-name");
		}

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

		// suggestion.getDocComplete() always returns Doc Complete missing
		Function<DartCompletionProposal, String> documentation = p -> {
			AnalysisGetHoverResult hover = analysis.getHover(p.proposal.getElement().getLocation().getFile(), p.proposal.getElement().getLocation().getOffset());
			String text = hover.getHovers().length > 0 ? hover.getHovers()[0].getDartdoc() : "no documentation";
			return text == null ? "no documentation" : text;
		};
		return new FXCompletionProposal<>(proposal, p -> s, p -> supplier.get(), contextInformationPresenter.createInformation(proposal.getContextInformation()), documentation);
	}

	@Override
	public String getAutoTriggers() {
		return ".";
	}
}
