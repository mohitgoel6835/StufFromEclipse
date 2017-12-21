package strings;

public class VerifyIsStringContainsAllDigits {

	public static void main(String[] args) {
		IsStringContainsAllDigits("6767676AAA7678989");

	}

	public static void IsStringContainsAllDigits(String input) {

		String str = "134567890";
		char[] ch = input.toCharArray();
		int count = 0;
		int length = input.length();
		for (char c : ch) {
			String st = Character.toString(c);
			if (str.contains(st)) {
				count++;

			}

		}

		if (count == length) {
			System.out.println("input string contaons all digits");
		}
		else if (count>0 && count <length){
			System.out.println("input string contaons  digits and numerals both");
		}

	}
}
