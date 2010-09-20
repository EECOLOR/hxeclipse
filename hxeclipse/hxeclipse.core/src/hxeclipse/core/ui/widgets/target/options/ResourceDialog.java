package hxeclipse.core.ui.widgets.target.options;

import hxeclipse.core.ui.dialogs.HaxeDialog;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.model.WorkbenchViewerComparator;

public class ResourceDialog extends HaxeDialog {

	private Button _okButton;
	private Text _nameText;
	private Text _fileText;
	private Button _browseButton;
	private ElementTreeSelectionDialog _fileSelector;
	private IFile _file;
	private String _name;

	public ResourceDialog(Shell parentShell) {
		super(parentShell);
		
		initialize();
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		
		shell.setText("Add a new Haxe Resource");
	}



	protected void initialize() {
		_createFileSelector();
	}

	private void _createFileSelector() {
		//TODO add create file button
		_fileSelector = new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		_fileSelector.setAllowMultiple(false);
		_fileSelector.setTitle("Select resource");
		_fileSelector.setDoubleClickSelects(true);
		_fileSelector.setAllowMultiple(false);
		//sort by name
		_fileSelector.setComparator(new WorkbenchViewerComparator());
		//make sure only a file can be selected
		_fileSelector.setValidator(new ISelectionStatusValidator() {
			@Override
			public IStatus validate(Object[] selection) {
				IFile resource = null;
				
				if (selection.length > 0 && selection[0] instanceof IAdaptable) {
					IAdaptable adaptable = (IAdaptable) selection[0];
					resource = (IFile) adaptable.getAdapter(IFile.class);
				}
				
				if (resource == null)
				{
					return new Status(IStatus.ERROR, "unknown", "Should select a valid file");
				} else
				{
					return new Status(IStatus.OK, "unknown", "");
				}
			}
		});
	}
	
	@Override
	public void create() {
		super.create();
		
		_okButton = getButton(IDialogConstants.OK_ID);
		_okButton.setEnabled(false);		
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite =  (Composite) super.createDialogArea(parent);
		
		Composite grid = new Composite(composite, SWT.NONE);
		grid.setLayout(new GridLayout(2, false));
		
		new Label(grid, SWT.NONE).setText("Name:");
		
		_nameText = new Text(grid, SWT.BORDER);
		_nameText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false, 2, 1));
		
		new Label(grid, SWT.NONE).setText("File:");
		
		_fileText = new Text(grid, SWT.BORDER);
		_fileText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		_fileText.setEditable(false);
		_fileText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				String name = null;
				
				String text = _nameText.getText();
				
				if (text != null && text.length() > 0) {
					name = text;
				}
				
				_name = name;
			}
		});
		
		_browseButton = new Button(grid, SWT.PUSH);
		_browseButton.setText("Browse...");
		_browseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_browseButtonClicked();
			}
		});
		
		return composite;
	}

	private void _browseButtonClicked() {
		if (_fileSelector.open() == IDialogConstants.OK_ID) {
			Object[] result = _fileSelector.getResult();
			boolean hasResult = result.length == 1;
			
			if (hasResult) {
				_file = (IFile) result[0];
				_fileText.setText(_file.getProjectRelativePath().toString());
			}
			
			_okButton.setEnabled(hasResult);
		}
	}
	
	public IFile getFile() {
		return _file;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setProject(IProject project) {
		_fileSelector.setInput(project);
	}
}
