package hxeclipse.core.ui.widgets.target.options;

import hxeclipse.core.internal.CompilerOptionCollection;
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

public class ConditionalCompilationFlagsOption extends Composite {

	private ConditionalCompilationFlagDialog _conditionalCompilationFlagDialog;
	private List<String> _conditionalCompilationFlags;
	private ListViewer _conditionalCompilationFlagsList;
	private Button _addButton;
	private Button _removeButton;

	public ConditionalCompilationFlagsOption(Composite parent, int style) {
		super(parent, style);
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout(2, false));
		
		_conditionalCompilationFlagDialog = new ConditionalCompilationFlagDialog(getShell());
		
		_createList();
		_createButtons();
	}

	private void _createList() {
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.widthHint = 100;
		layoutData.heightHint = 100;
		
		_conditionalCompilationFlagsList = new ListViewer(this);
		_conditionalCompilationFlagsList.getControl().setLayoutData(layoutData);
		_conditionalCompilationFlagsList.setContentProvider(ArrayContentProvider.getInstance());
		_conditionalCompilationFlagsList.setLabelProvider(new LabelProvider());
		_conditionalCompilationFlagsList.setComparator(new ViewerComparator());
		_conditionalCompilationFlagsList.addSelectionChangedListener(new ISelectionChangedListener() {
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
		_addButton.setText("Add conditional compilation flag...");
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
		IStructuredSelection selection = (IStructuredSelection) _conditionalCompilationFlagsList.getSelection();
		
		_removeButton.setEnabled(!selection.isEmpty());
	}

	private void _removeButtonClicked() {
		_removeButton.setEnabled(false);
		
		IStructuredSelection selection = (IStructuredSelection) _conditionalCompilationFlagsList.getSelection();
		@SuppressWarnings("unchecked")
		Iterator<Resource> mappings = selection.iterator();
		
		while (mappings.hasNext()) {
			_conditionalCompilationFlags.remove(mappings.next());
		}
		_conditionalCompilationFlagsList.refresh();
	}

	private void _addButtonClicked() {
		if (_conditionalCompilationFlagDialog.open() == IDialogConstants.OK_ID) {
			_conditionalCompilationFlags.add(_conditionalCompilationFlagDialog.getConditionalCompilerFlag());
			_conditionalCompilationFlagsList.refresh();
		}
	}

	public void setCompilerOptionCollection(CompilerOptionCollection compilerOptionCollection) {
		List<String> conditionalCompilationFlags = compilerOptionCollection.getConditionalCompilationFlags();
		
		if (conditionalCompilationFlags == null) {
			_conditionalCompilationFlags = new ArrayList<String>();
			compilerOptionCollection.setConditionalCompilationFlags(_conditionalCompilationFlags);
		} else
		{
			_conditionalCompilationFlags = conditionalCompilationFlags;
		}
		
		_conditionalCompilationFlagsList.setInput(_conditionalCompilationFlags);
	}
}
