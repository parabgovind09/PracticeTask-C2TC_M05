package ArrayPrograms;
/*
 * It is already mentioned that the column size can vary in a multi-dimensional array.
 * The example below demonstrates a three-dimensional array with varied column sizes.
 */
public class MultiDimensionalArray_06 {

	public static void main(String[] args) {
        //initialize 3-d array
        int[][][] intArray = {
              {{10, 20, 30},{20, 40, 60}}, 
              { {10, 30,50,70},{50},{80, 90}} 
              };
    System.out.println("Multidimensional Array (3-d) is as follows:");
    // use for..each loop to iterate through elements of 3d array
    for (int[][] array_2D: intArray) {
        for (int[] array_1D: array_2D) {
            for(int elem: array_1D) {
            System.out.print(elem + "\t");
             }
           System.out.println();
        }
        System.out.println();
    }
  }
}
/*
Output:-
Multidimensional Array (3-d) is as follows:
10	20	30	
20	40	60	

10	30	50	70	
50	
80	90	

*/