package hxeclipse.core.ui.widgets;

import hxeclipse.core.ui.IInputConsumer;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class FolderSelectionField extends Composite implements IInputConsumer, ISelectionProvider {

	private ListenerList _selectionChangedListeners = new ListenerList();
	private IStructuredSelection _selection;
	private Text _folderDisplay;
	private Button _changeButton;
	private FolderSelectionDialog _folderSelectionDialog;

	public FolderSelectionField(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout(2, false));
		
		_createFolderSelectionDialog();
		_createDirectoryDisplay();
		_createChangeButton();
	}

	private void _createFolderSelectionDialog() {
		_folderSelectionDialog = new FolderSelectionDialog(getShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider());
	}

	private void _createDirectoryDisplay() {
		_folderDisplay = new Text(this, SWT.BORDER | SWT.SINGLE);
		_folderDisplay.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
	}

	private void _createChangeButton() {
		_changeButton = new Button(this, SWT.PUSH);
		_changeButton.setText("Browse...");
		_changeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_changeButtonClicked();
			}
		});
	}

	private void _changeButtonClicked() {
		if (_folderSelectionDialog.open() == IDialogConstants.OK_ID) {
			Object folder = _folderSelectionDialog.getFirstResult();
			StructuredSelection selection = new StructuredSelection(folder);
			setSelection(selection);
			fireSelectionChanged(new SelectionChangedEvent(this, selection));
		}
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
		_selection = (IStructuredSelection) selection;
		_selectionChanged();
	}

	private void _selectionChanged() {
		IFolder folder = (IFolder) _selection.getFirstElement();
		_folderDisplay.setText(folder.getProjectRelativePath().toString());
		
		_folderSelectionDialog.setInitialSelection(folder);
	}

	/**
	 * Expects the root of folders as input
	 */
	@Override
	public void setInput(Object input) {
		_folderSelectionDialog.setInput(input);
	}
}
