package at.bestsolution.dart.editor.outline;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.inject.Inject;

import org.eclipse.fx.code.editor.Input;
import org.eclipse.fx.code.editor.fx.services.Outline;
import org.eclipse.fx.code.editor.fx.services.Outline.OutlineItem;
import org.eclipse.fx.code.editor.fx.services.OutlineTypeProviderService;
import org.eclipse.fx.core.URI;
import org.eclipse.fx.ui.controls.styledtext.StyledString;
import org.eclipse.fx.ui.services.resources.AdornedImageDescriptor;
import org.eclipse.fx.ui.services.resources.AdornedImageDescriptor.Adornment;
import org.eclipse.fx.ui.services.resources.AdornedImageDescriptor.Location;
import org.eclipse.fx.ui.services.resources.GraphicsLoader;
import org.eclipse.fx.ui.services.sync.UISynchronize;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.dart.editor.doc.DartInput;
import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.model.ElementKind;
import javafx.beans.Observable;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.ReadOnlyProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;

@Component
public class DartOutlineFactory implements OutlineTypeProviderService {

	@Override
	public boolean test(Input<?> input) {
		return input instanceof DartInput;
	}

	@Override
	public Class<? extends Outline> getType(Input<?> input) {
		return DartOutline.class;
	}

	private static class DartOutline implements Outline {

		private UISynchronize sync;
		private ObservableList<OutlineItem> items = FXCollections.observableArrayList();
		private DartInput input;
		private GraphicsLoader graphicsLoader;

		@Inject
		public DartOutline(UISynchronize sync, Input<?> input, GraphicsLoader graphicsLoader, DartServer server) {
			this.graphicsLoader = graphicsLoader;
			this.sync = sync;
			this.input = (DartInput) input;
			this.input.outlineProperty().addListener( this::handleOutlineChange );
			handleOutlineChange(this.input.outlineProperty());
		}

		private void handleOutlineChange(Observable obs) {
			if( this.input.outlineProperty().get() != null ) {
				List<? extends OutlineItem> list = transformItems(null, graphicsLoader, this.input.outlineProperty().get().getChildren());
				sync.asyncExec(() -> items.setAll(list));
			} else {
				sync.asyncExec(() -> items.clear());
			}
		}

		@Override
		public ObservableList<OutlineItem> getRootItems() {
			return items;
		}
	}

	private static ObservableList<? extends OutlineItem> transformItems(OutlineItem parent, GraphicsLoader graphicsLoader, at.bestsolution.dart.server.api.model.Outline[] outline) {
		List<DartOutlineItem> list = Stream.of(outline).filter(o -> o.getElement().getKind() != ElementKind.GETTER && o.getElement().getKind() != ElementKind.SETTER).map(o -> new DartOutlineItem(graphicsLoader,parent, o)).collect(Collectors.toList());
		ObservableList<OutlineItem> rv = FXCollections.observableArrayList(list);

		Map<at.bestsolution.dart.server.api.model.Outline, DartOutlineItem> basicMap = list.stream().collect(Collectors.toMap( o -> ((DartOutlineItem)o).outline, o -> o));

		List<at.bestsolution.dart.server.api.model.Outline> list2 = Stream.of(outline).filter(o -> o.getElement().getKind() == ElementKind.GETTER || o.getElement().getKind() == ElementKind.SETTER).collect(Collectors.toList());
		Map<String, DartPropertyOutlineItem> elements = new HashMap<>();

		for( at.bestsolution.dart.server.api.model.Outline o : list2 ) {
			DartPropertyOutlineItem getterSetter = elements.get(o.getElement().getName());
			if( getterSetter == null ) {
				getterSetter = new DartPropertyOutlineItem(parent,graphicsLoader);
				at.bestsolution.dart.server.api.model.Outline ref = null;

				for( at.bestsolution.dart.server.api.model.Outline o2 : outline ) {
					if( o2 == o ) {
						break;
					}
					ref = o2;
				}

				if( ref == null ) {
					rv.add(0,getterSetter);
				} else if( ref.getElement().getKind() == ElementKind.SETTER || ref.getElement().getKind() == ElementKind.GETTER ) {
					rv.add(rv.indexOf(elements.get(ref.getElement().getName())), getterSetter);
				} else {
					at.bestsolution.dart.server.api.model.Outline fref = ref;
					rv.add(rv.indexOf(basicMap.get(fref))+1,getterSetter);
				}

				elements.put(o.getElement().getName(), getterSetter);
			}

			if( o.getElement().getKind() == ElementKind.SETTER ) {
				getterSetter.setter = o;
			} else {
				getterSetter.getter = o;
			}
		}

		return rv;
	}

	private static class DartOutlineItem implements OutlineItem {
		private final at.bestsolution.dart.server.api.model.Outline outline;
		private final OutlineItem parent;
		private GraphicsLoader graphicsLoader;
		private ReadOnlyObjectWrapper<CharSequence> label = new ReadOnlyObjectWrapper<>(this, "label");
		private ReadOnlyObjectWrapper<Node> graphic = new ReadOnlyObjectWrapper<>(this, "graphic");

		public DartOutlineItem(GraphicsLoader graphicsLoader, OutlineItem parent, at.bestsolution.dart.server.api.model.Outline outline) {
			this.graphicsLoader = graphicsLoader;
			this.outline = outline;
			this.parent = parent;
			this.label.set(calculateLabel());
			this.graphic.set(calculateGraphic());
		}

		@Override
		public ReadOnlyProperty<Node> graphicProperty() {
			return graphic.getReadOnlyProperty();
		}

		@Override
		public ReadOnlyProperty<CharSequence> labelProperty() {
			return label.getReadOnlyProperty();
		}

		@Override
		public CharSequence getLabel() {
			return label.get();
		}

		private CharSequence calculateLabel() {
			if( outline.getElement().getKind() == ElementKind.FIELD ) {
				StyledString s = new StyledString();
				s.appendSegment(outline.getElement().getName(), "dart-element-name");
				if( outline.getElement().getReturnType() != null ) {
					s.appendSegment( " \u2192 " + outline.getElement().getReturnType(), "dart-type-info");
				}
				return s;
			} else if( outline.getElement().getKind() == ElementKind.GETTER ) {
				return "get";
			} else if( outline.getElement().getKind() == ElementKind.SETTER ) {
				return "set";
			}
			return outline.getElement().getName();
		}

		private Node calculateGraphic() {
			if( outline.getElement().getKind() == ElementKind.CLASS ) {
				return graphicsLoader.getGraphicsNode(URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/classpub_obj.png"));
			} else if( outline.getElement().getKind() == ElementKind.FIELD ) {
				if( (outline.getElement().getFlags() & 0x10) == 0x10 ) {
					return graphicsLoader.getGraphicsNode(URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/field_public_obj.png"));
				} else {
					return graphicsLoader.getGraphicsNode(URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/field_private_obj.png"));
				}
			} else if( outline.getElement().getKind() == ElementKind.GETTER || outline.getElement().getKind() == ElementKind.SETTER ) {
				return graphicsLoader.getGraphicsNode(URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/methpub_obj.png"));
			} else if( outline.getElement().getKind() == ElementKind.FUNCTION ) {
				return graphicsLoader.getGraphicsNode(URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/methpub_obj.png"));
			}
			return null;
		}

		@Override
		public Node getGraphic() {
			return graphic.get();
		}

		@Override
		public OutlineItem getParent() {
			return parent;
		}

		@Override
		public ObservableList<? extends OutlineItem> getChildren() {
			if( outline.getChildren() != null ) {
				return transformItems(this, graphicsLoader, outline.getChildren());
			} else {
				return FXCollections.emptyObservableList();
			}
		}
	}

	static class DartPropertyOutlineItem implements OutlineItem {
		private at.bestsolution.dart.server.api.model.Outline getter;
		private at.bestsolution.dart.server.api.model.Outline setter;
		private GraphicsLoader graphicsLoader;
		private OutlineItem parent;
		private ReadOnlyObjectWrapper<CharSequence> label;
		private ReadOnlyObjectWrapper<Node> graphic = new ReadOnlyObjectWrapper<>(this, "graphic");

		public DartPropertyOutlineItem(OutlineItem parent, GraphicsLoader graphicsLoader) {
			this.parent = parent;
			this.graphicsLoader = graphicsLoader;

			AdornedImageDescriptor desc = new AdornedImageDescriptor(
					URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/16/field_public_obj.png"),
					Collections.singletonList(
							new Adornment(Location.LEFT_TOP,URI.createPlatformPluginURI("at.bestsolution.dart.editor", "css/icons/7/property.png"))));
			graphic.set(graphicsLoader.getGraphicsNode(desc));
		}

		@Override
		public CharSequence getLabel() {
			return labelProperty().getValue();
		}

		@Override
		public ReadOnlyProperty<CharSequence> labelProperty() {
			if( this.label == null ) {
				this.label = new ReadOnlyObjectWrapper<>(this, "label", this.getter != null ? this.getter.getElement().getName() : this.setter.getElement().getName());
			}

			return label.getReadOnlyProperty();
		}

		@Override
		public Node getGraphic() {
			return graphicProperty().getValue();
		}

		@Override
		public ReadOnlyProperty<Node> graphicProperty() {
			return graphic.getReadOnlyProperty();
		}

		@Override
		public OutlineItem getParent() {
			return parent;
		}

		@Override
		public ObservableList<OutlineItem> getChildren() {
			ObservableList<OutlineItem> rv = FXCollections.observableArrayList();
			if( getter != null ) {
				rv.add(new DartOutlineItem(graphicsLoader, this, getter));
			}

			if( setter != null ) {
				rv.add(new DartOutlineItem(graphicsLoader, this, setter));
			}
			return rv;
		}
	}
}
