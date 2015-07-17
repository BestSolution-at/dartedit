package at.bestsolution.dart.editor.doc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.fx.code.editor.Constants;
import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.services.URIProvider;
import org.eclipse.fx.core.URI;
import org.eclipse.jface.text.IDocument;

import at.bestsolution.dart.editor.internal.DartRemoteFileManager;
import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.Registration;
import at.bestsolution.dart.server.api.model.AddContentOverlay;
import at.bestsolution.dart.server.api.model.AnalysisOutlineNotification;
import at.bestsolution.dart.server.api.model.ChangeContentOverlay;
import at.bestsolution.dart.server.api.model.Outline;
import at.bestsolution.dart.server.api.model.RemoveContentOverlay;
import at.bestsolution.dart.server.api.model.SourceEdit;
import at.bestsolution.dart.server.api.services.ServiceAnalysis;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class DartInput implements Input<String>, URIProvider {
	private Path path;
	private String data;
	private DartServer server;
	private boolean activeContentOverlay;
	private IEventBroker broker;
	private final ObjectProperty<Outline> outline = new SimpleObjectProperty<>();
	private Registration outlineReg;

	@Inject
	public DartInput(DartServer server, IEventBroker broker, @Optional @Named(Constants.DOCUMENT_URL) String url) {
		this.path = Paths.get(java.net.URI.create(url));
		this.server = server;
		this.broker = broker;
		ServiceAnalysis service = server.getService(ServiceAnalysis.class);
		outlineReg = service.outline(this::handleOutlineChange);
		this.broker.send(DartRemoteFileManager.DART_INPUT_CREATED, this.path.toAbsolutePath().toString());
	}

	private void handleOutlineChange(AnalysisOutlineNotification n) {
		if( path.toAbsolutePath().toString().equals(n.getFile()) ) {
			outline.set(n.getOutline());
		}
	}

	public ObjectProperty<Outline> outlineProperty() {
		return outline;
	}

	@Override
	public URI getURI() {
		return URI.create(path.toUri().toString());
	}

	public Path getPath() {
		return path;
	}

	@Override
	public String getData() {
		if( data == null ) {
			try(BufferedReader reader = Files.newBufferedReader(path)) {
				StringBuilder b = new StringBuilder();
				String line;
				while( (line = reader.readLine()) != null ) {
					b.append(line+"\n");
				}
				reader.close();
				data = b.toString();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data;
	}

	@Override
	public void setData(String data) {
		this.data = data;
	}

	@Override
	public void persist() {
		try(BufferedWriter writer = Files.newBufferedWriter(path)) {
			writer.write(data);
			writer.close();
			if( activeContentOverlay ) {
				server.getService(ServiceAnalysis.class).updateContent(Collections.singletonMap(path.toAbsolutePath().toString(), new RemoveContentOverlay()));
				activeContentOverlay = false;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void reset() {
		this.data = null;
		getData();
	}

	@Override
	public void dispose() {
		if( activeContentOverlay ) {
			server.getService(ServiceAnalysis.class).updateContent(Collections.singletonMap(path.toAbsolutePath().toString(), new RemoveContentOverlay()));
			activeContentOverlay = false;
		}
		if( outlineReg != null ) {
			outlineReg.dispose();
		}
		this.broker.send(DartRemoteFileManager.DART_INPUT_CREATED, this.path.toAbsolutePath().toString());

		this.data = null;
		this.path = null;
	}

	//TODO Move this to DartRemoteFileManager.java
	public void documentChanged(IDocument doc, int fOffset, int fLength, String fText) {
		if( ! activeContentOverlay ) {
			AddContentOverlay overlay = new AddContentOverlay();
			overlay.setContent(doc.get());
			server.getService(ServiceAnalysis.class).updateContent(Collections.singletonMap(path.toAbsolutePath().toString(), overlay));
			activeContentOverlay = true;
		} else {
			ChangeContentOverlay overlay = new ChangeContentOverlay();
			SourceEdit edit = new SourceEdit();
			edit.setOffset(fOffset);
			edit.setLength(fLength);
			edit.setReplacement(fText);
			overlay.setEdits(new SourceEdit[] { edit });
			server.getService(ServiceAnalysis.class).updateContent(Collections.singletonMap(path.toAbsolutePath().toString(), overlay));
		}
	}
}
