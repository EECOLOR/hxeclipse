package hxeclipse.core.ui.widgets.target;

import hxeclipse.core.ui.IInputConsumer;
import hxeclipse.core.ui.viewers.HaxeTargetLabelProvider;
import hxeclipse.core.ui.widgets.ListDetails;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class TargetListDetails extends ListDetails {

	private TargetDetails _targetDetails;
	
	public TargetListDetails(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected void initialize() {
		super.initialize();
		
		setContentProvider(ArrayContentProvider.getInstance());
		setLabelProvider(HaxeTargetLabelProvider.getInstance());
		setComparator(new ViewerComparator());				
	}	
	
	@Override
	protected IInputConsumer createDetails(Composite parent) {
		_targetDetails = new TargetDetails(parent, SWT.NONE);
		return _targetDetails;
	}

}
