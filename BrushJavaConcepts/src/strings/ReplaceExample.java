package strings;

import java.util.HashSet;
import java.util.Set;

public class ReplaceExample {

	
	public static void main(String[] args) {
		String str= "Java is Great";
		str.replaceAll(" ", "%20");
		System.out.println(str.replaceAll(" ", "%20"));
		
		
		String st= "Java is best programming language";
String[]  array=st.split(" ");
String temp="";
for (int i = array.length-1; i >= 0; i--) {
	temp=temp+" "+array[i];
	
}
	System.out.println("temp==============="+temp.trim());
	} 
}
