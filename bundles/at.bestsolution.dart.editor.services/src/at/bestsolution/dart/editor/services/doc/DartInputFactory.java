package at.bestsolution.dart.editor.services.doc;

import org.eclipse.fx.code.editor.services.InputTypeProvider;
import org.osgi.service.component.annotations.Component;

@Component(property={"service.ranking:Integer=1"})
public class DartInputFactory implements InputTypeProvider {

	@Override
	public boolean test(String url) {
		return url.endsWith(".dart");
	}

	@Override
	public Class<DartInput> getType(String url) {
		return DartInput.class;
	}

}
