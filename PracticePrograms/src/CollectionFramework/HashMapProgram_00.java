package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram_00 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Mango");
		map.put(2,"Apple");    
		map.put(3,"Banana");   
		map.put(4,"Grapes");   
		map.put(1,"WaterMelon"); 
		map.putIfAbsent(3, "Gaurav");  
		
		HashMap<Integer,String> map1=new HashMap<Integer,String>();  
	    map1.put(104,"Ravi");  
	    map1.putAll(map);  
	    for(Map.Entry m:map1.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     } 
	    
		System.out.println("Iterating Hashmap...");  
		for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		}
		System.out.println("Initial list of elements: "+map);  
	    map.remove(1);  
	    System.out.println("Updated list of elements: "+map);  
	    map.remove(2);  
	    System.out.println("Updated list of elements: "+map);  
	    map.remove(3, "Banana");  
	    System.out.println("Updated list of elements: "+map);  
	    
	    
	    HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");   
	      System.out.println("Initial list of elements:");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	     System.out.println("Updated list of elements:");  
	     hm.replace(102, "Gaurav");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	     System.out.println("Updated list of elements:");  
	     hm.replace(101, "Vijay", "Ravi");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }   
	     System.out.println("Updated list of elements:");  
	     hm.replaceAll((k,v) -> "Ajay");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	}

}
