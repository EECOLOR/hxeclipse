package hxeclipse.core.ui.widgets;

import hxeclipse.core.HXEclipse;

import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;
import org.eclipse.ui.dialogs.PreferencesUtil;

public class HaxePathMissing extends Composite {

	public HaxePathMissing(Composite parent, int style) {
		super(parent, style);
		
		initialize();
	}

	protected void initialize() {
		setLayout(new GridLayout());
		
		_createLink();
	}

	private void _createLink() {
		Link link = new Link(this, SWT.MULTI);
		link.setFont(this.getFont());
		link.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		link.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				PreferenceDialog preferenceDialog = PreferencesUtil.createPreferenceDialogOn(getShell(), HXEclipse.HAXE_PREFERENCE_PAGE, null, null);
				if (preferenceDialog != null) {
					preferenceDialog.open();
				}
			}
		});
		link.setText("For this object to function you need to have the Haxe path specified. " +
					 "You can change the Haxe path in the <a>Haxe Preference Page</a>. " +
					 "You need to close and reopen this object for the changes to be visible.");
	}
}
