package hxeclipse.core.ui.widgets.options;

import hxeclipse.core.IHaxeClass;
import hxeclipse.core.ui.IInputConsumer;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.model.WorkbenchViewerComparator;

public class MainSelector extends Composite implements IInputConsumer, ISelectionProvider {
	private ListenerList _selectionChangedListeners = new ListenerList();
	private ElementTreeSelectionDialog _mainFileSelector;
	private Text _mainFileField;
	
	private ISelection _selection;
	
	public MainSelector(Composite parent, int style) {
		super(parent, style);
		
		initialize();
		createChildren();
	}
	
	protected void initialize() {
		setLayout(new GridLayout(3, false));
	}
	
	protected void createChildren() {
		_createLabel();
		_createMainFileField();
		_createButton();
		_createMainFileSelector();
	}

	private void _createLabel() {
		Label label = new Label(this, SWT.NONE);
		label.setText("Main file");
	}
	
	private void _createMainFileField() {
		_mainFileField = new Text(this, SWT.SINGLE | SWT.BORDER);
		_mainFileField.setFont(this.getFont());
		_mainFileField.setEditable(false);
		
		GridData layoutData = new GridData();
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.grabExcessHorizontalSpace = true;
		
		_mainFileField.setLayoutData(layoutData);
	}
	
	private void _createButton() {
		Button button = new Button(this, SWT.PUSH);
		button.setText("Browse");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if (_mainFileSelector.open() == ElementTreeSelectionDialog.OK) {
					Object[] elements = _mainFileSelector.getResult();
					if (elements.length == 1) {
						IResource resource = (IResource) elements[0];
						IHaxeClass haxeClass = (IHaxeClass) resource.getAdapter(IHaxeClass.class);
						
						String mainFile = resource.getProjectRelativePath().toString();
						_mainFileField.setText(mainFile);
						
						
						_selection = new StructuredSelection(haxeClass);
						
						fireSelectionChanged(new SelectionChangedEvent(MainSelector.this, _selection));
						layout(true);
					}
				}
			}
		});
	}

	private void _createMainFileSelector() {
		_mainFileSelector = new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		_mainFileSelector.setAllowMultiple(false);
		_mainFileSelector.setTitle("Select main file");
		_mainFileSelector.setMessage("The main file will the file added behind the -main argument");
		_mainFileSelector.setDoubleClickSelects(true);
		_mainFileSelector.setAllowMultiple(false);
		//sort by name
		_mainFileSelector.setComparator(new WorkbenchViewerComparator());
		//make sure only a file can be selected
		_mainFileSelector.setValidator(new ISelectionStatusValidator() {
			@Override
			public IStatus validate(Object[] selection) {
				IHaxeClass resource = null;
				
				if (selection.length > 0 && selection[0] instanceof IAdaptable) {
					IAdaptable adaptable = (IAdaptable) selection[0];
					resource = (IHaxeClass) adaptable.getAdapter(IHaxeClass.class);
				}
				
				if (resource == null)
				{
					return new Status(IStatus.ERROR, "unknown", "Should select a valid Haxe file");
				} else
				{
					return new Status(IStatus.OK, "unknown", "");
				}
			}
		});
	}

	@Override
	public void setInput(Object input) {
		_mainFileSelector.setInput(input);
	}
	
    protected void fireSelectionChanged(final SelectionChangedEvent event) {
        Object[] listeners = _selectionChangedListeners.getListeners();
        for (int i = 0; i < listeners.length; ++i) {
            final ISelectionChangedListener l = (ISelectionChangedListener) listeners[i];
            SafeRunnable.run(new SafeRunnable() {
                public void run() {
                    l.selectionChanged(event);
                }
            });
        }
    }	
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		_selectionChangedListeners.add(listener);
	}
	
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		_selectionChangedListeners.remove(listener);
	}

	@Override
	public ISelection getSelection() {
		return _selection;
	}

	@Override
	public void setSelection(ISelection selection) {
		_selection = selection;
	}
}
