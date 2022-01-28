package BasicPrograms;

import java.util.Scanner;

public class ReturnStatement_00 {
	
	static String name;
	
	static String display(Scanner sc) {
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		return name;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name : "+display(sc));
	}
}
/*
Output:-

Enter your name: 
Govind Rama Parab
Name : Govind Rama Parab

*/