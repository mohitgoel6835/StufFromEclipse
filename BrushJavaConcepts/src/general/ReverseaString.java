package general;

public class ReverseaString {
public static void main(String[] args) {
	reverse1("mohit");
}
public static void reverse1(String str) {
	String st="";
	for (int i =str.length()-1; i >=0; i--) {
		st=st+str.charAt(i);
	}
System.out.println("reverse string is ==="+st);
}
}
