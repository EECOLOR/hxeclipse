package ee.xtext.haxe.scoping;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.emptyList;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

import ee.xtext.haxe.haxe.Enum;
import ee.xtext.haxe.haxe.EnumConstructor;
import ee.xtext.haxe.haxe.HaxePackage;

public class HaxeImportScope extends ImportScope {

	private final List<ImportNormalizer> normalizers;
	
	public HaxeImportScope(List<ImportNormalizer> namespaceResolvers,
			IScope parent, ISelectable importFrom, EClass type,
			boolean ignoreCase) {
		super(namespaceResolvers, parent, importFrom, type, ignoreCase);
		
		this.normalizers = removeDuplicates(namespaceResolvers);
	}

	@Override
	protected Iterable<IEObjectDescription> getAliasedElements(
			Iterable<IEObjectDescription> candidates) {
		return super.getAliasedElements(candidates);
	}
	
	
}
