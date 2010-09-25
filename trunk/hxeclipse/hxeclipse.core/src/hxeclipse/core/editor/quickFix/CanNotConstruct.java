package hxeclipse.core.editor.quickFix;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.IMarkerResolution;

import hxeclipse.core.editor.HaxeProblemTypes;
import hxeclipse.core.extensions.IHaxeQuickFix;

public class CanNotConstruct implements IHaxeQuickFix {

	@Override
	public boolean canHandle(int problemType) {
		return problemType == HaxeProblemTypes.CAN_NOT_CONSTRUCT;
	}

	/*
		Test cannot be constructed
			** new Test(); ** 

			Test is a typedef:
			
			typedef Test = {
				var test:Int;
			}
			
				- construct new object following type definition
					{test: 1}
					

	 */
	
	@Override
	public IMarkerResolution[] getResolutions(IMarker marker) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
