package at.bestsolution.dart.editor.sample.dyn;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.configuration.text.DynamicScannerRuleCalculator;
import org.eclipse.fx.code.editor.configuration.text.DynamicScannerRuleCalculatorTypeProvider;
import org.osgi.service.component.annotations.Component;

@SuppressWarnings("restriction")
@Component
public class SampleDynScannerRuleCalculatorTypeProvider implements DynamicScannerRuleCalculatorTypeProvider {

	@Override
	public Class<? extends DynamicScannerRuleCalculator> getType(Input<?> s) {
		return SampleScannerCalc.class;
	}

	@Override
	public boolean test(Input<?> t) {
		return true;
	}

}
