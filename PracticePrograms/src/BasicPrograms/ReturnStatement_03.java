package BasicPrograms;

//Java program to illustrate usage of
//statement after return statement

//Main class
public class ReturnStatement_03 {

	// Since return type of RR method is void
	// so this method should return any value
	// Method 1
	void demofunction(double j)
	{
		return;

		// Here get compile error since can't
		// write any statement after return keyword
		//j++;
	}
	
	void demofunction1(double val)
    {
 
        // Condition check
        if (val < 0) {
 
            System.out.println(val);
            return;
 
            // System.out.println("oshea");
        }
        else
            ++val;
            System.out.println(val);
    }

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{

		// Calling the above defined function
		new ReturnStatement_03().demofunction(5);
		new ReturnStatement_03().demofunction1(5);
		new ReturnStatement_03().demofunction1(-1);
	}
}
/*
6.0
-1.0
*/