/*
 * generated by Xtext
 */
package at.bestsolution.dart.service.spec.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DartServiceSpecAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("at/bestsolution/dart/service/spec/parser/antlr/internal/InternalDartServiceSpec.tokens");
	}
}