package BasicPrograms;

import java.util.Scanner;

public class IfElseStatement_00 {
	
	static void evenOddCheck(Scanner sc) {
		int a = 0;
		System.out.println("Enter the Number: ");
		try {
			a = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Enter valid whole number as input");
			sc.close();
			System.exit(0);
		}
		if(a % 2 == 0) {
			System.out.println("The entered number is even number");
		}
		else {
			System.out.println("The entered number is odd number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		evenOddCheck(sc);
	}
}
/*
Output:-
Enter the Number: 
5
The entered number is odd number

*/