package Interface;

interface Draw{
	void name();
}
class Square implements Draw{

	@Override
	public void name() {
		System.out.println("This is Square");
	}
	
}
class Circle extends Square {
	public void name() {
		System.out.println("This is circle");
	}
}
public class InterfaceProgram_02 {

	public static void main(String[] args) {
		Circle obj = new Circle();
		Square obj1 = new Square();
		Square obj2 = new Circle();
		obj.name();
		obj1.name();
		obj2.name();
	}

}
