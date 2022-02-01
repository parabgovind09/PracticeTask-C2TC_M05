package BasicPrograms;

import java.util.Scanner;

public class ShortHandIfElseTernaryOperator_00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student marks: ");
		float marks = 0;
		try {
			marks = sc.nextFloat();
			if(marks > 100) {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("Enter valid marks in range 0 to 100");
			System.exit(0);
		}
		String result = (marks >= 35)?"Pass":"Fail";
		System.out.println("The Result is: "+result);
	}
}
/*
Output:-

Enter student marks: 
45
The Result is: Pass

*/