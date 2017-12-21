package strings;

public class BiggestSubstring {

	public static void main(String[] args) {
		biggestSubstring("I am Programmer dd cvxcxc  ABCDEFGHIJKLM");
	}

	public static void biggestSubstring(String input) {
		String[] str = input.split(" ");
		int maxlen = 1;
		String temp = "";
		for (int i = 0; i < str.length; i++) {

			if (str[i].length() > maxlen) {
				maxlen = str[i].length();
				temp = str[i];
			}
		}
		System.out.println("======" + temp);
	}
}
