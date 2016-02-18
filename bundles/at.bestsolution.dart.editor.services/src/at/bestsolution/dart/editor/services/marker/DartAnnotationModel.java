package at.bestsolution.dart.editor.services.marker;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.LocalFile;
import org.eclipse.fx.core.ThreadSynchronize;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.Registration;
import at.bestsolution.dart.server.api.model.AnalysisError;
import at.bestsolution.dart.server.api.model.AnalysisErrorsNotification;
import at.bestsolution.dart.server.api.model.AnalysisGetErrorsResult;
import at.bestsolution.dart.server.api.services.ServiceAnalysis;

@SuppressWarnings("restriction")
public class DartAnnotationModel extends AnnotationModel {
	private Registration subscription;
	private final ThreadSynchronize synchronize;
	private Path file;

	@Inject
	public DartAnnotationModel(DartServer server, Input<?> input, ThreadSynchronize synchronize) {
		this.synchronize = synchronize;
		file = ((LocalFile)input).getPath();

		// Subscribe to errors
		ServiceAnalysis service = server.getService(ServiceAnalysis.class);
		subscription = service.errors(this::accept);

		CompletableFuture.supplyAsync(
				() -> service.getErrors(file.toString())).thenAccept(this::accept);

	}

	private void accept(AnalysisErrorsNotification notification) {
		if( file.equals(Paths.get(notification.getFile()))) {
			processSubscriptions(notification.getErrors());
		}
	}

	private void accept(AnalysisGetErrorsResult result) {
		processSubscriptions(result.getErrors());
	}

	private void processSubscriptions(AnalysisError[] error) {
		synchronize.asyncExec(() -> {
			Iterator<?> annotationIterator = getAnnotationIterator();
			List<Annotation> removed = new ArrayList<>();
			while( annotationIterator.hasNext() ) {
				Object next = annotationIterator.next();
				if( next instanceof DartAnnotation) {
					removed.add((Annotation) next);
				}
			}

			Map<Annotation,Position> added = new HashMap<>();
			for( AnalysisError e : error ) {
				added.put(new DartAnnotation(e),new Position(e.getLocation().getOffset(), e.getLocation().getLength()));
			}
			replaceAnnotations(removed.toArray(new Annotation[0]), added);
		});
	}

	@PreDestroy
	void cleanup() {
		if( subscription != null ) {
			subscription.dispose();
			subscription = null;
		}
	}
}
