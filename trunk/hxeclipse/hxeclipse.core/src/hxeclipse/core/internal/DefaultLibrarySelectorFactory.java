package hxeclipse.core.internal;

import org.eclipse.swt.widgets.Shell;

import hxeclipse.core.extensions.IHaxeLibrarySelector;
import hxeclipse.core.extensions.IHaxeLibrarySelectorFactory;

public class DefaultLibrarySelectorFactory implements IHaxeLibrarySelectorFactory {

	@Override
	public IHaxeLibrarySelector newInstance(Shell shell) {
		return new DefaultLibrarySelector(shell);
	}

	@Override
	public String getDisplayName() {
		return "default";
	}

}
