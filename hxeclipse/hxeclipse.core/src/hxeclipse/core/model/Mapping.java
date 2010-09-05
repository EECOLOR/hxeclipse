package hxeclipse.core.model;

public class Mapping {
	private String _sourcePackage;
	private String _targetPackage;
	
	public Mapping(String sourcePackage, String targetPackage) {
		_sourcePackage = sourcePackage;
		_targetPackage = targetPackage;
	}
	
	public void setSourcePackage(String sourcePackage) {
		_sourcePackage = sourcePackage;
	}
	
	public String getSourcePackage() {
		return _sourcePackage;
	}

	public void setTargetPackage(String targetPackage) {
		_targetPackage = targetPackage;
	}

	public String getTargetPackage() {
		return _targetPackage;
	}
	
	
}
