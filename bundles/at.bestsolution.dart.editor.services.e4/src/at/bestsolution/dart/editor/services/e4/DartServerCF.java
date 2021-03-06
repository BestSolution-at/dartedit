package at.bestsolution.dart.editor.services.e4;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.InputContext;
import org.eclipse.fx.code.editor.services.InputContextLookup;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.dart.server.api.DartServerFactory;

@Component(service=IContextFunction.class,property={"service.context.key=at.bestsolution.dart.server.api.DartServer"})
public class DartServerCF extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		DartServerFactory factory = context.get(DartServerFactory.class);
		InputContext inputContext = context.get(InputContextLookup.class).getContext(context.get(Input.class));
		return factory.getServer(inputContext.getId());
	}
}
