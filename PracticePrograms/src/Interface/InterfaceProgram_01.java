package Interface;

interface Shape{
	public static final String shape_square = "Square";
	String shape_circle = "Circle";
	
	interface Square{
		int side1 = 20;
		int side2 = 20;
		void squareDetails();
	}
	
	interface Circle{
		int radius = 5;
		float PI = 3.14f;
		void circleDetails();
	}

}

class Details implements Shape, Shape.Square, Shape.Circle{

	@Override
	public void squareDetails() {
		System.out.println("The name of the shape is : "+shape_square);
		System.out.println("Area of Square is: "+(side1*side2));
	}

	@Override
	public void circleDetails() {
		System.out.println("The name of the shape is : "+shape_circle);
		System.out.println("Area of Circle is: "+(PI*radius*radius));
	}
	
}

public class InterfaceProgram_01 {

	public static void main(String[] args) {
		Details obj = new Details();
		obj.squareDetails();
		obj.circleDetails();
	}

}
