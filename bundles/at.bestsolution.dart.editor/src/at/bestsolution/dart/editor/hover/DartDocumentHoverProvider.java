package at.bestsolution.dart.editor.hover;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.LocalSourceFileInput;
import org.eclipse.fx.text.hover.DefaultHoverInfoType;
import org.eclipse.fx.text.hover.DocumentHoverProvider;
import org.eclipse.fx.text.hover.HoverInfo;
import org.eclipse.fx.text.hover.HtmlString;
import org.eclipse.fx.text.hover.LinkActionEvent;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.Region;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.model.AnalysisGetHoverResult;
import at.bestsolution.dart.server.api.services.ServiceAnalysis;

public class DartDocumentHoverProvider implements DocumentHoverProvider {

	private ServiceAnalysis analysis;
	private LocalSourceFileInput fInput;

	@Inject
	public DartDocumentHoverProvider(DartServer server, Input<?> input) {
		fInput = (LocalSourceFileInput) input;
		analysis = server.getService(ServiceAnalysis.class);
	}

	private Optional<Position> findPosition(IDocument document, int offset) {
		try {
		for (String cat : document.getPositionCategories()) {
			for (Position p : document.getPositions(cat)) {
				if (p.offset >= offset && p.offset + p.length < offset) {
					// match
					return Optional.of(p);
				}
			}
		}
		}
		catch (BadPositionCategoryException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}

	@Override
	public Set<HoverInfo> getHoverInfo(IDocument document, int offset) {
		System.err.println("GET HOVER INFO: " + offset);
		try {
			ITypedRegion partition = document.getPartition(offset);
			String partitionType = partition.getType();
			System.err.println("partition Type = " + partitionType);
			Optional<Position> position = findPosition(document, offset);
			System.err.println(" position = " + position);

			Region region = position.isPresent() ? new Region(position.get().offset, position.get().length) : new Region(offset, 0);

			
			if( IDocument.DEFAULT_CONTENT_TYPE.equals(partitionType) ) {
				AnalysisGetHoverResult hover = analysis.getHover(fInput.getPath().toAbsolutePath().toString(), offset);
				
				String text = hover.getHovers().length > 0 ? hover.getHovers()[0].getDartdoc() : "";
				System.err.println(" -> " + text);
				
				String type = hover.getHovers().length > 0 ? hover.getHovers()[0].getStaticType() : "";

				HtmlString html = new HtmlString("<a href=\"lulu\">Lulu</a><h3>" + type + "</h3><p>" + text + "</p>");
				html.addEventHandler(LinkActionEvent.LINK_ACTION, e -> {System.err.println("Link pressed: " + e.getLinkTarget());});
				
				if (text != null && !text.isEmpty()) {
					return Collections.singleton(new HoverInfo(DefaultHoverInfoType.DOCUMENTATION, region, html, null));
				}
			}
		}
		catch (BadLocationException e) {
			e.printStackTrace();
		}
		return Collections.emptySet();
	}

}
