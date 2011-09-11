package ee.xtext.haxe.scoping;

import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

public class HaxeImportUriGlobalScopeProvider extends
		ImportUriGlobalScopeProvider {

	@Override
	protected LinkedHashSet<URI> getImportedUris(Resource context) {
		System.out.println("getImportedUris");
		URI uri = URI.createURI("classpath:/String.hx");
		
		LinkedHashSet<URI> temp = super.getImportedUris(context);
		temp.add(uri);
	    
		System.out.println("resource exists: " + !(getClass().getClassLoader().getResource("String.hx") == null));
		
	    return temp;
	}
		
}
