package hxeclipse.core.internal;

import org.eclipse.swt.widgets.Shell;

import hxeclipse.core.extensions.ILibrarySelector;
import hxeclipse.core.extensions.ILibrarySelectorFactory;

public class DefaultLibrarySelectorFactory implements ILibrarySelectorFactory {

	@Override
	public ILibrarySelector newInstance(Shell shell) {
		return new DefaultLibrarySelector(shell);
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

}
