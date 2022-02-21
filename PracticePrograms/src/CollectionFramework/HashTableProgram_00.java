package CollectionFramework;

import java.util.Hashtable;

public class HashTableProgram_00 {

	public static void main(String[] args) {
		/*
		 Hashtable(): This creates an empty hashtable with the default load factor of 0.75 and an initial capacity is 11. 
        Hashtable<K, V> ht = new Hashtable<K, V>();
		 Java program to demonstrate adding elements to Hashtable
		 Hashtable<Integer, String> ht1 = new Hashtable<>();

		 // Initialization of a Hashtable using Generics
		 Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

		 // Inserting the Elements using put() method
		 ht1.put(1, "one");
		 ht1.put(2, "two");
		 ht1.put(3, "three");

		 ht2.put(4, "four");
		 ht2.put(5, "five");
		 ht2.put(6, "six");

		 // Print mappings to the console
		 System.out.println("Mappings of ht1 : " + ht1);
		 System.out.println("Mappings of ht2 : " + ht2);
		*/
		
		/*
		 Hashtable(int initialCapacity): This creates a hash table that has an initial size specified by
		 initialCapacity and the default load factor is 0.75.
        Hashtable<K, V> ht = new Hashtable<K, V>(int initialCapacity);
		// No need to mention the Generic type twice
		Hashtable<Integer, String> ht1 = new Hashtable<>(4);

		// Initialization of a Hashtable using Generics
		Hashtable<Integer, String> ht2
			= new Hashtable<Integer, String>(2);

		// Inserting the Elements using put() method
		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(3, "three");

		ht2.put(4, "four");
		ht2.put(5, "five");
		ht2.put(6, "six");

		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
		*/
		/*
		 3. Hashtable(int size, float fillRatio): This version creates a hash table that has an initial size specified by
		 size and fill ratio specified by fillRatio. fill ratio: Basically, it determines how full a hash table can be
		 before it is resized upward and its Value lies between 0.0 to 1.0.
        Hashtable<K, V> ht = new Hashtable<K, V>(int size, float fillRatio);
		 
		// No need to mention the Generic type twice
		Hashtable<Integer, String> ht1 = new Hashtable<>(4, 0.75f);

		// Initialization of a Hashtable using Generics
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(3, 0.5f);

		// Inserting the Elements using put() method
		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(3, "three");

		ht2.put(4, "four");
		ht2.put(5, "five");
		ht2.put(6, "six");

		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
		*/
		/*
		 4. Hashtable(Map<? extends K,? extends V> m): This creates a hash table that is initialized with the elements in m.
        Hashtable<K, V> ht = new Hashtable<K, V>(Map m);
		// No need to mention the Generic type twice
		Map<Integer, String> hm = new HashMap<>();

		// Inserting the Elements using put() method
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");

		// Initialization of a Hashtable using Generics
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(hm);
		// Print mappings to the console
		System.out.println("Mappings of ht2 : " + ht2);
		*/
		
		Hashtable<Integer,String> hashtabl1 = new Hashtable<>();
		/*Hashtable put() Method for adding elements
		 The java.util.Hashtable.put() method of Hashtable is used to insert a mapping into a table.
		 This means we can insert a specific key and the value it is mapping to into a particular table.
		 If an existing key is passed then the previous value gets replaced by the new value.
		 If a new pair is passed, then the pair gets inserted as a whole.
        Syntax:
        Hash_Table.put(key, value)
        Parameters: The method takes two parameters, both are of the Object type of the Hashtable.

        key: This refers to the key element that needs to be inserted into the Table for mapping.
        value: This refers to the value that the above key would map into.
        Return Value: If an existing key is passed then the previous value gets returned.
        If a new pair is passed, then NULL is returned.
		 */
		// Inserting values into the table
		hashtabl1.put(10, "Geeks");
		hashtabl1.put(15, "4");
		hashtabl1.put(20, "Geeks");
		hashtabl1.put(25, "Welcomes");
		hashtabl1.put(30, "You");

		// Displaying the Hashtable
		System.out.println("Initial table is: " + hashtabl1);

		// Inserting existing key along with new value
		String returned_value = (String)hashtabl1.put(20, "All");

		// Verifying the returned value
		System.out.println("Returned value is: " + returned_value);

		// Displaying the new table
		System.out.println("New table is: " + hashtabl1);
		
		// Inserting new key along with new value
       String returned_value1 = (String)hashtabl1.put(50, "All");
 
       // Verifying the returned value
       System.out.println("Returned value is: " + returned_value1);
 
       // Displaying the new table
       System.out.println("New table is: " + hashtabl1);
       
       /*
       Hashtable clear() Method
       The java.util.Hashtable.clear() method in Java is used to clear and remove all of the keys from a specified Hashtable.
       Syntax:
       Hash_table.clear()
       Parameters: The method does not accept any parameters.
       Return Value: The method does not return any value.
        */
       Hashtable<String,Integer> hashtable2 = new Hashtable<>();
       //adding elements
       hashtable2.put("Govind", 30);
       hashtable2.put("Minal", 40);
       //displaying initial keys values
       System.out.println("Hashtable2 before using clear()method: "+hashtable2);
       //using clear() method
       hashtable2.clear();
       //displaying the hashtable2
       System.out.println("Displaying the Hashtable2 after using clear() method: "+hashtable2);
       
       /*
        Hashtable clone() Method the weird one
        The java.util.Hashtable.clone() method is used to return a shallow copy of the mentioned hash table. It just creates a copy of the table.
        Syntax:
        Hash_Table.clone()
        Parameters: The method does not take any parameters.
        Return Value: The method just returns a copy of the Hashtable.
        */
       Hashtable<Integer, String> hashtable3 = new Hashtable<Integer, String>();
 
       // Putting values into the table
       hashtable3.put(10, "Apple");
       hashtable3.put(15, "Mango");
       hashtable3.put(20, "Orange");
       // Displaying the hashtable3
       System.out.println("The Hashtable is: " + hashtable3);
       // Displaying the cloned hashtable3 using clone()
       System.out.println("The cloned table look like this: " + hashtable3.clone());
       
       /*
        Hashtable contains() Method 
        The java.util.Hashtable.contains(Object value) method in Java is used to check whether a particular value
        is being mapped by any keys present in the Hashtable.
        Syntax:
        Hash_table.contains(Object value)
        Parameters: The method accepts one parameter value of object type and refers to the value of the hashtable whose mapping is to be verified.
        Return Value: The method returns a boolean true value if the passed value is mapped by any of the keys in the Hashtable.
        Exceptions: The method throws NullPointerException if the passed value is Null.
        */
       Hashtable<Integer, String> hashtable4 = new Hashtable<Integer, String>();
         
               // Mapping string values to int keys
               hashtable4.put(10, "India");
               hashtable4.put(20, "Pakistan");
               hashtable4.put(30, "China");
               hashtable4.put(40, "Bhutan");
               hashtable4.put(50, "Nepal");
         
               // Displaying the HashMap
               System.out.println("Initial Table is: " + hashtable4);
         
               // Checking for the Value 'India'
               System.out.println("Is the value 'India' present? " + hashtable4.contains("India"));
         
               // Checking for the Value 'Bangladesh'
               System.out.println("Is the value 'Bangladesh' present? " + hashtable4.contains("Bangladesh"));
               //below line will throw an exception
               //System.out.println("Is the value 'Bangladesh' present? " + hashtable4.contains(null));
               
               /*
               Hashtable containsKey() Method
               The java.util.Hashtable.containsKey() method is used to check whether a particular key is present in the 
               Hashtable or not. 
               It takes the key element as a parameter and returns True if that element is present in the table.
               Syntax:
               Hash_table.containsKey(key_element)
               Parameters: The method takes just one parameter key_element which refers to the key whose presence is supposed to be checked inside a Hashtable.
               Return Value: The method returns boolean true if the key is present in the Hashtable otherwise it returns false.
                */
               
               Hashtable<Integer, String> hashtable5 = new Hashtable<Integer, String>();
               
               // Mapping string values to int keys
               hashtable5.put(10, "India");
               hashtable5.put(20, "Pakistan");
               hashtable5.put(30, "China");
               hashtable5.put(40, "Bhutan");
               hashtable5.put(50, "Nepal");
         
               // Displaying the HashMap
               System.out.println("Initial Table is: " + hashtable5);
               // Checking for the key_element '20'
               System.out.println("Is the key '20' present? " + hashtable5.containsKey(20));
         
               // Checking for the key_element '5'
               System.out.println("Is the key '5' present? " + hashtable5.containsKey(500));
               
               /*
               Hashtable containsValue() Method
               The java.util.Hashtable.containsValue() method is used to check whether a particular value is being mapped
               by a single or more than one key in the Hashtable. It takes the Value as a parameter and returns True
               if that value is mapped by any of the keys in the table.
               Syntax:
               Hash_Table.containsValue(Object Value)
               Parameters: The method takes just one parameter Value of Object type and refers to the value whose
               mapping is supposed to be checked by any key inside the table.
               Return Value: The method returns boolean true if the value is mapped to any key in the Hashtable
               otherwise it returns false.
                */
               
              Hashtable<Integer, String> hashtable6 = new Hashtable<Integer, String>();
               
               // Mapping string values to int keys
               hashtable6.put(10, "India");
               hashtable6.put(20, "Pakistan");
               hashtable6.put(30, "China");
               hashtable6.put(40, "India");
               hashtable6.put(50, "Nepal");
         
               // Displaying the HashMap
               System.out.println("Initial Table is: " + hashtable6);
               // Checking for the Value 'India'
               System.out.println("Is the value 'India' present? " + hashtable6.containsValue("India"));
         
               // Checking for the Value 'London'
               System.out.println("Is the value 'World' present? " + hashtable6.containsValue("London"));
               
               /*
               Hashtable isEmpty() Method
                The java.util.Hashtable.isEmpty() method of Hashtable class is used to check for the emptiness of the table.
                The method returns True if no key-value pair or mapping is present in the table else False.
                Syntax:
                Hash_Table.isEmpty()
                Parameters: The method does not take any parameters.
                Return Value: The method returns boolean true if the table is empty or does not contain any mapping
                pairs else boolean false.
                */
               System.out.println("The table is: " + hashtable6);
               // Checking for the emptiness of Table
               System.out.println("Is the table empty? " + hashtable6.isEmpty());
               hashtable6.clear();
               // Checking for the emptiness of Table after clearing it
               System.out.println("Is the table empty? " + hashtable6.isEmpty());
               
	}

}
