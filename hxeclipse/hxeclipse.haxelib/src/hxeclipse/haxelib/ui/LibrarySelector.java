package hxeclipse.haxelib.ui;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class LibrarySelector extends Dialog {

	protected LibrarySelector(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		super.create();
		//set the focus
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Control composite = super.createDialogArea(parent);
		
		return composite;
	}


}
