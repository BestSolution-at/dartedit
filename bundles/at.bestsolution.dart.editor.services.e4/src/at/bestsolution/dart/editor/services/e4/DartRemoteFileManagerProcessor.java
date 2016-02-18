package at.bestsolution.dart.editor.services.e4;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MAddon;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

public class DartRemoteFileManagerProcessor {
	private static String ADDON_URI = "bundleclass://at.bestsolution.dart.editor.services/at.bestsolution.dart.editor.services.DartRemoteFileManager";
	@Execute
	public void addAddon(MApplication application, EModelService modelService) {
		if( !application.getAddons().stream().filter( a -> ADDON_URI.equals(a.getContributionURI()) ).findFirst().isPresent() ) {
			MAddon addon = modelService.createModelElement(MAddon.class);
			addon.setContributionURI(ADDON_URI);
			application.getAddons().add(addon);
		}
	}
}
