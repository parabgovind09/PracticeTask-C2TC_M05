package BasicPrograms;
/*
The for-each loop is used to traverse array or collection in Java.
It is easier to use than simple for loop because we don't need to increment value and use subscript notation.

It works on the basis of elements and not the index.
It returns element one by one in the defined variable.
 */
public class ForEachLoop_00 {

	public static void main(String[] args) {
		System.out.println("Program to demonstrate the working of For each loop:\n");
		String array[] = {"India","China","Japan","Italy","Germany","Bangladesh","Afghanistan","Sri Lanka","Pakistan"};
		for(String i : array) {
			System.out.print(i+"\t");
		}
	}
}
/*
Output:-

Program to demonstrate the working of For each loop:

India	China	Japan	Italy	Germany	Bangladesh	Afghanistan	Sri Lanka	Pakistan	

*/