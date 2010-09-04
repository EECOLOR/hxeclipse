package hxeclipse.core.ui;

import hxeclipse.core.HXEclipseCore;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Shell;

public class HaxeDialog extends Dialog {

	public HaxeDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		
		//set icon
		shell.setImage(HXEclipseCore.getSharedImages().getImage(ISharedImages.IMG_ICON_HAXE));		
	}
}
