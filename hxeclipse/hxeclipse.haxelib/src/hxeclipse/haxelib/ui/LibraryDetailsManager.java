package hxeclipse.haxelib.ui;

import hxeclipse.haxelib.HaxeLib;
import hxeclipse.haxelib.model.LibraryRelease;

import java.util.Iterator;

import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

//TODO run the haxe lib with a progress bar
public class LibraryDetailsManager extends LibraryDetails {

	private HaxeLib _haxeLib;
	private Button _removeButton;
	private Button _currentButton;
	private Button _installButton;
	private ListViewer _versionList;
	private TableViewer _releaseTable;
	
	public LibraryDetailsManager(Composite parent, int style, HaxeLib haxeLib) {
		super(parent, style);
		
		_haxeLib = haxeLib;
	}
	
	@Override
	protected Composite createDetailsLeftPart(Composite details) {
		Composite leftPart = super.createDetailsLeftPart(details);
		
		createVersionButtons(leftPart);
		
		return leftPart;
	}

	@Override
	protected ListViewer createVersionList(Composite parent) {
		_versionList = super.createVersionList(parent);
		
		_versionList.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				_versionListSelectionChanged();
			}
		});
		
		return _versionList;
	}
	
	protected Composite createVersionButtons(Composite leftPart) {
		Composite buttonBar = new Composite(leftPart, SWT.NONE);
		buttonBar.setLayout(new FillLayout(SWT.HORIZONTAL));
		buttonBar.setLayoutData(new GridData(SWT.RIGHT, SWT.NONE, true, false, 2, 1));
		
		_currentButton = new Button(buttonBar, SWT.PUSH);
		_currentButton.setText("Set as current");
		_currentButton.setEnabled(false);
		_currentButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_currentButtonClicked();
			}
		});
		
		_removeButton = new Button(buttonBar, SWT.PUSH);
		_removeButton.setText("Remove");
		_removeButton.setEnabled(false);
		_removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_removeButtonClicked();
			}
		});		
		
		return buttonBar;
	}

	@Override
	protected Composite createReleasePart() {
		Composite releasePart = super.createReleasePart();
		
		createInstallButtons();
		
		return releasePart;
	}
	
	@Override
	protected TableViewer createReleaseTable(Composite parent, TableColumnLayout tableLayout) {
		_releaseTable = super.createReleaseTable(parent, tableLayout);
		
		_releaseTable.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				_releaseTableSelectionChanged();
			}
		});
		
		return _releaseTable;
	}
	
	protected Composite createInstallButtons() {
		Composite buttonBar = new Composite(this, SWT.NONE);
		buttonBar.setLayout(new FillLayout(SWT.HORIZONTAL));
		buttonBar.setLayoutData(new GridData(SWT.RIGHT, SWT.NONE, true, false, 2, 1));
		
		_installButton = new Button(buttonBar, SWT.PUSH);
		_installButton.setText("Install");
		_installButton.setEnabled(false);
		_installButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_installButtonClicked();
			}
		});
		
		return buttonBar;
	}	
	
	private void _versionListSelectionChanged() {
		IStructuredSelection selection = (IStructuredSelection) _versionList.getSelection();
		boolean enabled = !selection.isEmpty();
		
		LibraryRelease release = null;
		
		if (enabled) {
			release = (LibraryRelease) selection.getFirstElement();
		}
		
		_removeButton.setEnabled(enabled && (!release.isCurrent() || _versionList.getList().getItemCount() == 1));
		_currentButton.setEnabled(enabled && selection.size() == 1 && !release.isCurrent());
	}
	
	private void _releaseTableSelectionChanged() {
		IStructuredSelection selection = (IStructuredSelection) _releaseTable.getSelection();
		boolean enabled = !selection.isEmpty();
		
		_installButton.setEnabled(enabled && selection.size() == 1 && !((LibraryRelease) selection.getFirstElement()).isInstalled());
	}
	
	private void _removeButtonClicked() {
		_removeButton.setEnabled(false);
		
		IStructuredSelection selection = (IStructuredSelection) _versionList.getSelection();
		
		@SuppressWarnings("unchecked")
		Iterator<LibraryRelease> releases = (Iterator<LibraryRelease>) selection.iterator();
		
		while (releases.hasNext()) {
			final LibraryRelease release = releases.next();
			
			SafeRunnable.run(new SafeRunnable() {
				
				@Override
				public void run() throws Exception {
					String name = release.getLibrary().getName();
					if (_versionList.getList().getItemCount() == 1)
					{
						//we only have one item left, remove the whole library
						_haxeLib.remove(name);
					} else
					{
						_haxeLib.remove(name, release.getVersion());
					}
				}
			});
		}
		
		_versionList.refresh();
	}
	
	private void _currentButtonClicked() {
		_currentButton.setEnabled(false);

		//disable the remove button, we can not remove the current version
		_removeButton.setEnabled(false);
		
		IStructuredSelection selection = (IStructuredSelection) _versionList.getSelection();
		final LibraryRelease release = (LibraryRelease) selection.getFirstElement();
		
		SafeRunnable.run(new SafeRunnable() {
			@Override
			public void run() throws Exception {
				_haxeLib.set(release.getLibrary().getName(), release.getVersion());
			}
		});
		
		_versionList.refresh();
	}
	
	private void _installButtonClicked() {
		_installButton.setEnabled(false);
		
		IStructuredSelection selection = (IStructuredSelection) _releaseTable.getSelection();
		final LibraryRelease release = (LibraryRelease) selection.getFirstElement();
		
		SafeRunnable.run(new SafeRunnable() {
			@Override
			public void run() throws Exception {
				_haxeLib.install(release.getLibrary().getName(), release.getVersion());
			}
		});	
		
		_versionList.refresh();
	}
	
}
