package at.bestsolution.dart.editor.services.pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;

public class PatternPairType implements PairType {

	private final IDocument document;
	private final Pattern pattern;

	public PatternPairType(IDocument document, String left, String right) {
		this.pattern = Pattern.compile("(" + Pattern.quote(left) + ")|(" + Pattern.quote(right) + ")");
		this.document = document;

		this.document.addDocumentListener(new IDocumentListener() {
			@Override
			public void documentChanged(DocumentEvent event) {
				buildPairIndex();
			}
			@Override
			public void documentAboutToBeChanged(DocumentEvent event) {
			}
		});
		buildPairIndex();
	}

	private Map<IRegion, Pair> pairIndex = new HashMap<>();

	private void buildPairIndex() {
		pairIndex.clear();

		Stack<IRegion> leftSide = new Stack<>();

		Matcher matcher = pattern.matcher(document.get());
		while (matcher.find()) {

			if (matcher.group(1) != null) {
				// left hit
				IRegion left = new Region(matcher.start(1), matcher.end(1) - matcher.start(1));
				leftSide.push(left);
			}
			else if (matcher.group(2) != null) {
				// right hit
				if (!leftSide.isEmpty()) {
					IRegion left = leftSide.pop();
					IRegion right = new Region(matcher.start(2), matcher.end(2) - matcher.start(2));

					Pair pair = Pair.create(this, PairSide.LEFT, left, right);
					pairIndex.put(left, pair);
					pairIndex.put(right, pair.getOpposite());
				}
			}

		}

	}

	private boolean contains(IRegion region, int offset) {
		return region.getOffset() <= offset && region.getOffset() + region.getLength() >= offset;
	}

	private boolean contains(IRegion region, IRegion test) {
		return contains(region, test.getOffset()) && contains(region, test.getOffset()+test.getLength());
	}

	@Override
	public Optional<Pair> getPairAtOffset(int offset) {
		for (IRegion r : pairIndex.keySet()) {
			if (contains(r, offset)) {
				// found one
				return Optional.of(pairIndex.get(r));
			}
		}
		return Optional.empty();
	}

	@Override
	public List<Pair> getPairsInLine(int lineIndex) {
		List<Pair> pairsInLine = new ArrayList<>();
		try {
			IRegion lineInformation = document.getLineInformation(lineIndex);

			for (IRegion r : pairIndex.keySet()) {
				if (contains(lineInformation, r)) {
					// found one
					pairsInLine.add(pairIndex.get(r));
				}
			}
		}
		catch (BadLocationException e) {
			throw new RuntimeException(e);
		}

		Collections.sort(pairsInLine, (a, b)->a.getRegion().getOffset() - b.getRegion().getOffset());

		return pairsInLine;
	}

}
