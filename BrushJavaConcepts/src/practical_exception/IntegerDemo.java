package practical_exception;
public class IntegerDemo {
	public static void main(String[] args) {
		int test = 45000;
		String test1 = "100";
		int test2 = 100;
		// primitive to wrapper
		Double salary = new Double("5.0d");
		System.out.println("from wrapper" + salary);
		// wrapper to primitive
		double sal = salary.doubleValue();
		System.out.println("from primitive" + sal);
		// converting string 45000 into integer value
		int stoi = Integer.parseInt("45000");
		if (test == stoi)
		{
			System.out.println("converted to integer");
		}
		// convertig int to string
		String itos = Integer.toString(100);
		if (itos.equals(test1))
		{
			System.out.println("converted to string");
		}
		//integer wrapper class
		Integer val1= new Integer(21122);
		Integer val2= new Integer(43222);
		
		int intval1=val1.intValue();
		System.out.println("the int value of integer " +val1 +"is"+intval1);
		
		long longval1=val1.longValue();
		System.out.println("the long  value of integer " +val1 +"is"+longval1);
		
		int compareValues=val1.compareTo(val2);
		System.out.println(compareValues);
		if(compareValues>0)
		{
			System.out.println("val1  is greatr val2");
					}
		else
		{
			System.out.println("val2  is greatr val1");
			
		}
		
		System.out.println("the maximunm values  of an int can hold is "+val1.MAX_VALUE);
		System.out.println("the minimum values  of an int can hold is "+val1.MIN_VALUE);
		
String str="1234";
int num=Integer.parseInt(str);
int finalValue=num+100;
System.out.println("-->"+finalValue);

//Boolean wrapper class
Boolean val11=new Boolean(true);
Boolean val12=new Boolean(false);
System.out.println("hashcode of val11 "+val11.hashCode());
System.out.println("hashcode of val11 "+val12.hashCode());


	}
	
	
}
