package hxeclipse.core.ui.widgets.target.compiler.options;

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

public class ConditionalCompilationFlagDialog extends HaxeDialog {

	private Button _okButton;
	private Text _conditionalCompilationFlagText;
	private String _conditionalCompilationFlag;

	public ConditionalCompilationFlagDialog(Shell parent) {
		super(parent);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		
		shell.setText("Add new conditional compilation flag");
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
		
		new Label(grid, SWT.NONE).setText("Conditional compilation flag:");
		
		_conditionalCompilationFlagText = new Text(grid, SWT.BORDER);
		_conditionalCompilationFlagText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		_conditionalCompilationFlagText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				_conditionalCompilationFlag = _conditionalCompilationFlagText.getText();
				_updateOkButtonState();
			}
		});
		
		return composite;
	}

	private void _updateOkButtonState() {
		boolean enabled = _conditionalCompilationFlag != null && _conditionalCompilationFlag.length() > 0;
		
		_okButton.setEnabled(enabled);
	}

	public String getConditionalCompilerFlag() {
		return _conditionalCompilationFlag;
	}

	public void setConditionalCompilerFlag(String conditionalCompilationFlag) {
		_conditionalCompilationFlag = conditionalCompilationFlag;
		_conditionalCompilationFlagText.setText(_conditionalCompilationFlag);
	}
}
