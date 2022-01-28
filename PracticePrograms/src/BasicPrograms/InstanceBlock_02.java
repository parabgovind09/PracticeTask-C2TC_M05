package BasicPrograms;
/*
There are mainly three rules for the instance initializer block. They are as follows:
The instance initializer block is created when instance of the class is created.
The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
The instance initializer block comes in the order in which they appear.
 */
class A{
	{
		System.out.println("This is Second Instance Block which is inside the class A");
	}
	A(){
		System.out.println("This is class A Default Constructor");
	}
	A(String name){
		System.out.println("This is class A Paramerterized Constructor");
		System.out.println("Name : "+name);
	}
}
class B extends A{
	{
	    System.out.println("This is Third Instance Block which is inside the class B");
	}
	/*
	 * whenever a child class constructor gets invoked it implicitly invokes the constructor of parent class.
	 * You can also say that compiler inserts a super(); statement at the beginning of a child class constructor.
	 */
	B(){
		super("Govind");
		System.out.println("This is class B Default Constructor");
	}
	B(int age){
		System.out.println("This is class B Paramerterized Constructor");
		System.out.println("Age : "+age);
	}
}
public class InstanceBlock_02 {

	public static void main(String[] args) {
		// Declaring instance block inside main method
        {
            System.out.println("This is First Instance block which is inside the main method which is called without creating an object");
        }
        B obj = new B();
        B obj1 = new B(21);
	}
}
/*
Output:-

This is First Instance block which is inside the main method which is called without creating an object
This is Second Instance Block which is inside the class A
This is class A Paramerterized Constructor
Name : Govind
This is Third Instance Block which is inside the class B
This is class B Default Constructor
This is Second Instance Block which is inside the class A
This is class A Default Constructor
This is Third Instance Block which is inside the class B
This is class B Paramerterized Constructor
Age : 21

*/