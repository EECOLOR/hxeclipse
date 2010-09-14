package hxeclipse.core.ui.widgets.target;

import hxeclipse.core.extensions.IHaxeTargetDescription;
import hxeclipse.core.internal.HaxeTarget;
import hxeclipse.core.ui.IInputConsumer;
import hxeclipse.core.ui.viewers.HaxeTargetTreeLabelProvider;
import hxeclipse.core.ui.viewers.HaxeTargetTreeProvider;
import hxeclipse.core.ui.widgets.ListDetails;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class TargetListDetails extends ListDetails {

	private ListenerList _targetDescriptionsChangedListeners = new ListenerList();
	
	private TargetDetails _targetDetails;
	private TreeViewer _treeViewer;
	private Button _addButton;
	private Button _removeButton;
	private List<IHaxeTargetDescription> _targetDescriptions;
	private HaxeTargetSelector _haxeTargetSelector;

	private IProject _project;
	
	public TargetListDetails(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected void initialize() {
		super.initialize();
		
		setContentProvider(HaxeTargetTreeProvider.getInstance());
		setLabelProvider(HaxeTargetTreeLabelProvider.getInstance());
		setComparator(new ViewerComparator());
		
		_haxeTargetSelector = new HaxeTargetSelector(getShell());
	}	
	
	@Override
	protected Composite createListContainer(Composite parent) {
		Composite container = super.createListContainer(parent);
		
		_createButtonBar(container);
		
		return container;
	}

	private void _createButtonBar(Composite parent) {
		Composite buttonBar = new Composite(parent, SWT.NONE);
		buttonBar.setLayout(new GridLayout(2, false));
		
		_addButton = new Button(buttonBar, SWT.PUSH);
		_addButton.setText("Add...");
		_addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_addButtonClicked();
			}
		});
		
		_removeButton = new Button(buttonBar, SWT.PUSH);
		_removeButton.setText("Remove");
		_removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_removeButtonClicked();
			}
		});
		_removeButton.setEnabled(false);
	}

	private void _removeButtonClicked() {
		_removeButton.setEnabled(false);
		
		IStructuredSelection selection = (IStructuredSelection) _treeViewer.getSelection();
		
		_targetDescriptions.remove(selection);
		
		fireSelectionChanged(new TargetDescriptionsChangedEvent(this));
	}

	private void _addButtonClicked() {
		if (_haxeTargetSelector.open() == IDialogConstants.OK_ID) {
			IHaxeTargetDescription targetDescription = _haxeTargetSelector.getSelectedHaxeTarget().getTargetDescription().copy();
			targetDescription.setDefaultValues(_project);
			_targetDescriptions.add(targetDescription);
			_treeViewer.refresh();
			fireSelectionChanged(new TargetDescriptionsChangedEvent(this));
		}
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

	@Override
	protected void updateDetails() {
		IStructuredSelection selection = (IStructuredSelection) _treeViewer.getSelection();
		
		Object input = null;
		
		if (!selection.isEmpty()) {
			input = selection.getFirstElement();
		}
		
		boolean selectionIsHaxeTarget = input instanceof HaxeTarget;
		
		_removeButton.setEnabled(selectionIsHaxeTarget);
		
		if (!selectionIsHaxeTarget) {
			super.updateDetails();
		}
	}
	
    protected void fireSelectionChanged(final TargetDescriptionsChangedEvent event) {
        Object[] listeners = _targetDescriptionsChangedListeners.getListeners();
        for (int i = 0; i < listeners.length; ++i) {
            final ITargetDescriptionChangedListener l = (ITargetDescriptionChangedListener) listeners[i];
            SafeRunnable.run(new SafeRunnable() {
                public void run() {
                    l.targetDescriptionsChanged(event);
                }
            });
        }
    }	
	
	public void addTargetDescriptionsChangedListener(ITargetDescriptionChangedListener listener) {
		_targetDescriptionsChangedListeners.add(listener);
	}
	
	public void removeTargetDescriptionsChangedListener(ITargetDescriptionChangedListener listener) {
		_targetDescriptionsChangedListeners.remove(listener);
	}
    
	public void setProject(IProject project) {
		_project = project;
		_targetDetails.setProject(project);
	}

	public void setTargetDescriptions(List<IHaxeTargetDescription> targetDescriptions) {
		_targetDescriptions = targetDescriptions;
		setInput(_targetDescriptions);
	}
	
	public List<IHaxeTargetDescription> getTargetDescriptions() {
		return _targetDescriptions;
	}
	
}
