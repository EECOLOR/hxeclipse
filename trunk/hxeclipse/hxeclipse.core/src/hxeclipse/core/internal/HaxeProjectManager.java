package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxeProject;
import hxeclipse.core.extensions.IHaxeTargetDescription;
import hxeclipse.core.model.HaxeProjectDescription;

import java.net.URI;
import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.service.prefs.BackingStoreException;

public class HaxeProjectManager {
	
	/**
	 * Creates a new eclipse project using the given information
	 * 
	 * @param name		The name of the project
	 * @param location	The location of the project
	 * 
	 * @return	A project instance
	 * 
	 * @throws CoreException	Thrown when creating the project or opening the project failed 
	 */
	public IProject createProject(String name, URI location) throws CoreException {
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		
		if (!project.exists()) {
			final IProjectDescription projectDescription = project.getWorkspace().newProjectDescription(project.getName());
			projectDescription.setLocationURI(location);
			
			project.create(projectDescription, null);
			
			if (!project.isOpen()) {
				project.open(null);
			}
		}
		
		return project;
	}
	
	/**
	 * Creates and initializes a new Haxe project for the given project using the given project description
	 * 
	 * @param project					The project to create a Haxe project from
	 * @param haxeProjectDescription	The project description to use for the Haxe project
	 * 
	 * @return	An instance of a Haxe project
	 * 
	 * @throws CoreException	Thrown when creating the project failed
	 */
	public IHaxeProject createHaxeProject(IProject project, HaxeProjectDescription haxeProjectDescription) throws CoreException {
		IHaxeProject haxeProject = (IHaxeProject) project.getAdapter(IHaxeProject.class);
		
		if (haxeProject == null) {
			try {
				haxeProject = getHaxeProject(project, haxeProjectDescription);
			} catch (BackingStoreException e) {
				IStatus status = new Status(IStatus.ERROR, HXEclipse.PLUGIN_ID, "Could not create haxe project, problem with the preference store", e);
				StatusManager.getManager().handle(status);
			}
		}

		//initialize the project using the targets
		//TODO add initialize method to haxe project
		Iterator<IHaxeTargetDescription> targets = haxeProject.getProjectDescription().getTargetDescriptions().iterator();
		
		while (targets.hasNext()) {
			IHaxeTargetDescription targetDescription = targets.next();
			targetDescription.initializeProject(haxeProject);
		}
		
		return haxeProject;
	}
	
	/**
	 * Retrieves a Haxe project from the project. If the project is not a Haxe project, null 
	 * is returned.
	 * 
	 * This method calls getHaxeProject(project, null, false)
	 * 
	 * @param project	The project to get the Haxe project from
	 * 
	 * @return	A Haxe project instance or null if the given project is not a Haxe project
	 * 
	 * @throws CoreException	Thrown if retrieving the project failed
	 * 
	 * @see #getHaxeProject(IProject, HaxeProjectDescription, boolean)
	 */
	public IHaxeProject getHaxeProject(IProject project) throws CoreException {
		try {
			return getHaxeProject(project, null, false);
		} catch (BackingStoreException e) {
			return null;
		}
	}
	
	/**
	 * Retrieves a Haxe project, if the project does not exist it's created using the given 
	 * project description.
	 * 
	 * This method calls getHaxeProject(project, haxeProjectDescription, true)
	 * 
	 * @param project					The project to get the Haxe project from
	 * @param haxeProjectDescription	The project description to use to create the Haxe project with
	 * 
	 * @return	An instance of a Haxe project
	 *  
	 * @throws CoreException			Thrown if retrieving or creating the project failed
	 * @throws BackingStoreException	Thrown if the preference store failed
	 */
	public IHaxeProject getHaxeProject(IProject project, HaxeProjectDescription haxeProjectDescription) throws CoreException, BackingStoreException {
		return getHaxeProject(project, haxeProjectDescription, true);
	}
	
	/**
	 * Creates or retrieves a Haxe project. If the given project's session scope contains 
	 * a valid Haxe project, it's returned. If the project's scope contains Haxe project 
	 * preferences, that is used to create a Haxe project. In all other cases the given 
	 * project description is used to create a new Haxe project. This project will be saved 
	 * to the project's scope.
	 * 
	 * @param project					The project to retrieve or create the Haxe project for
	 * @param haxeProjectDescription	The description that will be used to create the Haxe project
	 * @param allowProjectCreation		Indicates if this method may create a new project. If set to true, it may return null.
	 * 
	 * @return	A new Haxe project or null if allowProjectCreation is false and the given project was no Haxe project
	 * 
	 * @throws CoreException			Thrown when accessing the project's session scope or creating a new Haxe project failed. 	
	 * @throws BackingStoreException	Thrown when the project's preferences threw an exception.
	 */
	public IHaxeProject getHaxeProject(IProject project, HaxeProjectDescription haxeProjectDescription, boolean allowProjectCreation) throws CoreException, BackingStoreException {
		
		IHaxeProject haxeProject = (IHaxeProject) project.getSessionProperty(HXEclipse.HAXE_PROJECT_PROPERTY);
		
		//check the session scope
		if (haxeProject == null) {
			
			IScopeContext projectScope = new ProjectScope(project);
			IEclipsePreferences projectPreferences = projectScope.getNode(HXEclipse.PLUGIN_ID);
			boolean isHaxeProject = projectPreferences.getBoolean(HXEclipse.FLAG_IS_HAXE_PROJECT, false);
			
			if (isHaxeProject) {
				//load the haxe project from disk
				try {
					haxeProject = new HaxeProject(project, projectPreferences);
				} catch (BackingStoreException e) {
					IStatus status = new Status(IStatus.ERROR, HXEclipse.PLUGIN_ID, "Could not load haxe project, problem with the preference store", e);
					StatusManager.getManager().handle(status);
					throw e;
				}
			} else
			{
				if (allowProjectCreation) {
					if (haxeProjectDescription == null) {
						throw new RuntimeException("This should not happen, can not request a haxe project if no haxeProjectDescription is available in the session or in a file");
					}
					
					//create a new haxe project
					haxeProject = new HaxeProject(project, haxeProjectDescription);
					//save it to disk
					haxeProject.save();
					projectPreferences.putBoolean(HXEclipse.FLAG_IS_HAXE_PROJECT, true);
					projectPreferences.flush();
				}
			}
			
			if (haxeProject != null) {
				//add it as session property
				project.setSessionProperty(HXEclipse.HAXE_PROJECT_PROPERTY, haxeProject);
			}
		}

		return haxeProject;
	}
	
	public IHaxeProject createTempHaxeProject(IProject project, HaxeProjectDescription projectDescription) throws CoreException {
		IHaxeProject haxeProject = new TempHaxeProject(project, projectDescription);
		//add it as session property
		project.setSessionProperty(HXEclipse.HAXE_PROJECT_PROPERTY, haxeProject);

		return haxeProject;
	}
	
	public void removeTempHaxeProject(IHaxeProject haxeProject) throws CoreException {
		haxeProject.getProject().setSessionProperty(HXEclipse.HAXE_PROJECT_PROPERTY, null);
	}
	
	/**
	 * Adds the Haxe nature to the given project
	 * 
	 * @param project			The project to give the Haxe nature
	 * @throws CoreException	Thrown when the project fails to expose it's nature or description
	 */
	public void addHaxeNature(IProject project) throws CoreException {
		if (!project.hasNature(HXEclipse.NATURE_ID)) {
			IProjectDescription projectDescription = project.getDescription();
			String[] natures = projectDescription.getNatureIds();
			
			int natureCount = natures.length;
			String[] newNatures = new String[natureCount + 1];
			System.arraycopy(natures, 0, newNatures, 0, natureCount);
			
			newNatures[natureCount] = HXEclipse.NATURE_ID;
			
			projectDescription.setNatureIds(newNatures);
			project.setDescription(projectDescription, null);
		}
	}

	public void createHaxeProject(IHaxeProject haxeProject) throws CoreException {
		if (haxeProject instanceof TempHaxeProject)
		{
			HaxeProjectDescription projectDescription = haxeProject.getProjectDescription();
			IProject project = haxeProject.getProject();
			
			removeTempHaxeProject(haxeProject);
			createHaxeProject(project, projectDescription);
		}
	}
}
