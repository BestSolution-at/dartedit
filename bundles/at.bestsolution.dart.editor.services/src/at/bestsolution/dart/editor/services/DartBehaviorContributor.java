package at.bestsolution.dart.editor.services;

import java.text.BreakIterator;
import java.text.StringCharacterIterator;

import org.eclipse.fx.code.editor.services.BehaviorContributor;
import org.eclipse.fx.code.editor.services.EditingContext;
import org.eclipse.fx.core.text.DefaultTextEditActions;
import org.eclipse.fx.core.text.SourceTextEditActions;
import org.eclipse.fx.core.text.TextEditAction;
import org.eclipse.jface.text.BadLocationException;

public class DartBehaviorContributor implements BehaviorContributor {

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
	public boolean handle(TextEditAction action, EditingContext context) {

		// custom event handling
		if (action == CUSTOM_FUN) {
			try {
				context.document.replace(context.location - 1, 1, "var fun = \"Hello Dart!\";");
				context.editor.setCaret(context.location + 23);
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
			return true;
		}

		// example to change word navigation behavior
		if (action == DefaultTextEditActions.WORD_NEXT) {
			BreakIterator wordInstance = new CamelCaseBreakIterator();
			wordInstance.setText(context.document.get());
			int following = wordInstance.following(context.editor.getCaret());
			if (following != BreakIterator.DONE) {
				context.editor.setCaret(following);
			}
			return true;
		}
		if (action == DefaultTextEditActions.WORD_PREVIOUS) {
			BreakIterator wordInstance = new CamelCaseBreakIterator();
			wordInstance.setText(context.document.get());
			int prev = wordInstance.preceding(context.editor.getCaret());
			if (prev != BreakIterator.DONE) {
				context.editor.setCaret(prev);
			}
			return true;
		}

		// example to change word selection behavior
		if (action == DefaultTextEditActions.SELECT_WORD_NEXT) {
			BreakIterator wordInstance = new CamelCaseBreakIterator();
			wordInstance.setText(context.document.get());
			int following = wordInstance.following(context.editor.getCaret());
			if (following != BreakIterator.DONE) {
				context.editor.setCaret(following, true);
			}
			return true;
		}
		if (action == DefaultTextEditActions.SELECT_WORD_PREVIOUS) {
			BreakIterator wordInstance = new CamelCaseBreakIterator();
			wordInstance.setText(context.document.get());
			int prev = wordInstance.preceding(context.editor.getCaret());
			if (prev != BreakIterator.DONE) {
				context.editor.setCaret(prev, true);
			}
			return true;
		}

		return BehaviorContributor.super.handle(action, context);
	}

}
