package ee.xtext.haxe.scoping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.IScopeWrapper;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

import com.google.common.collect.Lists;

public class HaxeImportedNamespaceAwareLocalScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {
	
	protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		
		StringBuilder contents = new StringBuilder();

		try {
	      //use buffering, reading one line at a time
	      //FileReader always assumes default encoding is OK!
	    	
	      ClassLoader classLoader = getClass().getClassLoader();
		InputStream resourceAsStream = classLoader.getResourceAsStream("String.hx");
	      
	      if (resourceAsStream == null) throw new RuntimeException("Could not find file");
	      
		BufferedReader input =  new BufferedReader(new InputStreamReader(resourceAsStream));
	      try {
	        String line = null; //not declared within while loop
	        /*
	        * readLine is a bit quirky :
	        * it returns the content of a line MINUS the newline.
	        * it returns null only for the END of the stream.
	        * it returns an empty String if two newlines appear in a row.
	        */
	        while (( line = input.readLine()) != null){
	          contents.append(line);
	          contents.append(System.getProperty("line.separator"));
	        }
	      }
	      finally {
	        input.close();
	      }
	    }
	    catch (IOException ex){
	      ex.printStackTrace();
	    }
	    
	   System.out.println(contents.toString());
		
		
		
		List<ImportNormalizer> implicitImports = Lists.newArrayList();
		implicitImports.add(new ImportNormalizer(QualifiedName.create("String"), false, ignoreCase));
		
		return implicitImports;
	}
}
