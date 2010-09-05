package hxeclipse.core.preferences;

import hxeclipse.core.HXEclipse;

import java.io.File;
import java.io.FilenameFilter;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class HaxePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public static final String HAXE_PATH = "hxeclipse.preferences.haxePath";
		
	private DirectoryFieldEditor _haxePath;
	
	
	public HaxePreferencePage() {
		super(GRID);
		setPreferenceStore(HXEclipse.getDefault().getPreferenceStore());
		setDescription("Compiler related preferences");
	}
	
	public void createFieldEditors() {
		_haxePath = new DirectoryFieldEditor(HAXE_PATH, "&Haxe path:", getFieldEditorParent());
		_haxePath.setEmptyStringAllowed(false);
		addField(_haxePath);
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);
		
		if (event.getSource().equals(_haxePath)) {
			checkState();
		}
	}

	@Override
	protected void checkState() {
		super.checkState();
		
		String haxePathString = _haxePath.getStringValue();
		File haxePath = new File(haxePathString);
		
		boolean valid = haxePath.exists() && haxePath.isDirectory();
		
		if (!valid) {
			setErrorMessage("Haxe path is not a directory");
		} else {
			String[] haxeFiles = haxePath.list(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					String lowerCaseName = name.toLowerCase();
					String[] split = lowerCaseName.split("\\.");
					String testName = split[0];
					return testName.equals("haxe") || testName.equals("haxelib");
				}
			});
			
			valid = haxeFiles.length > 1;
			
			if (!valid) {
				setErrorMessage("Could not find 'haxe' or 'haxelib' in the given directory");
			}
		}
		
		setValid(valid);
	}

	@Override
	public void init(IWorkbench workbench) {
		//not implemented
	}
}
