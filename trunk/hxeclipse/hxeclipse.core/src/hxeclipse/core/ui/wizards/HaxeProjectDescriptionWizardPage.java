package hxeclipse.core.ui.wizards;

import hxeclipse.core.HaxeTarget;
import hxeclipse.core.extensions.ITargetDescription;
import hxeclipse.core.model.AbstractTargetDescription;
import hxeclipse.core.model.HaxeProjectDescription;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class HaxeProjectDescriptionWizardPage extends WizardPage {

	private HaxeProjectDescription _projectDescription;
	
	protected HaxeProjectDescriptionWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Create wizard page
		
		//needed to prevent null pointer exception
		setControl(new Composite(parent, SWT.NONE));
		
		//create temp target
		ImageDescriptor imageDescriptor = PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_DEC_FIELD_WARNING);
		TempTargetDescription tempTargetDescription = new TempTargetDescription();
		new HaxeTarget<TempTargetDescription>("temp", imageDescriptor, tempTargetDescription);
		
		//create a list of target descriptions
		List<ITargetDescription> targetDescriptions = new ArrayList<ITargetDescription>();
		targetDescriptions.add(tempTargetDescription);
		
		_projectDescription = new HaxeProjectDescription();
		_projectDescription.setTargets(targetDescriptions);
	}

	@Override
	public boolean isPageComplete() {
		// TODO Auto-generated method stub
		return super.isPageComplete();
	}

	public HaxeProjectDescription getProjectDescription() {
		return _projectDescription;
	}
	
	class TempTargetDescription extends AbstractTargetDescription {

	}
}

