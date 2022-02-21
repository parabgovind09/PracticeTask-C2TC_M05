package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetProgram_00 {
	
	/*
	public static void main(String[] args) {
		// Creating an empty LinkedHashSet of string type
				LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

				// Adding element to LinkedHashSet using add() method
				linkedset.add("A");
				linkedset.add("B");
				linkedset.add("C");
				linkedset.add("D");

				// Note: This will not add new element as A already exists
				linkedset.add("A");
				linkedset.add("E");

				// Getting size of LinkedHashSet using size() method
				System.out.println("Size of LinkedHashSet = " + linkedset.size());

				System.out.println("Original LinkedHashSet:" + linkedset);

				// Removing existing entry from above Set using remove() method
				System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));

				// Removing existing entry from above Set that does not exist in Set
				System.out.println(
					"Trying to Remove Z which is not " + "present: " + linkedset.remove("Z"));

				// Checking for element whether it is present inside Set or not using contains() method
				System.out.println("Checking if A is present=" + linkedset.contains("A"));

				// Now lastly printing the updated LinekdHashMap
				System.out.println("Updated LinkedHashSet: " + linkedset);
			}
			
			*/
			public static void main(String args[]) {
				
				//LinkedHashSet(): This constructor is used to create a default HashSet
				LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
				//add() method
				linkedhashset.add("Govind");
				linkedhashset.add("Minal");
				linkedhashset.add("Ruchita");
				linkedhashset.add("Govind");//this will not be added as it already exists
				System.out.println("Elements of LinkedHashSet are: "+linkedhashset);
				
				//LinkedHashSet(Collection C): Used in initializing the HashSet with the elements of the collection C.
				LinkedHashSet<String> linkedhashset1 = new LinkedHashSet<>(linkedhashset);
				linkedhashset1.add("Sahil");
				linkedhashset1.add("Minal");//this will not be added as it already exists in linkedhashset
				System.out.println("Elements of LinkedHashSet1 are: "+linkedhashset1);
				
				LinkedHashSet<String> linkedhashset2 = new LinkedHashSet<>();
				//addAll() method
				linkedhashset2.addAll(linkedhashset);
				linkedhashset2.add("Sanchit");
				System.out.println("Elements of LinkedHashSet2 are: "+linkedhashset2);
				
				//remove() method
				System.out.println("Initial Elements of LinkedHashSet are: "+linkedhashset);
				System.out.println("Result of removing Ruchita from the linkedhashset: "+linkedhashset.remove("Ruchita"));
				System.out.println("Result of removing Dinesh from the linkedhashset: "+linkedhashset.remove("Dinesh"));
				System.out.println("Elements of LinkedHashSet are: "+linkedhashset);
				
				//removeAll() method for clearing itself
				linkedhashset.removeAll(linkedhashset);
				System.out.println("Elements of LinkedHashSet are: "+linkedhashset);
				
				//removeAll() method for clearing common existing values in linkedhashset1 and linkedhashset2
				linkedhashset1.removeAll(linkedhashset2);
				System.out.println("Elements of LinkedHashSet1 are: "+linkedhashset1);
				
				LinkedHashSet<Integer> linkedhashset3 = new LinkedHashSet<Integer>();
				linkedhashset3.add(10);
				linkedhashset3.add(20);
				linkedhashset3.add(30);
				linkedhashset3.add(40);
				System.out.println("Elements of LinkedHashSet3 are: "+linkedhashset3);
				//iterating through linkedhashset3
				System.out.println("Iterating through linkedhashset3 by using iterator");
				Iterator i = linkedhashset3.iterator();
				while(i.hasNext()) {
					System.out.print(i.next() + ", ");
				}
				//using contain() method
				System.out.println("\nResult of checking wheather the linkedhashset3 has number 20 or not :"+linkedhashset3.contains(20));
				
				LinkedHashSet<Integer> linkedhashset4 = new LinkedHashSet<Integer>();
				linkedhashset4.add(30);
				linkedhashset4.add(40);
				linkedhashset4.add(50);
				linkedhashset4.add(60);
				//using conatinAll() method
				System.out.println("Result of checking wheather the linkedhashset4 has numbers of linkedhashset3 or not :"+linkedhashset3.containsAll(linkedhashset4));
				linkedhashset4.remove(50);
				linkedhashset4.remove(60);
				System.out.println("Result of checking wheather the linkedhashset4 has numbers of linkedhashset3 or not :"+linkedhashset3.containsAll(linkedhashset4));
				
				//equal() method
				System.out.println("Initial Elements of LinkedHashSet3 are: "+linkedhashset3);
				System.out.println("Initial Elements of LinkedHashSet4 are: "+linkedhashset4);
				System.out.println("Result of wheather linkedhashset4 and linkedhashset3 contains same elements is: "+linkedhashset4.equals(linkedhashset3));
				linkedhashset3.remove(10);
				linkedhashset3.remove(20);
				System.out.println("updated elements of LinkedHashSet3 are: "+linkedhashset3);
				System.out.println("Result of wheather linkedhashset4 and linkedhashset3 contains same elements is: "+linkedhashset4.equals(linkedhashset3));
				System.out.println("Initial Elements of LinkedHashSet4 are: "+linkedhashset4);
				
				//retainAll() method:- removes the unmatched elements from the result.
				linkedhashset1.add("Sanchit");
				System.out.println("Initial Elements of LinkedHashSet1 are: "+linkedhashset1);
				System.out.println("Initial Elements of LinkedHashSet2 are: "+linkedhashset2);
				System.out.println("Result of removing unmatched elements of linkedhashset1 and linkedhashset2: "+linkedhashset1.retainAll(linkedhashset2));
				System.out.println("Retained elements of LinkedHashSet1 are: "+linkedhashset1);
	}

}
