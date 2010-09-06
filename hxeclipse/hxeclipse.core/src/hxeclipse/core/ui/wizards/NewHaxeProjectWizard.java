package hxeclipse.core.ui.wizards;

import hxeclipse.core.HXEclipse;

import java.net.URI;

import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NewHaxeProjectWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage _pageOne;
	private HaxeProjectDescriptionWizardPage _pageTwo;
	
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
		
		_pageTwo = new HaxeProjectDescriptionWizardPage("haxeProjectDescription");
		_pageTwo.setTitle("Haxe project information");
		_pageTwo.setDescription("Create targets, etc...");
		addPage(_pageTwo);
	}

	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);
	}

	@Override
	public boolean performFinish() {
		
		final URI location = _pageOne.useDefaults() ? null : _pageOne.getLocationURI();
		
		SafeRunnable.run(new SafeRunnable() {
			@Override
			public void run() throws Exception {
				HXEclipse.createProject(_pageOne.getProjectName(), location, _pageTwo.getProjectDescription());
			}
		});
		
		return true;
	}

}
