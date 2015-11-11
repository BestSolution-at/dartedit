package at.bestsolution.dart.editor.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.Constants;
import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.LocalSourceFileInput;
import org.eclipse.fx.code.editor.SourceFileChange;
import org.eclipse.fx.code.editor.SourceFileInput;
import org.eclipse.fx.core.event.Event;
import org.eclipse.fx.core.event.EventBus;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.Registration;
import at.bestsolution.dart.server.api.model.AddContentOverlay;
import at.bestsolution.dart.server.api.model.AnalysisOutlineNotification;
import at.bestsolution.dart.server.api.model.AnalysisService;
import at.bestsolution.dart.server.api.model.ChangeContentOverlay;
import at.bestsolution.dart.server.api.model.Outline;
import at.bestsolution.dart.server.api.model.RemoveContentOverlay;
import at.bestsolution.dart.server.api.model.SourceEdit;
import at.bestsolution.dart.server.api.services.ServiceAnalysis;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;


@SuppressWarnings("restriction")
public class DartRemoteFileManager {
	private List<String> activeInputList = new ArrayList<>();
	private Set<String> activeContentOverlay = new HashSet<>();
	private Map<String, OutlineMapping> outlineMap = new HashMap<>();
	private DartServer server;

	static class OutlineMapping {
		ObjectProperty<Outline> property;
		Registration serviceRegistration;
	}

	@Inject
	public DartRemoteFileManager(EventBus eventBroker, DartServer server) {
		this.server = server;
		eventBroker.subscribe(Constants.TOPIC_SOURCE_FILE_INPUT_CREATED, this::handleInputOpened);
		eventBroker.subscribe(Constants.TOPIC_SOURCE_FILE_INPUT_MODIFIED, this::handleInputModified);
		eventBroker.subscribe(Constants.TOPIC_SOURCE_FILE_INPUT_SAVED, this::handleInputSaved);
		eventBroker.subscribe(Constants.TOPIC_SOURCE_FILE_INPUT_DISPOSED, this::handleInputOpened);
	}

	void handleInputModified(Event<SourceFileChange> e) {
		SourceFileChange modified = e.getData();
		String filePath = ((LocalSourceFileInput)modified.input).getPath().toAbsolutePath().toString();
		if( activeInputList.contains(filePath) ) {
			if(! activeContentOverlay.contains(filePath) ) {
				AddContentOverlay overlay = new AddContentOverlay();
				overlay.setContent(modified.input.getData());
				server.getService(ServiceAnalysis.class).updateContent(Collections.singletonMap(filePath, overlay));
				activeContentOverlay.add(filePath);
			} else {
				ChangeContentOverlay overlay = new ChangeContentOverlay();
				SourceEdit edit = new SourceEdit();
				edit.setOffset(modified.offset);
				edit.setLength(modified.length);
				edit.setReplacement(modified.replacement);
				overlay.setEdits(new SourceEdit[] { edit });
				server.getService(ServiceAnalysis.class).updateContent(Collections.singletonMap(filePath, overlay));
			}
		}
	}

	void handleInputSaved(Event<SourceFileInput> e) {
		LocalSourceFileInput input = (LocalSourceFileInput) e.getData();
		String filePath = input.getPath().toAbsolutePath().toString();
		if( activeContentOverlay.contains(filePath) ) {
			server.getService(ServiceAnalysis.class).updateContent(Collections.singletonMap(filePath, new RemoveContentOverlay()));
			activeContentOverlay.remove(filePath);
		}
	}

	void handleInputOpened(Event<SourceFileInput> e) {
		synchronized (activeInputList) {
			activeInputList.add(((LocalSourceFileInput)e.getData()).getPath().toAbsolutePath().toString());
		}
		refreshOutlineSubscriptions();
	}

	void handleInputDisposed(Event<SourceFileInput> e) {
		synchronized (activeInputList) {
			String filePath = ((LocalSourceFileInput)e.getData()).getPath().toAbsolutePath().toString();
			activeInputList.remove(filePath);
			if( activeContentOverlay.contains(filePath) ) {
				server.getService(ServiceAnalysis.class).updateContent(Collections.singletonMap(filePath, new RemoveContentOverlay()));
			}
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
