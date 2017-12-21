package general;

public class Swap2Nos {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a====BEFORE=====>"+a);

		System.out.println("b====BEFORE=====>"+b);
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		System.out.println("a====AFTER=====>"+a);

		System.out.println("b====AFTER=====>"+b);
	}
	

}
