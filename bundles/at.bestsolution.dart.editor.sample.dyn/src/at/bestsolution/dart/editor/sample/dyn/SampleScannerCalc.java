package at.bestsolution.dart.editor.sample.dyn;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.configuration.text.DynamicScannerRuleCalculator;
import org.eclipse.fx.core.event.EventBus;
import org.eclipse.fx.core.event.Topic;
import org.eclipse.fx.text.rules.CombinedWordRule;
import org.eclipse.fx.text.rules.JavaLikeWordDetector;
import org.eclipse.fx.text.ui.TextAttribute;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@SuppressWarnings("restriction")
public class SampleScannerCalc implements DynamicScannerRuleCalculator {
	public static final Topic<Void> TOGGLE_RULE = new Topic<>("at/bestsolution/dart/editor/sample/dyn/toggle");
	private ObservableList<IRule> rules = FXCollections.observableArrayList();

	@Inject
	public SampleScannerCalc(EventBus eventBus) {
		eventBus.subscribe(TOGGLE_RULE, e -> {
			if( rules.isEmpty() ) {
				rules.add(createRule());
			} else {
				rules.clear();
			}
		});
		rules.add(createRule());
	}

	private IRule createRule() {
		JavaLikeWordDetector wordDetector= new JavaLikeWordDetector();
		CombinedWordRule combinedWordRule= new CombinedWordRule(wordDetector, Token.UNDEFINED);
		CombinedWordRule.WordMatcher wordRule= new CombinedWordRule.WordMatcher();
		wordRule.addWord("hello", new Token(new TextAttribute("lua.lua_keyword")));
		combinedWordRule.addWordMatcher(wordRule);

		return combinedWordRule;
	}

	@Override
	public List<IRule> getRule(String partitionId) {
		if(! IDocument.DEFAULT_CONTENT_TYPE.equals(partitionId) ) {
			return Collections.emptyList();
		}
//		System.err.println("=====> RULE: " + this.rules);
		return rules;
	}

}
