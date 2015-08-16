package at.bestsolution.dart.editor.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.fx.code.editor.Constants;
import org.eclipse.fx.code.editor.LocalSourceFileInput;
import org.osgi.service.event.Event;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.model.AnalysisService;
import at.bestsolution.dart.server.api.services.ServiceAnalysis;


public class DartRemoteFileManager {
//	public static final String DART_INPUT_CREATED = "at/bestsolution/dart/editor/input/created";
//	public static final String DART_INPUT_DISPOSED = "at/bestsolution/dart/editor/input/disposed";

	private List<String> activeInputList = new ArrayList<>();
	private DartServer server;

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
}
