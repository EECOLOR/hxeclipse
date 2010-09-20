package hxeclipse.core.ui.widgets.target.general;

import hxeclipse.core.internal.GeneralOptionCollection;
import hxeclipse.core.ui.widgets.target.options.ResourcesOption;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class ResourcesBlock extends Composite {
	private ResourcesOption _resourcesOption;

	public ResourcesBlock(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout());
		
		_createLibrariesOption();
	}

	private void _createLibrariesOption() {
		_resourcesOption = new ResourcesOption(this, SWT.NONE);
		_resourcesOption.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}

	public void setGeneralOptionCollection(GeneralOptionCollection generalOptionsCollection) {
		_resourcesOption.setGeneralOptionCollection(generalOptionsCollection);
	}

	public void setProject(IProject project) {
		_resourcesOption.setProject(project);
	}
}
