package hxeclipse.core;

import hxeclipse.core.extensions.ITargetDescription;
import hxeclipse.core.internal.HaxePreferences;
import hxeclipse.core.internal.HaxeProject;
import hxeclipse.core.internal.LibrarySelectorManager;
import hxeclipse.core.internal.SharedImages;
import hxeclipse.core.internal.TargetManager;
import hxeclipse.core.model.AbstractTargetDescription;
import hxeclipse.core.model.GeneralOptionCollection;
import hxeclipse.core.model.HaxeProjectDescription;
import hxeclipse.core.ui.ISharedImages;

import java.net.URI;
import java.net.URL;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

//TODO check all buttons in the ui that open a new window. Their label should have ..., for example: Add...
/**
 * The activator class controls the plug-in life cycle
 */
public class HXEclipse extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hxeclipse.core"; //$NON-NLS-1$

	public static final String NATURE_ID = PLUGIN_ID + ".haxeNature";
	
	public static final String BUILDER_ID = PLUGIN_ID + ".haxeBuilder";
	
	public static final String HAXE_FILE_TYPE = PLUGIN_ID + ".haxe";
	
	public static final String TARGETS_EXTENSION = PLUGIN_ID + ".targets";
	
	public static final String LIBRARY_SELECTORS_EXTENSION = PLUGIN_ID + ".librarySelectors";
	
	static public final QualifiedName HAXE_PROJECT_PROPERTY = new QualifiedName(HXEclipse.PLUGIN_ID, "haxeProject");
	
	public static final String HAXE_PROJECT_FILE = ".haxeProject";
	
	// The shared instance
	private static HXEclipse _plugin;

	private static IHaxePreferences _haxePreferences;
	private static SharedImages _sharedImages;
	private static LibrarySelectorManager _librarySelectorManager;
	private static TargetManager _targetManager;
	
	/**
	 * The constructor
	 */
	public HXEclipse() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		_plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		_plugin = null;
		super.stop(context);
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry imageRegistry) {
		super.initializeImageRegistry(imageRegistry);
		
		Bundle bundle = getBundle();
        IPath path = new Path("icons/haxe.ico");
        URL url = FileLocator.find(bundle, path, null);
        imageRegistry.put(ISharedImages.IMG_ICON_HAXE, ImageDescriptor.createFromURL(url));
	}
	
	static public IHaxePreferences getHaxePreferences() {
		if (_haxePreferences == null) {
			_haxePreferences = new HaxePreferences(getInternalPreferenceStore());
		}
		
		return _haxePreferences;
	}
	
	static public IPreferenceStore getInternalPreferenceStore() {
		return _plugin.getPreferenceStore();
	}
	
	static public ImageRegistry getInternalImageRegistry() {
		return _plugin.getImageRegistry();
	}
	
	static public ISharedImages getSharedImages() {
		if (_sharedImages == null) {
			_sharedImages = new SharedImages();
		}
		
		return _sharedImages;
	}	
	
	static public IHaxeProject createProject(String name, URI location, HaxeProjectDescription haxeProjectDescription) throws CoreException {
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		
		if (!project.exists()) {
			final IProjectDescription projectDescription = project.getWorkspace().newProjectDescription(project.getName());
			projectDescription.setLocationURI(location);
			
			project.create(projectDescription, null);
			
			if (!project.isOpen()) {
				project.open(null);
			}
		}
		
		IHaxeProject haxeProject = (IHaxeProject) project.getAdapter(IHaxeProject.class);
		
		if (haxeProject == null) {
			haxeProject = getHaxeProject(project, haxeProjectDescription);
		}

		_createFolders(haxeProject);
		
		return haxeProject;
	}
	
	static public IHaxeProject getHaxeProject(IProject project, HaxeProjectDescription haxeProjectDescription) throws CoreException {
		
		IHaxeProject haxeProject = (IHaxeProject) project.getSessionProperty(HAXE_PROJECT_PROPERTY);
		
		//check the session scope
		if (haxeProject == null) {
			IFile haxeProjectFile = project.getFile(HAXE_PROJECT_FILE);
			if (haxeProjectFile.exists()) {
				//load the haxe project from disk
				haxeProject = new HaxeProject(project, haxeProjectFile);
			} else
			{
				if (haxeProjectDescription == null) {
					throw new RuntimeException("This should not happen, can not request a haxe project if no haxeProjectDescription is available in the session or in a file");
				}
				
				//create a new haxe project
				haxeProject = new HaxeProject(project, haxeProjectDescription);
				//save it to disk
				haxeProject.save();
				//add it as session property
				project.setSessionProperty(HAXE_PROJECT_PROPERTY, haxeProject);
			}
		}

		return haxeProject;
	}
	
	//TODO refactor this to the IOptionCollections themselves through the ITargetDescription (prepareProject(project) or something)
	private static void _createFolders(IHaxeProject haxeProject) throws CoreException {
		
		Iterator<ITargetDescription> targets = haxeProject.getProjectDescription().getTargets().iterator();
		
		while (targets.hasNext()) {
			ITargetDescription targetDescription = targets.next();
			
			if (targetDescription instanceof AbstractTargetDescription) {
				AbstractTargetDescription abstractTargetDescription = (AbstractTargetDescription) targetDescription;
				abstractTargetDescription.setDefaultValues(haxeProject.getProject());
				
				GeneralOptionCollection generalOptionCollection = abstractTargetDescription.getGeneralOptionCollection();
					
				//create source folders
				Iterator<IFolder> sourcePaths = generalOptionCollection.getSourceFolders().iterator();
				while (sourcePaths.hasNext()) {
					IFolder sourcePath = sourcePaths.next();
					if (!sourcePath.exists()) {
						sourcePath.create(false, true, null);
					}
				}
				
				//create output folder
				IFolder outputPath = generalOptionCollection.getOutputPath();
				if (!outputPath.exists()) {
					outputPath.create(false, true, null);
				}
			}
		}
	}

	static public void addHaxeNature(IProject project) throws CoreException {
		if (!project.hasNature(NATURE_ID)) {
			IProjectDescription projectDescription = project.getDescription();
			String[] natures = projectDescription.getNatureIds();
			
			int natureCount = natures.length;
			String[] newNatures = new String[natureCount + 1];
			System.arraycopy(natures, 0, newNatures, 0, natureCount);
			
			newNatures[natureCount] = NATURE_ID;
			
			projectDescription.setNatureIds(newNatures);
			project.setDescription(projectDescription, null);
		}
	}

	public static LibrarySelectorManager getLibrarySelectorManager() {
		if (_librarySelectorManager == null) {
			try {
				_librarySelectorManager = new LibrarySelectorManager();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		return _librarySelectorManager;
	}

	public static TargetManager getTargetManager() {
		if (_targetManager == null) {
			try {
				_targetManager = new TargetManager();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		return _targetManager;
	}
}
