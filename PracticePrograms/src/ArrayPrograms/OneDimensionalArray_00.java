package ArrayPrograms;
/*
 * Java array is an object which contains elements of a similar data type.
 * Additionally, The elements of an array are stored in a contiguous memory location.
 * It is a data structure where we store similar elements.
 * We can store only a fixed set of elements in a Java array.
 * Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
 * Since arrays are objects in Java, we can find their length using the object property length.
 * This is different from C/C++, where we find length using sizeof.
 * Java array can be also be used as a static field, a local variable, or a method parameter.
 * The size of an array must be specified by int or short value and not long.
 * The direct superclass of an array type is Object.
 * Every array type implements the interfaces Cloneable and java.io.Serializable.
 * An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class depending on the definition of the array.
 * In the case of primitive data types, the actual values are stored in contiguous memory locations.
 * In the case of class objects, the actual objects are stored in a heap segment.
 * byte byteArray[];
 * short shortsArray[];
 * boolean booleanArray[];
 * long longArray[];
 * float floatArray[];
 * double doubleArray[];
 * char charArray[];
 * MyClass myClassArray[]; //an array of references to objects of the class MyClass (a class created by user)
 * Object[]  ao; //array of Object
 * Collection[] ca; //array of Collection of unknown type
 */

/*
 * JVM throws ArrayIndexOutOfBoundsException to indicate that the array has been accessed with an illegal index.
 * The ArrayIndexOutOfBoundsException occurs whenever we are trying to access any item of an array at an
 * index which is not present in the array. In other words, the index may be negative or exceed the size of an array.
 */

/*
 * If we don’t assign values to array elements, and try to access them,
 * the compiler does not produce error as in case of simple variables.
 * Instead it assigns values which aren’t garbage.
 * Like C++, Java automatically creates default constructor if there is no default or parameterized constructor written by user,
 * and (like C++) the default constructor automatically calls parent default constructor.
 * But unlike C++, default constructor in Java initializes member data variable to default values
 * (numeric values are initialized as 0, booleans are initialized as false and references are initialized as null).
 * Below are the default assigned values.
 * boolean : false
 * int : 0
 * double : 0.0
 * String : null
 * User Defined Type : null
 */

/*
 * Obtaining an array is a two-step process.
 * First, you must declare a variable of the desired array type.
 * Second, you must allocate the memory to hold the array, using new, and assign it to the array variable.
 * Thus, in Java, all arrays are dynamically allocated.
 */

/*
 * One-Dimensional Arrays: The general form of a one-dimensional array declaration is:
 * data_type var_name[];
 * OR
 * data_type[] var_name;
 */

/*
 * declaration:- declaration is not to declare "value" to a variable; it's to declare the type of the variable.
 * A declaration states the type of a variable, along with it's name. A variable can be declared only once.
 * It is used by the compiler to help programmers to avoid mistakes such as assigning string values to integer variables.
 * Before reading or assigning a variable, that variable must have been declared.
 * In short, declaration means no memory is allocated, no value is stored. 
 * This only states in the program that there will be an object of a certain type existing and what the name of that object will be.
 * 
 * instantiation:- instantiation means memory is allocated to array i.e an instance of array is created here and default values will be stored.
 * 
 * initialization:-it's a special kind of assignment: or you can say the first.
 * It simply means to give an initial values.
 * Before initialization objects have null values and primitive have default values such as 0 or false.
 * 
 * assignment:- Simply means throwing away the old value of a variable and replacing it with a new one.
 */
public class OneDimensionalArray_00 {

	public static void main(String[] args) {
		//declaration
		int arr[];
		
		//instantiation
		arr = new int[4];
		
		//traversing array before initializing the values by using advanced for loop
		for(int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println("\n");
		
		//initialization
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		//traversing the array after initializing the values by using advanced for loop
		for(int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println("\n");
		//assignment
		arr[2] = 40;
		arr[3] = 50;
		
		//traversing the array after assigning the values by using for loop
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
}
/*
Output:-

0	0	0	0	

10	20	30	40	

arr[0] = 10
arr[1] = 20
arr[2] = 40
arr[3] = 50

*/