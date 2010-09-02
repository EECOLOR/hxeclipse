package hxeclipse.haxelib.utils;

import hxeclipse.haxelib.model.Library;
import hxeclipse.haxelib.model.LibraryRelease;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class StringUtils {
	/**
	 * Parses the given string into a typed haxe library. This string is the output 
	 * of the haxelib tool.
	 * 
	 * @param str	The string to parse
	 * 
	 * @return	A filled instance of HaxeLibrary
	 * 
	 * @throws ParseException	Thrown when createHaxeLibraryRelease throws the ParseException
	 * 
	 * @see #createHaxeLibraryRelease(String)
	 */
	static public Library createHaxeLibrary(String str) throws ParseException {
		str = str.trim();
		
		Library haxeLibrary = new Library();
		
		String[] split = str.split("(\\n\\r|\\n|\\r)");
		
		String[] partSplit;
		String name;
		String value;
		boolean gatheringReleases = false;
		List<LibraryRelease> releases = new ArrayList<LibraryRelease>();
		String currentPart = null;
		String partToProcess = null;
		for (int i = 0; i < split.length; i++) {
			
			String part = split[i];
			
			if (gatheringReleases) {
				if (part.startsWith("   ") && part.substring(3, 4).matches("\\d")) {
					//we found a new part
					
					if (currentPart != null) {
						//we were still gathering a part
						partToProcess = currentPart;
					}
					currentPart = part; 
				} else
				{
					currentPart += "\n" + part;
				}
				
				if (i == split.length - 1) {
					//we are at the end
					partToProcess = currentPart;
				}
				
				if (partToProcess != null) {
					releases.add(createHaxeLibraryRelease(partToProcess, haxeLibrary));
					partToProcess = null;
				}
			} else {
				partSplit = part.split(": ");
				
				name = partSplit[0]; 
				
				if (name.equalsIgnoreCase("releases")) {
					gatheringReleases = true;
				} else
				{
					if (partSplit.length > 1)
					{
						value = partSplit[1];
						
						if (name.equalsIgnoreCase("name")) {
							haxeLibrary.setName(value);
						} else if (name.equalsIgnoreCase("tags")) {
							haxeLibrary.setTags(value);
						} else if (name.equalsIgnoreCase("desc")) {
							haxeLibrary.setDescription(value);
						} else if (name.equalsIgnoreCase("website")) {
							haxeLibrary.setWebsite(value);
						} else if (name.equalsIgnoreCase("license")) {
							haxeLibrary.setLicense(value);
						} else if (name.equalsIgnoreCase("owner")) {
							haxeLibrary.setOwner(value);
						} else if (name.equalsIgnoreCase("version")) {
							haxeLibrary.setVersion(value);
						}
					}
				}
			}
		}
		haxeLibrary.setReleases(releases);
		
		return haxeLibrary;
	}
	
	/**
	 * Parses the given string into a typed haxe library release. This string is the output 
	 * of the haxelib tool.
	 * 
	 * @param str	A string representing a release
	 * 
	 * @return	A filled typed HaxeLibraryRelease
	 * 
	 * @throws ParseException	Thrown if the date in the release can not be formatted 
	 */
	static public LibraryRelease createHaxeLibraryRelease(String str, Library haxeLibrary) throws ParseException {
		LibraryRelease release = new LibraryRelease(haxeLibrary);
		str = str.trim();
		String[] split = str.split("( : | :)");
		
		String[] dateVersion = split[0].split(" ");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		release.setDate(dateFormat.parse(dateVersion[0] + " " + dateVersion[1]));
		release.setVersion(dateVersion[2]);
		
		if (split.length > 1)
		{
			release.setDescription(split[1]);
		}
		
		return release;
	}	
}
