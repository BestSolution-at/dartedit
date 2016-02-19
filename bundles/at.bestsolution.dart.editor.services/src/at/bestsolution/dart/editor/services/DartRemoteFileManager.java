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
import org.eclipse.fx.code.editor.LocalFile;
import org.eclipse.fx.code.editor.SourceFileChange;
import org.eclipse.fx.code.editor.SourceFileInput;
import org.eclipse.fx.code.editor.services.InputContextLookup;
import org.eclipse.fx.core.event.Event;
import org.eclipse.fx.core.event.EventBus;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.DartServerFactory;
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
	private Map<String,List<String>> activeInputList = new HashMap<>();
	private Set<String> activeContentOverlay = new HashSet<>();
	private Map<String, OutlineMapping> outlineMap = new HashMap<>();

	static class OutlineMapping {
		ObjectProperty<Outline> property;
		Registration serviceRegistration;
	}

	private final InputContextLookup inputContextLookup;
	private final DartServerFactory serverFactory;

	@Inject
	public DartRemoteFileManager(InputContextLookup inputContextLookup, DartServerFactory serverFactory, EventBus eventBroker) {
		this.inputContextLookup = inputContextLookup;
		this.serverFactory = serverFactory;
		eventBroker.subscribe(Constants.TOPIC_SOURCE_FILE_INPUT_CREATED, this::handleInputOpened);
		eventBroker.subscribe(Constants.TOPIC_SOURCE_FILE_INPUT_MODIFIED, this::handleInputModified);
		eventBroker.subscribe(Constants.TOPIC_SOURCE_FILE_INPUT_SAVED, this::handleInputSaved);
		eventBroker.subscribe(Constants.TOPIC_SOURCE_FILE_INPUT_DISPOSED, this::handleInputDisposed);
	}

	DartServer getServer(Input<?> input) {
		return serverFactory.getServer(inputContextLookup.getContext(input).getId());
	}

	void handleInputModified(Event<SourceFileChange> e) {
		SourceFileChange modified = e.getData();
		String filePath = ((LocalFile)modified.input).getPath().toAbsolutePath().toString();

		DartServer server = getServer(modified.input);

		if( activeInputList.getOrDefault(server.getId(),Collections.emptyList()).contains(filePath) ) {
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
		LocalFile input = (LocalFile) e.getData();
		String filePath = input.getPath().toAbsolutePath().toString();
		if( activeContentOverlay.contains(filePath) ) {
			getServer(e.getData()).getService(ServiceAnalysis.class).updateContent(Collections.singletonMap(filePath, new RemoveContentOverlay()));
			activeContentOverlay.remove(filePath);
		}
	}

	void handleInputOpened(Event<SourceFileInput> e) {
		DartServer server = getServer(e.getData());
		synchronized (activeInputList) {
			activeInputList.computeIfAbsent(server.getId(), (k) -> new ArrayList<>()).add(((LocalFile)e.getData()).getPath().toAbsolutePath().toString());
		}
		refreshOutlineSubscriptions(server);
	}

	void handleInputDisposed(Event<SourceFileInput> e) {
		DartServer server = getServer(e.getData());
		synchronized (activeInputList) {
			String filePath = ((LocalFile)e.getData()).getPath().toAbsolutePath().toString();
			activeInputList.getOrDefault(server.getId(), new ArrayList<>()).remove(filePath);
			if( activeContentOverlay.contains(filePath) ) {
				getServer(e.getData()).getService(ServiceAnalysis.class).updateContent(Collections.singletonMap(filePath, new RemoveContentOverlay()));
			}
		}
		refreshOutlineSubscriptions(server);
	}

	void refreshOutlineSubscriptions(DartServer server) {
		String[] files;
		synchronized (activeInputList) {
			files = activeInputList.getOrDefault(server.getId(), new ArrayList<>()).toArray(new String[0]);
		}
		server.getService(ServiceAnalysis.class).setSubscriptions(Collections.singletonMap(AnalysisService.OUTLINE, files));
	}

	public ObjectProperty<Outline> outlineProperty(Input<?> input) {
		LocalFile i = (LocalFile) input;
		OutlineMapping mapping = outlineMap.get(i.getPath().toAbsolutePath().toString());
		if( mapping == null ) {
			mapping = new OutlineMapping();
			mapping.property = new SimpleObjectProperty<Outline>();
			ServiceAnalysis service = getServer(input).getService(ServiceAnalysis.class);
			mapping.serviceRegistration = service.outline(this::handleOutlineChange);
			outlineMap.put(i.getPath().toAbsolutePath().toString(), mapping);
		}
		return mapping.property;
	}

	private void handleOutlineChange(AnalysisOutlineNotification n) {
		if( outlineMap.containsKey(n.getFile()) ) {
			System.err.println();
			outlineMap.get(n.getFile()).property.set(n.getOutline());
		}
	}
}
