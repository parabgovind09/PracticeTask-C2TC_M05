package BasicPrograms;
/*
 * In java, multiple variables can be initialized in the initialization block of for loop regardless of 
 * whether you use it in the loop or not.
 */
public class ForLoop_01 {
/*
 * Variables declared in the initialization block must be of same type.
 * Variables that are declared in the initialization block can be accessed only within the loop.
 */
	public static void main(String[] args) {
		int x = 2;
		for(long y = 0 , z = 4 ; x < 10 && y < 10 ; x++ , y++) {
			System.out.println("y = "+y+"\t"+"x = "+x);
		}
		System.out.println("x = "+x);
	}
}
/*
Output:-
y = 0	x = 2
y = 1	x = 3
y = 2	x = 4
y = 3	x = 5
y = 4	x = 6
y = 5	x = 7
y = 6	x = 8
y = 7	x = 9
x = 10

*/