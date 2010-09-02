package hxeclipse.core.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;

public class FileUtils {
	/**
	 * Finds a file in the given path, ignoring the extension (multi-platform)
	 * 
	 * @param path	The path in which to search
	 * @param file	The name of the file
	 * 
	 * @return	The actual file with the given name (whatever the extension)
	 * @throws FileNotFoundException Thrown when no file with that name could be found
	 */
	static public String getFile(File path, String file) throws FileNotFoundException {
		final String searchFile = file;
		
		String[] files = path.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				String lowerCaseName = name.toLowerCase();
				String[] split = lowerCaseName.split("\\.");
				return split[0].equals(searchFile);
			}
		});
		
		if (files.length < 1) {
			throw new FileNotFoundException("Could not find a file with the name '" + file + "' in the directory '" + path.getAbsolutePath() + "'");
		}
		
		return files[0];
	}
}
