package hxeclipse.haxelib.ui.dialogs;

import hxeclipse.core.exceptions.HaxePathNotFoundException;
import hxeclipse.core.ui.dialogs.HaxeDialog;
import hxeclipse.core.ui.widgets.HaxePathMissing;
import hxeclipse.haxelib.HaxeLib;
import hxeclipse.haxelib.exceptions.HaxeLibNotFoundException;
import hxeclipse.haxelib.ui.widgets.LibraryManager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class HaxeLibraryManagerDialog extends HaxeDialog {

	private LibraryManager _haxeLibraryManager;
	private HaxeLib _haxeLib;
	
	public HaxeLibraryManagerDialog(Shell parentShell) {
		super(parentShell);
	}
	
	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		
		//set title
		shell.setText("Haxe Library Manager");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		final Composite dialogArea = (Composite) super.createDialogArea(parent);
		
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
			_haxeLibraryManager = new LibraryManager(dialogArea, SWT.NONE, _haxeLib);
		} else
		{
			new HaxePathMissing(dialogArea, SWT.NONE);
		}
		
		return dialogArea;
	}

	@Override
	public void create() {
		super.create();
		if (_haxeLibraryManager != null) {
			_haxeLibraryManager.setFocus();
		}
	}

}
