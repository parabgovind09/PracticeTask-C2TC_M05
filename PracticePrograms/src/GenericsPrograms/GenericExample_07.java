package GenericsPrograms;

import java.util.Arrays;
import java.util.List;

//unbounded wild card demo
public class GenericExample_07 {

	public static void display(List<?> l1) {
		for(Object o : l1) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3);
		System.out.println("Display Values: ");
		display(l1);
		
		List<String> l2 = Arrays.asList("Hi","Hello","How are you");
		System.out.println("Display Values: ");
		display(l2);
	}

}
