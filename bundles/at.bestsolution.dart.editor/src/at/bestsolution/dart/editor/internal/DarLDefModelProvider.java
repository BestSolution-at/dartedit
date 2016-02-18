package at.bestsolution.dart.editor.internal;

import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.SourceFileInput;
import org.eclipse.fx.code.editor.configuration.EditorGModel;
import org.eclipse.fx.code.editor.configuration.LanguageDef;
import org.eclipse.fx.code.editor.configuration.text.ConfigurationModelProvider;
import org.eclipse.fx.core.log.LoggerCreator;
import org.osgi.service.component.annotations.Component;

@SuppressWarnings("restriction")
@Component
public class DarLDefModelProvider implements ConfigurationModelProvider {
	private LanguageDef model;

	@Override
	public boolean applies(Input<?> input) {
		return input instanceof SourceFileInput && ((SourceFileInput)input).getURI().endsWith(".dart");
	}

	@Override
	public LanguageDef getModel(Input<?> input) {
		if( model != null ) {
			return model;
		}
		try( InputStream in = getClass().getClassLoader().getResourceAsStream("at/bestsolution/sample/code/dart.json");
				InputStreamReader r = new InputStreamReader(in) ) {
			return model = EditorGModel.create().createObject(r);
		} catch (Exception e1) {
			LoggerCreator.createLogger(DarLDefModelProvider.class).error("Unable to load json file", e1);
			return null;
		}
	}
}
