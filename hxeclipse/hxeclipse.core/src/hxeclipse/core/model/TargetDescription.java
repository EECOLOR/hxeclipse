package hxeclipse.core.model;

import hxeclipse.core.IHaxeClass;

import java.util.List;

import org.eclipse.core.resources.IFolder;

abstract public class TargetDescription {
	private IHaxeClass _main;
	private List<String> _libraries;
	private List<String> _conditionalCompilationFlags;
	private List<Resource> _resources;
	private List<String> _excludes;
	private boolean _includeDebugInformation;
	private boolean _noOptimalisation;
	private boolean _noTraces;
	private boolean _noInlining;
	private List<Mapping> _mappings;
	private List<IFolder> _sourcePaths;
	
	public TargetDescription() {
	}
	
	public void setMain(IHaxeClass main) {
		_main = main;
	}
	
	public IHaxeClass getMain() {
		return _main;
	}

	public void setLibraries(List<String> libraries) {
		_libraries = libraries;
	}

	public List<String> getLibraries() {
		return _libraries;
	}

	public void setConditionalCompilationFlags(
			List<String> conditionalCompilationFlags) {
		_conditionalCompilationFlags = conditionalCompilationFlags;
	}

	public List<String> getConditionalCompilationFlags() {
		return _conditionalCompilationFlags;
	}

	public void setResources(List<Resource> resources) {
		_resources = resources;
	}

	public List<Resource> getResources() {
		return _resources;
	}

	public void setExcludes(List<String> excludes) {
		_excludes = excludes;
	}

	public List<String> getExcludes() {
		return _excludes;
	}

	public void setIncludeDebugInformation(boolean includeDebugInformation) {
		_includeDebugInformation = includeDebugInformation;
	}

	public boolean getIncludeDebugInformation() {
		return _includeDebugInformation;
	}

	public void setNoOptimalisation(boolean noOptimalisation) {
		_noOptimalisation = noOptimalisation;
	}

	public boolean getNoOptimalisation() {
		return _noOptimalisation;
	}

	public void setNoTraces(boolean noTraces) {
		_noTraces = noTraces;
	}

	public boolean getNoTraces() {
		return _noTraces;
	}

	public void setNoInlining(boolean noInlining) {
		_noInlining = noInlining;
	}

	public boolean getNoInlining() {
		return _noInlining;
	}

	public void setMappings(List<Mapping> mappings) {
		_mappings = mappings;
	}

	public List<Mapping> getMappings() {
		return _mappings;
	}

	public void setSourcePaths(List<IFolder> sourcePaths) {
		_sourcePaths = sourcePaths;
	}

	public List<IFolder> getSourcePaths() {
		return _sourcePaths;
	}
}
