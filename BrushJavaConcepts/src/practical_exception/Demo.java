package practical_exception;
public class Demo {
public int divisor;
public int dividend;
int result=0;
public int division() throws ArithmeticException{
	
//	if(result==0){
//	throw new	ArithmeticException("divisor cant be zero");
//	}
	 result=dividend/divisor;
	return result;
	
	
}
}
