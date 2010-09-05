package hxeclipse.core.project;

import hxeclipse.core.HXEclipse;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class HaxeProjectNature implements IProjectNature {

	private IProject _project;
	
	@Override
	public void configure() throws CoreException {
		_addBuilder();
	}

	@Override
	public void deconfigure() throws CoreException {
		_removeBuilder();
	}

	private void _addBuilder() throws CoreException {
		IProjectDescription projectDescription = _project.getDescription();
		
		ICommand[] commands = projectDescription.getBuildSpec();
		
		int builderIndex = _getBuilderIndex(commands);
		
		if (builderIndex == -1) {
			
			ICommand builderCommand = projectDescription.newCommand();
			builderCommand.setBuilderName(HXEclipse.BUILDER_ID);
			
			//add the builder as the first builder
			ICommand[] newCommands = new ICommand[commands.length + 1];
			System.arraycopy(commands, 0, newCommands, 1, commands.length);
			newCommands[0] = builderCommand;
			
			projectDescription.setBuildSpec(newCommands);
			_project.setDescription(projectDescription, null);
		}
	}
	
	private void _removeBuilder() throws CoreException {
		IProjectDescription projectDescription = _project.getDescription();
		
		ICommand[] commands = projectDescription.getBuildSpec();
		
		int builderIndex = _getBuilderIndex(commands);
		
		if (builderIndex > -1) {
			
			ICommand[] newCommands = new ICommand[commands.length - 1];
			System.arraycopy(commands, 0, newCommands, 0, builderIndex);
			System.arraycopy(commands, builderIndex + 1, newCommands, builderIndex, commands.length - builderIndex - 1);
			
			projectDescription.setBuildSpec(newCommands);
			_project.setDescription(projectDescription, null);
		}
	}	
	
	private int _getBuilderIndex(ICommand[] commands) {
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(HXEclipse.BUILDER_ID)) {
				return i;
			}
		}
		return -1;
	}	

	@Override
	public IProject getProject() {
		return _project;
	}

	@Override
	public void setProject(IProject project) {
		_project = project;
	}

}
