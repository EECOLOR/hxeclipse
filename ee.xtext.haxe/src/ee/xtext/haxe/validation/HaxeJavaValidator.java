package ee.xtext.haxe.validation;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import ee.xtext.haxe.haxe.BlockExpression;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.VariableDeclaration;
import ee.xtext.haxe.haxe.VariableDeclarations;
 

public class HaxeJavaValidator extends AbstractHaxeJavaValidator {

	@Check
	public void checkUniqueVariableName(VariableDeclaration variableDeclaration)
	{
		Map<Object, Object> context = getContext();

		if (context != null) {
			if (context.containsKey(variableDeclaration))
				return; // variableDeclaration was already validated
			context.put(variableDeclaration, this);
		}
		
		//find block
		EObject block = variableDeclaration.eContainer();
		while (!(block instanceof BlockExpression))
		{
			block = block.eContainer();
		}

		//check if any other variable has the same name
		String name = variableDeclaration.getName();
		for (EObject object : block.eContents())
		{
			if (object instanceof VariableDeclarations)
			{
				VariableDeclarations declarations = (VariableDeclarations) object;
				
				for (VariableDeclaration foundVariableDeclaration : declarations.getDeclarations())
				{
					if (!foundVariableDeclaration.equals(variableDeclaration) && foundVariableDeclaration.getName().equals(name))
					{
						error("Duplicate variable name '" + name + "'", variableDeclaration, HaxePackage.Literals.VARIABLE_DECLARATION__NAME, -1);
					}
				}
			}
		}
		
	}

}
