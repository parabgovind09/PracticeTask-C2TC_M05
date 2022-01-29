package BasicPrograms;
/*
 * Java supports three types of jump statements: break, continue, and return.
 * These statements transfer control of execution to another part of the program.
 */
import java.util.Scanner;

/*
Break Statement is a loop control statement that is used to terminate the loop.
As soon as the break statement is encountered from within a loop,
the loop iterations stop there, and control returns from the loop immediately to the first statement after the loop. 
Syntax: break;
Basically, break statements are used in situations when we are not sure about the actual number of iterations
for the loop or we want to terminate the loop based on some condition. 
 */
/*
 * Note: Break, when used inside a set of nested loops, will only break out of the innermost loop.
 */
public class BreakStatement_00 {
	
	static void ForLoop(){
		System.out.println("From ForLoop() method");
		for(int i = 0 ; i < 10 ; i++) {
			if(i == 5) {
				break;
			}
			System.out.print(i+"\t");
		}
	}
	
	static void innerForLoop() {
		System.out.println("\nFrom innerForLoop() method");
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("For Iterartion number : "+i+"\nValues of i and j are:");
			for(int j = 0 ; j < 5 ; j++) {
				if(i == j) {
					break;
				}
				System.out.println("i = "+i+" j = "+j);
			}
		}
	}
	
	static void whileLoop() {
		int i = 0;
		System.out.println("\nFrom whileLoop() method");
		while(i < 10) {
			i++;
			if(i == 5) {
				break;
			}
			System.out.print(i+"\t");
		}
	}
	
	static void doWhileLoop() {
		System.out.println("\nFrom doWhileLoop() method");
	    int i=1;  
	    do{  
	        if(i==5){  
	           break; 
	        }  
	        System.out.print(i+"\t");  
	        i++;  
	    }while(i<=10);  
	}
	
	static void switchCase() {
		System.out.println("\nFrom switchCase() method");
		char ch='O';    
	    switch(ch)  
	    {  
	        case 'a':   
	            System.out.println("Vowel");  
	            break;  
	        case 'e':   
	            System.out.println("Vowel");  
	            break;  
	        case 'i':   
	            System.out.println("Vowel");  
	            break;  
	        case 'o':   
	            System.out.println("Vowel");  
	            break;  
	        case 'u':   
	            System.out.println("Vowel");  
	            break;  
	        case 'A':   
	            System.out.println("Vowel");  
	            break;  
	        case 'E':   
	            System.out.println("Vowel");  
	            break;  
	        case 'I':   
	            System.out.println("Vowel");  
	            break;  
	        case 'O':   
	            System.out.println("Vowel");  
	            break;  
	        case 'U':   
	            System.out.println("Vowel");  
	            break;  
	        default:   
	            System.out.println("Consonant");  
	    } 
	}
	
	public static void main(String[] args) {
		ForLoop();
		innerForLoop();
		whileLoop();
		doWhileLoop();
		switchCase();
	}
}
/*
Output:-

From ForLoop() method
0	1	2	3	4	
From innerForLoop() method
For Iterartion number : 0
Values of i and j are:
For Iterartion number : 1
Values of i and j are:
i = 1 j = 0
For Iterartion number : 2
Values of i and j are:
i = 2 j = 0
i = 2 j = 1
For Iterartion number : 3
Values of i and j are:
i = 3 j = 0
i = 3 j = 1
i = 3 j = 2
For Iterartion number : 4
Values of i and j are:
i = 4 j = 0
i = 4 j = 1
i = 4 j = 2
i = 4 j = 3

From whileLoop() method
1	2	3	4	
From doWhileLoop() method
1	2	3	4	
From switchCase() method
Vowel


*/