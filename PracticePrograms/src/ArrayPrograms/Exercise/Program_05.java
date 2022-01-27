//Program to find the smallest element in array
package ArrayPrograms.Exercise;

import java.util.Scanner;

public class Program_05 {
	
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
		smallestElement(arr);
	}
	
	static void smallestElement(int arr[]) {
		System.out.println("\nDisplaying the smallest array element: ");
		for(int i=0 ; i < arr.length ; i++) {
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[0]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		input(sc);
	}
}
/*
Output:-
Enter the size of array: 
5
Enter the array elements: 
120
arr[0] = 120
-45
arr[1] = -45
-99
arr[2] = -99
568
arr[3] = 568
1
arr[4] = 1
Displaying the arr array elements: 
120	-45	-99	568	1	
Displaying the smallest array element: 
-99
*/