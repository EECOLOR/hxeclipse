package hxeclipse.core.extensions;

import org.eclipse.swt.widgets.Shell;

public interface ILibrarySelectorFactory {
	public ILibrarySelector newInstance(Shell shell);
	public String getDisplayName();
}
