package GenericsPrograms;

public class GenericExample_01<T> {
	
	T type_obj;
	
	void add(T obj) {
		this.type_obj = obj;
	}
	
	T get() {
		return type_obj;
	}
	public static void main(String[] args) {
		GenericExample_01<Integer> obj = new GenericExample_01<Integer>();
		obj.add(2);
		System.out.println(obj.get());
		
		GenericExample_01<String> obj1 = new GenericExample_01<String>();
		obj1.add("Govind");
		System.out.println(obj1.get());
	}

}
