package ee.xtext.haxe.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import ee.xtext.haxe.haxe.EnumConstructor;
import ee.xtext.haxe.haxe.Expression;
import ee.xtext.haxe.haxe.Parameter;
import ee.xtext.haxe.haxe.TypeParameter;
import ee.xtext.haxe.haxe.VariableDeclaration;

public class HaxeDefaultResourceDescriptionStrategy extends
		DefaultResourceDescriptionStrategy {

	@Override
	public boolean createEObjectDescriptions(EObject eObject,
			IAcceptor<IEObjectDescription> acceptor) {
		
		if (eObject instanceof Expression || 
				eObject instanceof VariableDeclaration ||
				eObject instanceof Parameter ||
				eObject instanceof TypeParameter)
		{
			return false;
		}
		
		return super.createEObjectDescriptions(eObject, acceptor);
	}

	@Override
	public boolean createReferenceDescriptions(EObject from,
			URI exportedContainerURI, IAcceptor<IReferenceDescription> acceptor) {
		
		return super.createReferenceDescriptions(from, exportedContainerURI, acceptor);
	}

	
}
