package hxeclipse.core.exceptions;

public class HaxeCompileException extends Exception {

	private static final long serialVersionUID = 1L;

	public HaxeCompileException() {
	}

	public HaxeCompileException(String message) {
		super(message);
	}

	public HaxeCompileException(Throwable cause) {
		super(cause);
	}

	public HaxeCompileException(String message, Throwable cause) {
		super(message, cause);
	}

}
