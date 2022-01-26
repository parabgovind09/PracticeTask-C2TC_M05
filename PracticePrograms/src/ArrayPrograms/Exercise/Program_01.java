//Program to print array elements in reverse order
package ArrayPrograms.Exercise;

import java.util.Scanner;

public class Program_01 {

	static void input(Scanner sc) {
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
		}
		reverseElements(arr);
	}
	
	static void reverseElements(int arr[]) {
		System.out.println("\nDisplaying the array elements in reverse order: ");
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		input(sc);
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
Displaying the array elements in reverse order: 
100	90	80	70	60	50	40	30	20	10	

*/