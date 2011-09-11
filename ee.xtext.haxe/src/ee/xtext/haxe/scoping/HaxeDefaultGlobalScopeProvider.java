package ee.xtext.haxe.scoping;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

public class HaxeDefaultGlobalScopeProvider extends DefaultGlobalScopeProvider {

	@Override
	protected List<IContainer> getVisibleContainers(Resource resource) {
		// TODO Auto-generated method stub
		return super.getVisibleContainers(resource);
	}
	
}
