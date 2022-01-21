package ArrayPrograms;
/*
 * Array Literal:-
 * In a situation where the size of the array and variables of the array are already known, array literals can be used. 
 * int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; //Declaring array literal
 * The length of this array determines the length of the created array.
 */
public class ArrayLiterals_00 {

	public static void main(String[] args) {
		String arr[] = {"India","China","Pakistan","Nepal","Sri Lanka","Bhutan","Bangladesh"};
		//using for-each loop to iterate the array elements
		for(String i : arr) {
			System.out.println(i);
		}
	}
}
/*
Output:-

India
China
Pakistan
Nepal
Sri Lanka
Bhutan
Bangladesh

*/