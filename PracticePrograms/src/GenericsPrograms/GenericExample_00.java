package GenericsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericExample_00 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("Pakistan");
		
		String country = list.get(0);
		System.out.println("Element is: "+country);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}