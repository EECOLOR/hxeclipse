package hxeclipse.core.editor.quickFix;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.IMarkerResolution;

import hxeclipse.core.editor.HaxeProblemTypes;
import hxeclipse.core.extensions.IHaxeQuickFix;

public class InvalidType implements IHaxeQuickFix {

	@Override
	public boolean canHandle(int problemType) {
		return problemType == HaxeProblemTypes.INVALID_TYPE;
	}

	/*
		{ } should be Test
		{ } should be { test2 : Int, test : Int }
		**  
			static private function test():Test {
				return {};
			}		
		**
	
			Test is a typedef:
			
			typedef Test = {
				var test:Int;
				var test2:Int;
			}
				
				- construct new object following type definition
					static private function test():Test {
						return {test: 1, test2: 2};
					}
					
		
		Test should be Void
		{ test2 : Int, test : Int } should be Void
		**  
			static private function test():Test {
			}
		**
			
			Test is a typedef:
			
			typedef Test = {
				var test:Int;
				var test2:Int;
			}
			
			- change return type to Void
				static private function test():Void {
				}
			
			- add return statement
				static private function test():Test {
					return null;
				}
	 */	
	
	@Override
	public IMarkerResolution[] getResolutions(IMarker marker) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
