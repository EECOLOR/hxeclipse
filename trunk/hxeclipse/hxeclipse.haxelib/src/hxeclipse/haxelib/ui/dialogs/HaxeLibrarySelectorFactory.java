package hxeclipse.haxelib.ui.dialogs;

import org.eclipse.swt.widgets.Shell;

import hxeclipse.core.extensions.ILibrarySelector;
import hxeclipse.core.extensions.ILibrarySelectorFactory;

public class HaxeLibrarySelectorFactory implements ILibrarySelectorFactory {

	@Override
	public ILibrarySelector newInstance(Shell shell) {
		return new HaxeLibrarySelector(shell);
	}

	@Override
	public String getDisplayName() {
		return "HaxeLib";
	}

}
