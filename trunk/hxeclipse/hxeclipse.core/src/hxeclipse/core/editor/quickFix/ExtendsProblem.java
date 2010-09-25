package hxeclipse.core.editor.quickFix;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.IMarkerResolution;

import hxeclipse.core.editor.HaxeProblemTypes;
import hxeclipse.core.extensions.IHaxeQuickFix;

public class ExtendsProblem implements IHaxeQuickFix {

	@Override
	public boolean canHandle(int problemType) {
		return problemType == HaxeProblemTypes.EXTENDS_PROBLEM;
	}

	/*
		Cannot extend by using an interface
		** class Main extends ITest **
			
			- convert Main to interface
				interface Main extends ITest
			
			- change extends to implements
				class Main implements ITest
				
		Should extend by using a class
		** class Main extends Test **

			Test is a typedef
			
			- remove extends
				class Main 
	*/
	
	
	@Override
	public IMarkerResolution[] getResolutions(IMarker marker) {
		// TODO Auto-generated method stub
		return null;
	}

}
