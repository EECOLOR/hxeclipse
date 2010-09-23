package hxeclipse.core.internal;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.model.HaxeProjectDescription;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class HaxeProject extends AbstractHaxeProject {
	
	public HaxeProject(IProject project, HaxeProjectDescription haxeProjectDescription) throws CoreException {
		super(project, haxeProjectDescription);
		
		initialize(project, haxeProjectDescription);
	}
	
	public HaxeProject(IProject project, Preferences projectPreferences) throws CoreException, BackingStoreException {
		HaxeProjectDescription haxeProjectDescription = new HaxeProjectDescription();
		haxeProjectDescription.load(projectPreferences.node("projectDescription"));
		initialize(project, haxeProjectDescription);
	}
	
	protected void initialize(IProject project, HaxeProjectDescription haxeProjectDescription) throws CoreException {
		super.initialize(project, haxeProjectDescription);
		
		HXEclipse.getProjectManager().addHaxeNature(project);
	}
	
	public void save() {
		IScopeContext projectScope = new ProjectScope(getProject());
		IEclipsePreferences projectPreferences = projectScope.getNode(HXEclipse.PLUGIN_ID);
		Preferences preferences = projectPreferences.node("projectDescription");
		getProjectDescription().save(preferences);
	}
}
