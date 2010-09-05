package hxeclipse.core.ui.wizards;

import hxeclipse.core.HXEclipse;

import java.net.URI;

import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NewHaxeProjectWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage _pageOne;
	
	public NewHaxeProjectWizard() {
		super();
		setWindowTitle("New Haxe Project");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public void addPages() {
		super.addPages();
		
		_pageOne = new WizardNewProjectCreationPage("basicNewProjectPage");
		_pageOne.setTitle("Create a Haxe project");
		_pageOne.setDescription("Create a Haxe project in the workspace or in an external location.");
		
		addPage(_pageOne);
	}

	@Override
	public boolean performFinish() {
		
		final URI location = _pageOne.useDefaults() ? null : _pageOne.getLocationURI();
		
		SafeRunnable.run(new SafeRunnable() {
			@Override
			public void run() throws Exception {
				HXEclipse.createProject(_pageOne.getProjectName(), location);
			}
		});
		
		return true;
	}

}
