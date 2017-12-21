package arrays;

public class TopTwoNumbersInarray {
	public static void main(String[] args) {
		toptwonumber();
		
	}

	private static void toptwonumber() {

		int[] arr = { 9, 2, 3, 100, 5, 6, 7, 8 };
		int maxnum = arr[0];
		int secondmax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxnum) {
				secondmax = maxnum;
				maxnum = arr[i];

			} else if (arr[i] > secondmax)
				secondmax = arr[i];

		}
		System.out.println("maxnum" + maxnum);
		System.out.println("secondmax" + secondmax);
	}
	
	
}


