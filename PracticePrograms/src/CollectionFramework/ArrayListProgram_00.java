package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram_00 {

	public static void main(String[] args) {
		
		//non generic arraylist
		ArrayList a1 = new ArrayList();
		a1.add("Govind");
		a1.add("Suraj");
		a1.add("Touhid");
		a1.add(1);
		a1.add(2.56);
		a1.add(3);
		System.out.println(a1);
		
		//iterating the arraylist using iterator
		Iterator i1 = a1.iterator();
		while(i1.hasNext()) {
			System.out.println("Element is: "+i1.next());
		}
		
		//set in arraylist
		System.out.println("Setting 3rd element as Sahil: ");
		a1.set(2, "Sahil");
		System.out.println(a1);
		
		//generic arraylist
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Govind");
		a2.add("Suraj");
		a2.add("Touhid");
		System.out.println(a2);
		
		//iterating the arraylist using for-each loop
		for(String i : a2) {
			System.out.println("Element is: "+i);
		}
		
		//get in arraylist
		System.out.println("Printing 3rd element of arraylist: "+a2.get(2));
		
		//displaying the size of arraylist
		System.out.println("The size of arraylist is: "+(a2.size()));
		
		//removing an element
		a2.remove(2);
		System.out.println(a2);
		
		//checking is arraylist empty
		System.out.println(a2.isEmpty());
		
		//clearing arraylist
		a2.clear();
		System.out.println(a2);
		System.out.println(a2.isEmpty());
	
		//many more methods are there like 
		//retainAll()
		//indexOf()
		//contains()
		//clone()
		//toArray()
		//etc
	}
}
