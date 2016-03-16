package at.bestsolution.dart.app.addons;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.commands.MParameter;
import org.eclipse.e4.ui.model.application.ui.menu.ItemType;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.fx.code.editor.Constants;
import org.eclipse.fx.core.preferences.Preference;
import org.eclipse.fx.text.ui.Feature;

@SuppressWarnings("restriction")
public class EditorFeatureAddon {
	private final EModelService modelService;
	private final MApplication application;
	private Set<Feature> featureSet;
	private Map<Feature, MHandledItem> itemMap;

	@Inject
	public EditorFeatureAddon(EModelService modelService, MApplication application) {
		this.modelService = modelService;
		this.application = application;
	}

	@Inject
	public void setEditorFeatures(@Preference(key=Constants.PREFERENCE_KEY_EDITOR_FEATURE,nodePath=Constants.PREFERENCE_NODE_PATH) Set<Feature> featureSet) {
		this.featureSet = featureSet;
		updateFeatureSet();
	}

	private void updateFeatureSet() {
		if( featureSet != null && itemMap != null ) {
			itemMap.entrySet().forEach( e -> e.getValue().setSelected(featureSet.contains(e.getKey())) );
		}
	}

	@PostConstruct
	public void init() {
		itemMap = new HashMap<>();
		MMenu menu = (MMenu) modelService.findElements(application, "at.bestsolution.dart.app.menu.editorfeatures", null, null, EModelService.ANYWHERE | EModelService.IN_MAIN_MENU).get(0);
		menu.getChildren().clear();
		menu.getChildren().addAll(Stream.of(Feature.values()).map( this::createFeature).collect(Collectors.toList()));
		updateFeatureSet();
	}

	private MMenuItem createFeature(Feature f) {
		MHandledMenuItem e = modelService.createModelElement(MHandledMenuItem.class);
		e.setLabel("%editorfeature."+ f.name());
		e.setContributorURI("platform:/plugin/at.bestsolution.dart.app");
		e.setType(ItemType.CHECK);
		if( f == Feature.SHOW_LINE_NUMBERS ) {
			e.setSelected(true);
		}

		MParameter parameter = modelService.createModelElement(MParameter.class);
		parameter.setName("feature");
		parameter.setValue(f.name());

		e.getParameters().add(parameter);
		application.getCommands()
			.stream()
			.filter( c -> c.getElementId().equals("at.bestsolution.dart.app.command.toggleeditorfeature"))
			.findFirst()
			.ifPresent(e::setCommand);
		itemMap.put(f, e);

		return e;
	}
}
