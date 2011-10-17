package ee.xtext.haxe.scoping;

import static java.util.Collections.singletonList;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import ee.xtext.haxe.haxe.Enum;
import ee.xtext.haxe.haxe.EnumConstructor;
import ee.xtext.haxe.haxe.HaxePackage;

public class HaxeImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		List<ImportNormalizer> implicitImports = super.getImplicitImports(ignoreCase);
		implicitImports = Lists.newArrayList(implicitImports);
		
		QualifiedName qualifiedName = QualifiedName.create("Bool");
		/*
		EClass eClass = HaxePackage.eINSTANCE.getEnum();
		
		IEObjectDescription singleElement = getGlobalScope(res, reference).getSingleElement(qualifiedName);
		
		if (singleElement != null && singleElement.getEClass().equals(eClass))
		{
			
			Enum resolve = (Enum) EcoreUtil2.resolve(singleElement.getEObjectOrProxy(), res);
			EList<EnumConstructor> constructors = resolve.getConstructors();
			
			for (EnumConstructor constructor : constructors)
			{
				implicitImports.add(new ImportNormalizer(qualifiedName.append(constructor.getName()), false, ignoreCase));
			}
		}
		*/

		implicitImports.add(
				new ImportNormalizer(
						qualifiedName, 
						false, 
						ignoreCase
				)
		);
		return implicitImports;
	}
	
	private static final Field importedNamespacePrefixField = _getImportedNamespacePrefixField();
	
	protected ImportScope createImportScope(IScope parent, List<ImportNormalizer> namespaceResolvers, ISelectable importFrom, EClass type, boolean ignoreCase) {
		
		List<ImportNormalizer> newNamespaceResolvers = namespaceResolvers;
		
		if (isFeature(type)) {
			newNamespaceResolvers = Lists.newArrayList(namespaceResolvers);
			
			try {
				importedNamespacePrefixField.setAccessible(true);
				
				for (ImportNormalizer namespaceResolver : namespaceResolvers) {
					QualifiedName qn = (QualifiedName) importedNamespacePrefixField.get(namespaceResolver);
					
					IEObjectDescription singleElement = parent.getSingleElement(qn);
					
					if (singleElement != null && isEnum(singleElement)) {
						newNamespaceResolvers.add(new ImportNormalizer(qn, true, ignoreCase));
					}
				}
				
				importedNamespacePrefixField.setAccessible(false);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		
		return super.createImportScope(parent, newNamespaceResolvers, importFrom, type, ignoreCase);
	}


	private static Field _getImportedNamespacePrefixField() {
		try {
			return ImportNormalizer.class.getDeclaredField("importedNamespacePrefix");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}


	private boolean isEnum(IEObjectDescription singleElement) {
		return singleElement.getEClass().equals(HaxePackage.eINSTANCE.getEnum());
	}

	private boolean isFeature(EClass type) {
		return type.equals(HaxePackage.eINSTANCE.getFeature());
	}

	protected IScope getLocalElementsScope(IScope parent, final EObject context,
			final EReference reference) {
		IScope result = super.getLocalElementsScope(parent, context, reference);
		/*
		ISelectable allDescriptions = getAllDescriptions(context.eResource());
		QualifiedName name = getQualifiedNameOfLocalElement(context);
		boolean ignoreCase = isIgnoreCase(reference);
		
		Iterable<IEObjectDescription> exportedObjects = allDescriptions.getExportedObjects();
		for (IEObjectDescription o : exportedObjects)
		{
			System.out.println(o.getName());
		}
		Iterable<IEObjectDescription> enumConstructors = allDescriptions.getExportedObjectsByType(HaxePackage.eINSTANCE.getEnumConstructor());
		
		int length = name == null ? 1 : name.getSegmentCount() + 1;
		
		List<IEObjectDescription> aliases = new ArrayList<IEObjectDescription>();
		
		for (IEObjectDescription enumConstructor : enumConstructors)
		{
			QualifiedName qualifiedName = enumConstructor.getQualifiedName();
			boolean check = name == null || qualifiedName.startsWith(name);
System.out.println(qualifiedName);
			if (check && qualifiedName.getSegmentCount() - length == 1)
			{
				aliases.add(new AliasedEObjectDescription(qualifiedName.skipFirst(length), enumConstructor));
			}
		}
		
		if (!aliases.isEmpty())
		{
			return new SimpleScope(result, aliases);
		}
		*/
		return result;
	}
}
