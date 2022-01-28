package BasicPrograms;
/*

The top five differences between instance block and static block in java are as follows:

1. Static block is also known as a static initialization block whereas instance block is also known as instance initialization block or non-static block.

2. They execute before the instance block whereas instance block executes after the static blocks.

3. Only static variables can be accessed inside the static block whereas both static and non-static variables can be accessed inside the instance block.

4. Static blocks execute when the class is loaded into the memory whereas instance blocks execute only when instance of the class is created.

5. ‘this’ keyword cannot be used in the static block whereas this keyword can be used in the instance block.

 */

/*
 * If the keyword “static” is missed before block then the block is called non-static block (instance block)
 * that is executed when class is instantiated.
 */

/*
 * Since Dot class file is loaded into the memory only one time.
 * So, only one time static block will be executed.
 * Instance block’s execution depends upon the object creation.
 * If we create 10 objects, 10 times instance blocks will be executed but the execution of static block
 * depends upon the class loading.
 * Since the class is loaded only one time So, static block will be executed only one time.  
 */
public class InstanceBlock_00 {

	/*
	 * Initializer block contains the code that is always executed whenever an instance is created.
	 * It is used to declare/initialize the common part of various constructors of a class.
	 */
	// Initializer block starts..
    {
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
    // Initializer block ends
 
    public InstanceBlock_00()
    {
        System.out.println("Default Constructor invoked");
    }
    public InstanceBlock_00(int x)
    {
        System.out.println("Parameterized constructor invoked");
    }
    public static void main(String arr[])
    {
    	InstanceBlock_00 obj1, obj2;
        obj1 = new InstanceBlock_00();
        obj2 = new InstanceBlock_00(0);
    }
}
/*
Output:-

Common part of constructors invoked !!
Default Constructor invoked
Common part of constructors invoked !!
Parameterized constructor invoked

*/