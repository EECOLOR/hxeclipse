package hxeclipse.core.ui.widgets.target.options;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.extensions.IHaxeLibrary;
import hxeclipse.core.extensions.IHaxeLibrarySelector;
import hxeclipse.core.extensions.IHaxeLibrarySelectorFactory;
import hxeclipse.core.internal.GeneralOptionCollection;

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

public class LibrariesOption extends Composite {

	private ListViewer _libraryList;
	private Button _addButton;
	private Button _removeButton;
	private List<IHaxeLibrary> _libraries;
	
	public LibrariesOption(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout(2, false));
		
		_createLibraryList();
		_createButtons();
	}

	private void _createLibraryList() {
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.heightHint = 100;
		
		_libraryList = new ListViewer(this);
		_libraryList.getControl().setLayoutData(layoutData);
		_libraryList.setComparator(new ViewerComparator());
		_libraryList.setContentProvider(ArrayContentProvider.getInstance());
		_libraryList.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				IHaxeLibrary library = (IHaxeLibrary) element;
				String version = library.getVersion();
				String text = library.getName() + (version == null ? "" : " (" + version + ")");
				return super.getText(text);
			}
		});
		_libraryList.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				_libraryListChanged();
			}
		});
	}

	private void _createButtons() {
		Composite buttonBar = new Composite(this, SWT.NONE);
		buttonBar.setLayout(new GridLayout());
		buttonBar.setLayoutData(new GridData(SWT.NONE, SWT.BEGINNING, false, false));
		
		_addButton = new Button(buttonBar, SWT.PUSH);
		_addButton.setLayoutData(new GridData(SWT.FILL, SWT.NONE, false, false));
		_addButton.setText("Add...");
		_addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_addButtonClicked();
			}
		});
		
		_removeButton = new Button(buttonBar, SWT.PUSH);
		_removeButton.setLayoutData(new GridData(SWT.FILL, SWT.NONE, false, false));
		_removeButton.setText("Remove");
		_removeButton.setEnabled(false);
		_removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_removeButtonClicked();
			}
		});
		
	}
	
	protected void _libraryListChanged() {
		IStructuredSelection selection = (IStructuredSelection) _libraryList.getSelection();
		_removeButton.setEnabled(!selection.isEmpty());
	}

	protected void _addButtonClicked() {
		IHaxeLibrarySelectorFactory currentLibrarySelector = HXEclipse.getLibrarySelectorManager().getCurrentLibrarySelector();
		IHaxeLibrarySelector librarySelector = currentLibrarySelector.newInstance(getShell());
		if (librarySelector.open() == IDialogConstants.OK_ID) {
			_libraries.add(librarySelector.getSelectedLibrary());
		}
		_libraryList.refresh();
	}
	
	protected void _removeButtonClicked() {
		IStructuredSelection selection = (IStructuredSelection) _libraryList.getSelection();
		Iterator<?> libraries = selection.iterator();
		
		while (libraries.hasNext()) {
			_libraries.remove(libraries.next());
		}
		_libraryList.refresh();
	}
	
	public void setGeneralOptionCollection(GeneralOptionCollection generalOptionsCollection) {
		_libraries = generalOptionsCollection.getLibraries();
		
		if (_libraries == null) {
			_libraries = new ArrayList<IHaxeLibrary>();
			generalOptionsCollection.setLibraries(_libraries);
		}
		
		_libraryList.setInput(_libraries);
	}
	
}
