package hxeclipse.core.model;

import hxeclipse.core.extensions.ITargetDescription;

import java.util.List;

public class HaxeProjectDescription {
	private List<ITargetDescription> _targets;

	public void setTargets(List<ITargetDescription> targets) {
		_targets = targets;
	}

	public List<ITargetDescription> getTargets() {
		return _targets;
	}
}
