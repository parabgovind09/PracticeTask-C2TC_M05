package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListProgram_00 {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<String>();  
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 System.out.println("Returning element: "+list.get(1));
		 list.set(1,"Dates");  
		 for(String fruit:list) {
			 System.out.println(fruit); 
		 }
		 
		 Collections.sort(list);  
		  for(String fruit:list) {
			  System.out.println(fruit);
		  }
		  
		  ListIterator<String> itr=list.listIterator();    
	        System.out.println("Traversing elements in forward direction");    
	        while(itr.hasNext()){    
	              
	        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
	        }    
	        System.out.println("Traversing elements in backward direction");    
	        while(itr.hasPrevious()){    
	          
	        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
	        }  
	}
}
