package Constructor;

import java.util.Scanner;

class A{
	Scanner sc = new Scanner(System.in);

	A(){
		this(0);
	}
	
	A(int sum){
		this(0.0f);
		System.out.println("Enter the first number to be added: ");
		float a = sc.nextFloat();
		System.out.println("Enter the second number to be added: ");
		float b = sc.nextFloat();
		System.out.println("Sum = "+(a+b));
	}
	
	A(float mul){
		System.out.println("Enter the first number to be multiplied: ");
		float a = sc.nextFloat();
		System.out.println("Enter the second number to be multiplied: ");
		float b = sc.nextFloat();
		System.out.println("Multiplication = "+(a*b));
	}
	{
		System.out.println("This is Class A init block for multiplication and addition process");
	}
}
class B extends A{
	{
		System.out.println("This is Class B init block for subtraction process");
	}
	public B() {
		this(0);
	}
	public B(int sub) {
		super();
		System.out.println("Enter the first number to be subtracted: ");
		float a = sc.nextFloat();
		System.out.println("Enter the second number to be subtracted: ");
		float b = sc.nextFloat();
		System.out.println("Subtraction = "+(a-b));
	}
}
class C extends B{
	C(){
		this(0);
		System.out.println("Calculation process has been done");
	}
	{
		System.out.println("This is Class C init block for division process");
	}
	C(int div){
		//super(); //even if don't write super() in the child constructor the compiler itself creates for you
		System.out.println("Enter the first number: ");
		float a = sc.nextFloat();
		System.out.println("Enter the second number: ");
		float b = sc.nextFloat();
		System.out.println("Division = "+(a/b));
	}
}
public class Constructor_02 {

	public static void main(String[] args) {
		C obj = new C();
	}

}
