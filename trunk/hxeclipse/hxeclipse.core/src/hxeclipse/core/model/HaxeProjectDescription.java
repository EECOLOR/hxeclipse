package hxeclipse.core.model;

import hxeclipse.core.extensions.ITargetDescription;

import java.util.Iterator;
import java.util.List;

import org.osgi.service.prefs.Preferences;

public class HaxeProjectDescription {
	private List<ITargetDescription> _targets;

	public void setTargets(List<ITargetDescription> targets) {
		_targets = targets;
	}

	public List<ITargetDescription> getTargets() {
		return _targets;
	}

	public void save(Preferences preferences) {
		Iterator<ITargetDescription> targets = _targets.iterator();
		
		while(targets.hasNext()) {
			ITargetDescription targetDescription = targets.next();
			Preferences targetPreferences = preferences.node(targetDescription.getClass().getName());
			targetDescription.save(targetPreferences);
		}
	}
}
