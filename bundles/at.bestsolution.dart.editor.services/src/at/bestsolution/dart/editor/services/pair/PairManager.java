package at.bestsolution.dart.editor.services.pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.Constants;
import org.eclipse.fx.code.editor.services.EditingContext;
import org.eclipse.fx.core.preferences.Preference;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

import at.bestsolution.dart.editor.services.pair.PairType.Pair;
import at.bestsolution.dart.editor.services.pair.PairType.PairSide;


public class PairManager {

	private IDocument document;
	private EditingContext editingContext;
	private PairTypeProvider provider;

	public PairManager(IDocument document, EditingContext editingContext, PairTypeProvider provider) {
		this.document = document;
		this.editingContext = editingContext;
		this.provider = provider;
		// TODO remove me
		provider.init(document);
	}

	private Map<Integer, Integer> buildIndentMap() {
		Map<Integer, Integer> indentMap = new HashMap<>();
		int indent = 0;
		for (int lineIndex = 0; lineIndex < document.getNumberOfLines(); lineIndex++) {
			int delta = 0;
			for (PairType t : provider.getIntendationPairTypes()) {
				List<Pair> pairsInLine = t.getPairsInLine(lineIndex);

				delta += pairsInLine.stream().filter(p->p.getSide() == PairSide.LEFT).count();
				delta -= pairsInLine.stream().filter(p->p.getSide() == PairSide.RIGHT).count();

			}
			if (delta < 0) {
				indent += delta;
			}

			indentMap.put(lineIndex, indent);

			if (delta > 0) {
				indent += delta;
			}
		}
		return indentMap;
	}

	public void autoformat() {
		autoNewLines();
		autoIndent();
	}

	public void autoNewLines() {
		try {

			String formatted = "";
			for (int lineIndex = 0; lineIndex < document.getNumberOfLines(); lineIndex++) {

				int lI = lineIndex;
				List<Pair> pairsInLine = provider.getAutoFormatEnterPairTypes().stream().flatMap(p->p.getPairsInLine(lI).stream()).sorted((a,b)->a.getRegion().getOffset()-b.getRegion().getOffset()).collect(Collectors.toList());

				IRegion lineInformation = document.getLineInformation(lineIndex);
				if (pairsInLine.size() > 1) {
					// split line after lefts
					int cur = lineInformation.getOffset();

					for (Pair pair : pairsInLine) {
						System.err.println("Current pair: " + pair);
						System.err.println("access: " + cur + " -> " + (pair.getRegion().getOffset() + pair.getRegion().getLength() - cur));
						String part = document.get(cur, pair.getRegion().getOffset() + pair.getRegion().getLength() - cur);

						formatted += part;
						formatted += "\n";

						cur = pair.getRegion().getOffset() + pair.getRegion().getLength();
					}

					String lastPart = document.get(cur, lineInformation.getOffset() + lineInformation.getLength() - cur);
					formatted += lastPart;


				}
				else {
					String string = document.get(lineInformation.getOffset(), lineInformation.getLength());
					formatted += string;
				}
				String lineDelimiter = document.getLineDelimiter(lineIndex);
				if (lineDelimiter != null) {
					formatted += lineDelimiter;
				}


			}
			document.set(formatted);

		}
		catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	public void fixIndentationOnEnter() {
		try {
			int caretOffset = editingContext.getCaretOffset();
			int lineIndex = document.getLineOfOffset(caretOffset);

			// first insert enter
			document.replace(caretOffset, 0, "\n");

			// then compute the intendation map
			Map<Integer, Integer> indentMap = buildIndentMap();

			// insert tabs
			int indent = indentMap.get(lineIndex + 1);
			System.err.println("new line indent = " + indent);
			String tabs = getTabs(indent);
			document.replace(caretOffset + 1, 0, tabs);


			// move caret
			editingContext.setCaretOffset(caretOffset + 1 + tabs.length());
		}
		catch (BadLocationException e) {
			throw new RuntimeException(e);
		}
	}

	public Optional<Pair> getHighlightPair(int offset) {
		for (PairType t: provider.getHighlightPairTypes()) {
			Optional<Pair> pairAtOffset = t.getPairAtOffset(offset);
			if (pairAtOffset.isPresent()) {
				return pairAtOffset;
			}
		}
		return Optional.empty();
	}

	public void autoIndent() {
		Map<Integer, Integer> indentMap = buildIndentMap();

		try {
			String formatted = "";
			for (int lineIndex = 0; lineIndex < document.getNumberOfLines(); lineIndex++) {
				int count = indentMap.get(lineIndex);
				IRegion lineInformation = document.getLineInformation(lineIndex);

				String string = document.get(lineInformation.getOffset(), lineInformation.getLength());
				string = string.replaceAll("^\\s*", getTabs(count));

				formatted += string;
				String lineDelimiter = document.getLineDelimiter(lineIndex);
				if (lineDelimiter != null) {
					formatted += lineDelimiter;
				}
			}

			document.set(formatted);
		}
		catch (BadLocationException e) {
			e.printStackTrace();
		}

	}

	private boolean spacesForTab = false;
	private int tabAdvance = 4;

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
}
