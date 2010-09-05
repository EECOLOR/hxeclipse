package hxeclipse.core.model;

import java.util.List;

public class ProjectDescription {
	private List<TargetDescription> _targets;

	public void setTargets(List<TargetDescription> targets) {
		_targets = targets;
	}

	public List<TargetDescription> getTargets() {
		return _targets;
	}
}
