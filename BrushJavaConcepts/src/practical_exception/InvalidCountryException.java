package practical_exception;
public class InvalidCountryException extends Exception
{
	public InvalidCountryException(final String  message) {
		super(message);
	}
	
	public InvalidCountryException(final Throwable  Exception) {
		super(Exception);
	}
	
	
	public InvalidCountryException(final String  message,final Throwable  Exception) {
		super(message,Exception);
	}
	
	
}