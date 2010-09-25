package hxeclipse.core.editor.quickFix;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.IMarkerResolution;

import hxeclipse.core.editor.HaxeProblemTypes;
import hxeclipse.core.extensions.IHaxeQuickFix;

public class Unexpected implements IHaxeQuickFix {

	@Override
	public boolean canHandle(int problemType) {
		return problemType == HaxeProblemTypes.UNEXPECTED;
	}

	/*
		Unexpected {
			** private function test():void { **
				
				- Convert void to Void
					private function test():Void {
				- Remove return type
					private function test() {
		
			** typedef Test { **
				
				- Add =
					typedef Test = {

			** class Main extends test { **
			
				- Convert to uppercase first letter
					class Main extends Test {
					
				
		Unexpected void
			** private void function test() { **
			
				-remove void
					private function test() {
		
		
		Unexpected ;
			** import test.test; **
				
				- Convert test to Test
					import test.Test;
					
				- Select class from package test.test
					import test.test.Test;
					
			** var x:; **
				
				- Remove :
					var x;
				
				- Select type
					var x:Test;
			
			** test:Int; **
				
				- Add var
					var test:Int;
					
					
		Unexpected <end of file>
	 */
	
	
	@Override
	public IMarkerResolution[] getResolutions(IMarker marker) {
		// TODO Auto-generated method stub
		return null;
	}

}
