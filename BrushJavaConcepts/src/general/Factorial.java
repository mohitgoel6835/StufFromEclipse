package general;

public class Factorial {

	public static void main(String[] args) {
		factorail(8);

	}

	private static void factorail(int num) {

		int x = num;
		int a = 1;
		for (int i = 1; i <= x; i++) {
			a = a * i;
		}
		System.out.println(a);
	}

}
