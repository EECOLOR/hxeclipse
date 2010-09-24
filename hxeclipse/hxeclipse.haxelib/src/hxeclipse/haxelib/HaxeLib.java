package hxeclipse.haxelib;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxePreferences;
import hxeclipse.core.exceptions.HaxePathNotFoundException;
import hxeclipse.core.exceptions.NekoPathNotFoundException;
import hxeclipse.core.utils.FileUtils;
import hxeclipse.haxelib.exceptions.HaxeLibNotFoundException;
import hxeclipse.haxelib.model.Library;
import hxeclipse.haxelib.model.LibraryRelease;
import hxeclipse.haxelib.utils.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HaxeLib {
	static private HaxeLib _instance;
	
	//TODO can we use dependency injection instead of this nasty Singleton pattern?
	static public HaxeLib getInstance() throws HaxePathNotFoundException, HaxeLibNotFoundException, NekoPathNotFoundException {
		synchronized(HaxeLib.class) {
			if (_instance == null) {
				_instance = new HaxeLib();
			}
		}
		return _instance;
	}
	
	private String _haxeLibLocation;
	
	private Map<String, CacheElement> _libraryCache;
	private List<Library> _installedLibrariesCache;
	private List<Library> _availableLibrariesCache;

	private File _haxePath;
	private File _nekoPath;
	
	private HaxeLib() throws HaxePathNotFoundException, HaxeLibNotFoundException, NekoPathNotFoundException {
		_initialize();
	}
	
	private void _initialize() throws HaxePathNotFoundException, HaxeLibNotFoundException, NekoPathNotFoundException {
		IHaxePreferences haxePreferences = HXEclipse.getHaxePreferences();
		
		_haxePath = new File(haxePreferences.getHaxePath());
		_nekoPath = new File(haxePreferences.getNekoPath());
		
		//get the haxelib absolute path
		File haxeLib;
		try {
			haxeLib = new File(_haxePath, FileUtils.getFile(_haxePath, "haxelib"));
		} catch (FileNotFoundException e) {
			throw new HaxeLibNotFoundException("Could not find the Haxe library tool", e);
		} 
		_haxeLibLocation = haxeLib.getAbsolutePath();
		
		
		//initialize the caches
		clearCache();
	}

	private void _execute(LineAppender appender, List<String> arguments) throws IOException {
		List<String> command = new ArrayList<String>(1 + arguments.size());
		command.add(_haxeLibLocation);
		command.addAll(arguments);
		
		ProcessBuilder processBuilder = new ProcessBuilder(command);
		//TODO file an issue so that normal environment variables can be used, for now execute in the dir of neko
		processBuilder.directory(_nekoPath);
		
		//set environment variables
		Map<String, String> environment = processBuilder.environment();
		environment.put("HAXEPATH", _haxePath.getAbsolutePath());
		environment.put("NEKO_INSTPATH", _nekoPath.getAbsolutePath());
		
		Process process = processBuilder.start();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line = null;
		while ((line = bufferedReader.readLine()) != null)
		{
			//let the appender handle the line
			appender.append(line);
		}
	}
	
	public void clearCache() {
		_libraryCache = new HashMap<String, CacheElement>();
		_installedLibrariesCache = new ArrayList<Library>();
		_availableLibrariesCache = new ArrayList<Library>();
	}
	
	public boolean isInstalled(String library) throws ParseException, IOException {
		return isInstalled(library, null);
	}
	
	public boolean isInstalled(String library, String version) throws ParseException, IOException {
		if (_installedLibrariesCache.size() == 0) {
			//call list to make certain all installed libraries are cached
			list();
		}
		
		if (_libraryCache.containsKey(library)) {
			CacheElement cacheElement = _libraryCache.get(library);
			
			if (cacheElement.hasInstalledInfo) {
				Library haxeLibrary = cacheElement.haxeLibrary;
				
				if (version == null) {
					if (!cacheElement.hasDetails) {
						//get the details
						info(library);
					}
					
					//check if the latest release is installed
					List<LibraryRelease> releases = haxeLibrary.getReleases();
					LibraryRelease lastRelease = releases.get(releases.size() - 1);
					return lastRelease.isInstalled();
				} else {
					//we need to check a specific version
					Iterator<LibraryRelease> releases = haxeLibrary.getReleases().iterator();
					
					while (releases.hasNext()) {
						LibraryRelease release = releases.next();
						if (release.getVersion().equals(version) && release.isInstalled()) {
							return true;
						}
					}
					return false;
				}
			} else {
				//we called list, the library should contain installed info, if not it's not installed
				return false;
			}
		} else {
			return false;
		}
	}
	
	/**
	 * Calls install(libarary, null)
	 * 
	 * @param library	The library to install
	 * 
	 * @return	The output of the haxelib tool
	 * 
	 * @throws IOException 
	 * @throws ParseException 
	 * 
	 * @see #install(String, String)
	 */
	public String install(String library) throws ParseException, IOException {
		return install(library, null);
	}
	
	/**
	 * Installs the given library with the given version. If no version has been given 
	 * the latest version is installed. If the library is allready installed this will 
	 * be reflected in the returned string.
	 * 
	 * @param library	The library to install
	 * @param version	The version of the library to install, if null the latest version
	 * 
	 * @return	The output of the haxelib tool or "You already have ${library} version ${version} installed"
	 * 
	 * @throws IOException 
	 * @throws ParseException 
	 * 
	 * @see #install(String, String)
	 */
	public String install(String library, String version) throws ParseException, IOException {
		/*
		 * we need to check if it's already installed if a version is given
		 */
		if (isInstalled(library, version)) {
			if (version == null) {
				//since we called isInstalled and version == null, info has been called for this library
				version = _libraryCache.get(library).haxeLibrary.getLatestVersion();
			}
			return "You already have " + library + " version " + version + " installed"; 
		} else {
			StringAppender appender = new StringAppender();
			
			List<String> searchArguments = new ArrayList<String>(3);
			searchArguments.add("install");
			searchArguments.add(library);
			if (version != null) {
				searchArguments.add(version);
			}
			
			_execute(appender, searchArguments);
			
			//update install information
			Library haxeLibrary;
			CacheElement cacheElement;
			
			//check the library cache
			if (_libraryCache.containsKey(library)) {
				cacheElement = _libraryCache.get(library);
				haxeLibrary = cacheElement.haxeLibrary;
			} else
			{
				haxeLibrary = new Library();
				haxeLibrary.setName(library);
				cacheElement = new CacheElement(haxeLibrary);
				_libraryCache.put(library, cacheElement);
			}
			
			//check releases
			List<LibraryRelease> releases = haxeLibrary.getReleases();
			
			if (releases == null) {
				releases = new ArrayList<LibraryRelease>();
				haxeLibrary.setReleases(releases);
			}
			
			if (version == null) {
				version = haxeLibrary.getLatestVersion();
			}
			
			//get the correct release
			LibraryRelease release = new LibraryRelease(haxeLibrary);
			release.setVersion(version);
			
			if (releases.contains(release)) {
				//get the original release
				release = releases.get(releases.indexOf(release));
			} else
			{
				releases.add(release);
			}
			
			boolean firstInstall = true;
			
			//check if we need to mark this one as current
			Iterator<LibraryRelease> iterator = releases.iterator();
			while (iterator.hasNext()) {
				if (iterator.next().isInstalled()) {
					firstInstall = false;
					break;
				}
			}
			
			if (firstInstall) {
				release.setCurrent(true);
			}

			//update installed information
			release.setInstalled(true);
			
			//update the installed libraries cache
			if (!_installedLibrariesCache.contains(haxeLibrary)) {
				_installedLibrariesCache.add(haxeLibrary);
			}
			
			return appender.getResult();
		}
	}
	
	/**
	 * Calls search("")
	 * 
	 * @return	A list of all installed libraries
	 * 
	 * @throws IOException
	 * 
	 * @see #search(String)
	 */
	public List<Library> search() throws IOException {
		return search("\"\"");
	}
	
	/**
	 * Searches the libraries for the given word. If an empty string is given all libraries 
	 * are returned.
	 * 
	 * @param word	The word to search for
	 * 
	 * @return	A list of all installed libraries
	 * 
	 * @throws IOException
	 * 
	 * @see #search(String)
	 */	
	public List<Library> search(String word) throws IOException {
		
		boolean allLibraries = (word == null || word.length() == 0);
		
		if (allLibraries && _availableLibrariesCache.size() > 0) {
			return _availableLibrariesCache;
		} else {
			LibraryAppender appender = new LibraryAppender();
			
			//TODO fix all other calls in this file
			List<String> searchArguments = new ArrayList<String>(2);
			searchArguments.add("search");
			searchArguments.add(word);
			
			_execute(appender, searchArguments);
			
			List<Library> result = appender.getResult();
			
			//remove the last entry, it says: X projects found
			int size = result.size();
			if (size > 0)
			{
				result.remove(size - 1);
			}
			
			if (allLibraries) {
				_availableLibrariesCache.addAll(result);
			}
			
			return result;
		}
	}
	
	/**
	 * Queries the haxelib tool for information about the given library
	 * 
	 * @param library	The library to request information for
	 * 
	 * @return	A filled instance of HaxeLibrary
	 * 
	 * @throws ParseException
	 * @throws IOException 
	 */
	public Library info(String library) throws ParseException, IOException {
		Library haxeLibrary = null;
		CacheElement cacheElement = null;
		
		boolean getInfo = true;
		boolean inCache = _libraryCache.containsKey(library);
		
		if (inCache) {
			//we have a cached instance
			cacheElement = _libraryCache.get(library);
			haxeLibrary = cacheElement.haxeLibrary;
			//we dont need to get info if we already have them
			getInfo = !cacheElement.hasDetails;
		}

		if (getInfo) {
			StringAppender appender = new StringAppender();
			
			List<String> searchArguments = new ArrayList<String>(2);
			searchArguments.add("info");
			searchArguments.add(library);
			
			_execute(appender, searchArguments);
			
			Library haxeLibraryDetails = StringUtils.createHaxeLibrary(appender.getResult());
			
			if (inCache) {
				//update the cached version
				haxeLibrary.setDescription(haxeLibraryDetails.getDescription());
				haxeLibrary.setLicense(haxeLibraryDetails.getLicense());
				haxeLibrary.setOwner(haxeLibraryDetails.getOwner());
				haxeLibrary.setTags(haxeLibraryDetails.getTags());
				haxeLibrary.setVersion(haxeLibraryDetails.getLatestVersion());
				haxeLibrary.setWebsite(haxeLibraryDetails.getWebsite());
				
				//we need to update any existing releases
				List<LibraryRelease> releases = haxeLibrary.getReleases();
				
				if (releases == null) {
					releases = new ArrayList<LibraryRelease>();
					haxeLibrary.setReleases(releases);
				}
				
				Iterator<LibraryRelease> releaseDetails = haxeLibraryDetails.getReleases().iterator();
				while (releaseDetails.hasNext()) {
					LibraryRelease release = releaseDetails.next();
					if (releases.contains(release)) {
						//we allready have this release, update it
						LibraryRelease originalRelease = releases.get(releases.indexOf(release));
						originalRelease.setDate(release.getDate());
						originalRelease.setDescription(release.getDescription());
					} else
					{
						releases.add(release);
					}
				}
				
				
			} else {
				//the library is not yet cached. Cache it now
				cacheElement = new CacheElement(haxeLibraryDetails);
				_libraryCache.put(library, cacheElement);
				
				haxeLibrary = haxeLibraryDetails;
			}
			cacheElement.hasDetails = true;
		}
		
		return haxeLibrary;
	}
	
	/**
	 * Lists the installed libraries
	 * 
	 * @return	A list of installed libraries
	 * 
	 * @throws IOException 
	 */
	public List<Library> list() throws IOException {
		if (_installedLibrariesCache.size() > 0) {
			return _installedLibrariesCache;
		} else {
			LibraryAppender appender = new LibraryAppender();
			
			List<String> searchArguments = new ArrayList<String>(1);
			searchArguments.add("list");
			
			_execute(appender, searchArguments);
			
			List<Library> result = appender.getResult();
			
			_installedLibrariesCache = result;
			
			return result;
		}
		
	}
	
	/**
	 * Calls remove(library, null)
	 * 
	 * @param library	The library to remove
	 * 
	 * @return	The output from the haxelib tool
	 * 
	 * @throws IOException 
	 * 
	 * @see #remove(String, String)
	 */
	public String remove(String library) throws IOException {
		return remove(library, null);
	}
	
	/**
	 * Removes the given library 
	 * 
	 * @param library	The library to remove
	 * @param version	The version of the library to remove, null if all versions should be removed
	 * 
	 * @return	The output from the haxelib tool
	 * 
	 * @throws IOException 
	 */
	public String remove(String library, String version) throws IOException {
		
		if (_libraryCache.containsKey(library)) {
			//remove the library version(s) from the caches
			CacheElement cacheElement = _libraryCache.get(library);
			
			Library haxeLibrary = cacheElement.haxeLibrary;
			Iterator<LibraryRelease> releases = haxeLibrary.getReleases().iterator();
			
			LibraryRelease release;
			
			if (version == null) {
				//we remove them all
				while (releases.hasNext()) {
					release = releases.next();
					
					if (release.isCurrent()) {
						release.setCurrent(false);
					}
					
					if (release.isInstalled()) {
						release.setInstalled(false);
					}
				}
				
				_installedLibrariesCache.remove(haxeLibrary);
			} else {
				boolean hasInstalledVersion = false;
				boolean removedVersion = false;
				
				while (releases.hasNext())
				{
					release = releases.next();
					
					if (!removedVersion && release.getVersion().equals(version)) {
						release.setInstalled(false);
						removedVersion = true;
					}
					
					if (!hasInstalledVersion && release.isInstalled()) {
						hasInstalledVersion = true;
					}
					
					if (hasInstalledVersion && removedVersion) {
						break;
					}
				}
				
				if (!hasInstalledVersion) {
					_installedLibrariesCache.remove(haxeLibrary);
				}
			}
		}
		
		StringAppender appender = new StringAppender();
		
		System.out.println("calling 'remove " + library + (version == null ? "" : " " + version) + "'");
		
		List<String> searchArguments = new ArrayList<String>(3);
		searchArguments.add("remove");
		searchArguments.add(library);
		if (version != null) {
			searchArguments.add(version);
		}
		
		_execute(appender, searchArguments);
		
		System.out.println(appender.getResult());
		return appender.getResult();
	}
	
	/**
	 * Sets the given version of the given library to the current version
	 * 
	 * @param library	The library of which the version should be set
	 * @param version	The version of the library that should be set current
	 * 
	 * @return	The result of the haxelib tool
	 * 
	 * @throws IOException
	 */
	public String set(String library, String version) throws IOException {
		
		if (_libraryCache.containsKey(library)) {
			//remove the library version(s) from the caches
			CacheElement cacheElement = _libraryCache.get(library);
			
			Library haxeLibrary = cacheElement.haxeLibrary;
			
			Iterator<LibraryRelease> iterator = haxeLibrary.getReleases().iterator();
			
			while (iterator.hasNext()) {
				LibraryRelease haxeLibraryRelease = iterator.next();
				
				if (haxeLibraryRelease.isCurrent()) {
					haxeLibraryRelease.setCurrent(false);
				}
				
				if (haxeLibraryRelease.getVersion().equals(version)) {
					haxeLibraryRelease.setCurrent(true);
				}
			}
		}
			
		StringAppender appender = new StringAppender();
		
		List<String> searchArguments = new ArrayList<String>(3);
		searchArguments.add("set");
		searchArguments.add(library);
		searchArguments.add(version);
		
		_execute(appender, searchArguments);
		
		return appender.getResult();
	}
	
	/**
	 * Generic interface for appending lines
	 */
	interface LineAppender {
		void append(String line);
	}
	
	/**
	 * Implementation that appends the lines to a string. A \n is used as separator 
	 * between each line.
	 */
	class StringAppender implements LineAppender {
		private StringBuilder _result = new StringBuilder();
		
		@Override
		public void append(String line) {
			_result.append(line);
			_result.append("\n");
		}
		
		public String getResult() {
			return _result.toString();
		}
	}
	
	/**
	 * A special appender that returns a list of libraries.
	 */
	class LibraryAppender implements LineAppender {
		private ArrayList<Library> _arrayList = new ArrayList<Library>();
		
		@Override
		public void append(String line) {
			String[] split = line.split("(: |:)");
			
			String library = split[0];

			boolean inCache = _libraryCache.containsKey(library);
			
			Library haxeLibrary;
			CacheElement cacheElement;
			
			if (inCache)
			{
				cacheElement = _libraryCache.get(library);
				haxeLibrary =  cacheElement.haxeLibrary;
			} else
			{
				haxeLibrary = new Library();
				haxeLibrary.setName(library);
				cacheElement = new CacheElement(haxeLibrary);
				_libraryCache.put(library, cacheElement);
			}
			
			_arrayList.add(haxeLibrary);
			
			if (split.length > 1) {
				//we are dealing with installed versions
				String versions = split[1];
				String[] versionsSplit = versions.split(" ");
				
				//get the releases
				List<LibraryRelease> releases = haxeLibrary.getReleases();
				if (!inCache || releases == null) {
					releases = new ArrayList<LibraryRelease>(versionsSplit.length);
					haxeLibrary.setReleases(releases);
				}
				LibraryRelease haxeLibraryRelease;
				
				boolean current;
				
				//check for each version
				for (String version : versionsSplit) {
					
					current = version.startsWith("[");
					
					if (current)
					{
						version = version.substring(1, version.length() - 1);
					}
					
					haxeLibraryRelease = new LibraryRelease(haxeLibrary);
					haxeLibraryRelease.setVersion(version);
					
					if (releases.contains(haxeLibraryRelease)) {
						//get the real release
						haxeLibraryRelease = releases.get(releases.indexOf(haxeLibraryRelease));
					} else {
						releases.add(haxeLibraryRelease);
					}
					haxeLibraryRelease.setInstalled(true);
					haxeLibraryRelease.setCurrent(current);
				}
				
				cacheElement.hasInstalledInfo = true;
			}
		}
		
		public List<Library> getResult() {
			return _arrayList;
		}
	}
	
	private class CacheElement {
		public Library haxeLibrary;
		public boolean hasDetails;
		public boolean hasInstalledInfo;
		
		public CacheElement(Library haxeLibrary) {
			this.haxeLibrary = haxeLibrary;
		}
	}
}
