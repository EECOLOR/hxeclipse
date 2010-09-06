package hxeclipse.haxelib.ui.views;

import hxeclipse.core.exceptions.HaxePathNotFoundException;
import hxeclipse.core.ui.widgets.HaxePathMissing;
import hxeclipse.haxelib.HaxeLib;
import hxeclipse.haxelib.exceptions.HaxeLibNotFoundException;
import hxeclipse.haxelib.ui.widgets.LibraryManager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

//TODO run the haxe lib with a progress bar
public class HaxeLibraryManagerView extends ViewPart {

	private LibraryManager _haxeLibraryManager;
	private HaxeLib _haxeLib;
	
	public HaxeLibraryManagerView() {
	}
	
	@Override
	public void createPartControl(final Composite parent) {
		//create library manager
		boolean haxeLibAvilable = true;
		if (_haxeLib == null) {
			try {
				_haxeLib = HaxeLib.getInstance();
			} catch (HaxePathNotFoundException e) {
				haxeLibAvilable = false;
			} catch (HaxeLibNotFoundException e) {
				haxeLibAvilable = false;
			}
		}
		
		if (haxeLibAvilable) {
			_haxeLibraryManager = new LibraryManager(parent, SWT.NONE, _haxeLib);
		} else
		{
			new HaxePathMissing(parent, SWT.NONE);
		}
	}

	@Override
	public void setFocus() {
		if (_haxeLibraryManager != null) {
			_haxeLibraryManager.setFocus();
		}
	}

	
}
