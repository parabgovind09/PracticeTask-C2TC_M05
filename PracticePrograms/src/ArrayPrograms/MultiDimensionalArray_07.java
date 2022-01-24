//taking input from console
//fixed number of tables rows and cols
package ArrayPrograms;

import java.util.Scanner;

public class MultiDimensionalArray_07 {

	static int[][][] input(Scanner sc) {
		int arr[][][] = null;
		int table=0;
		int row=0;
		int col=0;
		try {
			System.out.println("Enter the number of tables: ");
			table = sc.nextInt();
			System.out.println("Enter the number of rows: ");
			row = sc.nextInt();
			System.out.println("Enter the number of columns: ");
			col = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Enter the valid innput!!!");
			System.exit(0);
		}
		System.out.println("Enter the array elements: ");
		sc.nextLine();
		arr = new int[table][row][col];
		for(int i = 0 ; i <  arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				for(int k = 0 ; k < arr[i][j].length ; k++) {
					System.out.println("arr["+i+"]["+j+"]["+k+"] = "+(arr[i][j][k] = sc.nextInt()));
				}
			}
		}
		return arr;
	}
	
	static void display(int[][][] arr) {
		for(int[][] i : arr) {
			for(int[] j : i) {
				for(int k : j) {
					System.out.print(k+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MultiDimensionalArray_07.display(MultiDimensionalArray_07.input(sc));
	}
}
/*
Output:-

Enter the number of tables: 
2
Enter the number of rows: 
2
Enter the number of columns: 
3
Enter the array elements: 
10
arr[0][0][0] = 10
20
arr[0][0][1] = 20
30
arr[0][0][2] = 30
11
arr[0][1][0] = 11
22
arr[0][1][1] = 22
33
arr[0][1][2] = 33
40
arr[1][0][0] = 40
50
arr[1][0][1] = 50
60
arr[1][0][2] = 60
44
arr[1][1][0] = 44
55
arr[1][1][1] = 55
66
arr[1][1][2] = 66

10	20	30	
11	22	33	

40	50	60	
44	55	66	

*/