package Constructor;

import java.util.Scanner;

public class Constructor_03 {
	
	Scanner sc = new Scanner(System.in);
	
	Constructor_03(){
		try {
			System.out.println("Enter your 12th percentage: ");
			float percent = sc.nextFloat();
			System.out.println("Enter you age: ");
			int age = sc.nextInt();
			if(percent < 90.00 || age < 18) {
				throw new Exception();
			}
			else {
				System.out.println("You are eligible for exam");
			}
		}catch(Exception e) {
			System.out.println("You are not eligible for exam");
		}
	}

	public static void main(String[] args) {
		Constructor_03 obj = new Constructor_03();
	}

}
