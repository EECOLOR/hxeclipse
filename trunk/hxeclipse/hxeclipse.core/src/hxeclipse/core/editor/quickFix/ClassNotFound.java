package hxeclipse.core.editor.quickFix;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.IMarkerResolution;

import hxeclipse.core.editor.HaxeProblemTypes;
import hxeclipse.core.extensions.IHaxeQuickFix;

public class ClassNotFound implements IHaxeQuickFix {

	@Override
	public boolean canHandle(int problemType) {
		return problemType == HaxeProblemTypes.CLASS_NOT_FOUND;
	}

	/*
		Class not found : Test
			** var x:Test; **
			
				- Create class Test
				- Create interface Test
				- Create typedef Test
					

	 */
	
	@Override
	public IMarkerResolution[] getResolutions(IMarker marker) {
		// TODO Auto-generated method stub
		return null;
	}

}
