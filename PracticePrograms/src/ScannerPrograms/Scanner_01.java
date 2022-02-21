//passing scanner object as parameter
package ScannerPrograms;

import java.util.Scanner;

public class Scanner_01 {
	
	void addition(Scanner sc) {
		try {
			System.out.println("Enter the value of first number to be added: ");
			double num1 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the value of second number to be added: ");
			double num2 = sc.nextDouble();
			double add = num1 + num2;
			System.out.println("Addition is of "+num1+" and "+num2+" is : "+add);
		}catch(Exception e) {
			System.out.println("please enter valid input data!!!");
			sc.close();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner_01 obj = new Scanner_01();
		obj.addition(sc);
	}

}
/*
Output:-

Enter the value of first number to be added: 
124
Enter the value of second number to be added: 
125.36
Addition is of 124.0 and 125.36 is : 249.36

*/