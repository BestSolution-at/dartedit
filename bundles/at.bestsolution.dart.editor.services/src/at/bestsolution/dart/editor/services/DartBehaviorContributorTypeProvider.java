package at.bestsolution.dart.editor.services;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.SourceFileInput;
import org.eclipse.fx.code.editor.services.BehaviorContributor;
import org.eclipse.fx.code.editor.services.BehaviorContributorTypeProvider;
import org.osgi.service.component.annotations.Component;

@Component
public class DartBehaviorContributorTypeProvider implements BehaviorContributorTypeProvider {

	@Override
	public Class<? extends BehaviorContributor> getType(Input<?> s) {
		return DartBehaviorContributor.class;
	}

	@Override
	public boolean test(Input<?> input) {
		return input instanceof SourceFileInput && ((SourceFileInput)input).getURI().endsWith(".dart");
	}

}
