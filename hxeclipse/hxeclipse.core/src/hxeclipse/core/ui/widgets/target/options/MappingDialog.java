package hxeclipse.core.ui.widgets.target.options;

import hxeclipse.core.ui.dialogs.HaxeDialog;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class MappingDialog extends HaxeDialog {

	private Text _sourcePackageText;
	private String _sourcePackage;
	private Text _destinationPackageText;
	private String _destinationPackage;
	private Button _okButton;

	public MappingDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		
		shell.setText("Create new Haxe mapping");
	}

	@Override
	public void create() {
		super.create();
		
		_okButton = getButton(IDialogConstants.OK_ID);
		_updateOkButtonState();		
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		
		Composite grid = new Composite(composite, SWT.NONE);
		grid.setLayout(new GridLayout(2, false));
		
		new Label(grid, SWT.NONE).setText("Source package:");
		
		_sourcePackageText = new Text(grid, SWT.BORDER);
		_sourcePackageText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		_sourcePackageText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				_sourcePackage = _sourcePackageText.getText();
				_updateOkButtonState();
			}
		});
		
		new Label(grid, SWT.NONE).setText("Destination package:");
		
		_destinationPackageText = new Text(grid, SWT.BORDER);
		_destinationPackageText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		_destinationPackageText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				_destinationPackage = _destinationPackageText.getText();
				_updateOkButtonState();
			}
		});
		
		return composite;
	}

	private void _updateOkButtonState() {
		boolean enabled = _sourcePackage != null && _sourcePackage.length() > 0 &&
						  _destinationPackage != null && _destinationPackage.length() > 0;
		
		_okButton.setEnabled(enabled);
	}

	public String getSourcePackage() {
		return _sourcePackage;
	}

	public void setSourcePackage(String sourcePackage) {
		_sourcePackage = sourcePackage;
		_sourcePackageText.setText(_sourcePackage);
	}
	
	public String getDestinationPackage() {
		return _destinationPackage;
	}
	
	public void setDestinationPackage(String destinationPackage) {
		_destinationPackage = destinationPackage;
		_destinationPackageText.setText(_destinationPackage);
	}
}
