package hxeclipse.haxelib.ui;

import hxeclipse.haxelib.HaxeLib;
import hxeclipse.haxelib.model.Library;

import java.io.FileNotFoundException;

import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

//TODO run the haxe lib with a progress bar
public class HaxeLibraryManager extends ViewPart {

	private LibraryListDetailsManager _libraryListDetailsManager;
	private HaxeLib _haxeLib;
	
	public HaxeLibraryManager() {
		try {
			_haxeLib = HaxeLib.getInstance();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void createPartControl(Composite parent) {
		_libraryListDetailsManager = new LibraryListDetailsManager(parent, SWT.NONE, _haxeLib);
		_libraryListDetailsManager.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				if (!selection.isEmpty()) {
					final Library haxeLibrary = (Library) selection.getFirstElement();
					
					SafeRunnable.run(new SafeRunnable() {
						@Override
						public void run() throws Exception {
							//gather information
							_haxeLib.info(haxeLibrary.getName());
						}
					});
				}
			}
		});
		
		SafeRunnable.run(new SafeRunnable() {
			@Override
			public void run() throws Exception {
				//gather installation information
				_haxeLib.list();
				//get a list of all available libraries
				_libraryListDetailsManager.setInput(_haxeLib.search());
			}
		});			
	}

	@Override
	public void setFocus() {
		_libraryListDetailsManager.setFocus();
	}

}
