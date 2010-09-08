package hxeclipse.core.ui.wizards;

import hxeclipse.core.HXEclipse;

import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IPageChangeProvider;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.statushandlers.StatusManager;

public class NewHaxeProjectWizard extends Wizard implements INewWizard, IPageChangedListener {

	private WizardNewProjectCreationPage _pageOne;
	private HaxeProjectDescriptionWizardPage _pageTwo;
	
	private IProject _project;
	private IWizardPage _currentPage;
	
	public NewHaxeProjectWizard() {
		super();
		setWindowTitle("New Haxe Project");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		//not implemented
	}

	@Override
	public void setContainer(IWizardContainer wizardContainer) {
		if (getContainer() != null && wizardContainer instanceof IPageChangeProvider) {
			((IPageChangeProvider) wizardContainer).removePageChangedListener(this);
		}
		
		super.setContainer(wizardContainer);
		
		if (wizardContainer != null && wizardContainer instanceof IPageChangeProvider) {
			((IPageChangeProvider) wizardContainer).addPageChangedListener(this);
		}
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
	public void pageChanged(PageChangedEvent event) {
		Object selectedPage = event.getSelectedPage();

		if (_currentPage != null) {
			
			if (_currentPage.equals(_pageOne) && selectedPage.equals(_pageTwo)) {
				_createProject();
			} else if (_currentPage.equals(_pageTwo) && selectedPage.equals(_pageOne)) {
				_deleteProject();
			}
		}
		_currentPage = (IWizardPage) selectedPage;
	}
	
	private void _createProject() {
		String projectName = _pageOne.getProjectName();
		URI location = _pageOne.useDefaults() ? null : _pageOne.getLocationURI();
		try {
			_project = HXEclipse.getProjectManager().createProject(projectName, location);
			_projectCreated();
		} catch (CoreException e) {
			_throwStatus("Could not create project '" + projectName + "'", e);
			dispose();
			_project = null;
		}
	}
	
	private void _projectCreated() {
		_pageTwo.setProject(_project);
	}

	private void _deleteProject() {
		if (_project != null) {
			try {
				_project.delete(true, true, null);
				_project = null;
				_projectDeleted();
			} catch (CoreException e) {
				_throwStatus("Could not delete project '" + _project.getName() + "'", e);
			}
		}
	}
	
	private void _projectDeleted() {
		_pageTwo.setProject(null);
	}

	private void _throwStatus(String message, Throwable e) {
		IStatus status = new Status(IStatus.ERROR, HXEclipse.PLUGIN_ID, message, e);
		StatusManager.getManager().handle(status);
	}
	
	@Override
	public boolean performCancel() {
		_deleteProject();
		
		return super.performCancel();
	}

	@Override
	public boolean canFinish() {
		// TODO check if we can finish (we need a project description)
		
		return super.canFinish();
	}

	@Override
	public boolean performFinish() {
		
		SafeRunnable.run(new SafeRunnable() {
			@Override
			public void run() throws Exception {
				HXEclipse.getProjectManager().createHaxeProject(_project, _pageTwo.getProjectDescription());
			}
		});
		
		return true;
	}

}
