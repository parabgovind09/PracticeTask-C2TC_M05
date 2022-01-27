//Program to print array elements in descending order
package ArrayPrograms.Exercise;

import java.util.Scanner;

public class Program_08 {

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
		sort(arr);
	}
	
	static void sort(int arr[]) {
		System.out.println("\nDisplaying the array elements in descending order: ");
		for(int i=0 ; i < arr.length ; i++) {
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		display(arr);
	}
	
	static void display(int[] arr) {
		for(int i : arr) {
			System.out.print(i+"\t");
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
5
Enter the array elements: 
89
arr[0] = 89
25
arr[1] = 25
-152
arr[2] = -152
897
arr[3] = 897
12
arr[4] = 12
Displaying the arr array elements: 
89	25	-152	897	12	
Displaying the array elements in descending order: 
897	89	25	12	-152	

*/