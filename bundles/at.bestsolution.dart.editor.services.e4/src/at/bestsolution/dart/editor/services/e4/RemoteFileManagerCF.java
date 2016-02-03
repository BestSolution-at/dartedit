package at.bestsolution.dart.editor.services.e4;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MAddon;
import org.eclipse.e4.ui.model.application.MApplication;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.dart.editor.services.DartRemoteFileManager;

@Component(service=IContextFunction.class,property={"service.context.key=at.bestsolution.dart.editor.services.DartRemoteFileManager"})
public class RemoteFileManagerCF extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		MApplication app = context.get(MApplication.class);
		Object rv = app.getAddons()
				.stream()
				.filter( a -> a.getObject() instanceof DartRemoteFileManager)
				.findFirst()
				.map( a -> a.getObject())
				.orElse(null);
		return rv;
	}
}
