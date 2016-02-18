package at.bestsolution.dart.editor.hover;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.SourceFileInput;
import org.eclipse.fx.code.editor.services.HoverInformationProvider;
import org.eclipse.fx.code.editor.services.HoverInformationProviderTypeProvider;
import org.osgi.service.component.annotations.Component;


@Component
public class DartHoverInformationProviderTypeProvider implements HoverInformationProviderTypeProvider {

	@Override
	public Class<? extends HoverInformationProvider> getType(Input<?> s) {
		return DartHoverInformationProvider.class;
	}

	@Override
	public boolean test(Input<?> input) {
		return input instanceof SourceFileInput && ((SourceFileInput)input).getURI().endsWith(".dart");
	}

}
