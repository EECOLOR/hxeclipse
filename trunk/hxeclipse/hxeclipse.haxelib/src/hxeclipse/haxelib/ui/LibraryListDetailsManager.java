package hxeclipse.haxelib.ui;

import hxeclipse.haxelib.HaxeLib;
import hxeclipse.haxelib.model.Library;

import java.util.List;

import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class LibraryListDetailsManager extends LibraryListDetails {

	private HaxeLib _haxeLib;
	private Button _checkBox;
	private ViewerFilter _filter;
	private List<Library> _installedLibraries;
	private ListViewer _listViewer;
	
	public LibraryListDetailsManager(Composite parent, int style, HaxeLib haxeLib) {
		super(parent, style);
		
		_haxeLib = haxeLib;
		
		_initialize();
	}
	
	@Override
	protected void initialize() {
		//prevent direct initializing, haxeLib has not been set yet
	}
	
	private void _initialize() {
		
		//set some stuff up before initializing
		SafeRunnable.run(new SafeRunnable() {
			@Override
			public void run() throws Exception {
				_installedLibraries = _haxeLib.list();
			}
		});
		
		_filter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				
				Library library = (Library) element;
				
				return _installedLibraries.contains(library);
			}
		};
		
		super.initialize();
	}

	@Override
	protected Text createFilterText(Composite listContainer) {
		
		//TODO remove
		final Shell shell = listContainer.getShell();
		
		Button b = new Button(listContainer, SWT.PUSH);
		b.setText("lib sel");
		b.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				LibrarySelector librarySelector = new LibrarySelector(shell);
				librarySelector.open();
			}
		});
		
		Text filterText = super.createFilterText(listContainer);
		
		_checkBox = new Button(listContainer, SWT.CHECK);
		_checkBox.setText("Show only installed libraries");
		_checkBox.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				_checkBoxClicked();
			}
		});
		
		return filterText;
	}	
	
	@Override
	protected ListViewer createList(Composite listContainer) {
		_listViewer = super.createList(listContainer);
		
		return _listViewer;
	}	
	
	protected LibraryDetails createLibraryDetails(Composite parent) {
		LibraryDetails libraryDetails = new LibraryDetailsManager(parent, SWT.NONE, _haxeLib);
		return libraryDetails;
	}

	private void _checkBoxClicked() {
		if (_checkBox.getSelection()) {
			_listViewer.addFilter(_filter);
		} else
		{
			_listViewer.removeFilter(_filter);
		}
	}
	
	protected HaxeLib getHaxeLib() {
		return _haxeLib;
	}
}
