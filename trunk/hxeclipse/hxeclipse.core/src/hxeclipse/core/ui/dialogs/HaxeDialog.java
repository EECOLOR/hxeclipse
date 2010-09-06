package hxeclipse.core.ui.dialogs;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.ui.ISharedImages;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.widgets.Shell;

public class HaxeDialog extends Dialog {

	public HaxeDialog(Shell parentShell) {
		super(parentShell);
	}

	public HaxeDialog(IShellProvider parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		
		//set icon
		shell.setImage(HXEclipse.getSharedImages().getImage(ISharedImages.IMG_ICON_HAXE));		
	}
}
