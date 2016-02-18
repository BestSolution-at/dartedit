package at.bestsolution.dart.editor.services.complete;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.SourceFileInput;
import org.eclipse.fx.code.editor.services.ProposalComputer;
import org.eclipse.fx.code.editor.services.ProposalComputerTypeProvider;
import org.osgi.service.component.annotations.Component;

@Component
public class DartProposalComputerTypeProvider implements ProposalComputerTypeProvider {

	@Override
	public boolean test(Input<?> input) {
		return input instanceof SourceFileInput && ((SourceFileInput)input).getURI().endsWith(".dart");
	}

	@Override
	public Class<? extends ProposalComputer> getType(Input<?> input) {
		return DartProposalComputer.class;
	}

}
