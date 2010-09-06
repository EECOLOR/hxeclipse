package hxeclipse.core.ui.widgets.target;

import hxeclipse.core.HaxeTarget;
import hxeclipse.core.extensions.IOptionCollection;
import hxeclipse.core.ui.IInputConsumer;
import hxeclipse.core.ui.viewers.HaxeTargetTreeLabelProvider;
import hxeclipse.core.ui.viewers.HaxeTargetTreeProvider;
import hxeclipse.core.ui.widgets.ListDetails;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class TargetListDetails extends ListDetails {

	private TargetDetails _targetDetails;
	private TreeViewer _treeViewer;
	
	public TargetListDetails(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected void initialize() {
		super.initialize();
		
		setContentProvider(HaxeTargetTreeProvider.getInstance());
		setLabelProvider(HaxeTargetTreeLabelProvider.getInstance());
		setComparator(new ViewerComparator());				
	}	
	
	@Override
	protected StructuredViewer createViewer(Composite container) {
		_treeViewer = new TreeViewer(container, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		return _treeViewer;
	}

	@Override
	protected IInputConsumer createDetails(Composite parent) {
		_targetDetails = new TargetDetails(parent, SWT.NONE);
		_targetDetails.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		return _targetDetails;
	}

	protected void updateDetails() {
		IStructuredSelection selection = (IStructuredSelection) _treeViewer.getSelection();
		
		Object input = null;
		
		if (!selection.isEmpty()) {
			input = selection.getFirstElement();
		}
		
		if (input instanceof HaxeTarget) {
			//move the selection to a child 
			
			@SuppressWarnings("rawtypes")
			HaxeTarget haxeTarget = (HaxeTarget) input;
			List<IOptionCollection> optionCollections = haxeTarget.getTargetDescription().getOptionCollections();
			
			Object newSelection = null;
			
			if (!optionCollections.isEmpty()) {
				newSelection = optionCollections.get(0);
			}
			_treeViewer.setSelection(new StructuredSelection(newSelection), true);
		}
		
		super.updateDetails();
	}
	
	public void setProject(IProject project) {
		_targetDetails.setProject(project);
	}
}
