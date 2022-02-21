package CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapProgram_00 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();           
	    map.put(100,"Amit");    
	    map.put(101,"Vijay");    
	    map.put(102,"Rahul");    
	    System.out.println("Keys: "+map.keySet());  
	    System.out.println("Values: "+map.values());  
	    System.out.println("Key-Value pairs: "+map.entrySet()); 
	    System.out.println("Before invoking remove() method: "+map);     
	    map.remove(102);  
	    System.out.println("After invoking remove() method: "+map); 
	    for(Map.Entry m:map.entrySet()){  
	    	 System.out.println(m.getKey()+" "+m.getValue());  
	    }  
	}
}
