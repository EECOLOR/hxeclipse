package hxeclipse.haxelib.ui.dialogs;

import hxeclipse.core.ui.dialogs.HaxeDialog;
import hxeclipse.haxelib.HaxeLib;
import hxeclipse.haxelib.model.Library;
import hxeclipse.haxelib.ui.widgets.LibraryListDetails;

import java.io.FileNotFoundException;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;

public class HaxeLibrarySelector extends HaxeDialog {

	private LibraryListDetails _libraryListDetails;
	private HaxeLib _haxeLib;
	private Button _okButton;
	
	public HaxeLibrarySelector(Shell parentShell) {
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
		_libraryListDetails.setFocus();
		
		_okButton = getButton(IDialogConstants.OK_ID);
		_okButton.setEnabled(false);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		
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
		
		if (_haxeLib == null) {
			try {
				_haxeLib = HaxeLib.getInstance();
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			}		
		}
		
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
		
		return composite;
	}
	
	public ISelection getSelection() {
		return _libraryListDetails.getSelection();
	}
}
