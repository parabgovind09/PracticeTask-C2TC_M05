package ArrayPrograms;

public class ArrayLiterals_01 {

	public static void main(String[] args) {
		int arr[] = {1,3,45,67,76,99};
		//iterating through array by using normal for loop
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
}
/*

Output:-

arr[0] = 1
arr[1] = 3
arr[2] = 45
arr[3] = 67
arr[4] = 76
arr[5] = 99

*/