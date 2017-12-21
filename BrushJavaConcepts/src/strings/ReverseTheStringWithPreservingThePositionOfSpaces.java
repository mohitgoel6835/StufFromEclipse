package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseTheStringWithPreservingThePositionOfSpaces {
public static void main(String[] args) throws IOException {
reverseString("I Am Not String");
reverseString("JAVA JSP ANDROID");

reverseString("1 22 333 4444 55555");
reverseString("Java Concept Of The Day");

}

private static void reverseString(String str) {
	/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String s = reader.readLine();*/
	String s=str;
	StringBuilder sb = new StringBuilder(s);
	
	
	String revS = new StringBuilder(s.replaceAll(" ", "")).reverse().toString();
	
	
	//System.out.println(revS);
	int c = 0;
	for (int i = 0; i < s.length(); i++) {
	if (sb.charAt(i) != ' ')	
	{
	sb.setCharAt(i, revS.charAt(c));
	
	c++;
	}
	}
	
	System.out.println(sb);
}
}