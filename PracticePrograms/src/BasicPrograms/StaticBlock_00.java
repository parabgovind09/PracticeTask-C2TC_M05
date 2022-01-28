package BasicPrograms;
/*
 * Java provides special block that gets executed even before initializing static member and even before constructor.
 * It is done by defining static block, which gets executed only once i.e when first time that class gets loaded or we say
 * before its first method execute.
 * We can also define multiple static blocks in a single program. 
 * A class can have any number of static initialization blocks, and they can appear anywhere in the class body.
 * The runtime system guarantees that static initialization blocks are called in the order that they appear in the source code.
 * The static block is a block of statement inside a Java class that will be executed when a class is first loaded into the JVM.
 * A static block helps to initialize the static data members, just like constructors help to initialize instance members.
 * Static block is also known as static initialization block or static initializer block in Java.
 * A static block in java can not be declared inside any method.
*/

/*
 * There are mainly three uses of static block in java that are as follows:
 * 1. The purpose of using a static initialization block is to write that logic inside static block
 * that is executed during the class loading. 
 * 2. It is mostly used for changing default value of static variables.
 * 3. It is used to initialize static variables of the class.
 */
public class StaticBlock_00 {
	static {
		System.out.println("Hello I am First Static Block");
	}
	static {
		System.out.println("Hello I am Second Static Block");
	}
	static void show() {
		System.out.println("This is Show Method");
	}
	void display() {
		System.out.println("This is Display Method");
	}
	static {
		System.out.println("Hello I am Third Static Block");
	}
	static {
		System.out.println("Hello I am Fourth Static Block");
	}
	public static void main(String args[]) {
		StaticBlock_00 obj = new StaticBlock_00();
		obj.display();
		show();
	}
}
/*
Output:-
Hello I am First Static Block
Hello I am Second Static Block
Hello I am Third Static Block
Hello I am Fourth Static Block
This is Display Method
This is Show Method

*/