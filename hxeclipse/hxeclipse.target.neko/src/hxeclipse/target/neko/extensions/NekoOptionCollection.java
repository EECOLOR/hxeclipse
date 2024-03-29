package hxeclipse.target.neko.extensions;

import java.util.List;

import hxeclipse.core.IHaxeProject;
import hxeclipse.core.extensions.AbstractOutputOptionCollection;
import hxeclipse.core.extensions.IHaxeOptionCollection;

import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class NekoOptionCollection extends AbstractOutputOptionCollection {

	private boolean _outputSource;
	
	@Override
	public String getName() {
		return "Neko";
	}

	@Override
	protected String getOutputFileArgument() {
		return "-neko";
	}
	
	@Override
	public List<String> getCommandLineArguments(IHaxeProject haxeProject) {
		List<String> commandLineArguments = super.getCommandLineArguments(haxeProject);
		
		if (_outputSource) {
			commandLineArguments.add("--neko-source");
		}
		
		return commandLineArguments;
	}

	@Override
	public IHaxeOptionCollection copy() {
		NekoOptionCollection nekoOptionCollection = new NekoOptionCollection();
		nekoOptionCollection.setOutputFile(getOutputFile());
		nekoOptionCollection._outputSource = _outputSource;
		
		return nekoOptionCollection;
	}

	@Override
	public void save(Preferences preferences) {
		super.save(preferences);
		
		preferences.putBoolean("outputSource", _outputSource);
	}

	@Override
	public void load(Preferences preferences) throws BackingStoreException {
		super.load(preferences);
		
		_outputSource = preferences.getBoolean("outputSource", false);
	}

	public void setOutputSource(boolean outputSource) {
		_outputSource = outputSource;
	}

	public boolean getOutputSource() {
		return _outputSource;
	}

}
