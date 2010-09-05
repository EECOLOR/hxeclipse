package hxeclipse.haxelib.ui.widgets;

import hxeclipse.haxelib.HaxeLib;
import hxeclipse.haxelib.model.Library;

import java.io.FileNotFoundException;

import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;

public class LibraryManager extends LibraryListDetailsManager {

	public LibraryManager(Composite parent, int style) throws FileNotFoundException {
		super(parent, style, HaxeLib.getInstance());
		
		addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				if (!selection.isEmpty()) {
					final Library haxeLibrary = (Library) selection.getFirstElement();
					
					SafeRunnable.run(new SafeRunnable() {
						@Override
						public void run() throws Exception {
							//gather information
							getHaxeLib().info(haxeLibrary.getName());
						}
					});
				}
			}
		});
		
		SafeRunnable.run(new SafeRunnable() {
			@Override
			public void run() throws Exception {
				//gather installation information
				HaxeLib haxeLib = getHaxeLib();
				haxeLib.list();
				//get a list of all available libraries
				setInput(haxeLib.search());
			}
		});
	}
}
