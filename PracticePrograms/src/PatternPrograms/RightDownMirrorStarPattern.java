package PatternPrograms;

import java.util.Scanner;

public class RightDownMirrorStarPattern {

	static void display(Scanner sc) {
		System.out.println("Enter the number of rows you want: \n");
		int row = sc.nextInt();
		System.out.println();
		for(int i = 0; i < row ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print(" ");
			}
			for(int k = i ; k < row ; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RightDownMirrorStarPattern.display(sc);
	}
}
/*
Output:-

Enter the number of rows you want: 

5

*****
 ****
  ***
   **
    *

*/