package hxeclipse.haxelib.ui.dialogs;

import hxeclipse.core.exceptions.HaxePathNotFoundException;
import hxeclipse.core.exceptions.NekoPathNotFoundException;
import hxeclipse.core.extensions.IHaxeLibrary;
import hxeclipse.core.extensions.IHaxeLibrarySelector;
import hxeclipse.core.ui.dialogs.HaxeDialog;
import hxeclipse.core.ui.widgets.HaxePathMissing;
import hxeclipse.haxelib.HaxeLib;
import hxeclipse.haxelib.exceptions.HaxeLibNotFoundException;
import hxeclipse.haxelib.model.Library;
import hxeclipse.haxelib.model.LibraryRelease;
import hxeclipse.haxelib.ui.widgets.LibraryListDetails;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;

public class HaxeLibrarySelector extends HaxeDialog implements IHaxeLibrarySelector {

	private LibraryListDetails _libraryListDetails;
	private HaxeLib _haxeLib;
	private Button _okButton;
	
	public HaxeLibrarySelector(Shell parentShell) {
		super(parentShell);
	}

	public HaxeLibrarySelector(IShellProvider parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		
		shell.setText("Select Haxe Library");
	}

	@Override
	public void create() {
		super.create();
		if (_libraryListDetails != null) {
			_libraryListDetails.setFocus();
		}
		
		_okButton = getButton(IDialogConstants.OK_ID);
		_okButton.setEnabled(false);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		
		//create library manager
		boolean haxeLibAvilable = true;
		if (_haxeLib == null) {
			try {
				_haxeLib = HaxeLib.getInstance();
			} catch (HaxePathNotFoundException e) {
				haxeLibAvilable = false;
			} catch (HaxeLibNotFoundException e) {
				haxeLibAvilable = false;
			} catch (NekoPathNotFoundException e) {
				haxeLibAvilable = false;
			}
		}
		
		if (haxeLibAvilable) {		
			_libraryListDetails = new LibraryListDetails(composite, SWT.NONE);
			_libraryListDetails.addSelectionChangedListener(new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					IStructuredSelection selection = (IStructuredSelection) event.getSelection();
					
					boolean isEmpty = selection.isEmpty();
					
					_okButton.setEnabled(!isEmpty);
					
					if (!isEmpty) {
						final Library haxeLibrary = (Library) selection.getFirstElement();
						
						SafeRunnable.run(new SafeRunnable() {
							@Override
							public void run() throws Exception {
								//gather information
								_haxeLib.info(haxeLibrary.getName());
							}
						});
					}
				}
			});
			
			SafeRunnable.run(new SafeRunnable() {
				@Override
				public void run() throws Exception {
					_libraryListDetails.setInput(_haxeLib.list());
				}
			});	
			
			Link link = new Link(composite, SWT.SINGLE);
			link.setFont(composite.getFont());
			link.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
			link.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent event) {
					HaxeLibraryManagerDialog haxeLibraryManagerDialog = new HaxeLibraryManagerDialog(getShell());
					haxeLibraryManagerDialog.open();
					_libraryListDetails.refresh();
				}
			});
			link.setText("You can manage libraries using the <a>Haxe Library Manager</a>");
			
		} else
		{
			new HaxePathMissing(composite, SWT.NONE);
		}
		return composite;
	}

	public ISelection getSelections() {
		return _libraryListDetails.getSelection();
	}

	@Override
	public IHaxeLibrary getSelectedLibrary() {
		IStructuredSelection selection = (IStructuredSelection) _libraryListDetails.getSelection();
		hxeclipse.haxelib.model.Library selectedLibrary = (hxeclipse.haxelib.model.Library) selection.getFirstElement();
		
		LibraryRelease selectedInstalledRelease = _libraryListDetails.getSelectedInstalledRelease();
		
		hxeclipse.core.model.Library library = new hxeclipse.core.model.Library(selectedLibrary.getName());
		
		if (selectedInstalledRelease != null) {
			library.setVersion(selectedInstalledRelease.getVersion());
		}
		
		return library;
	}
}
