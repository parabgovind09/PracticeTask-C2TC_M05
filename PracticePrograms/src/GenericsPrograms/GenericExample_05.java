package GenericsPrograms;

import java.util.ArrayList;

//upperboundedwildcard
public class GenericExample_05 {
	
	public static Double add(ArrayList<? extends Number> a1) {
		double sum = 0.0;
		for(Number n : a1) {
			sum = sum + n.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println("Display the sum: "+add(a1));
		
		ArrayList<Double> a2 = new ArrayList<Double>();
		a2.add(10.20);
		a2.add(20.30);
		a2.add(30.50);
		System.out.println("Display the sum: "+add(a2));
	}
}
