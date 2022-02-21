package CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProgram_00 {

	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  System.out.println("Highest Value: "+al.pollFirst());  
	      System.out.println("Lowest Value: "+al.pollLast());  
	      
	      System.out.println("Reverse Set: "+al.descendingSet());  
          
	      System.out.println("Head Set: "+al.headSet("Vijay", true));  
	          
	      System.out.println("SubSet: "+al.subSet("Ajay", false, "Ravi", true));  
	           
	      System.out.println("TailSet: "+al.tailSet("Vijay", false));  
	      
	      TreeSet<String> set=new TreeSet<String>();  
	      set.add("Arti");  
	      set.add("Bharat");  
	      set.add("Clide");  
	      set.add("Dinesh");  
	      set.add("Emaam");  
	           
	      System.out.println("Intial Set: "+set);  
	      System.out.println("Head Set: "+set.headSet("Clide"));  
	      System.out.println("SubSet: "+set.subSet("Arti", "Emaam"));  
	      System.out.println("TailSet: "+set.tailSet("Clide"));  
	}

}
