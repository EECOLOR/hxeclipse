package hxeclipse.core.ui.widgets.target.general;

import hxeclipse.core.internal.GeneralOptionCollection;
import hxeclipse.core.ui.widgets.target.options.MappingsOption;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class MappingsBlock extends Composite {

	private MappingsOption _mappingsOption;

	public MappingsBlock(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout());
		
		_createLibrariesOption();
	}

	private void _createLibrariesOption() {
		_mappingsOption = new MappingsOption(this, SWT.NONE);
		_mappingsOption.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}

	public void setGeneralOptionCollection(GeneralOptionCollection generalOptionsCollection) {
		_mappingsOption.setGeneralOptionCollection(generalOptionsCollection);
	}
}
