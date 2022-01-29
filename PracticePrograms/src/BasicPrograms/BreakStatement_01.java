package BasicPrograms;
/*
Java Break Statement with Labeled For Loop
We can use break statement with a label.
The feature is introduced since JDK 1.5. So, we can break any loop in Java now whether it is outer or inner loop.
 */
public class BreakStatement_01 {
	
	static void lableLoop1() {
		System.out.println("Program to terminate the loop when the value of i and j will be equal to 2: ");
		aa:  
            for(int i = 1 ; i <= 3 ; i++){    
            	System.out.println("For Iterartion number : "+i+"\nValues of i and j are:");
                    bb:  
                    for(int j = 1 ; j <= 3 ; j++){    
                        if(i == 2 && j == 2){    
                        	System.out.println("Value of i is "+i+" and value of j is "+j+" which is equal so loop is terminated");
                            break aa;    
                        }    
                        System.out.println("i = "+i+"\tj = "+j);    
                    }
            }
		}
	
	static void labelLoop2() {
		boolean t = true;

		// label first
		first : {
			
		// Illegal statement here as label second is not introduced yet break second;
		second : {
		    third : {
			    System.out.println("Before the break statement from third block");
		    	if (t)
			    	break second;
    			System.out.println("This is inside third block");
	    	}
			System.out.println("This is inside second block");
		}
		System.out.println("This is inside first block");
		}
	}

	public static void main(String[] args) {
		lableLoop1();
		labelLoop2();
	}
}
/*
Output:-

Program to terminate the loop when the value of i and j will be equal to 2: 
For Iterartion number : 1
Values of i and j are:
i = 1	j = 1
i = 1	j = 2
i = 1	j = 3
For Iterartion number : 2
Values of i and j are:
i = 2	j = 1
Value of i is 2 and value of j is 2 which is equal so loop is terminated
Before the break statement from third block
This is inside first block

*/