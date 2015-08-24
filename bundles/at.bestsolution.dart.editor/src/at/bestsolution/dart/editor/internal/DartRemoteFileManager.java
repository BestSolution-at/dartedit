package at.bestsolution.dart.editor.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.fx.code.editor.Constants;
import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.LocalSourceFileInput;
import org.osgi.service.event.Event;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.Registration;
import at.bestsolution.dart.server.api.model.AnalysisOutlineNotification;
import at.bestsolution.dart.server.api.model.AnalysisService;
import at.bestsolution.dart.server.api.model.Outline;
import at.bestsolution.dart.server.api.services.ServiceAnalysis;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;


public class DartRemoteFileManager {
	private List<String> activeInputList = new ArrayList<>();
	private Map<String, OutlineMapping> outlineMap = new HashMap<>();
	private DartServer server;

	static class OutlineMapping {
		ObjectProperty<Outline> property;
		Registration serviceRegistration;
	}

	@Inject
	public DartRemoteFileManager(IEventBroker eventBroker, DartServer server) {
		this.server = server;
		eventBroker.subscribe(Constants.TOPIC_SOURCE_FILE_INPUT_CREATED, this::handleInputOpened);
		eventBroker.subscribe(Constants.TOPIC_SOURCE_FILE_INPUT_DISPOSED, this::handleInputOpened);
	}

	void handleInputOpened(Event e) {
		synchronized (activeInputList) {
			activeInputList.add(((LocalSourceFileInput)e.getProperty(IEventBroker.DATA)).getPath().toAbsolutePath().toString());
		}
		refreshOutlineSubscriptions();
	}

	void handleInputDisposed(Event e) {
		synchronized (activeInputList) {
			activeInputList.remove(((LocalSourceFileInput)e.getProperty(IEventBroker.DATA)).getPath().toAbsolutePath().toString());
		}
		refreshOutlineSubscriptions();
	}

	void refreshOutlineSubscriptions() {
		String[] files;
		synchronized (activeInputList) {
			files = activeInputList.toArray(new String[activeInputList.size()]);
		}
		server.getService(ServiceAnalysis.class).setSubscriptions(Collections.singletonMap(AnalysisService.OUTLINE, files));
	}

	public ObjectProperty<Outline> outlineProperty(Input<?> input) {
		LocalSourceFileInput i = (LocalSourceFileInput) input;
		OutlineMapping mapping = outlineMap.get(i.getPath().toAbsolutePath().toString());
		if( mapping == null ) {
			mapping = new OutlineMapping();
			mapping.property = new SimpleObjectProperty<Outline>();
			ServiceAnalysis service = server.getService(ServiceAnalysis.class);
			mapping.serviceRegistration = service.outline(this::handleOutlineChange);
		}
		return mapping.property;
	}

	private void handleOutlineChange(AnalysisOutlineNotification n) {
		if( outlineMap.containsKey(n.getFile()) ) {
			outlineMap.get(n.getFile()).property.set(n.getOutline());
		}
	}
}
