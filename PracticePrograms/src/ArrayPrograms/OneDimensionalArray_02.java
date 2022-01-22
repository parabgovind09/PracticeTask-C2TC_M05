//Taking input from console for array element and passing array as an argument to method and returning array from method 
//and printing the sum of array elements
package ArrayPrograms;

import java.util.Scanner;

public class OneDimensionalArray_02 {
	
	static int[] input (Scanner sc) {
		int arr[] = null;
		try {
			System.out.println("Enter the size of the array: ");
			System.out.println();
			int size = sc.nextInt();
			arr = new int[size];
			System.out.println("Enter the array elements: ");
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.println("arr["+i+"] = ");
				arr[i] = sc.nextInt();
			}
		}catch(Exception e) {
			System.out.println("Enter valid data of integer type");
			System.exit(0);
		}
		return arr;
	}
	
	static void display(int arr[]) {
		System.out.println("Displaying the array elements: ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		OneDimensionalArray_02.sum(arr);
	}
	
	static void sum(int arr[]) {
		int s = 0;
		System.out.println("\nDisplaying the sum of array elements: ");
		for(int i = 0 ; i < arr.length ; i++) {
			s = s + arr[i];
		}
		System.out.println("\nSum of array elements is: "+s);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OneDimensionalArray_02.display(OneDimensionalArray_02.input(sc));
	}
}

/*
Output:-

Enter the size of the array: 
5
Enter the array elements: 
arr[0] = 
10
arr[1] = 
20
arr[2] = 
30
arr[3] = 
40
arr[4] = 
50
Displaying the array elements: 
arr[0] = 10
arr[1] = 20
arr[2] = 30
arr[3] = 40
arr[4] = 50

Displaying the sum of array elements: 

Sum of array elements is: 150

*/