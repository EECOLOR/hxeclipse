package ee.xtext.haxe.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import ee.xtext.haxe.haxe.EnumConstructor;

public class HaxeQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		
		QualifiedName fullyQualifiedName = super.getFullyQualifiedName(obj);
		
		if (obj instanceof EnumConstructor)
		{
			//return fullyQualifiedName.skipLast(1);
		}
		
		return fullyQualifiedName;
	}
	
}
