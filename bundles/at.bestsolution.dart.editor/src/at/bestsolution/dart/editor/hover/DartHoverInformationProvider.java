package at.bestsolution.dart.editor.hover;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.LocalSourceFileInput;
import org.eclipse.fx.code.editor.services.HoverInformationProvider;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.model.AnalysisGetHoverResult;
import at.bestsolution.dart.server.api.services.ServiceAnalysis;

public class DartHoverInformationProvider implements HoverInformationProvider {

	private ServiceAnalysis analysis;
	private LocalSourceFileInput fInput;

	@Inject
	public DartHoverInformationProvider(DartServer server, Input<?> input) {
		fInput = (LocalSourceFileInput) input;
		analysis = server.getService(ServiceAnalysis.class);
	}

	@Override
	public CharSequence getHoverInformation(String partitionType, IRegion region) {
		if( IDocument.DEFAULT_CONTENT_TYPE.equals(partitionType) ) {
			AnalysisGetHoverResult hover = analysis.getHover(fInput.getPath().toAbsolutePath().toString(), region.getOffset());
			return hover.getHovers().length > 0 ? hover.getHovers()[0].getDartdoc() : "";
		}
		return null;
	}

	@Override
	public IRegion getHoverRegion(String partitionType, int offset) {
		return new Region(offset, 0);
	}


}
