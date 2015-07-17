package at.bestsolution.dart.editor.doc;

import java.util.Map.Entry;
import java.util.Optional;
import java.util.WeakHashMap;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.services.DocumentFactory;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.osgi.service.component.annotations.Component;

@Component(property="service.ranking:Integer=1")
public class DartDocumentFactory implements DocumentFactory {
	private WeakHashMap<IDocument, Input<?>> documents = new WeakHashMap<IDocument, Input<?>>();

	@Override
	public boolean test(Input<?> input) {
		return input instanceof DartInput;
	}

	@Override
	public IDocument create(Input<?> input) {
		IDocument document;

		Optional<Entry<IDocument, Input<?>>> first = documents.entrySet().stream().filter((e) -> e.getValue() == input).findFirst();
		if( first.isPresent() ) {
			document = first.get().getKey();
		} else {
			document = new Document(((DartInput)input).getData());
			document.addDocumentListener(new IDocumentListener() {

				@Override
				public void documentChanged(DocumentEvent event) {
					DartInput di = (DartInput) input;
					di.documentChanged(event.fDocument, event.fOffset, event.fLength, event.fText);
				}

				@Override
				public void documentAboutToBeChanged(DocumentEvent event) {

				}
			});
		}

		documents.put(document, input);
		return document;
	}

	@Override
	public boolean persistDocument(IDocument document) {
		Input<?> input = documents.get(document);
		if( input != null ) {
			DartInput fileInput = (DartInput)input;
			fileInput.setData(document.get());
			fileInput.persist();
			return true;
		}
		return false;
	}

}
