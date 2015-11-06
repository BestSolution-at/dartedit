package at.bestsolution.dart.editor.hover;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.services.HoverInformationProvider;
import org.eclipse.fx.code.editor.services.HoverInformationProviderTypeProvider;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.dart.editor.doc.DartInput;

@Component
public class DartTextHoverMapProvider implements HoverInformationProviderTypeProvider {

	@Override
	public Class<? extends HoverInformationProvider> getType(Input<?> s) {
		return DartTextHoverMap.class;
	}

	@Override
	public boolean test(Input<?> t) {
		return t instanceof DartInput;
	}

}
