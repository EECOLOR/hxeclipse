package hxeclipse.core.ui.widgets;

import org.eclipse.core.resources.IContainer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.NewFolderDialog;
import org.eclipse.ui.views.navigator.ResourceComparator;


/**
  */
public class FolderSelectionDialog extends ElementTreeSelectionDialog {

	private Button _createButton;
	private IContainer _selectedContainer;
	private TreeViewer _treeViewer;

	public FolderSelectionDialog(Shell parent, ILabelProvider labelProvider, ITreeContentProvider contentProvider) {
		super(parent, labelProvider, contentProvider);
		setComparator(new ResourceComparator(ResourceComparator.NAME));
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite result = (Composite) super.createDialogArea(parent);

		_treeViewer = getTreeViewer();
		_treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				_updateCreateButton();
			}
		});

		Button button = new Button(result, SWT.PUSH);
		button.setText("Create folder...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				_createButtonClicked();
			}
		});
		button.setFont(parent.getFont());
		_createButton= button;

		applyDialogFont(result);

		return result;
	}

	private void _updateCreateButton() {
		IStructuredSelection selection= (IStructuredSelection) getTreeViewer().getSelection();
		
		_selectedContainer = null;
		
		if (selection.size() == 1) {
			Object element = selection.getFirstElement();
			
			if (element instanceof IContainer) {
				_selectedContainer = (IContainer) element;
			}
		}
		_createButton.setEnabled(_selectedContainer != null);
	}

	private void _createButtonClicked() {
		NewFolderDialog newFolderDialog = new NewFolderDialog(getShell(), _selectedContainer);
		
		if (newFolderDialog.open() == Window.OK) {
			Object createdFolder = newFolderDialog.getResult()[0];
			
			_treeViewer.refresh(_selectedContainer);
			_treeViewer.reveal(createdFolder);
			_treeViewer.setSelection(new StructuredSelection(createdFolder));
		}
	}

}
