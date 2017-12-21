package collectionquestions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class TestSet {

//	public static void main(String[] args) {
//		int count[] = {34, 22,10,60,30,22};//integer array
//	      Set<Integer> set = new HashSet<Integer>();//declare integer type set
//	      try {
//	         for(int i = 0; i < 5; i++) {//adding values of array to set
//	            set.add(count[i]);
//	         }
//	        
//	         System.out.println(set);//printing out set values
//
//	         TreeSet sortedSet = new TreeSet<Integer>(set);
//	         System.out.println("The sorted list is:");
//	         System.out.println(sortedSet);
//
//	         System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
//	         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
//	      }
//	      catch(Exception e) {}	
//	}
	public static void main(String[] args) {
		
		String[] str= {"abc","xyz","pqr","uvw",null,"lmn","lmn"};		//string array
		Set<String> st= new HashSet<String>();	//declare string type set
		for (String string : str) {//adding values of array to set
			st.add(string);
		}
		for (String string : st) {//printing out set values
			System.out.println("elements are "+string);
		}
		
		System.out.println(st.size());//printing set size
		
		
		st.add("mohit");//ading new element in set
		if(st.contains("mohit")){System.out.println("mohit is available");//checking set has specific element or not
		}
		System.out.println(st.size());//checking size of set after ading new element
		System.out.println(st.isEmpty());//checking if set is empty or not returns boolean value
		st.remove("abc");//deleting specified element from set
		for (String string : st) {//printing set value s again after deleling and adding 1 element 
		System.out.println(	"new elements are"+string);	
		}
	}
	
}
