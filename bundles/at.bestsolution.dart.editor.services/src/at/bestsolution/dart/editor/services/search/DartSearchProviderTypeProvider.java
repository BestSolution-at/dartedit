package at.bestsolution.dart.editor.services.search;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.SourceFileInput;
import org.eclipse.fx.code.editor.services.SearchProvider;
import org.eclipse.fx.code.editor.services.SearchProviderTypeProvider;
import org.osgi.service.component.annotations.Component;


@Component
public class DartSearchProviderTypeProvider implements SearchProviderTypeProvider {

	@Override
	public boolean test(Input<?> input) {
		return input instanceof SourceFileInput && ((SourceFileInput)input).getURI().endsWith(".dart");
	}

	@Override
	public Class<? extends SearchProvider> getType(Input<?> input) {
		return DartSearchProvider.class;
	}

}
