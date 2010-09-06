package hxeclipse.core.internal;

import hxeclipse.core.extensions.ILibrary;
import hxeclipse.core.extensions.ILibrarySelector;
import hxeclipse.core.model.Library;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Shell;

public class DefaultLibrarySelector extends InputDialog implements ILibrarySelector {

	private Library _library;

	public DefaultLibrarySelector(Shell parentShell) {
		super(parentShell, 
			"Enter Library Name", 
			"Enter the name of the library that you want to add", 
			"<libraryName:version>", 
			new IInputValidator() {
				@Override
				public String isValid(String newText) {
					if (newText.endsWith(":")) {
						return "A library can not end with a colon";
					}
					
					if (newText.length() < 1) {
						return "A library name is mandatory";
					}
					
					if (newText.equals("<libraryName:version>")) {
						return "Please fill in a library name";
					}
					return null;
				}
		});
	}

	@Override
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) {
			String text = getText().getText();
			String[] nameParts = text.split(":");
			String name = nameParts[0];
			_library = new Library(name);
			
			if (nameParts.length > 1) {
				_library.setVersion(nameParts[1]);
			}
		}
		
		super.buttonPressed(buttonId);
	}

	@Override
	public ILibrary getSelectedLibrary() {
		return _library;
	}
}
