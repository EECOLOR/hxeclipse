package hxeclipse.core.ui.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class LabelText {
	private Text _text;

	public LabelText(Composite parent, String labelText) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(labelText);
		
		_text = new Text(parent, SWT.SINGLE | SWT.BORDER);
		_text.setFont(parent.getFont());
		_text.setEditable(false);
		_text.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
	}
	
	public void setText(String text) {
		_text.setText(text);
	}
	
	public String getText(String text) {
		return _text.getText();
	}
}
