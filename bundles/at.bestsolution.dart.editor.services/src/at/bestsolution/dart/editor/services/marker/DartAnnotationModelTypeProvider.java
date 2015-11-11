package at.bestsolution.dart.editor.services.marker;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.services.AnnotationModelTypeProvider;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.dart.editor.services.doc.DartInput;

@Component
public class DartAnnotationModelTypeProvider implements AnnotationModelTypeProvider {

	@Override
	public boolean test(Input<?> input) {
		return input instanceof DartInput;
	}

	@Override
	public Class<? extends IAnnotationModel> getType(Input<?> input) {
		return DartAnnotationModel.class;
	}

}
