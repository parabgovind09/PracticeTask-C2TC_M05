package GenericsPrograms;
//Generic Constructor
public class GenericExample_03 {
	
private double v;

public <T extends Number> GenericExample_03(T t){
	v = t.doubleValue();
}
void show() {
	System.out.println("Value of V is: "+v);
}
	public static void main(String[] args) {
		System.out.println("Number to Double Conversion: ");
		
		GenericExample_03 obj = new GenericExample_03(10);
		obj.show();
		
		GenericExample_03 obj1 = new GenericExample_03(136.8f);
		obj1.show();
	}
}