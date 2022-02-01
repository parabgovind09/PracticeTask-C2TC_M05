package BasicPrograms;
/*
 * We can have a name of each Java for loop. To do so, we use label before the for loop.
 * It is useful while using the nested for loop as we can break/continue specific for loop.
 */
/*
Syntax:

label_name:    
for(initialization; condition; increment/decrement){    
   //code to be executed    
}    
 */
public class LabeledForLoop_00 {

	public static void main(String[] args) {
		System.out.println("Program to demonstrate the working of label for loop: \n");
		loop1:for(int i = 1 ; i < 100 ; i++) {
			System.out.println("\t");
			if(i >= 10) break;
			for(int j = 1 ; j < 100 ; j++) {
				System.out.print("*");
				if(j == i) continue loop1;
			}
		}
	}
}
/*
Output:-
Program to demonstrate the working of label for loop: 


*	
**	
***	
****	
*****	
******	
*******	
********	
*********	

*/