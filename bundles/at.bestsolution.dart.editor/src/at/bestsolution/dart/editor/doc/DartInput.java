package at.bestsolution.dart.editor.doc;

import java.nio.file.Path;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.fx.code.editor.Constants;
import org.eclipse.fx.code.editor.LocalSourceFileInput;
import org.eclipse.fx.core.adapter.Adapt;
import org.eclipse.fx.core.event.EventBus;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.Registration;
import at.bestsolution.dart.server.api.model.AnalysisOutlineNotification;
import at.bestsolution.dart.server.api.model.Outline;
import at.bestsolution.dart.server.api.services.ServiceAnalysis;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class DartInput extends LocalSourceFileInput {
	private final ObjectProperty<Outline> outline = new SimpleObjectProperty<>();
	private Registration outlineReg;
	private DartServer server;

	@Inject
	public DartInput(DartServer server, EventBus eventBus, @Adapt @Named(Constants.DOCUMENT_URL) Path path) {
		super(path, eventBus);
		this.server = server;
	}

	@PostConstruct
	@Override
	protected void init() {
		ServiceAnalysis service = server.getService(ServiceAnalysis.class);
		outlineReg = service.outline(this::handleOutlineChange);
		super.init();
	}

	@Override
	protected void doDispose() {
		super.doDispose();
		outlineReg.dispose();
	}

	private void handleOutlineChange(AnalysisOutlineNotification n) {
		if( getPath().toAbsolutePath().toString().equals(n.getFile()) ) {
			outline.set(n.getOutline());
		}
	}

	public ObjectProperty<Outline> outlineProperty() {
		return outline;
	}
}
