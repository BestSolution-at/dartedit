package at.bestsolution.dart.editor.complete;

import org.eclipse.fx.code.editor.fx.services.ContextInformationPresenter;
import org.eclipse.fx.code.editor.services.ContextInformation;
import org.eclipse.fx.text.ui.contentassist.IContextInformation;

import javafx.scene.Node;

public class DartContextInformationPresenter implements ContextInformationPresenter {

	@Override
	public IContextInformation createInformation(final ContextInformation information) {
		if (information == null) return null;

		return new IContextInformation() {

			@Override
			public String getInformationDisplayString() {
				return information.getText().toString();
			}

			@Override
			public Node getGraphic() {
				return null;
			}

			@Override
			public int getContextInformationPosition() {
				return information.getOffset();
			}

			@Override
			public String getContextDisplayString() {
				return null;
			}
		};
	}

}
