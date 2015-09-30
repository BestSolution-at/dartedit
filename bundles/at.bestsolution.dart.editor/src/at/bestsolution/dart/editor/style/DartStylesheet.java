package at.bestsolution.dart.editor.style;

import java.net.URL;

import org.eclipse.fx.code.editor.fx.themes.EditorStylesheet;
import org.eclipse.fx.ui.services.theme.Stylesheet;
import org.eclipse.fx.ui.services.theme.Theme;
import org.eclipse.jdt.annotation.Nullable;
import org.osgi.service.component.annotations.Component;

@Component
public class DartStylesheet implements Stylesheet {

	@Override
	public boolean appliesToTheme(Theme t) {
		return true;
	}

	@Override
	public @Nullable URL getURL(Theme t) {
		return getClass().getClassLoader().getResource("css/highlight.css");
	}

}
