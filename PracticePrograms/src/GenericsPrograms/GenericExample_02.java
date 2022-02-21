package GenericsPrograms;

public class GenericExample_02 {
	
	public <E> void dilayArrayElements(E[] elements) {
		for(E element : elements) {
			System.out.println("Element is: "+element);
		}
	}

	public static void main(String[] args) {
		GenericExample_02 obj = new GenericExample_02();
		Integer[] intarray = {10,20,30,40,50};
		String[] strarray = {"India","Pakistan","Japan","Nepal","China"};
		
		obj.dilayArrayElements(intarray);
		System.out.println();
		obj.dilayArrayElements(strarray);
	}

}
