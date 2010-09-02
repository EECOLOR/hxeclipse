package hxeclipse.haxelib.ui;

import hxeclipse.core.ui.IInputConsumer;
import hxeclipse.core.ui.ListDetails;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class LibraryListDetails extends ListDetails {

	public LibraryListDetails(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected void initialize() {
		super.initialize();
		
		setContentProvider(ArrayContentProvider.getInstance());
		setLabelProvider(LibraryLabelProvider.getInstance());
		setComparator(new ViewerComparator());
	}

	@Override
	protected IInputConsumer createDetails(Composite parent) {
		LibraryDetails libraryDetails = createLibraryDetails(parent);
		libraryDetails.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		return libraryDetails;
	}
	
	protected LibraryDetails createLibraryDetails(Composite parent) {
		LibraryDetails libraryDetails = new LibraryDetails(parent, SWT.NONE);
		return libraryDetails;
	}

}
