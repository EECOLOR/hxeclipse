package hxeclipse.core.extensions;

import org.eclipse.swt.widgets.Shell;

public interface IHaxeLibrarySelectorFactory {
	public IHaxeLibrarySelector newInstance(Shell shell);
	public String getDisplayName();
}
