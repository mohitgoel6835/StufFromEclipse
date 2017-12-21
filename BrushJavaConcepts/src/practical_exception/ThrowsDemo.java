package practical_exception;
public class ThrowsDemo{
public static void main(String[] args) {
	Demo demo =new Demo();
	int result =0;
	try {
		demo.dividend=8;
		demo.divisor=0;
		result=demo.division();
	} catch (ArithmeticException e) {
//e.printStackTrace();
//System.out.println(e.getMessage());
System.out.println("ArithmeticException is thrown");
	}
	finally{
		System.out.println("result is : "+result);
	}
}
}
