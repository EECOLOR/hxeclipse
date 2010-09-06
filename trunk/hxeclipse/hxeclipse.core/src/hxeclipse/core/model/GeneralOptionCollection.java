package hxeclipse.core.model;

import hxeclipse.core.IHaxeClass;
import hxeclipse.core.extensions.ILibrary;
import hxeclipse.core.extensions.IOptionCollection;

import java.util.List;

import org.eclipse.core.resources.IFolder;

public class GeneralOptionCollection implements IOptionCollection {
	private IHaxeClass _main;
	private List<ILibrary> _libraries;
	private List<String> _conditionalCompilationFlags;
	private List<Resource> _resources;
	private List<String> _excludes;
	private boolean _includeDebugInformation;
	private boolean _noOptimalisation;
	private boolean _noTraces;
	private boolean _noInlining;
	private List<Mapping> _mappings;
	private List<IFolder> _sourceFolder;
	private IFolder _outputPath;
	
	@Override
	public String getName() {
		return "General";
	}
	
	@Override
	public IOptionCollection copy() {
		GeneralOptionCollection generalOptionCollection = new GeneralOptionCollection();
		generalOptionCollection._main = _main;
		generalOptionCollection._libraries = _libraries;
		generalOptionCollection._conditionalCompilationFlags = _conditionalCompilationFlags;
		generalOptionCollection._resources = _resources;
		generalOptionCollection._excludes = _excludes;
		generalOptionCollection._includeDebugInformation = _includeDebugInformation;
		generalOptionCollection._noOptimalisation = _noOptimalisation;
		generalOptionCollection._noTraces = _noTraces;
		generalOptionCollection._noInlining = _noInlining;
		generalOptionCollection._mappings = _mappings;
		generalOptionCollection._sourceFolder = _sourceFolder;
		generalOptionCollection._outputPath = _outputPath;
		
		return generalOptionCollection;
	}
	
	public void setMain(IHaxeClass main) {
		_main = main;
	}
	
	public IHaxeClass getMain() {
		return _main;
	}

	public void setLibraries(List<ILibrary> libraries) {
		_libraries = libraries;
	}

	public List<ILibrary> getLibraries() {
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

	public void setSourceFolders(List<IFolder> sourceFolders) {
		_sourceFolder = sourceFolders;
	}

	public List<IFolder> getSourceFolders() {
		return _sourceFolder;
	}

	public void setOutputPath(IFolder outputPath) {
		_outputPath = outputPath;
	}

	public IFolder getOutputPath() {
		return _outputPath;
	}
}
