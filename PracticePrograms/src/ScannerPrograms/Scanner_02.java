//passing Scanner as constructor parameter
package ScannerPrograms;

import java.util.Scanner;

public class Scanner_02 {
	String name,gender;
	int roll_number;

	Scanner_02(Scanner sc){
		System.out.println("Enter your Full Name: ");
		name = sc.nextLine();
		System.out.println("Enter your Roll Number: ");
		roll_number = sc.nextInt();
		System.out.println("Enter your Gender");
		gender = sc.next();
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Roll Number: "+roll_number);
		System.out.println("Gender: "+gender);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner_02 obj = new Scanner_02(sc);
		obj.display();
	}
}
/*
Output:-

Enter your Full Name: 
Govind Rama Parab
Enter your Roll Number: 
30
Enter your Gender
M
Name : Govind Rama Parab
Roll Number: 30
Gender: M
*/