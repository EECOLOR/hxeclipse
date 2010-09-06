package hxeclipse.core.ui.widgets.target.general;

import hxeclipse.core.model.GeneralOptionCollection;
import hxeclipse.core.ui.widgets.target.options.LibrariesOption;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class LibrariesBlock extends Composite {

	private LibrariesOption _librariesOption;

	public LibrariesBlock(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout());
		
		_createLibrariesOption();
	}

	private void _createLibrariesOption() {
		_librariesOption = new LibrariesOption(this, SWT.NONE);
	}

	public void setGeneralOptionCollection(GeneralOptionCollection generalOptionsCollection) {
		_librariesOption.setGeneralOptionCollection(generalOptionsCollection);
	}
	
}
