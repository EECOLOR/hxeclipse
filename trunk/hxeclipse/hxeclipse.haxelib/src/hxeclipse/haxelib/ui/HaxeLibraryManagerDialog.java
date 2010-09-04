package hxeclipse.haxelib.ui;

import hxeclipse.core.ui.HaxeDialog;

import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class HaxeLibraryManagerDialog extends HaxeDialog {

	private HaxeLibraryManager _haxeLibraryManager;
	
	protected HaxeLibraryManagerDialog(Shell parentShell) {
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
		SafeRunnable.run(new SafeRunnable() {
			@Override
			public void run() throws Exception {
				_haxeLibraryManager = new HaxeLibraryManager(dialogArea, SWT.NONE);
			}
		});
		
		return dialogArea;
	}

	@Override
	public void create() {
		super.create();
		_haxeLibraryManager.setFocus();
	}

}
