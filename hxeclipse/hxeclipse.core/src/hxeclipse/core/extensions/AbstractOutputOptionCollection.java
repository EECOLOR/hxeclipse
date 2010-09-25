package hxeclipse.core.extensions;

import hxeclipse.core.IHaxeProject;
import hxeclipse.core.model.DefaultValues;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public abstract class AbstractOutputOptionCollection implements IHaxeOptionCollection {

	private IFile _outputFile;
	
	@Override
	abstract public String getName();

	@Override
	public List<String> getCommandLineArguments(IHaxeProject haxeProject) {
		List<String> commandLineArguments = new ArrayList<String>();
		
		if (_outputFile != null) {
			commandLineArguments.add(getOutputFileArgument());
			commandLineArguments.add(_outputFile.getProjectRelativePath().toOSString());
		}
		
		return commandLineArguments;
	}

	abstract protected String getOutputFileArgument();
	
	@Override
	public void setDefaultValues(IProject project) {
		IFolder outputFolder = project.getFolder(DefaultValues.OUTPUT_PATH);
		_outputFile = outputFolder.getFile("Main.n");
	}
	
	@Override
	abstract public IHaxeOptionCollection copy();

	@Override
	public void save(Preferences preferences) {
		if (_outputFile != null) {
			String outputFile = _outputFile.getFullPath().toString();
			preferences.put("outputFile", outputFile);
		}
	}

	@Override
	public void load(Preferences preferences) throws BackingStoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		
		String outputFile = preferences.get("outputFile", null);
		if (outputFile != null) {
			_outputFile = root.getFile(new Path(outputFile));
		}
	}

	@Override
	public void initializeProject(IHaxeProject haxeProject) throws CoreException {
		//not implemented
	}
	
	public void setOutputFile(IFile outputFile) {
		_outputFile = outputFile;
	}

	public IFile getOutputFile() {
		return _outputFile;
	}	
}
