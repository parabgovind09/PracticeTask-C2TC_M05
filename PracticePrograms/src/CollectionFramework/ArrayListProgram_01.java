package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListProgram_01 {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("India");
		a1.add("America");
		a1.add("Nepal");
		a1.add("Pakistan");
		a1.add("Africa");
		a1.add("China");
		
		//sorting arraylist using collections.sort() method
	    Collections.sort(a1);
	    
	    Iterator i1 = a1.iterator();
	    while(i1.hasNext()) {
	    	System.out.println("Element is: "+i1.next());
	    }
	    
	    //creating arraylist from existing arraylist
	    ArrayList<String> a2 = new ArrayList<String>(a1);
		a2.add("France");
		a2.add("Germany");
		a2.add("Japan");
		a2.add("Bangladesh");
		a2.add("Sri Lanka");
		
		for(String s : a2) {
			System.out.println("Element is: "+s);
		}
	}

}
