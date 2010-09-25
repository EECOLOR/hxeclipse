package hxeclipse.core.project;

import hxeclipse.core.HXEclipse;
import hxeclipse.core.IHaxeProject;
import hxeclipse.core.exceptions.HaxeCompileException;

import java.util.HashSet;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.editors.text.TextFileDocumentProvider;

public class HaxeProjectBuilder extends IncrementalProjectBuilder {

	private ProblemMarkerCreator[] problemMarkerCreators;
	private TextFileDocumentProvider _textFileDocumentProvider;
	
	public HaxeProjectBuilder() {
		_createPatterns();
		_textFileDocumentProvider = new TextFileDocumentProvider();
	}

	private void _createPatterns() {
		//src/Main.hx:2: characters 15-19 : Unexpected void
		Pattern syntaxExceptionPattern = Pattern.compile("^(.*?):(\\d+): characters (\\d+)-(\\d+) : (.*)$");
		//src/Main.hx:19: lines 19-21 : Test should be Void
		Pattern blockSyntaxExceptionPattern = Pattern.compile("^(.*?):(\\d+): lines (\\d+)-(\\d+) : (.*)$");
		//src/TestClass.hx:3: character 0 : Unexpected <end of file>
		Pattern structureExceptionPattern = Pattern.compile("^(.*?):(\\d+): character (\\d+) : (.*)$");
		
		problemMarkerCreators = new ProblemMarkerCreator[] {
				new DefaultProblemMarkerCreator(syntaxExceptionPattern),
				new BlockProblemMarkerCreator(blockSyntaxExceptionPattern),
				new StructureProblemMarkerCreator(structureExceptionPattern)
		};
	}

	@Override
	protected IProject[] build(int kind, @SuppressWarnings("rawtypes") Map args, IProgressMonitor monitor) throws CoreException {
		
		System.out.println("build");
		
		IProject project = getProject();
		
		//remove any markers
		project.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
		
		IHaxeProject haxeProject = (IHaxeProject) project.getAdapter(IHaxeProject.class);
		try
		{
			HXEclipse.getCompiler().compileProject(haxeProject);
			
			//refresh the output folder
			haxeProject.getOutputFolder().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			IStatus status = e.getStatus();
			
			if (status instanceof MultiStatus)
			{
				IStatus[] children = status.getChildren();
				
				for (IStatus childStatus : children) {
					Throwable exception = childStatus.getException();
					if (exception instanceof HaxeCompileException) {
						//we need to add a marker
						_addExceptionMarker((HaxeCompileException) exception, haxeProject);
					} else {
						throw e;
					}
				}
				
			} else
			{
				throw e;
			}
		}
			
		return null;
	}

	private void _addExceptionMarker(HaxeCompileException exception, IHaxeProject haxeProject) throws CoreException {
		String message = exception.getMessage();
		IProject project = haxeProject.getProject();
		
		IMarker marker;
		
		System.out.println("Creating markers for:\n|" + message + "|");
		
		HashSet<String> _createdMarkers = new HashSet<String>();
		
		//check for syntax exception
		String[] problems = message.split("\n");
		
		for (String problem : problems) {
			if (!_createdMarkers.contains(problem)) {
				_createdMarkers.add(problem);
				
				boolean foundMatch = false;
				
				for (ProblemMarkerCreator problemMarkerCreator : problemMarkerCreators) {
					
					if (problemMarkerCreator.canCreate(problem))
					{
						problemMarkerCreator.create(project);
						
						foundMatch = true;
						break;
					}
				}
				
				if (!foundMatch)
				{
					marker = project.createMarker(HXEclipse.HAXE_PROBLEM_MARKER);
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
					marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
					marker.setAttribute(IMarker.MESSAGE, message);
				}
			}
		}
	}

	public void _addHaxeProblemMarker(IProject project, MatchResult matchResult) throws CoreException {

	}

	private abstract class ProblemMarkerCreator {
		protected int CLASS_FILE = 1;
		protected int LINE_NUMBER = 2;
		protected int RANGE_START = 3;
		protected int RANGE_END = 4;
		protected int MESSAGE = 5;
		
		private Pattern _pattern;
		private Matcher _matcher;
		
		public ProblemMarkerCreator(Pattern pattern) {
			_pattern = pattern;
		}
		
		public boolean canCreate(String problem) {
			_matcher = _pattern.matcher(problem);
			return _matcher.matches();
		}
		
		public void create(IProject project) throws CoreException {
			MatchResult matchResult = _matcher.toMatchResult();
			IPath classFilePath = new Path(matchResult .group(CLASS_FILE));
			IFile classFile = project.getFile(classFilePath);
			
			//connect to a document provider in order to get line information
			_textFileDocumentProvider.connect(classFile);
			IDocument classFileDocument = _textFileDocumentProvider.getDocument(classFile);
			
			int lineNumber = Integer.parseInt(matchResult.group(LINE_NUMBER)) - 1;
			
			IMarker marker = classFile.createMarker(HXEclipse.HAXE_PROBLEM_MARKER);
			marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber + 1);
			marker.setAttribute(IMarker.MESSAGE, matchResult.group(MESSAGE));
			
			try {
				setCharacterPositions(marker, matchResult, classFileDocument, lineNumber);
			} catch (BadLocationException e) {
				IStatus status = new Status(IStatus.ERROR, HXEclipse.PLUGIN_ID, "Problem retrieving line offset", e);
				throw new CoreException(status);
			}
		}
		
		protected abstract void setCharacterPositions(IMarker marker, MatchResult matchResult, IDocument classFileDocument, int lineNumber) throws CoreException, BadLocationException;
	}
	
	private class DefaultProblemMarkerCreator extends ProblemMarkerCreator {
		public DefaultProblemMarkerCreator(Pattern pattern) {
			super(pattern);
		}

		@Override
		protected void setCharacterPositions(IMarker marker, MatchResult matchResult, IDocument classFileDocument, int lineNumber) throws CoreException, BadLocationException {
			int lineOffset = classFileDocument.getLineOffset(lineNumber);
			
			int charStart = lineOffset + Integer.parseInt(matchResult.group(RANGE_START));
			int charEnd = lineOffset + Integer.parseInt(matchResult.group(RANGE_END));
			
			marker.setAttribute(IMarker.CHAR_START, charStart);
			marker.setAttribute(IMarker.CHAR_END, charEnd);			
		}
	}
	
	private class BlockProblemMarkerCreator extends ProblemMarkerCreator {
		public BlockProblemMarkerCreator(Pattern pattern) {
			super(pattern);
		}
		
		@Override
		protected void setCharacterPositions(IMarker marker, MatchResult matchResult, IDocument classFileDocument, int lineNumber) throws CoreException, BadLocationException {
			//int lineStart = Integer.parseInt(matchResult.group(RANGE_START));
			//int lineEnd = Integer.parseInt(matchResult.group(RANGE_END));
			
			int charStart = classFileDocument.getLineOffset(lineNumber);
			int charEnd = charStart + classFileDocument.getLineLength(lineNumber);
			
			//TODO select function or class more nicely, this can only be done once we have a document model
			marker.setAttribute(IMarker.CHAR_START, charStart);
			marker.setAttribute(IMarker.CHAR_END, charEnd);			
		}
	}
	
	private class StructureProblemMarkerCreator extends ProblemMarkerCreator {

		public StructureProblemMarkerCreator(Pattern pattern) {
			super(pattern);
			MESSAGE = MESSAGE - 1;
		}

		@Override
		protected void setCharacterPositions(IMarker marker, MatchResult matchResult, IDocument classFileDocument, int lineNumber) throws CoreException, BadLocationException {
			//not implemented
		}
		
	}
}

