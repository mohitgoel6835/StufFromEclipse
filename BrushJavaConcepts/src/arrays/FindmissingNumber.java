package arrays;

public class FindmissingNumber {

	public static void main(String[] args) {
		findmissingnumber();
	}
	private static void findmissingnumber( ) {
		int [] arr={1,2,3,4,5,7,8,9,10};
		int a=0;
		int x=0;int n=10;
		
		for (int i = 0; i <=arr.length-1; i++) {
			a=a+arr[i];
		}
		System.out.println("==a===>"+a);
		
		while(n>0)
		{
			x=x+n;
			n--;
		}
		System.out.println("==x===>"+x);
		System.out.println("missing number is "+(x-a));
	}
}
