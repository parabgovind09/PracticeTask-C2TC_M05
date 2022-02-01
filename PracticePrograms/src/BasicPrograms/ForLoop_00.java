package BasicPrograms;
/*
The Java for loop is used to iterate a part of the program several times.
If the number of iteration is fixed, it is recommended to use for loop.
 */
/*
There are three types of for loops in Java.

Simple for Loop
For-each or Enhanced for Loop
Labeled for Loop
*/
/*
It consists of four parts:
  
Initialization:
It is the initial condition which is executed once when the loop starts.
Here, we can initialize the variable, or we can use an already initialized variable.
It is an optional condition.

Condition:
It is the second condition which is executed each time to test the condition of the loop.
It continues execution until the condition is false. It must return boolean value either true or false.
It is an optional condition.

Increment/Decrement:
It increments or decrements the variable value. It is an optional condition.

Statement:
The statement of the loop is executed each time until the second condition is false.
 */
/*
Syntax:-
for(initialization; condition; increment/decrement){    
    //statement or code to be executed    
}    
 */
public class ForLoop_00 {

	public static void main(String[] args) {
		System.out.println("Program to demonstrate simple for loop working: ");
		for(int i = 0 ; i < 10 ; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}
}
/*
Output:-
Program to demonstrate simple for loop working: 
0
1
2
3
4

*/