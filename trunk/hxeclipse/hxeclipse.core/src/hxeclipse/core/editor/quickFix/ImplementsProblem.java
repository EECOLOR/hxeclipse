package hxeclipse.core.editor.quickFix;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.IMarkerResolution;

import hxeclipse.core.editor.HaxeProblemTypes;
import hxeclipse.core.extensions.IHaxeQuickFix;

public class ImplementsProblem implements IHaxeQuickFix {

	@Override
	public boolean canHandle(int problemType) {
		return problemType == HaxeProblemTypes.IMPLEMENTS_PROBLEM;
	}

	/*
		Should implement by using an interface or a class
		** class Main implements Test **

			Test is a typedef
			
			- remove implements
				class Main
				
				
		Field test needed by TestClass is missing
		** class Main implements TestClass **

			- implement missing fields
			
		
		Field test3 should be public as requested by TestClass
		** function test3(); **

			- add public
				public function test3();

				
		Field soep has different property access than in TestClass (default method should be default)
		** public function soep(); **

			- change signature
				public var soep:Int;
				
		
		Field soep has different property access than in TestClass (default should be test4)
		** public var soep:Int; **
		
			- change signature
				public var soep(default, test4):Int;
				
		
		
		
		
	
	*/
	
	
	@Override
	public IMarkerResolution[] getResolutions(IMarker marker) {
		// TODO Auto-generated method stub
		return null;
	}

}
