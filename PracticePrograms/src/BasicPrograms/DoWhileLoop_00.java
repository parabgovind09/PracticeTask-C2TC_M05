package BasicPrograms;
/*
 * If the number of iteration is not fixed and you must have to execute the loop at least once, then it is recommended to use
 * do while loop
 */
public class DoWhileLoop_00 {

	public static void main(String[] args) {
		int i =1;
		do {
			System.out.print(i+"\t");
			i++;
		}while(i <= 10);
	}
}
/*
output:-
1	2	3	4	5	6	7	8	9	10	
*/