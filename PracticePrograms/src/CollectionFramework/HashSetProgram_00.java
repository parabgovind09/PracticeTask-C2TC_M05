package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram_00 {

	public static void main(String[] args) {
		 HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next()); 
		  }
		  System.out.println("An initial list of elements: "+set);  
          set.remove("Ravi");  
          System.out.println("After invoking remove(object) method: "+set);  
          HashSet<String> set1=new HashSet<String>();  
          set1.add("Ajay");  
          set1.add("Gaurav");  
          set.addAll(set1);  
          System.out.println("Updated List: "+set);  
          set.removeAll(set1);  
          System.out.println("After invoking removeAll() method: "+set);  
          set.removeIf(str->str.contains("Vijay"));    
          System.out.println("After invoking removeIf() method: "+set);  
          set.clear();  
          System.out.println("After invoking clear() method: "+set);  
          
          ArrayList<String> list=new ArrayList<String>();  
          list.add("Ravi");  
          list.add("Vijay");  
          list.add("Ajay");  
            
          HashSet<String> set2=new HashSet(list);  
          set2.add("Gaurav");  
          Iterator<String> i=set2.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }  
	}
}