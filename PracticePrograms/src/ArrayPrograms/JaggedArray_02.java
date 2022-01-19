//Static Jagged Array Program
/*

Syntax: 

data_type array_name[][] = new data_type[n][];  //n: no. of rows
    array_name[] = new data_type[n1] //n1= no. of columns in row-1
    array_name[] = new data_type[n2] //n2= no. of columns in row-2
    array_name[] = new data_type[n3] //n3= no. of columns in row-3
                                   .
                                   .
                                   .
    array_name[] = new data_type[nk]  //nk=no. of columns in row-n
 */
/*

Alternative, ways to Initialize a Jagged array :

int arr_name[][] = new int[][]  {
    new int[] {10, 20, 30 ,40},
    new int[] {50, 60, 70, 80, 90, 100},
    new int[] {110, 120}
};
                                      
OR                                     
                                                         
int[][] arr_name = {
    new int[] {10, 20, 30 ,40},
    new int[] {50, 60, 70, 80, 90, 100},
    new int[] {110, 120}
};
                              
OR                                     
                                                         
int[][] arr_name = {
    {10, 20, 30 ,40},
    {50, 60, 70, 80, 90, 100},
    {110, 120}
};
 */

package ArrayPrograms;

public class JaggedArray_02 {

	public static void main(String[] args) {
		int arr[][] = new int[][] {
			new int[] {1,2,3},
			new int[] {4,5,6,7},
			new int[] {8,9}
		};
		System.out.println("Contents of 2D Jagged Array\n");
	    for (int i=0; i<arr.length; i++) {
	        for (int j=0; j<arr[i].length; j++) {
	            System.out.print(arr[i][j] + "\t");
	        }
	    System.out.println("\n");
	    }
	}
}

/*

Output:-

Contents of 2D Jagged Array

1	2	3	

4	5	6	7	

8	9	

 */