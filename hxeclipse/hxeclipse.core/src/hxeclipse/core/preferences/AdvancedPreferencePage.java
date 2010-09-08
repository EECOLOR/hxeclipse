package hxeclipse.core.preferences;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.extensions.IHaxeLibrarySelectorFactory;
import hxeclipse.core.internal.HaxeLibrarySelectorManager;
import hxeclipse.core.internal.HaxePreferenceConstants;

import java.util.List;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class AdvancedPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public AdvancedPreferencePage() {
		super(GRID);
		setPreferenceStore(HXEclipse.getInternalPreferenceStore());
		setDescription("Advanced preferences");
	}

	@Override
	protected void createFieldEditors() {
		_createLibrarySelectorChooser();
	}

	private void _createLibrarySelectorChooser() {
		HaxeLibrarySelectorManager librarySelectorManager = HXEclipse.getLibrarySelectorManager();
		List<IHaxeLibrarySelectorFactory> librarySelectorFactories = librarySelectorManager.getLibrarySelectorFactories();
		int size = librarySelectorFactories.size();
		
		if (size > 1)
		{
			//we only need the selector if we have more then one selector candidates
			String[][] entryNamesAndValues = new String[size][2];
			
			for (int i = 0; i < size; i++) {
				IHaxeLibrarySelectorFactory librarySelectorFactory = librarySelectorFactories.get(i);
				entryNamesAndValues[i][0] = librarySelectorFactory.getDisplayName();
				entryNamesAndValues[i][1] = librarySelectorManager.getLibrarySelectorId(librarySelectorFactory);
			}
			
			ComboFieldEditor comboEditor = new ComboFieldEditor(HaxePreferenceConstants.LIBRARY_SELECTOR, "Library Selector:", entryNamesAndValues, getFieldEditorParent());
			addField(comboEditor);
		}
	}

	@Override
	public void init(IWorkbench workbench) {
		//not implemented
	}

}
