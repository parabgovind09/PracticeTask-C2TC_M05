package PatternPrograms;

import java.util.Scanner;

public class LeftTriangleStarPattern {
	
	static void display(Scanner sc) {
		System.out.println("Enter the number of rows you want: \n");
		int row = sc.nextInt();
		System.out.println();
		for(int i = 0 ; i < row ; i++) {
			for(int j = 1 ; j < row-i ; j++) {
				System.out.print(" ");
			}
			for(int k = row-i ; k <= row ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LeftTriangleStarPattern.display(sc);
	}
}
/*
Output:-
 
Enter the number of rows you want: 

10

         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********

*/