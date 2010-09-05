package hxeclipse.core.ui.wizards;

import hxeclipse.core.model.ProjectDescription;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

public class HaxeProjectDescriptionWizardPage extends WizardPage {

	private ProjectDescription _projectDescription;
	
	protected HaxeProjectDescriptionWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isPageComplete() {
		// TODO Auto-generated method stub
		return super.isPageComplete();
	}

	public ProjectDescription getProjectDescription() {
		return _projectDescription;
	}
}
