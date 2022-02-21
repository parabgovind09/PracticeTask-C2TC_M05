package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram_03 {

	public static void main(String[] args) {
		ArrayList<String> country = new ArrayList<String>();
		country.add("India");
		country.add("Japan");
		country.add("France");
		country.add("China");
		country.add("Afghanistan");
		country.add("Sri Lanka");
		
		ArrayList<String> city = new ArrayList<String>();
		city.add("Mumbai");
		city.add("Kolkata");
		city.add("Delhi");
		
		ArrayList<String> vegetable = new ArrayList<String>();
		vegetable.add("Spinach");
		vegetable.add("Peas");
		vegetable.add("Cabbage");
		
		
		ArrayList<ArrayList<String>> pack = new ArrayList<ArrayList<String>>();
		pack.add(country);
		pack.add(city);
		pack.add(vegetable);
		
		Iterator itr = pack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
