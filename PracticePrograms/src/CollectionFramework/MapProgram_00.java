package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapProgram_00 {

	public static void main(String[] args) {
		
		Map map=new HashMap();  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    //Traversing Map  
	    Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	    
	    Map<Integer,String> map1=new HashMap<Integer,String>();  
	    map1.put(100,"Amit");  
	    map1.put(101,"Vijay");  
	    map1.put(102,"Rahul");  
	    //Elements can traverse in any order  
	    for(Map.Entry m:map1.entrySet()){  
	     System.out.println(m.getKey()+" "+m.getValue());  
	    }
	    
	  //Returns a Set view of the mappings contained in this map        
	      map1.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println); 
	}

}
