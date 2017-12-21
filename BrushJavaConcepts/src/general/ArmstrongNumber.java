package general;

public class ArmstrongNumber {
	public static void main(String[] args) {
		identifyarmstrongnumber();
		//printlistofarmstrongnumber();
	}

	private static void printlistofarmstrongnumber() {
		int n, a = 0, c;
		for (int i = 1; i <= 1000; i++) {
			n = i;
			while (n > 0) {

				c = n % 10;
				a = a + (c * c * c);
				n=n/10;

			}
			if (a == i) {
				System.out.println(i+" ");

			}a=0;
		}
	}

	private static void identifyarmstrongnumber() {

		int num = 153;
		int add = 0;
		int remain;
		int temp;

		temp = num;
		while (num > 0) {
			remain = num % 10;
			num = num / 10;
			add = add + (remain * remain * remain);

		}
		if (temp == add) {
			System.out.println("NUMBER IS ARMSTRONG");

		} else {

			System.out.println("NUMBER IS NOT ARMSTRONG");
		}

	}
}
