package BasicPrograms;
/*
 * An empty statement in java is written as a single semicolon.
 * The empty statement doesn't do anything, but the syntax is occasionally useful.
 */
/*
 * These are not infinite loop but can be made to work as infinite loop. 
 * These are just included to create a time delay or just to cover the code space which you don't want to currently typed.
 */
public class EmptyStatement_00 {

	public static void main(String[] args) {
		int age = 0;
		if(age < 18) {
			System.out.println();
		}
		for(int i = 0 ; i < 5000 ; i ++) {
			System.out.println();
		}
	}
}
