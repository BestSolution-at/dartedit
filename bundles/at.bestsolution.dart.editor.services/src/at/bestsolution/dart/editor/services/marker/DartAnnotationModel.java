package at.bestsolution.dart.editor.services.marker;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.LocalFile;
import org.eclipse.fx.code.editor.services.EditingContext;
import org.eclipse.fx.core.ThreadSynchronize;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;

import at.bestsolution.dart.editor.services.pair.PairManager;
import at.bestsolution.dart.editor.services.pair.PairType.Pair;
import at.bestsolution.dart.editor.services.pair.PairTypeProvider;
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

	private final EditingContext editingContext;
	private final IDocument document;

	private PairManager pairManager;

	@Inject
	public DartAnnotationModel(DartServer server, IDocument document, EditingContext editingContext, Input<?> input, ThreadSynchronize synchronize) {
		this.synchronize = synchronize;
		this.document = document;
		this.editingContext = editingContext;
		file = ((LocalFile)input).getPath();

		// TODO change this to injection
		pairManager = new PairManager(document, editingContext, new PairTypeProvider());

		// Subscribe to errors
		ServiceAnalysis service = server.getService(ServiceAnalysis.class);
		subscription = service.errors(this::accept);

		CompletableFuture.supplyAsync(
				() -> service.getErrors(file.toString())).thenAccept(this::accept);

		this.editingContext.registerOnCaretOffsetChanged(this::onCaretOffsetChanged);

	}

	private ActivePairAnnotation activePairAnnotation = null;

	private void setActivePairAnnotation(Optional<IRegion> region) {
		if (activePairAnnotation != null) {
			removeAnnotation(activePairAnnotation);
		}

		if (region.isPresent()) {
			activePairAnnotation = new ActivePairAnnotation();
			addAnnotation(activePairAnnotation, region.map(r->new Position(r.getOffset(), r.getLength())).get());
		}
	}

	private List<SameWordAnnotation> sameWordAnnotations = new ArrayList<>();

	private void setSameWordAnnotations(List<IRegion> regions) {
		List<SameWordAnnotation> oldAnnotations = new ArrayList<>(sameWordAnnotations);
		sameWordAnnotations = new ArrayList<>();
		Map<SameWordAnnotation, Position> replacement = new HashMap<>();
		for (IRegion region : regions) {
			SameWordAnnotation a = new SameWordAnnotation();
			Position pos = new Position(region.getOffset(), region.getLength());
			replacement.put(a, pos);
			sameWordAnnotations.add(a);
		}

		replaceAnnotations(oldAnnotations.toArray(new Annotation[]{}), replacement);
	}

	private String findWordUnderCaret(int caretOffset) {
		BreakIterator it = BreakIterator.getWordInstance();

		it.setText(document.get());
		int end = it.following(caretOffset);
		int begin = it.previous();
		if (begin > caretOffset) {
			end = begin;
			begin = it.previous();
		}

		try {
			String word = document.get(begin, end - begin);

			if (word.matches("\\s*")) {
				System.err.println("WORD IS EMPTY");
				return null;
			}

			return word;

		}
		catch (BadLocationException e) {
			//e.printStackTrace();
		}
		return null;
	}

	private List<IRegion> findOccurences(String word) {
		List<IRegion> result = new ArrayList<>();
		if (word != null) {
			Pattern p = Pattern.compile(Pattern.quote(word));
			Matcher matcher = p.matcher(document.get());
			while (matcher.find()) {
				result.add(new Region(matcher.start(), matcher.end() - matcher.start()));
			}
		}
		return result;
	}

	private void onCaretOffsetChanged(int caretOffset) {

		// basic example for highlighting pairs
		Optional<Pair> caretPair = this.pairManager.getHighlightPair(caretOffset);
		Optional<Pair> opposite = caretPair.map(p->p.getOpposite());
		Optional<IRegion> oppositeRegion = opposite.map(p->p.getRegion());
		setActivePairAnnotation(oppositeRegion);

		// basic example for highlighting similar words
		//  find word under caret


		List<IRegion> occurences = Collections.emptyList();
		String word = findWordUnderCaret(caretOffset);
		System.err.println("WORD: " + word);
		// check if it is really a word (if it is a pair we don't highlight occurences)
		if (!caretPair.isPresent() && word != null && word.matches("[a-zA-Z]+[a-zA-Z0-9]*")) {
			occurences = findOccurences(word);
			// remove self
			Iterator<IRegion> iterator = occurences.iterator();
			while (iterator.hasNext()) {
				IRegion r = iterator.next();
				if (r.getOffset() <= caretOffset && r.getOffset() + r.getLength() >= caretOffset) {
					iterator.remove();
				}
			}
		}
		setSameWordAnnotations(occurences);

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
