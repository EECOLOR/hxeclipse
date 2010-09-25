package hxeclipse.core.compiler;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxePreferences;
import hxeclipse.core.IHaxeProject;
import hxeclipse.core.exceptions.HaxeCompileException;
import hxeclipse.core.exceptions.HaxeNotFoundException;
import hxeclipse.core.exceptions.HaxePathNotFoundException;
import hxeclipse.core.exceptions.NekoPathNotFoundException;
import hxeclipse.core.extensions.IHaxeTargetDescription;
import hxeclipse.core.utils.FileUtils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;

public class HaxeCompiler {
	
	private String _getHaxeLocation() throws HaxeNotFoundException, HaxePathNotFoundException {
		File haxePath = new File(HXEclipse.getHaxePreferences().getHaxePath());
		
		//get the haxelib absolute path
		File haxeLib;
		try {
			haxeLib = new File(haxePath, FileUtils.getFile(haxePath, "haxe"));
		} catch (FileNotFoundException e) {
			throw new HaxeNotFoundException("Could not find Haxe", e);
		} 
		return haxeLib.getAbsolutePath();
	}	
	
	private BufferedReader _getBufferedReader(InputStream inputStream) {
		return new BufferedReader(new InputStreamReader(new BufferedInputStream(inputStream)));
	}
	
    private void _executeProcess(Process process, StringBuilder outputStringBuilder, StringBuilder errorStringBuilder) {
    
		BufferedReader errorReader = _getBufferedReader(process.getErrorStream());
		BufferedReader outputReader = _getBufferedReader(process.getInputStream());
		
		Thread errorReaderThread = new ReaderThread(errorReader, errorStringBuilder, false);
		Thread outputReaderThread = new ReaderThread(outputReader, outputStringBuilder);
		
		outputReaderThread.start();
		errorReaderThread.start();
    
		try {
			outputReaderThread.join();
			errorReaderThread.join();
			process.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}		
	
	private String _execute(File workingDirectory, List<String> arguments) throws IOException, HaxeNotFoundException, HaxePathNotFoundException, NekoPathNotFoundException, HaxeCompileException {
		IHaxePreferences haxePreferences = HXEclipse.getHaxePreferences();
		
		List<String> command = new ArrayList<String>(1 + arguments.size());
		command.add(_getHaxeLocation());
		command.addAll(arguments);
		
		ProcessBuilder processBuilder = new ProcessBuilder(command);
		processBuilder.directory(workingDirectory);
		
		//set environment variables
		Map<String, String> environment = processBuilder.environment();
		environment.put("HAXEPATH", haxePreferences.getHaxePath());
		environment.put("NEKO_INSTPATH", haxePreferences.getNekoPath());
		
		Process process = processBuilder.start();

		StringBuilder result = new StringBuilder();
		StringBuilder error = new StringBuilder();
		
		_executeProcess(process, result, error);
		
		if (error.length() > 0) {
			throw new HaxeCompileException(error.toString());
		}
		
		return result.toString();
	}
	
	public List<String> compileProject(IHaxeProject haxeProject) throws CoreException {
		List<IHaxeTargetDescription> targetDescriptions = haxeProject.getProjectDescription().getTargetDescriptions();
		List<String> result = new ArrayList<String>(targetDescriptions.size());
		
		Iterator<IHaxeTargetDescription> iterator = targetDescriptions.iterator();
		
		List<IStatus> statusses = new ArrayList<IStatus>();
		
		while (iterator.hasNext()) {
			Exception exception = null;
			
			IHaxeTargetDescription targetDescription = iterator.next();
			try {
				File workingDirectory = haxeProject.getProject().getLocation().toFile();
				List<String> commandLineArguments = targetDescription.getCommandLineArguments(haxeProject);

				String targetCompileResult = _execute(workingDirectory, commandLineArguments);
				
				result.add(targetCompileResult);
			} catch (IOException e) {
				exception = e;
			} catch (HaxeNotFoundException e) {
				exception = e;
			} catch (HaxePathNotFoundException e) {
				exception = e;
			} catch (NekoPathNotFoundException e) {
				exception = e;
			} catch (HaxeCompileException e) {
				exception = e;
			}
			
			if (exception != null) {
				IStatus status = new MultiStatus(HXEclipse.PLUGIN_ID, IResourceStatus.BUILD_FAILED, "The was a problem compiling target '" + targetDescription.getHaxeTarget().getName() + "'", exception);
				statusses.add(status);
			}
		}
		
		if (statusses.size() > 0) {
			IStatus[] statussesArray = statusses.toArray(new IStatus[statusses.size()]);
			MultiStatus multiStatus = new MultiStatus(HXEclipse.PLUGIN_ID, IResourceStatus.BUILD_FAILED, statussesArray, "Haxe compilation failed", null);
			throw new CoreException(multiStatus);
		}
		
		return result;
	}
	
	private class ReaderThread extends Thread {
		private BufferedReader _reader;
		private StringBuilder _stringBuilder;
		private boolean _includeEmptyLines;
		
		public ReaderThread(BufferedReader reader, StringBuilder stringBuilder) {
			this(reader, stringBuilder, true);
		}
		
		public ReaderThread(BufferedReader reader, StringBuilder stringBuilder, boolean includeEmptyLines) {
			_reader = reader;
			_stringBuilder = stringBuilder;
			_includeEmptyLines = includeEmptyLines;
		}
		
        @Override
        public void run() {
            try {
            	boolean readLine = false;
                while (true) {
                    String line = _reader.readLine();
                    
                    if (line == null) {
                    	break;
                    } else {
                    	if (readLine) {
                    		_stringBuilder.append("\n");
                    	}
                    	
                    	if (_includeEmptyLines || line.length() > 0) {
                    		_stringBuilder.append(line);
                    		readLine = true;
                    	} else
                    	{
                    		readLine = false;
                    	}
                    }
                }
            } catch (IOException e) {
            	e.printStackTrace();
            }                               
        }
	}
}

