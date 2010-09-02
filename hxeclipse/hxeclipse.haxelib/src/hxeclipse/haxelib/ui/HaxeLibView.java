package hxeclipse.haxelib.ui;

import hxeclipse.haxelib.HaxeLib;
import hxeclipse.haxelib.model.Library;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class HaxeLibView extends ViewPart {

	private LibraryListDetails _haxeLibraryListDetails;
	private HaxeLib _haxeLib;
	
	public HaxeLibView() {
		try {
			_haxeLib = HaxeLib.getInstance();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void createPartControl(Composite parent) {
		_haxeLibraryListDetails = new LibraryListDetails(parent, SWT.NONE);
		_haxeLibraryListDetails.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				if (!selection.isEmpty()) {
					Library haxeLibrary = (Library) selection.getFirstElement();
					
					try {
						//gather information
						_haxeLib.info(haxeLibrary.getName());
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}
			}
		});
		
		try {
			//TODO remove, gather installation information
			_haxeLib.list();
			//get a list of all available libraries
			_haxeLibraryListDetails.setInput(_haxeLib.search());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void setFocus() {
		_haxeLibraryListDetails.setFocus();
	}

}
