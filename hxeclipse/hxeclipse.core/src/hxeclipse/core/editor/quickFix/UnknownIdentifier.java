package hxeclipse.core.editor.quickFix;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.IMarkerResolution;

import hxeclipse.core.editor.HaxeProblemTypes;
import hxeclipse.core.extensions.IHaxeQuickFix;

public class UnknownIdentifier implements IHaxeQuickFix {

	@Override
	public boolean canHandle(int problemType) {
		return problemType == HaxeProblemTypes.UNKNOWN_IDENTIFIER;
	}

	/*
		Unknown identifier : x
		** return x; **

			- create variable x

				
		Unknown identifier : test2
		** test2(); **

			- create method test2
			
			 
		Unknown identifier : y
		** var x = y; **
		
			- create variable y
		
	*/
	
	@Override
	public IMarkerResolution[] getResolutions(IMarker marker) {
		// TODO Auto-generated method stub
		return null;
	}

}
