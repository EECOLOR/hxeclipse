/*
 * generated by Xtext
 */
package ee.xtext.haxe.scoping;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import com.google.common.collect.Lists;

import ee.xtext.haxe.haxe.Assignment;
import ee.xtext.haxe.haxe.BlockExpression;
import ee.xtext.haxe.haxe.CatchClause;
import ee.xtext.haxe.haxe.Feature;
import ee.xtext.haxe.haxe.FeatureCall;
import ee.xtext.haxe.haxe.ForLoopExpression;
import ee.xtext.haxe.haxe.FunctionDeclaration;
import ee.xtext.haxe.haxe.FunctionExpression;
import ee.xtext.haxe.haxe.VariableDeclaration;
import ee.xtext.haxe.haxe.VariableDeclarations;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class HaxeScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope getAvailableFeatures(int index, EObject context)
	{
		IScope parentScope = getAvailableFeaturesFromParents(context);
				
		if (context instanceof BlockExpression)
		{
			List<Feature> elements = getFeatures(index, ((BlockExpression) context).getExpressions());
			return Scopes.scopeFor(elements, parentScope);
		}
		
		if (context instanceof FunctionExpression)
		{
			List<? extends Feature> elements = ((FunctionExpression) context).getParameters();
			return Scopes.scopeFor(elements, parentScope);
		}
		
		if (context instanceof FunctionDeclaration)
		{
			List<? extends Feature> elements = ((FunctionDeclaration) context).getParameters();
			return Scopes.scopeFor(elements, parentScope);
		}
		
		if (context instanceof ForLoopExpression)
		{
			List<? extends Feature> elements = Lists.newArrayList(((ForLoopExpression) context).getDeclaredParam());
			return Scopes.scopeFor(elements, parentScope);
		}
		
		if (context instanceof CatchClause)
		{
			List<? extends Feature> elements = Lists.newArrayList(((CatchClause) context).getDeclaredParam());
			return Scopes.scopeFor(elements, parentScope);
		}
		
		return parentScope;
	}
	
	private IScope getAvailableFeaturesFromParents(EObject context)
	{
		EObject parent = context.eContainer();
		
		if (parent == null)
		{
			return IScope.NULLSCOPE;
		} else
		{
			int index = parent.eContents().indexOf(context);
			
			return getAvailableFeatures(index, parent);
		}
	}
	
	public IScope scope_Assignment_feature(Assignment context, EReference reference)
	{
		return getAvailableFeaturesFromParents(context);
	}
	
	public IScope scope_FeatureCall_feature(FeatureCall context, EReference reference)
	{
		return getAvailableFeaturesFromParents(context);
	}

	private List<Feature> getFeatures(int currentIndex, EList<? extends EObject> expressions) {
		
		List<Feature> elements = Lists.newArrayList();
		
		for (int i = 0; i < currentIndex; i++)
		{
			EObject expression = expressions.get(i);
			
			if (expression instanceof VariableDeclarations)
			{
				EList<VariableDeclaration> declarations = ((VariableDeclarations) expression).getDeclarations();
				/*
				String variables = "";
				
				for (VariableDeclaration v : declarations)
				{
					variables += v.getName() + ", ";
				}
				
				System.out.println(variables);
				*/
				elements.addAll(declarations);
			} else if (expression instanceof Feature)
			{
				elements.add((Feature) expression);
			}
		}
		return elements;
	}
}
