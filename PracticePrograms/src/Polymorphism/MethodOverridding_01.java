package Polymorphism;

class Add{
	public void getResult(int a, int b) {
		System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
	}
}
class Multiply extends Add{
	public void getResult(int a, int b) {
		super.getResult(a,b);
		System.out.println("Multiplicaton of "+a+" and "+b+" is: "+(a*b));
	}
}
class Divide extends Multiply{
	public void getResult(int a, int b) {
		super.getResult(a,b);
		System.out.println(a+" divided by "+b+" is: "+(a/b));
	}
}
public class MethodOverridding_01 {

	public static void main(String[] args) {
		Divide obj = new Divide();
		obj.getResult(20, 10);
	}
}