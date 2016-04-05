package at.bestsolution.dart.editor.sample.dyn;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.fx.core.event.EventBus;

public class DynToggleHandler {
	@Execute
	public void toggle(EventBus eventBus) {
		eventBus.publish(SampleScannerCalc.TOGGLE_RULE, null, false);
	}
}
