package hxeclipse.core;

import hxeclipse.core.internal.DefaultTargetDescription;
import hxeclipse.core.internal.HaxePreferences;
import hxeclipse.core.model.TargetDescription;
import hxeclipse.core.ui.ISharedImages;
import hxeclipse.core.ui.SharedImages;

import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class HXEclipse extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "hxeclipse.core"; //$NON-NLS-1$

	public static final String NATURE_ID = PLUGIN_ID + ".haxeNature";
	
	public static final String BUILDER_ID = PLUGIN_ID + ".haxeBuilder";
	
	public static final String HAXE_FILE_TYPE = PLUGIN_ID + ".haxe";
	
	// The shared instance
	private static HXEclipse plugin;

	private static IHaxePreferences _haxePreferences;
	private static SharedImages _sharedImages;
	
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
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static HXEclipse getDefault() {
		return plugin;
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
			_haxePreferences = new HaxePreferences();
		}
		
		return _haxePreferences;
	}
	
	static public ISharedImages getSharedImages() {
		if (_sharedImages == null) {
			_sharedImages = new SharedImages();
		}
		
		return _sharedImages;
	}	
	
	static public HaxeProject createProject(String name, URI location) throws CoreException {
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		
		if (!project.exists()) {
			final IProjectDescription projectDescription = project.getWorkspace().newProjectDescription(project.getName());
			projectDescription.setLocationURI(location);
			
			project.create(projectDescription, null);
			
			if (!project.isOpen()) {
				project.open(null);
			}
			
			_createFolders(project);
		}
		
		HaxeProject haxeProject = new HaxeProject(project);
		
		return haxeProject;
	}
	
	private static void _createFolders(IProject project) throws CoreException {
		DefaultTargetDescription defaultTargetDescription = DefaultTargetDescription.newInstance(project);
		
		//create source folders
		Iterator<IFolder> sourcePaths = defaultTargetDescription.getSourcePaths().iterator();
		while (sourcePaths.hasNext()) {
			IFolder sourcePath = sourcePaths.next();
			if (!sourcePath.exists()) {
				sourcePath.create(false, true, null);
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
	
	static public List<HaxeTarget<? extends TargetDescription>> getTargets() {
		//TODO get targets from extensions
		return null;
	}
}
