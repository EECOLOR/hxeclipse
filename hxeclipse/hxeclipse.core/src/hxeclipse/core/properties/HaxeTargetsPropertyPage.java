package hxeclipse.core.properties;

import java.util.List;

import hxeclipse.core.IHaxeProject;
import hxeclipse.core.extensions.IHaxeTargetDescription;
import hxeclipse.core.ui.widgets.target.TargetListDetails;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.dialogs.PropertyPage;

public class HaxeTargetsPropertyPage extends PropertyPage implements IWorkbenchPropertyPage {

	public HaxeTargetsPropertyPage() {
	}

	@Override
	protected Control createContents(Composite parent) {
		TargetListDetails targetListDetails = new TargetListDetails(parent, SWT.NONE);
		
		IProject project = (IProject) getElement().getAdapter(IProject.class);
		IHaxeProject haxeProject = (IHaxeProject) project.getAdapter(IHaxeProject.class);
		
		if (haxeProject == null) {
			throw new RuntimeException("This should not happen. The project could not be adapted from IProject to IHaxeProject");
		}
		
		targetListDetails.setProject(project);
		List<IHaxeTargetDescription> targets = haxeProject.getProjectDescription().getTargets();
		targetListDetails.setInput(targets);
		
		return targetListDetails;
	}

}
