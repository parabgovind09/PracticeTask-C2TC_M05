package Constructor;

import java.util.Scanner;

public class Constructor_01 {
	
	Scanner sc = new Scanner(System.in);

	Constructor_01(){
		this(0);
		System.out.println("Calculation process has been done");
	}
	
	Constructor_01(int sum){
		this(0.0f);
		System.out.println("Enter the first number to be added: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number to be added: ");
		int b = sc.nextInt();
		System.out.println("Sum = "+(a+b));
	}
	
	Constructor_01(float mul){
		System.out.println("Enter the first number to be multiplied: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number to be multiplied: ");
		int b = sc.nextInt();
		System.out.println("Multiplication = "+(a*b));
	}
	
	public static void main(String[] args) {
		Constructor_01 obj = new Constructor_01();
	}

}
