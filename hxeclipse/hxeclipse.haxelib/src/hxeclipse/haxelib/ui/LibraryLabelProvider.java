package hxeclipse.haxelib.ui;

import hxeclipse.haxelib.model.Library;

import org.eclipse.jface.viewers.LabelProvider;

public class LibraryLabelProvider extends LabelProvider {

	static private LibraryLabelProvider _instance;
	
	static public LibraryLabelProvider getInstance() {
		
		if (_instance == null) {
			_instance = new LibraryLabelProvider();
		}
		
		return _instance;
	}
	
	@Override
	public String getText(Object element) {
		return super.getText(((Library) element).getName());
	}

}
