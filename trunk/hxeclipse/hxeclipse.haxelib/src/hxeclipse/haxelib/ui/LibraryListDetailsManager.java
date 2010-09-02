package hxeclipse.haxelib.ui;

import hxeclipse.haxelib.HaxeLib;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class LibraryListDetailsManager extends LibraryListDetails {

	private HaxeLib _haxeLib;

	public LibraryListDetailsManager(Composite parent, int style, HaxeLib haxeLib) {
		super(parent, style);
		
		_haxeLib = haxeLib;
		
		_initialize();
	}
	
	@Override
	protected void initialize() {
		//prevent direct initializing, haxeLib has not been set yet
	}
	
	private void _initialize() {
		super.initialize();
	}

	protected LibraryDetails createLibraryDetails(Composite parent) {
		LibraryDetails libraryDetails = new LibraryDetailsManager(parent, SWT.NONE, _haxeLib);
		return libraryDetails;
	}

}
