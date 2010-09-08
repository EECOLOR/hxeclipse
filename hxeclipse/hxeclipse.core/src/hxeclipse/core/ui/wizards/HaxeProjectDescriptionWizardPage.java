package hxeclipse.core.ui.wizards;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.extensions.AbstractHaxeTargetDescription;
import hxeclipse.core.extensions.IHaxeTargetDescription;
import hxeclipse.core.internal.HaxeTarget;
import hxeclipse.core.model.HaxeProjectDescription;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class HaxeProjectDescriptionWizardPage extends WizardPage {

	private HaxeProjectDescription _projectDescription;
	private IProject _project;
	
	protected HaxeProjectDescriptionWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Create wizard page
		
		//needed to prevent null pointer exception
		setControl(new Composite(parent, SWT.NONE));
	}

	@Override
	public boolean isPageComplete() {
		return _projectDescription != null;
	}

	public HaxeProjectDescription getProjectDescription() {
		return _projectDescription;
	}
	
	public class TempTargetDescription extends AbstractHaxeTargetDescription {

	}

	public void setProject(IProject project) {
		_project = project;
		
		if (project == null) {
			_projectDescription = null;
		} else
		{
			//create test target
			Iterator<HaxeTarget> targets = HXEclipse.getTargetManager().getTargets().iterator();
			List<IHaxeTargetDescription> targetDescriptions = new ArrayList<IHaxeTargetDescription>();
			while (targets.hasNext()) {
				IHaxeTargetDescription newTargetDescription = targets.next().getTargetDescription().copy();
				newTargetDescription.setDefaultValues(_project);
				targetDescriptions.add(newTargetDescription);
			}
			
			_projectDescription = new HaxeProjectDescription();
			_projectDescription.setTargets(targetDescriptions);		
		}
		
		setPageComplete(isPageComplete());
	}
}

