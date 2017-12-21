package strings;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateCharacterFromString {

	public static void  removeDuplicateCharacter(String input) {
		String st = "";
		char[] array= input.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
			if(array[i]!=array[j]){
				st=st+array[i];
				
			}	
			}
		}
		
		System.out.println(st);
		
		
	}

	public static void main(String[] args) {
		removeDuplicateCharacter("bananas");

	}

}
