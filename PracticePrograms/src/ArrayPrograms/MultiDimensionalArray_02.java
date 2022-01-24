package ArrayPrograms;
/*
 * Java 2d Array Length
 * A two-dimensional array is defined as the array of a one-dimensional array.
 * Thus, when you need the length of a 2d array it is not as straightforward as in a one-dimensional array.
 * The length property for a two-dimensional array returns the number of rows in the array.
 * Each row is a one-dimensional array. You already know that the two-dimensional array consists of rows and columns.
 * The column size may vary for each row.
 * Hence you can obtain the size of each row by iterating through the number of rows.
 * The following program gives the length of the array (number of rows) as well as the size of each row.
 */
public class MultiDimensionalArray_02 {

	public static void main(String[] args) {
        //initialize 2-d array
        int[][] myArray = { { 1, 2, 3 }, { 4, 5 } }; 
        System.out.println("length of array:" + myArray.length); //number of rows
        for(int i=0;i<myArray.length;i++) {
            //length of each row
            System.out.println("length of 1D array(" + (i+1) +"):" + myArray[i].length);
            for(int j : myArray[i]) {
            	System.out.print(j+"\t");
            }
            System.out.println();
        }
	}
}
/*
Output:-

length of array:2
length of 1D array(1):3
1	2	3	
length of 1D array(2):2
4	5	

*/