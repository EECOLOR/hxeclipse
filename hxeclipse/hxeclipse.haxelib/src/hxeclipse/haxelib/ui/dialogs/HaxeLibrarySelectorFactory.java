package hxeclipse.haxelib.ui.dialogs;

import org.eclipse.swt.widgets.Shell;

import hxeclipse.core.extensions.IHaxeLibrarySelector;
import hxeclipse.core.extensions.IHaxeLibrarySelectorFactory;

public class HaxeLibrarySelectorFactory implements IHaxeLibrarySelectorFactory {

	@Override
	public IHaxeLibrarySelector newInstance(Shell shell) {
		return new HaxeLibrarySelector(shell);
	}

	@Override
	public String getDisplayName() {
		return "HaxeLib";
	}

}
