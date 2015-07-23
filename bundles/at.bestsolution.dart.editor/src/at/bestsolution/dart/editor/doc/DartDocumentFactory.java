package at.bestsolution.dart.editor.doc;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.services.DocumentTypeProvider;
import org.eclipse.fx.code.editor.services.InputDocument;
import org.eclipse.jface.text.IDocument;
import org.osgi.service.component.annotations.Component;

@Component(property="service.ranking:Integer=1")
public class DartDocumentFactory implements DocumentTypeProvider {

	@Override
	public boolean test(Input<?> input) {
		return input instanceof DartInput;
	}

	@Override
	public Class<? extends IDocument> getType(Input<?> s) {
		return InputDocument.class;
	}
}
