package ArrayPrograms;
/*
 * The Java multidimensional arrays are arranged as an array of arrays
 * i.e. each element of a multi-dimensional array is another array.
 * The representation of the elements is in rows and columns.
 * Thus, you can get a total number of elements in a multidimensional array by multiplying row size with column size.
 * So if you have a two-dimensional array of 3×4, then the total number of elements in this array = 3×4 = 12.
 */
/*
 * The general declaration of a two-dimensional array is,
 * data_type [] [] array_name;
 * Here,
 * data_type = data type of elements that will be stored in an array.
 * array_name = name of the two-dimensional array.
 * You can create a 2D array using new as follows:
 * data_type [] [] array_name = new data_type[row_size][column_size];
 * Here,
 * row_size = number of rows an array will contain.
 * column_size = number of columns array will contain.
 */
/*
 * Initialize 2d Array
 * There are various ways of initializing the 2d array with values. The first method is the traditional method of assigning values to each element.
 * The general syntax for initialization is:
 * array_name[row_index][column_index] = value;
 */
public class MultiDimensionalArray_00 {

	public static void main(String[] args) {
        int[][] myarray = new int[2][2];
        myarray[0][0] = 1;
        myarray[0][1] =  myarray[1][0] =  0;
        myarray[1][1] = 1;
        System.out.println("Array elements are:");
        System.out.println("Accessing the array elements using index");
        System.out.println(myarray[0][0] + "\t" +myarray[0][1]);
        System.out.println(myarray[1][0] + "\t" +myarray[1][1]);
        System.out.println("Traversing using enhanced for loop");
        for(int[] i : myarray) {
        	for(int j : i) {
        		System.out.print(j+"\t");
        	}
        	System.out.println();
        }
    }
}
/*

Output:-
Array elements are:
Accessing the array elements using index
1	0
0	1
Traversing using enhanced for loop
1	0	
0	1	

*/