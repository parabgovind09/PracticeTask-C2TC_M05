package GenericsPrograms;

import java.util.Arrays;
import java.util.List;

//lower bound wildcard demo
public class GenericExample_06 {

	public static void displayNumbers1(List<? super Integer> list) {
		for(Object n : list) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3);
		System.out.println("Display Values: ");
		displayNumbers1(l1);
		
		List<Number> l2 = Arrays.asList(1.0,2.0,3.0);
		System.out.println("Display Values: ");
		displayNumbers1(l2);
	}

}
