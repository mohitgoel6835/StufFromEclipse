package general;

public class Palindrome {
	public static void main(String[] args) {
		 identifypalindromenumber();
		 reverseanumber();
		//listofpalindrome();
	}

	private static void listofpalindrome() {
		int temp;
		int num = 1000;
		int a = 0, c;

		for (int i = 1; i <= num; i++) {
			temp = i;
			while (temp > 0) {
				c = temp % 10;
				a = c + (a * 10);
				// System.out.println(a);
				temp = temp / 10;

			}
			if (a == i) {
				System.out.print(i + " , ");
			}
			a = 0;
		}

	}

	private static void identifypalindromenumber() {

		int a, temp;
		int c = 0;
		int num = 454;
		temp = num;

		while (num > 0) {
			a = num % 10;
			c = (c * 10) + a;
			num = num / 10;
		}
		//System.out.println("===============>"+c);
		if (c == temp) {
			System.out.println(temp + " is a palindrome");
		} else {
			System.out.println(temp + " is not a palindrome");
		}

	}
	
	private static void reverseanumber() {
		int num=153;
		int temp=num;
		int a = 0 ;
		int c=0;
		//for palindrone and revers a number
		/*while(num>0){
			c=(c*10)+(num%10);
			num=num/10;
			
			
		}*/
		
		
		while(num>0){
			a=num%10;
			c=c+(a*a*a);
			num=num/10;
			
			
			
			
		}if(temp==c){System.out.println(" number is armstrong =========="+c);}
	
		}

	}
	

