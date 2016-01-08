package at.bestsolution.dart.app;

import org.eclipse.fx.ui.workbench.renderers.base.services.MaximizationTransitionService;
import org.eclipse.fx.ui.workbench.renderers.fx.services.ProgressiveMaximizationTransitionService;
import org.osgi.service.component.annotations.Component;

@SuppressWarnings("restriction")
@Component(service=MaximizationTransitionService.class)
public class MinMaxAnimation extends ProgressiveMaximizationTransitionService {

}
