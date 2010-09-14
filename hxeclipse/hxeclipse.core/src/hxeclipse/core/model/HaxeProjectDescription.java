package hxeclipse.core.model;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.extensions.IHaxeTargetDescription;
import hxeclipse.core.internal.HaxeTargetManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class HaxeProjectDescription {
	private List<IHaxeTargetDescription> _targetDescriptions;

	public void setTargets(List<IHaxeTargetDescription> targetDescriptions) {
		_targetDescriptions = targetDescriptions;
	}

	public List<IHaxeTargetDescription> getTargetDescriptions() {
		return _targetDescriptions;
	}

	public void save(Preferences preferences) {
		Iterator<IHaxeTargetDescription> targets = _targetDescriptions.iterator();
		
		while(targets.hasNext()) {
			IHaxeTargetDescription targetDescription = targets.next();
			System.out.println("saving " + targetDescription.getClass().getName());
			Preferences targetPreferences = preferences.node(targetDescription.getClass().getName());
			targetDescription.save(targetPreferences);
		}
	}

	public void load(Preferences preferences) throws BackingStoreException, CoreException {
		HaxeTargetManager targetManager = HXEclipse.getTargetManager();
		
		String[] childrenNames = preferences.childrenNames();
		_targetDescriptions = new ArrayList<IHaxeTargetDescription>(childrenNames.length);
		
		for (String childName : childrenNames) {
			System.out.println("trying to load target " + childName);
			if (targetManager.hasTargetDescription(childName)) {
				System.out.println("loading target " + childName);
				IHaxeTargetDescription targetDescription = targetManager.createTargetDescription(childName);
				targetDescription.load(preferences.node(childName));
				_targetDescriptions.add(targetDescription);
			}
		}
	}
}
