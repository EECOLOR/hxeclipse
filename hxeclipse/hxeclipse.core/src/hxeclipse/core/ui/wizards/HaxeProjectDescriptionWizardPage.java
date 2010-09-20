package hxeclipse.core.ui.wizards;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxeProject;
import hxeclipse.core.extensions.IHaxeTargetDescription;
import hxeclipse.core.internal.HaxeProjectManager;
import hxeclipse.core.model.HaxeProjectDescription;
import hxeclipse.core.ui.widgets.target.ITargetDescriptionChangedListener;
import hxeclipse.core.ui.widgets.target.TargetDescriptionsChangedEvent;
import hxeclipse.core.ui.widgets.target.TargetListDetails;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.statushandlers.StatusManager;

public class HaxeProjectDescriptionWizardPage extends WizardPage {

	private IProject _project;
	private TargetListDetails _targetListDetails;
	private IHaxeProject _haxeProject;
	
	protected HaxeProjectDescriptionWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		
		_targetListDetails = new TargetListDetails(parent, SWT.NONE);
		_targetListDetails.setTargetDescriptions(new ArrayList<IHaxeTargetDescription>(1));
		_targetListDetails.addTargetDescriptionsChangedListener(new ITargetDescriptionChangedListener() {
			@Override
			public void targetDescriptionsChanged(TargetDescriptionsChangedEvent event) {
				_targetDescriptionsChanged();
			}
		});
		
		//needed to prevent null pointer exception
		setControl(_targetListDetails);
	}

	private void _targetDescriptionsChanged() {
		
		HaxeProjectDescription projectDescription = _haxeProject.getProjectDescription();
		projectDescription.setTargetDescriptions(_targetListDetails.getTargetDescriptions());
		
		setPageComplete(isPageComplete());
	}

	@Override
	public boolean isPageComplete() {
		return _haxeProject != null &&
			   _haxeProject.getProjectDescription().getTargetDescriptions().size() > 0 &&
			   _project != null;
	}

	public IHaxeProject getHaxeProject() {
		return _haxeProject;
	}
	
	public void setProject(IProject project) {
		_project = project;
		
		_targetListDetails.setProject(_project);
		
		HaxeProjectManager projectManager = HXEclipse.getProjectManager();
		
		if (_project == null) {
			try {
				projectManager.removeTempHaxeProject(_haxeProject);
			} catch (CoreException e) {
				StatusManager.getManager().handle(e.getStatus());
			}
		} else
		{
			try {
				_haxeProject = projectManager.createTempHaxeProject(_project, new HaxeProjectDescription());
			} catch (CoreException e) {
				StatusManager.getManager().handle(e.getStatus());
			}
		}
	}
}

