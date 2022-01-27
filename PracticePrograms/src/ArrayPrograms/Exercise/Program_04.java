//Program to print the sum of all array elements
package ArrayPrograms.Exercise;

import java.util.Scanner;

public class Program_04 {

	static int input(Scanner sc) {
		int sum = 0;
		System.out.println("Enter the size of array: ");
		int size = 0;
		try {
			size = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Enter valid Integer input!!!");
		}
		int arr[] = new int[size];
		System.out.println("Enter the array elements: ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr["+i+"] = "+(arr[i] = sc.nextInt()));
		}
		System.out.println("Displaying the arr array elements: ");
		for(int i : arr) {
			System.out.print(i+"\t");
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSum of all array elements is: "+(input(sc)));
	}
}
/*

Output:- 
Enter the size of array: 
10
Enter the array elements: 
10
arr[0] = 10
20
arr[1] = 20
30
arr[2] = 30
40
arr[3] = 40
50
arr[4] = 50
60
arr[5] = 60
70
arr[6] = 70
80
arr[7] = 80
90
arr[8] = 90
100
arr[9] = 100
Displaying the arr array elements: 
10	20	30	40	50	60	70	80	90	100	
Sum of all array elements is: 550
*/