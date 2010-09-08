package hxeclipse.core;

import hxeclipse.core.internal.HaxeLibrarySelectorManager;
import hxeclipse.core.internal.HaxePreferences;
import hxeclipse.core.internal.HaxeProjectManager;
import hxeclipse.core.internal.HaxeTargetManager;
import hxeclipse.core.internal.SharedImages;
import hxeclipse.core.ui.ISharedImages;

import java.net.URL;

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
	
	public static final String HAXE_PREFERENCE_PAGE = "hxeclipse.core.preferences.Haxe";
	
	public static final String FLAG_IS_HAXE_PROJECT = "isHaxeProject";
	
	// The shared instance
	private static HXEclipse _plugin;

	private static IHaxePreferences _haxePreferences;
	private static SharedImages _sharedImages;
	private static HaxeLibrarySelectorManager _librarySelectorManager;
	private static HaxeTargetManager _targetManager;
	private static HaxeProjectManager _projectManager;
	
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
	
	public static HaxeLibrarySelectorManager getLibrarySelectorManager() {
		if (_librarySelectorManager == null) {
			try {
				_librarySelectorManager = new HaxeLibrarySelectorManager();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		return _librarySelectorManager;
	}

	public static HaxeTargetManager getTargetManager() {
		if (_targetManager == null) {
			try {
				_targetManager = new HaxeTargetManager();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		return _targetManager;
	}
	
	public static HaxeProjectManager getProjectManager() {
		if (_projectManager == null) {
			_projectManager = new HaxeProjectManager();
		}
		
		return _projectManager;
	}
}
