package general;

public class Prime {
	public static void main(String[] args) {

		//identifyprimenumber();
		listofprimenumber();
		//identifyevennumber();
		//listofevennumber();
	}

	private static void identifyprimenumber() {
		int num = 4;
		int count = 0;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {

				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}

	}

	private static void listofprimenumber() {

		int num = 100;

		for (int i = 1; i < num; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;

				}
			}

			if (count == 0) {
				System.out.print(i + " ");
			}
		}

	}


	private static void identifyevennumber() {
		int num = 1000;

		if (num % 2 == 0) {
			System.out.println(num + " is a even number");
		} else {
			System.out.println(num + " is a not an even number");
		}
	}
	private static void listofevennumber() {
		int num=100,count=0;
		
		for (int i = 1; i <=num; i++) {
			if(i%2==0)
			{
				System.out.print(i + " " );
				count++;
			}
			
		}
		System.out.println();
		System.out.println("total even number from 1 to "+num + " is "+ count);
	}
	
}
