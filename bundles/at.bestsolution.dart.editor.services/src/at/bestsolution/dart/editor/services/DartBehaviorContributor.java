package at.bestsolution.dart.editor.services;

import java.text.BreakIterator;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.services.BehaviorContributor;
import org.eclipse.fx.code.editor.services.EditingContext;
import org.eclipse.fx.core.text.DefaultTextEditActions;
import org.eclipse.fx.core.text.SourceTextEditActions;
import org.eclipse.fx.core.text.TextEditAction;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

public class DartBehaviorContributor implements BehaviorContributor {

	private final EditingContext editingContext;
	private final IDocument document;

	@Inject
	public DartBehaviorContributor(IDocument document, EditingContext editingContext) {
		this.document = document;
		this.editingContext = editingContext;
	}

	public final static TextEditAction CUSTOM_FUN = new TextEditAction() {
	};

	@Override
	public void initializeMapping(MappingRegistry mapping) {
		// add autocompletion trigger for a typed character
		mapping.map('.', SourceTextEditActions.PROPOSAL_REQUEST);

		// add autocompletion trigger for Ctrl+Enter
		mapping.map("Ctrl+Enter", SourceTextEditActions.PROPOSAL_REQUEST);

		// example for changing a default:
		mapping.map("Ctrl+Space", TextEditAction.NOOP);
		mapping.map("Ctrl+#", SourceTextEditActions.PROPOSAL_REQUEST);


		// add custom event
		mapping.map('ö', CUSTOM_FUN);

	}

	@Override
	public boolean handle(TextEditAction action) {

		// custom event handling
		if (action == CUSTOM_FUN) {
			try {
				this.document.replace(this.editingContext.getCaretOffset() - 1, 1, "var fun = \"Hello Dart!\";");
				this.editingContext.setCaretOffset(this.editingContext.getCaretOffset() + 23);
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
			return true;
		}

		// example to change word navigation behavior
		if (action == DefaultTextEditActions.WORD_NEXT) {
			BreakIterator wordInstance = new CamelCaseBreakIterator();
			wordInstance.setText(this.document.get());
			int following = wordInstance.following(this.editingContext.getCaretOffset());
			if (following != BreakIterator.DONE) {
				this.editingContext.setCaretOffset(following);
			}
			return true;
		}
		if (action == DefaultTextEditActions.WORD_PREVIOUS) {
			BreakIterator wordInstance = new CamelCaseBreakIterator();
			wordInstance.setText(this.document.get());
			int prev = wordInstance.preceding(this.editingContext.getCaretOffset());
			if (prev != BreakIterator.DONE) {
				this.editingContext.setCaretOffset(prev);
			}
			return true;
		}

		// example to change word selection behavior
		if (action == DefaultTextEditActions.SELECT_WORD_NEXT) {
			BreakIterator wordInstance = new CamelCaseBreakIterator();
			wordInstance.setText(this.document.get());
			int following = wordInstance.following(this.editingContext.getCaretOffset());
			if (following != BreakIterator.DONE) {
				this.editingContext.setCaretOffset(following, true);
			}
			return true;
		}
		if (action == DefaultTextEditActions.SELECT_WORD_PREVIOUS) {
			BreakIterator wordInstance = new CamelCaseBreakIterator();
			wordInstance.setText(this.document.get());
			int prev = wordInstance.preceding(this.editingContext.getCaretOffset());
			if (prev != BreakIterator.DONE) {
				this.editingContext.setCaretOffset(prev, true);
			}
			return true;
		}

		return BehaviorContributor.super.handle(action);
	}

}
