package hxeclipse.core.ui.widgets.target.options;

import hxeclipse.core.ui.IInputConsumer;
import hxeclipse.core.ui.widgets.FolderSelectionDialog;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
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

public class ClassPathOption extends Composite implements IInputConsumer {

	private ListViewer _listViewer;
	private Button _addButton;
	private Button _removeButton;
	private FolderSelectionDialog _folderSelectionDialog;
	private List<IFolder> _classPaths;
	
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
	}

	private void _createClassPathList() {
		GridData layoutData = new GridData(SWT.NONE, SWT.FILL, false, true);
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
		buttons.setLayout(new GridLayout());
		
		_addButton = new Button(buttons, SWT.PUSH);
		_addButton.setText("Add folder...");
		_addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_addButtonClicked();
			}
		});
		
		_removeButton = new Button(buttons, SWT.PUSH);
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
		if (_folderSelectionDialog.open() == SWT.OK) {
			IFolder folder = (IFolder) _folderSelectionDialog.getFirstResult();
			_classPaths.add(folder);
			_classPathsChanged();
		}
	}
	
	private void _removeButtonClicked() {
		IStructuredSelection selection = (IStructuredSelection) _listViewer.getSelection();
		
		Iterator<?> iterator = selection.iterator();
		
		while (iterator.hasNext()) {
			_classPaths.remove(iterator.next());
		}
		
		_classPathsChanged();
	}

	private void _classPathsChanged() {
		_folderSelectionDialog.setInitialSelections(_classPaths.toArray());

		AdaptableList adaptableList = new AdaptableList(_classPaths);
		_listViewer.setInput(adaptableList);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	/**
	 * Expects a list of folders as input's, this list contains all classPaths
	 */
	public void setInput(Object input) {
		_classPaths = (List<IFolder>) input;
		
		_classPathsChanged();
	}

	public void setProject(IProject project) {
		_folderSelectionDialog.setInput(project);
	}
	
}
