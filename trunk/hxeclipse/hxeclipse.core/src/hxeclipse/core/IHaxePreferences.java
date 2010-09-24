package hxeclipse.core;

import hxeclipse.core.exceptions.HaxePathNotFoundException;
import hxeclipse.core.exceptions.NekoPathNotFoundException;

public interface IHaxePreferences {

	public String getHaxePath() throws HaxePathNotFoundException;
	public String getNekoPath() throws NekoPathNotFoundException;
}