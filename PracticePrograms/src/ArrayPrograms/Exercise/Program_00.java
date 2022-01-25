//Program to copy all elements of one array into another array
package ArrayPrograms.Exercise;

import java.util.Scanner;

public class Program_00 {
	
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
			System.out.print(i+" ");
		}
		copy(arr);
		simplecopy(arr);
	}

	static void copy(int arr[]) {
		int copy_arr[] = new int[arr.length];
		System.out.println("\nCopying elements of arr into copy_arr");
		for(int i = 0 ; i < arr.length ; i++) {
			copy_arr[i] = arr[i];
		}
		System.out.println("Displaying the copy_arr array elements: ");
		for(int i : copy_arr) {
			System.out.print(i+" ");
		}
	}
	
	static void simplecopy(int arr[]) {
		int copy_arr1[] = new int[arr.length];
		System.out.println("\nCopying elements of arr into copy_arr1");
		copy_arr1 = arr;
		System.out.println("Displaying the copy_arr1 array elements: ");
		for(int i : copy_arr1) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Program_00.input(sc);
	}
}
/*
Output:-

Enter the size of array: 
5
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
Displaying the arr array elements: 
10 20 30 40 50 
Copying elements of arr into copy_arr
Displaying the copy_arr array elements: 
10 20 30 40 50 
Copying elements of arr into copy_arr1
Displaying the copy_arr1 array elements: 
10 20 30 40 50 

*/