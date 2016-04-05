package at.bestsolution.dart.editor.services;

import java.text.BreakIterator;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.Constants;
import org.eclipse.fx.code.editor.services.BehaviorContributor;
import org.eclipse.fx.code.editor.services.ContextInformation;
import org.eclipse.fx.code.editor.services.EditingContext;
import org.eclipse.fx.core.Util;
import org.eclipse.fx.core.preferences.Preference;
import org.eclipse.fx.core.text.DefaultTextEditActions;
import org.eclipse.fx.core.text.SourceTextEditActions;
import org.eclipse.fx.core.text.TextEditAction;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

import at.bestsolution.dart.editor.services.pair.PairManager;
import at.bestsolution.dart.editor.services.pair.PairTypeProvider;

public class DartBehaviorContributor implements BehaviorContributor {

	private final EditingContext editingContext;
	private final IDocument document;

	private PairManager pairManager;


	@Inject
	public DartBehaviorContributor(IDocument document, EditingContext editingContext) {
		this.document = document;
		this.editingContext = editingContext;

		// TODO should be injected
		this.pairManager = new PairManager(document, editingContext, new PairTypeProvider());

	}

	public final static TextEditAction CUSTOM_FUN = new TextEditAction() {
	};

	public final static TextEditAction AUTO_FORMAT = new TextEditAction() {
	};

	public final static TextEditAction SINGLE_LINE_AUTO_CLOSE = new TextEditAction() {
	};

	public final static TextEditAction TRIGGER_CONTEXT_INFORMATION = new TextEditAction() {
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

		mapping.map("Ctrl+F", AUTO_FORMAT);


		mapping.map('(', SINGLE_LINE_AUTO_CLOSE);

		mapping.map("Ctrl+Shift+Space", TRIGGER_CONTEXT_INFORMATION);

	}

	private int tabAdvance = 4;
	private boolean spacesForTab = false;

	@Inject
	public void setTabAdvance(@Preference(nodePath=Constants.PREFERENCE_NODE_PATH, key=Constants.PREFERENCE_TAB_ADVANCE) Integer tabAdvance ) {
		this.tabAdvance = tabAdvance;
	}

	@Inject
	public void setInsertSpacesForTab(@Preference(nodePath=Constants.PREFERENCE_NODE_PATH, key=Constants.PREFERENCE_SPACES_FOR_TAB) Boolean spacesForTab ) {
		this.spacesForTab = spacesForTab;
	}

	private String repeat(String s, int count) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < count; i++) {
			result.append(s);
		}
		return result.toString();
	}

	private String getTabString() {
		if (spacesForTab) {
			return repeat(" ", tabAdvance);
		}
		return "\t";
	}

	private String getTabs(int count) {
		return repeat(getTabString(), count);
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

		if (action == AUTO_FORMAT) {
			pairManager.autoformat();
			return true;
		}

		if (action == TRIGGER_CONTEXT_INFORMATION) {
			int offset = this.editingContext.getCaretOffset();
			ContextInformation info = new ContextInformation() {
				@Override
				public CharSequence getText() {
					return "This is an example of ContextInformation via the EditingContext#showContextInformation() api";
				}

				@Override
				public int getOffset() {
					return offset;
				}
			};
			this.editingContext.showContextInformation(info);
		}

		if (action == SINGLE_LINE_AUTO_CLOSE) {
			try {

				int offset = this.editingContext.getCaretOffset();
					if ("(".equals(document.get(offset - 1, 1))) {
						document.replace(offset, 0, ")");
					}

				}
			catch (BadLocationException e) {
				e.printStackTrace();
			}

		}

		if (action == DefaultTextEditActions.NEW_LINE) {

			boolean fixAlsoNextLine = false;

			// automatically insert }
			try {
				int offset = this.editingContext.getCaretOffset();

				IRegion lf = this.document.getLineInformationOfOffset(offset);
				String line = this.document.get(lf.getOffset(), lf.getLength());

				if (line.matches(".*[{]\\s*")) {

					document.replace(offset, 0, "\n}");
					fixAlsoNextLine = true;
				}
			}
			catch (BadLocationException e) {
				e.printStackTrace();
			}

			pairManager.fixIndentationOnEnter(fixAlsoNextLine);
			return true;
//			try {
//				int caret = editingContext.getCaretOffset();
//
//				int lineIdx = document.getLineOfOffset(caret);
//
//				int count = pairManager.getIndent(lineIdx+1);
//				System.err.println("line " + lineIdx + ": " + count);
//
//				String tabString = getTabString();
//
//
//				// TODO get tab config here
////				if( this.viewer.getTextWidget().isInsertSpacesForTab() ) {
////					tabString = Util.createRepeatedString(' ', viewer.getTextWidget().getTabAdvance());
////				}
//
//				int replaceAt = caret;
//				int replaceLen = 0;
//				String replace = "\n";
//				for (int i = 0; i < count; i++) {
//					replace += tabString;
//				}
//
//
//				// endfix
//				int indent = pairManager.getIndent(caret);
//				int lineBegin = document.getLineInformationOfOffset(caret).getOffset();
//				String before = document.get().substring(lineBegin, caret);
//				if (before.matches("^\\s*}")) {
//					String tabs = "";
//					for (int i = 0; i < indent; i++) {
//						tabs += tabString;
//					}
//					replaceAt = lineBegin;
//					replaceLen = before.length();
//					replace = tabs + '}' + replace;
//				}
//
//
//
//				document.replace(replaceAt, replaceLen, replace);
//				editingContext.setCaretOffset(caret - replaceLen + replace.length());
//				return true;
//
//
//			}
//			catch (BadLocationException e) {
//				e.printStackTrace();
//			}
		}

		return BehaviorContributor.super.handle(action);
	}

}
