package at.bestsolution.dart.editor.services.search;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.services.SearchProvider;
import org.eclipse.fx.code.editor.services.SearchProviderTypeProvider;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.dart.editor.services.doc.DartInput;

@Component
public class DartProposalComputerTypeProvider implements SearchProviderTypeProvider {

	@Override
	public boolean test(Input<?> input) {
		return input instanceof DartInput;
	}

	@Override
	public Class<? extends SearchProvider> getType(Input<?> input) {
		return DartSearchProvider.class;
	}

}
