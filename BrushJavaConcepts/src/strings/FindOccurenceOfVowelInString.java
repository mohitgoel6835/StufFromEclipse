package strings;

import java.util.HashMap;

public class FindOccurenceOfVowelInString {

	public static void FindOccurenceOfVowel() {
		String vowel = "aeiou";
		String input = "Co-ordinate with team member to set up the testing environment".toLowerCase();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		

		char[] arr = input.toCharArray();

		for (char c : arr) {
			String st = Character.toString(c);
			if (vowel.contains(st)) {

				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);

				} else {
					map.put(c, 1);
				}

			}
		}

		System.out.println(map);

	}

		public static void main(String[] args) {
		FindOccurenceOfVowel();

	}

}
