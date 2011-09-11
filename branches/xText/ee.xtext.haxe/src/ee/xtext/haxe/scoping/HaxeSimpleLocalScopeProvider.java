package ee.xtext.haxe.scoping;

import java.io.InputStream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleLocalScopeProvider;

public class HaxeSimpleLocalScopeProvider extends SimpleLocalScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		return super.getScope(context, reference);
	}
	
}
