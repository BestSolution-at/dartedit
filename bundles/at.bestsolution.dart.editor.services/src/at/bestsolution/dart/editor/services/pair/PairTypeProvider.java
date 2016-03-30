package at.bestsolution.dart.editor.services.pair;

import java.text.CharacterIterator;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

public class PairTypeProvider {

	private PairType CURLY_BRACKET;
	private PairType BEGIN_END;

	private PairType BRACE;
	private PairType LTGT;
	private PairType BRACKET;

	@PostConstruct
	public void init(IDocument document) {
		CURLY_BRACKET = new PatternPairType(document, "{", "}");
		BEGIN_END = new PatternPairType(document, "begin", "end");
		BRACE = new PatternPairType(document, "(", ")");
		LTGT = new PatternPairType(document, "<", ">");
		BRACKET = new PatternPairType(document, "[", "]");
	}

	public Set<PairType> getHighlightPairTypes() {
		Set<PairType> result = new HashSet<>();
		result.add(CURLY_BRACKET);
		result.add(BEGIN_END);
		result.add(BRACE);
		result.add(BRACKET);
		result.add(LTGT);
		return result;
	}

	public Set<PairType> getIntendationPairTypes() {
		Set<PairType> result = new HashSet<>();
		result.add(CURLY_BRACKET);
		result.add(BEGIN_END);
		return result;
	}

	public Set<PairType> getAutoFormatEnterPairTypes() {
		Set<PairType> result = new HashSet<>();
		result.add(CURLY_BRACKET);
		result.add(BEGIN_END);
		return result;
	}

}
