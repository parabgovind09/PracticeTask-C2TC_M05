//Dynamic Jagged Array
//Taking Input From Console

package ArrayPrograms;

import java.util.Scanner;

public class JaggedArray_03 {
	
	void display(Scanner sc) {
		try {
		System.out.println("This is Jagged Array Program: ");
		System.out.println("Enter the number of rows you want: ");
		int rowcount = sc.nextInt();
		//declaring 2d Jagged Array with rows equal to rowcount
		int arr[][] = new int[rowcount][];
		
		//getting the input of array elements for each row
		for(int i = 0; i < rowcount; i++) {
			System.out.println("Enter the number of total elements to be inserted in row: "+i);
			int rows = sc.nextInt();
			System.out.println("Enter the row "+i+" elements: ");
			arr[i] = new int[rows];
			for(int j = 0; j < rows; j++) {
				System.out.println(arr[i][j] = sc.nextInt());
			}
		}
		
		//displaying the Jagged Array elements
		System.out.println("Entered elements in Jagged array are: \n");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
		}
		}
		catch(Exception e) {
			System.out.println("Enter only integer value");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JaggedArray_03 obj = new JaggedArray_03();
		obj.display(sc);
	}
}

/*
Output:-

This is Jagged Array Program: 
Enter the number of rows you want: 
3
Enter the number of total elements to be inserted in row: 0
5
Enter the row 0 elements: 
11
11
100
100
12
12
45
45
1
1
Enter the number of total elements to be inserted in row: 1
3
Enter the row 1 elements: 
4
4
55
55
698
698
Enter the number of total elements to be inserted in row: 2
6
Enter the row 2 elements: 
455
455
0
0
12
12
89
89
7
7
64
64
Entered elements in Jagged array are: 

11	100	12	45	1	

4	55	698	

455	0	12	89	7	64	

*/