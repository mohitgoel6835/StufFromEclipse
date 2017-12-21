package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFromArray {
	public static void main(String[] args) {
		//stringarraytoarraylist();
		integergarraytoarraylist();

	}

	
	private static void integergarraytoarraylist() {
		int[] intarray = { 1,2,3,4,5 };
		System.out.println(Arrays.toString(intarray));
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList());
		System.out.println(arrayList);
	}
	private static void stringarraytoarraylist() {
		String[] stringArray = { "a", "b", "c", "d", "e" };
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);
	}
}
