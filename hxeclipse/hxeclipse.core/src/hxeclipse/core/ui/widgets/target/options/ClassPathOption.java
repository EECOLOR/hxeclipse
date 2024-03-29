package hxeclipse.core.ui.widgets.target.options;

import hxeclipse.core.ui.widgets.FolderSelectionDialog;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.model.AdaptableList;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.model.WorkbenchViewerComparator;

public class ClassPathOption extends Composite {

	private ListViewer _listViewer;
	private Button _addButton;
	private Button _removeButton;
	private FolderSelectionDialog _folderSelectionDialog;
	private List<IFolder> _sourceFolders;
	
	public ClassPathOption(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		
		setLayout(new GridLayout(2, false));
		
		_createFolderSelectionDialog();
		_createClassPathList();
		_createButtons();
	}
	
	private void _createFolderSelectionDialog() {
		_folderSelectionDialog = new FolderSelectionDialog(getShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		_folderSelectionDialog.setAllowMultiple(true);
	}

	private void _createClassPathList() {
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.heightHint = 50;
		
		_listViewer = new ListViewer(this);
		_listViewer.getControl().setLayoutData(layoutData);
		_listViewer.setLabelProvider(new WorkbenchLabelProvider());
		_listViewer.setContentProvider(new WorkbenchContentProvider());
		_listViewer.setComparator(new WorkbenchViewerComparator());
		_listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				_listViewerSelectionChanged();
			}
		});
	}

	private void _createButtons() {
		Composite buttons = new Composite(this, SWT.NONE);
		buttons.setLayoutData(new GridData(SWT.NONE, SWT.BEGINNING, false, false));
		buttons.setLayout(new GridLayout());
		
		_addButton = new Button(buttons, SWT.PUSH);
		_addButton.setLayoutData(new GridData(SWT.FILL, SWT.NONE, false, false));
		_addButton.setText("Add folder...");
		_addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_addButtonClicked();
			}
		});
		
		_removeButton = new Button(buttons, SWT.PUSH);
		_removeButton.setLayoutData(new GridData(SWT.FILL, SWT.NONE, false, false));
		_removeButton.setText("Remove");
		_removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_removeButtonClicked();
			}
		});
		_removeButton.setEnabled(false);
	}

	private void _listViewerSelectionChanged() {
		_removeButton.setEnabled(!_listViewer.getSelection().isEmpty());
	}
	
	private void _addButtonClicked() {
		if (_folderSelectionDialog.open() == IDialogConstants.OK_ID) {
			Object[] results = _folderSelectionDialog.getResult();
			
			for (Object result : results) {
				IFolder folder = (IFolder) result;
				_sourceFolders.add(folder);
				_sourceFoldersChanged();
			}
		}
	}
	
	private void _removeButtonClicked() {
		IStructuredSelection selection = (IStructuredSelection) _listViewer.getSelection();
		
		Iterator<?> iterator = selection.iterator();
		
		while (iterator.hasNext()) {
			_sourceFolders.remove(iterator.next());
		}
		
		_sourceFoldersChanged();
	}

	private void _sourceFoldersChanged() {
		_folderSelectionDialog.setInitialSelections(_sourceFolders.toArray());
		
		AdaptableList adaptableList = new AdaptableList(_sourceFolders);
		_listViewer.setInput(adaptableList);
	}
	
	/**
	 * Expects a list of folders as input's, this list contains all classPaths
	 */
	public void setSourceFolders(List<IFolder> sourceFolders) {
		_sourceFolders = sourceFolders;
		
		_sourceFoldersChanged();
	}

	public void setProject(IProject project) {
		_folderSelectionDialog.setInput(project);
	}
	
}
