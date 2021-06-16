package exceptions;

public class ArgumentNullException extends ArgumentException {
	public ArgumentNullException(String argName) {
		super("Argument \"" + argName + "\" cannot be null");
	}
}
