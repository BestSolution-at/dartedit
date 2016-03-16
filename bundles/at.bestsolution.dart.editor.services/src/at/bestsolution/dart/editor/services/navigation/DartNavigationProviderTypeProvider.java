package at.bestsolution.dart.editor.services.navigation;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.SourceFileInput;
import org.eclipse.fx.code.editor.services.NavigationProvider;
import org.eclipse.fx.code.editor.services.NavigationProviderTypeProvider;
import org.osgi.service.component.annotations.Component;


@Component
public class DartNavigationProviderTypeProvider implements NavigationProviderTypeProvider {

	@Override
	public boolean test(Input<?> input) {
		return input instanceof SourceFileInput && ((SourceFileInput)input).getURI().endsWith(".dart");
	}

	@Override
	public Class<? extends NavigationProvider> getType(Input<?> input) {
		return DartNavigationProvider.class;
	}

}
