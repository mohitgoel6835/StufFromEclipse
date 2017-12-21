package practical_exception;
public class UserRegisteration {
	
public void registerProfile(String userName , int age,String country) throws 
InvalidCountryException,InvalidAgeException
{
	if(!"India".equals(country)){
		
throw new InvalidCountryException("User outside India cant be registered");

	}
	if(age<18)
	{
		throw new InvalidAgeException("User is a minor");
	}


}
	
	public static void main(String[] args) {
		UserRegisteration userReg=new UserRegisteration(); 
		
		try {
			userReg.registerProfile("John",5,"India");
			//userReg.registerProfile("John",18,"h");
		} catch (InvalidCountryException ice) {
			System.out.println(ice.getMessage());
			
		}
		catch (InvalidAgeException iae) {
			System.out.println(iae.getMessage());
			
		}
		
	}
}
