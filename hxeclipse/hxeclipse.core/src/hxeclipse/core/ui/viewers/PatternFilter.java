package hxeclipse.core.ui.viewers;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.internal.misc.StringMatcher;

@SuppressWarnings("restriction")
public class PatternFilter extends ViewerFilter {

	private StringMatcher _matcher;
    
    public final Object[] filter(Viewer viewer, Object parent, Object[] elements) {
        if (_matcher == null) {
			return elements;
		}

       	return super.filter(viewer, parent, elements);
    }

    public final boolean select(Viewer viewer, Object parentElement, Object element) {
        return isElementVisible(viewer, element);
    }
    
    /**
     * The pattern string for which this filter should select 
     * elements in the viewer.
     * 
     * @param patternString
     */
	public void setPattern(String patternString) {
        if (patternString == null || patternString.equals("")) {
			_matcher = null;
		} else {
			String pattern = patternString + "*";
			_matcher = new StringMatcher(pattern, true, false);
		}
    }
    
    /**
     * Answers whether the given element in the given viewer matches
     * the filter pattern.  This is a default implementation that will 
     * show a leaf element in the tree based on whether the provided  
     * filter text matches the text of the given element's text, or that 
     * of it's children (if the element has any).  
     * 
     * Subclasses may override this method.
     * 
     * @param viewer the tree viewer in which the element resides
     * @param element the element in the tree to check for a match
     * 
     * @return true if the element matches the filter pattern
     */
    public boolean isElementVisible(Viewer viewer, Object element){
        String labelText = ((ILabelProvider) ((StructuredViewer) viewer).getLabelProvider()).getText(element);
        
        if(labelText == null) {
			return false;
		}
        
        return _wordMatches(labelText); 
    }
    
	private boolean _match(String string) {
    	if (_matcher == null) {
			return true;
		}
        return _matcher.match(string);
    }
    
	private boolean _wordMatches(String text) {
		if (text == null) {
			return false;
		}
		
		//If the whole text matches we are all set
		if(_match(text)) {
			return true;
		}
		
		// Otherwise check if any of the words of the text matches
		Iterator<String> words = _getWords(text).iterator();
		while (words.hasNext())
		{
			if (_match(words.next())) {
				return true;
			}
		}

		return false;
	}
	
	private List<String> _getWords(String text){
		List<String> words = new ArrayList<String>();
		
		// Break the text up into words, separating based on whitespace and
		// common punctuation.
		// Previously used String.split(..., "\\W"), where "\W" is a regular
		// expression (see the Javadoc for class Pattern).
		// Need to avoid both String.split and regular expressions, in order to
		// compile against JCL Foundation (bug 80053).
		// Also need to do this in an NL-sensitive way. The use of BreakIterator
		// was suggested in bug 90579.
		BreakIterator iter = BreakIterator.getWordInstance();
		iter.setText(text);
		int i = iter.first();
		while (i != java.text.BreakIterator.DONE && i < text.length()) {
			int j = iter.following(i);
			if (j == java.text.BreakIterator.DONE) {
				j = text.length();
			}
			// match the word
			if (Character.isLetterOrDigit(text.charAt(i))) {
				String word = text.substring(i, j);
				words.add(word);
			}
			i = j;
		}
		return words;
	}
}
