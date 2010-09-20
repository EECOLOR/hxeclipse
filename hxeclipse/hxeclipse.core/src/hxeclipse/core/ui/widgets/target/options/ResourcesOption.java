package hxeclipse.core.ui.widgets.target.options;

import hxeclipse.core.internal.GeneralOptionCollection;
import hxeclipse.core.model.Resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class ResourcesOption extends Composite {

	private ListViewer _resourceList;
	private List<Resource> _resources;
	private Button _addButton;
	private Button _removeButton;
	private ResourceDialog _resourceDialog;

	public ResourcesOption(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout(2, false));
		
		_resourceDialog = new ResourceDialog(getShell());
		
		_createList();
		_createButtons();
	}

	private void _createList() {
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.widthHint = 100;
		layoutData.heightHint = 100;
		
		_resourceList = new ListViewer(this);
		_resourceList.getControl().setLayoutData(layoutData);
		_resourceList.setContentProvider(ArrayContentProvider.getInstance());
		_resourceList.setLabelProvider(new LabelProvider());
		_resourceList.setComparator(new ViewerComparator());
		_resourceList.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				_resourceListChanged();
			}
		});
	}

	private void _createButtons() {
		Composite buttonBar = new Composite(this, SWT.NONE);
		buttonBar.setLayout(new GridLayout());
		buttonBar.setLayoutData(new GridData(SWT.NONE, SWT.BEGINNING, false, false));
		
		_addButton = new Button(buttonBar, SWT.PUSH);
		_addButton.setLayoutData(new GridData(SWT.FILL, SWT.NONE, false, false));
		_addButton.setText("Add file...");
		_addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_addButtonClicked();
			}
		});
		
		_removeButton = new Button(buttonBar, SWT.PUSH);
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
	
	private void _resourceListChanged() {
		IStructuredSelection selection = (IStructuredSelection) _resourceList.getSelection();
		
		_removeButton.setEnabled(!selection.isEmpty());
	}

	private void _removeButtonClicked() {
		_removeButton.setEnabled(false);
		
		IStructuredSelection selection = (IStructuredSelection) _resourceList.getSelection();
		@SuppressWarnings("unchecked")
		Iterator<Resource> resources = selection.iterator();
		
		while (resources.hasNext()) {
			_resources.remove(resources.hasNext());
		}
		_resourceList.refresh();
	}

	private void _addButtonClicked() {
		if (_resourceDialog.open() == IDialogConstants.OK_ID) {
			Resource resource = new Resource(_resourceDialog.getFile());
			resource.setName(_resourceDialog.getName());
			
			_resources.add(resource);
			_resourceList.refresh();
		}
	}

	public void setProject(IProject project) {
		_resourceDialog.setProject(project);
	}
	
	public void setGeneralOptionCollection(GeneralOptionCollection generalOptionCollection) {
		List<Resource> resources = generalOptionCollection.getResources();
		
		if (resources == null) {
			_resources = new ArrayList<Resource>();
			generalOptionCollection.setResources(_resources);
		} else
		{
			_resources = resources;
		}
		
		_resourceList.setInput(_resources);
	}
}
