package hxeclipse.core.ui.widgets.target.options;

import hxeclipse.core.internal.GeneralOptionCollection;
import hxeclipse.core.model.Mapping;
import hxeclipse.core.model.Resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

public class MappingsOption extends Composite {

	private List<Mapping> _mappings;
	private Button _removeButton;
	private Button _addButton;
	private ListViewer _mappingList;
	private MappingDialog _mappingDialog;

	public MappingsOption(Composite parent, int style) {
		super(parent, style);
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout(2, false));
		
		_mappingDialog = new MappingDialog(getShell());
		
		_createList();
		_createButtons();
	}

	private void _createList() {
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.widthHint = 100;
		layoutData.heightHint = 100;
		
		_mappingList = new ListViewer(this);
		_mappingList.getControl().setLayoutData(layoutData);
		_mappingList.setContentProvider(ArrayContentProvider.getInstance());
		_mappingList.setLabelProvider(new LabelProvider());
		_mappingList.setComparator(new ViewerComparator());
		_mappingList.addSelectionChangedListener(new ISelectionChangedListener() {
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
		_addButton.setText("Add mapping...");
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
		IStructuredSelection selection = (IStructuredSelection) _mappingList.getSelection();
		
		_removeButton.setEnabled(!selection.isEmpty());
	}

	private void _removeButtonClicked() {
		_removeButton.setEnabled(false);
		
		IStructuredSelection selection = (IStructuredSelection) _mappingList.getSelection();
		@SuppressWarnings("unchecked")
		Iterator<Resource> mappings = selection.iterator();
		
		while (mappings.hasNext()) {
			_mappings.remove(mappings.next());
		}
		_mappingList.refresh();
	}

	private void _addButtonClicked() {
		if (_mappingDialog.open() == IDialogConstants.OK_ID) {
			Mapping mapping = new Mapping(_mappingDialog.getSourcePackage(), _mappingDialog.getDestinationPackage());
			
			_mappings.add(mapping);
			_mappingList.refresh();
		}
	}

	public void setGeneralOptionCollection(GeneralOptionCollection generalOptionCollection) {
		List<Mapping> mappings = generalOptionCollection.getMappings();
		
		if (mappings == null) {
			_mappings = new ArrayList<Mapping>();
			generalOptionCollection.setMappings(_mappings);
		} else
		{
			_mappings = mappings;
		}
		
		_mappingList.setInput(_mappings);
	}
}
