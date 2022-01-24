//Three – dimensional Array (3D-Array)
package ArrayPrograms;
/*
 * A three dimensional can be defined as an array of two-dimensional arrays.
 * The general definition of a Three-dimensional array is given below:
 * data_type [] [] [] array_name = new data_type [d1][d2][d3];
 * Here,
 * d1, d2, d3 = sizes of the dimensions
 * data_type = data type of the elements of the array
 * array_name = name of the 3d array
 * Example of 3d array definition is:
 *  int [] [] [] intArray = new int[2][3][4];
 *  The above definition of 3d array can be interpreted as having 2 tables or arrays, 3 rows and 4 columns
 *  that totals up to 2x3x4 = 24 elements.
 *  The number of Tables/Arrays: The first dimension indicates how many tables or arrays a 3d array will have.
 *  The number of Rows: The second dimension signifies the total number of rows an array will have.
 *  The number of Columns: The third dimension indicates the total columns in the 3d array.
 */
/*
 * Indirect Method of Declaration:
 * Declaration – Syntax:
 * data_type[][][] array_name = new data_type[x][y][z];
 * For example: int[][][] arr = new int[10][20][30];
 * Initialization – Syntax:
 * array_name[array_index][row_index][column_index] = value;
 * For example: arr[0][0][0] = 1;
 */
/*
 * Direct Method of Declaration:
 * Syntax:
 * data_type[][][] array_name = {
 *                               {
 *                                {valueA1R1C1, valueA1R1C2, ....}, 
 *                                {valueA1R2C1, valueA1R2C2, ....}
 *                               },
 *                               {
 *                                {valueA2R1C1, valueA2R1C2, ....}, 
 *                                {valueA2R2C1, valueA2R2C2, ....}
 *                               }
 *                              };
 * For example: int[][][] arr = { {{1, 2}, {3, 4}}, {{5, 6}, {7, 8}} };
 */
public class MultiDimensionalArray_05 {

	/*
	 * The above program displays a tabular representation of a three-dimensional array. As shown,
	 * it is a 3x2x3 array which means that it has 3 tables, 2 rows and 3 columns and thus 18 elements.
	 */
	public static void main(String[] args) {
        //initialize 3-d array
        int[][][] myArray = { { { 1, 2, 3 }, { 4, 5, 6 } },  { { 1, 4, 9 }, { 16, 25, 36 } },
                { { 1, 8, 27 }, { 64, 125, 216 } } }; 
        System.out.println("3x2x3 array is given below:");
        //print the 3-d array
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 2; j++) { 
        		for (int k = 0; k < 3; k++) { 
        			System.out.print(myArray[i][j][k] + "\t"); 
        			}
        		System.out.println(); 
        		} 
        	System.out.println(); 
        	} 
        }
}
/*
Output:-

3x2x3 array is given below:
1	2	3	
4	5	6	

1	4	9	
16	25	36	

1	8	27	
64	125	216	

*/