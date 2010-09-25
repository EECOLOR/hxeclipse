package hxeclipse.core.preferences;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.internal.HaxePreferenceConstants;

import java.io.File;
import java.io.FilenameFilter;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

//TODO add conventions page to support protected with code hinting (private var x shows up in subclass where private var _x does not)
public class HaxePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private DirectoryFieldEditor _haxePath;
	private DirectoryFieldEditor _nekoPath;
	
	public HaxePreferencePage() {
		super(GRID);
		setPreferenceStore(HXEclipse.getInternalPreferenceStore());
		setDescription("Compiler related preferences");
	}
	
	public void createFieldEditors() {
		_haxePath = new DirectoryFieldEditor(HaxePreferenceConstants.HAXE_PATH, "&Haxe path:", getFieldEditorParent());
		_haxePath.setEmptyStringAllowed(false);
		addField(_haxePath);
		
		_nekoPath = new DirectoryFieldEditor(HaxePreferenceConstants.NEKO_PATH, "&Neko path:", getFieldEditorParent());
		_nekoPath.setEmptyStringAllowed(false);
		addField(_nekoPath);
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);
		
		if (event.getSource().equals(_haxePath)) {
			checkState();
		} else if (event.getSource().equals(_nekoPath)) {
			checkState();
		}
	}

	@Override
	protected void checkState() {
		super.checkState();
		
		boolean valid = _checkHaxePath();
		valid = valid && _checkNekoPath();
		
		setValid(valid);
	}
	
	public boolean _checkHaxePath() {
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
				setErrorMessage("Could not find 'haxe' or 'haxelib' in the given Haxe directory");
			}
		}
		
		return valid;
	}

	public boolean _checkNekoPath() {
		String nekoPathString = _nekoPath.getStringValue();
		File nekoPath = new File(nekoPathString);
		
		boolean valid = nekoPath.exists() && nekoPath.isDirectory();
		
		if (!valid) {
			setErrorMessage("Neko path is not a directory");
		} else {
			String[] nekoFiles = nekoPath.list(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					String lowerCaseName = name.toLowerCase();
					String[] split = lowerCaseName.split("\\.");
					String testName = split[0];
					return testName.equals("neko") || testName.equals("nekoc");
				}
			});
			
			valid = nekoFiles.length > 1;
			
			if (!valid) {
				setErrorMessage("Could not find 'neko' or 'nekoc' in the given Neko directory");
			}
		}
		
		return valid;
	}

	@Override
	public void init(IWorkbench workbench) {
		//not implemented
	}
}
