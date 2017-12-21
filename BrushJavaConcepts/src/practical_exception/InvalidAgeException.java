package practical_exception;
public class InvalidAgeException extends Exception
{
	public InvalidAgeException(final String  message) {
		super(message);
	}
	
	public InvalidAgeException(final Throwable  Exception) {
		super(Exception);
	}
	
	
	public InvalidAgeException(final String  message,final Throwable  Exception) {
		super(message,Exception);
	}
	
	
}