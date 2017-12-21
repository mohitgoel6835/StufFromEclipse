package strings;

public class ReverseEachWord
{
	
	
	
	private static void reverseString1() {
		String st="mohit";
		String st1="";
		
		for (int i = st.length()-1; i>=0; i--) {
			st1=st1+st.charAt(i);
			}
System.out.println("reverse sring is ======>"+st1);
	}
	
    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
         
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(inputString);
         
        System.out.println(reverseString);
         
        System.out.println("-------------------------");
    }
     
    public static void main(String[] args) 
    {
    	
    	reverseString1();
        /*reverseEachWordOfString("Java Concept Of The Day");
         
        reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");
         
        reverseEachWordOfString("I am string not reversed");
         
        reverseEachWordOfString("Reverse Me");*/
    }
}