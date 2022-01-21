package ArrayPrograms;
//Static Jagged Array Program
/*
Jagged array also called as Ragged array.
If we are creating odd numbers of columns in a 2D array then it is known as jagged array.
In other words, it is an array of arrays with different number of columns.
#Create and initialize Jagged array:-
while creating an array of arrays we need to specify the first dimension that represents a number of rows in the array.
Note:- if we don't explicitly initialize this array, then it will take the default value as initial value depending on the data type of array.
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
Alternative, ways to Initialize a Jagged array is by omitting the first new keyword                                           
int[][] arr_name = {
  new int[] {10, 20, 30 ,40},
  new int[] {50, 60, 70, 80, 90, 100},
  new int[] {110, 120}
};
                            
OR                                     
Alternative, ways to Initialize a Jagged array is by ommiting all the new operators altogether                                              
int[][] arr_name = {
  {10, 20, 30 ,40},
  {50, 60, 70, 80, 90, 100},
  {110, 120}
};
*/
public class JaggedArray_00 {

	public static void main(String args[]) {
		String arr[][] = new String[][] {
			new String[] {"India","China","Iran"},
			new String[] {"Bhutan","Nepal","Italy","Macao","Iraq","Yemen"},
			new String[] {"Japan","France","Qatar","Syria"},
			new String[] {"Oman"}
		};
		
		System.out.println("Contents of 2D Jagged Array are: \n");
	    for (int i=0; i<arr.length; i++)
	    {
	        for (int j=0; j<arr[i].length; j++) {
	            System.out.print(arr[i][j]+"\t");
	        }
	    System.out.println("\n");
	    }
	}
	
}
