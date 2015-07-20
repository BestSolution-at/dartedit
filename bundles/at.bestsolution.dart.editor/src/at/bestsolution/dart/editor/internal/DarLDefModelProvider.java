package at.bestsolution.dart.editor.internal;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.ldef.LDefStandaloneSetup;
import org.eclipse.fx.code.editor.ldef.lDef.LanguageDef;
import org.eclipse.fx.code.editor.ldef.lDef.Root;
import org.eclipse.fx.code.editor.ldef.text.LDefModelProvider;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.dart.editor.doc.DartInput;

@Component
public class DarLDefModelProvider implements LDefModelProvider {
	private LanguageDef model;

	@Override
	public boolean applies(Input<?> input) {
		return input instanceof DartInput;
	}

	@Override
	public LanguageDef getModel(Input<?> input) {
		if( model == null ) {
			LDefStandaloneSetup.doSetup();
			ResourceSetImpl rs = new ResourceSetImpl();
			Resource resource = rs.getResource(URI.createURI("platform:/plugin/at.bestsolution.dart.editor/dart.ldef"), true);
			model = ((Root) resource.getContents().get(0)).getLanguageDefinition();
		}
		return model;
	}

}
