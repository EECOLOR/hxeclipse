package ee.xtext.haxe.converter;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class HexValueConverter extends AbstractLexerBasedConverter<Integer> {

	@Override
	protected String toEscapedString(Integer value) {
		return value.toString();
	}
	
	@Override
	protected void assertValidValue(Integer value) {
		super.assertValidValue(value);
		if (value < 0)
			throw new ValueConverterException(getRuleName() + "-value may not be negative (value:" + value + ").", null, null);
	}
	
	public Integer toValue(String string, INode node) {
		if (Strings.isEmpty(string))
			throw new ValueConverterException("Couldn't convert empty string to int.", node, null);
		try {
			int intValue = Integer.parseInt(string.substring(2), 16);
			return Integer.valueOf(intValue);
		} catch (NumberFormatException e) {
			throw new ValueConverterException("Couldn't convert '" + string + "' to int.", node, e);
		}
	}

}
