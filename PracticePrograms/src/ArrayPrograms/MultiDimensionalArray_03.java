//Taking input from console
package ArrayPrograms;

import java.util.Scanner;

public class MultiDimensionalArray_03 {
	
	static int[][] input(Scanner sc) {
		int arr[][];
		int row = 0,col = 0;
		try {
			System.out.println("Enter the number of rows: ");
			row = sc.nextInt();
			System.out.println("Enter the number of columns: ");
			col = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Enter valid input!!!");
			System.exit(0);
		}
		arr = new int[row][col];
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("Enter the row "+i+" elements: ");
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.println("arr["+i+"]["+j+"] = "+ (arr[i][j] = sc.nextInt()));
			}
		}
		return arr;
	}

	static void display(int arr[][]) {
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MultiDimensionalArray_03.display(MultiDimensionalArray_03.input(sc));
	}
}
/*
Output:-

Enter the number of rows: 
2
Enter the number of columns: 
3
Enter the row 0 elements: 
10
arr[0][0] = 10
20
arr[0][1] = 20
30
arr[0][2] = 30
Enter the row 1 elements: 
50
arr[1][0] = 50
60
arr[1][1] = 60
70
arr[1][2] = 70
10	20	30	
50	60	70	

*/