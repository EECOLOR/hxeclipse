/*
 * generated by Xtext
 */
package ee.xtext.haxe.scoping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.ScopeBasedSelectable;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.util.IResourceScopeCache;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

import ee.xtext.haxe.haxe.Assignment;
import ee.xtext.haxe.haxe.BlockExpression;
import ee.xtext.haxe.haxe.CatchClause;
import ee.xtext.haxe.haxe.Class;
import ee.xtext.haxe.haxe.Feature;
import ee.xtext.haxe.haxe.FeatureCall;
import ee.xtext.haxe.haxe.ForLoopExpression;
import ee.xtext.haxe.haxe.FunctionExpression;
import ee.xtext.haxe.haxe.HaxePackage;
import ee.xtext.haxe.haxe.Method;
import ee.xtext.haxe.haxe.Package;
import ee.xtext.haxe.haxe.ParameterizedTypeReference;
import ee.xtext.haxe.haxe.Reference;
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
	
	@Inject
	private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;
	
	static public final QualifiedName THIS = QualifiedName.create("this");
	static public final QualifiedName SUPER = QualifiedName.create("super");
	
	public IScope getAvailableFeatures(int index, final EObject context, EReference reference)
	{
		final IScope parentScope = getAvailableFeaturesFromParents(context, reference);
		
		if (context instanceof Class)
		{
			Set<IEObjectDescription> descriptions = new HashSet<IEObjectDescription>();
			
			Class classDefinition = (Class) context;
			descriptions.add(EObjectDescription.create(THIS, classDefinition));
			
			Reference extendsClass = classDefinition.getExtends();
			if (extendsClass != null && extendsClass instanceof ParameterizedTypeReference)
			{
				Class superClass = (Class) ((ParameterizedTypeReference) extendsClass).getType();
				descriptions.add(EObjectDescription.create(SUPER, superClass));
			}
			
			return new SimpleScope(parentScope, Iterables.concat(descriptions, Scopes.scopedElementsFor(((Class) context).getMethods())));
		}
		
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
		
		if (context instanceof Method)
		{
			List<? extends Feature> elements = ((Method) context).getParameters();
			return Scopes.scopeFor(elements, parentScope);
		}
		
		if (context instanceof FunctionExpression)
		{
			List<? extends Feature> elements = ((FunctionExpression) context).getParameters();
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
		
		if (context instanceof Package)
		{
			//ISelectable scopeBasedSelectable = new ScopeBasedSelectable(parentScope);
			
		}
		
		return parentScope;
	}
	
	private IScope getAvailableFeaturesFromParents(EObject context, EReference reference)
	{
		EObject parent = context.eContainer();
		if (parent == null)
		{
			IScope delegateGetScope = delegateGetScope(context, reference);
			return delegateGetScope;
		} else
		{
			int index = parent.eContents().indexOf(context);
			
			return getAvailableFeatures(index, parent, reference);
		}
	}
	
	public IScope scope_Assignment_feature(Assignment context, EReference reference)
	{
		return getAvailableFeaturesFromParents(context, reference);
	}
	
	public IScope scope_FeatureCall_feature(FeatureCall context, EReference reference)
	{
		return getAvailableFeaturesFromParents(context, reference);
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
