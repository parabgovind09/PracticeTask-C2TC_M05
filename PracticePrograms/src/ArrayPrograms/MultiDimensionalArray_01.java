package ArrayPrograms;
/*
 * The next method of initializing the 2d array in Java is by initializing the array at the time of declaration only.
 * The general syntax for this initialization method is as given below:
 * data_type[][] array_name = {{val_r1c1,val_r1c2,...val_r1cn},
 *                             {val_r2c1, val_r2c2,...val_r2cn}, …
 *                             {val_rnc1, val_rnc2,…val_rncn}};
 *For Example, if you have a 2×3 array of type int, then you can initialize it with the declaration as:
 *int [][] intArray = {{1, 2, 3},
 *	                   {4, 5, 6}};
 *Note:- In this syntax, the commas are required after each brace that closes off the row except in the case of the last row
 */
public class MultiDimensionalArray_01 {

	public static void main(String[] args) {
        //2-d array initialized with values    
       int[][] intArray = { { 1, 2 }, { 3, 4 },{5,6}}; 
       //print the array
       System.out.println("Initialized Two dimensional array:");
       for (int i = 0; i < 3; i++) { 
           for (int j = 0; j < 2; j++) { 
           System.out.print(intArray [i][j] + "\t"); 
           } 
           System.out.println(); 
       } 
   }
/*
Output:-

Initialized Two dimensional array:
1	2	
3	4	
5	6	

 */
}
