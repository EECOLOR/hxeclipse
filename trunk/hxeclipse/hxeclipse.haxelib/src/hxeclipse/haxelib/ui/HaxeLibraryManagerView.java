package hxeclipse.haxelib.ui;

import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

//TODO run the haxe lib with a progress bar
public class HaxeLibraryManagerView extends ViewPart {

	private HaxeLibraryManager _haxeLibraryManager;
	
	public HaxeLibraryManagerView() {
	}
	
	@Override
	public void createPartControl(final Composite parent) {
		SafeRunnable.run(new SafeRunnable() {
			@Override
			public void run() throws Exception {
				_haxeLibraryManager = new HaxeLibraryManager(parent, SWT.NONE);
			}
		});
	}

	@Override
	public void setFocus() {
		_haxeLibraryManager.setFocus();
	}

	
}
