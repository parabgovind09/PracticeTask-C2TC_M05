package PatternPrograms;

import java.util.Scanner;

public class DownwardTriangleStarPattern {
	
	static void display(Scanner sc) {
		System.out.println("Enter the number of rows you want: \n");
		int row = sc.nextInt();
		System.out.println();
		for(int i = 0 ; i < row ; i++) {
			for(int j = i ; j < row ; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DownwardTriangleStarPattern.display(sc);
	}
}
/*

Output:-

Enter the number of rows you want: 

5

*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*	

*/
