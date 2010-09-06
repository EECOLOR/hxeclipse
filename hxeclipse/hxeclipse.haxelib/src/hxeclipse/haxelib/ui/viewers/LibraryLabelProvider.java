package hxeclipse.haxelib.ui.viewers;

import hxeclipse.haxelib.model.Library;

import org.eclipse.jface.viewers.LabelProvider;

public class LibraryLabelProvider extends LabelProvider {

	static private LibraryLabelProvider _instance;
	
	static public LibraryLabelProvider getInstance() {
		synchronized(LibraryLabelProvider.class) {
			if (_instance == null) {
				_instance = new LibraryLabelProvider();
			}
		}
		
		return _instance;
	}
	
	@Override
	public String getText(Object element) {
		return super.getText(((Library) element).getName());
	}

}
