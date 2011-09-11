package ee.xtext.haxe.converter;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.KeywordAlternativeConverter;

import com.google.inject.Inject;

public class HaxeValueConverterService extends DefaultTerminalConverters {
	/*
	@Inject
	private KeywordAlternativeConverter featureIDConverter;
	
	@ValueConverter(rule = "FeatureID")
	public IValueConverter<String> getFeatureIDValueConverter() {
		return featureIDConverter;
	}
	*/
}
