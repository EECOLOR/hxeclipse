package hxeclipse.core;

import hxeclipse.core.exceptions.HaxePathNotFoundException;

public interface IHaxePreferences {

	public String getHaxePath() throws HaxePathNotFoundException;

}