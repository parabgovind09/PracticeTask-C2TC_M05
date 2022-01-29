package BasicPrograms;
/*
The continue statement is used in loop control structure when you need to jump to the next iteration of the loop immediately.
It can be used with for loop or while loop.
The Java continue statement is used to continue the loop.
It continues the current flow of the program and skips the remaining code at the specified condition.
In case of an inner loop, it continues the inner loop only.
We can use Java continue statement in all types of loops such as for loop, while loop and do-while loop.
Syntax: - continue;
 */
public class ContinueStatement_00 {

	static void ForLoop(){
		System.out.println("From ForLoop() method");
		for(int i = 0 ; i < 10 ; i++) {
			if(i == 5) {
				continue;
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
					continue;
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
				continue;
			}
			System.out.print(i+"\t");
		}
	}
	
	static void doWhileLoop() {
		System.out.println("\nFrom doWhileLoop() method");
	    int i=1;  
	    do{  
	        if(i==5){ 
	        	i++;//to avoid loop to enter in infinite loop
	           continue; 
	        }  
	        System.out.print(i+"\t");  
	        i++;  
	    }while(i<=10);  
	}
	
	static void labelLoop() {
		System.out.println("\nFrom labelLoop() method");
		aa:  
            for(int i = 1 ; i <= 3 ; i++){    
                    bb:  
                    for(int j = 1 ; j <= 3 ; j++){    
                        if(i == 2 && j == 2){    
                            continue aa;    
                        }    
                        System.out.println(i+"\t"+j);    
                    }    
            }
	}
	
	public static void main(String[] args) {
		ForLoop();
		innerForLoop();
		whileLoop();
		doWhileLoop();
		labelLoop();
	}
}
/*
Output:-
From ForLoop() method
0	1	2	3	4	6	7	8	9	
From innerForLoop() method
For Iterartion number : 0
Values of i and j are:
i = 0 j = 1
i = 0 j = 2
i = 0 j = 3
i = 0 j = 4
For Iterartion number : 1
Values of i and j are:
i = 1 j = 0
i = 1 j = 2
i = 1 j = 3
i = 1 j = 4
For Iterartion number : 2
Values of i and j are:
i = 2 j = 0
i = 2 j = 1
i = 2 j = 3
i = 2 j = 4
For Iterartion number : 3
Values of i and j are:
i = 3 j = 0
i = 3 j = 1
i = 3 j = 2
i = 3 j = 4
For Iterartion number : 4
Values of i and j are:
i = 4 j = 0
i = 4 j = 1
i = 4 j = 2
i = 4 j = 3

From whileLoop() method
1	2	3	4	6	7	8	9	10	
From doWhileLoop() method
1	2	3	4	6	7	8	9	10	
From labelLoop() method
1 1
1 2
1 3
2 1
3 1
3 2
3 3
*/