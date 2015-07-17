package at.bestsolution.dart.editor.complete;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.fx.services.ProposalComputer;
import org.eclipse.fx.code.editor.fx.services.ProposalComputerTypeProvider;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.dart.editor.doc.DartInput;

@Component
public class DartProposalComputerTypeProvider implements ProposalComputerTypeProvider {

	@Override
	public boolean test(Input<?> input) {
		return input instanceof DartInput;
	}

	@Override
	public Class<? extends ProposalComputer> getType(Input<?> input) {
		return DartProposalComputer.class;
	}

}
