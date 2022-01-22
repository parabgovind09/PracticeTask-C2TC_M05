package ArrayPrograms;
/*
 * If there is no use of array after some lines then we should use an anonymous array.
 * We can’t access elements of the anonymous array using an index.
 */
/*
 * To understand the use of anonymous array check below program, arithmeticOperation(-,-) method.
 * We want to write a method which takes two number as parameters and return its sum, subtraction, and multiplication.
 * Using primitive data type we can return only one value so we need to use array.
 * In the below program, arithmeticOperation(-,-) method return add, sub, and mul values of the given numbers.
 */
/*
 * Now, how to write the logic to return add, sub, and multiply values. We will see the all three ways and compare them.
 * 
 * The first way is by using array creation with values.
 * In array creation with values, first calculate the values of add, sub, mul and then create an int array
 * with these values and return them.
 * code:-
 * static int[] arithmeticOperation(int a, int b){
 * int add = a+b;
 * int sub = a-b;
 * int multiply = a*b;
 * int[] arr = {add, sub, multiply};
 * return arr;
 * }
 * 
 * The second way is using array creation without explicit value or with default value.
 * Here we must create an array having size of 3.
 * Later calculate the add, sub, and multiple, and store them into the array. After storing return the array.
 * code:-
 * static int[] arithmeticOperation(int a, int b){
 * int[] arr = new int[3];
 * arr[0] = a+b;
 * arr[1] = a-b;
 * arr[2] = a*b;
 * return arr;
 * }
 * 
 * In the third way i.e using anonymous array simply calculate the add, sub, and multiply and return it.
 * code discussed below:-
 */

/*
 * In the first two ways of array creation, we created an array variable that needs memory to store array elements.
 * Using Anonymous array we can do the same without using any extra memory.
 * Lines of code also increased in those two ways in comparison to an anonymous array.
 * The most important thing to note that there is no use of these array after the return.
 * We are creating these arrays only to return the values otherwise there is no use of any array in this method.
 * So, we should use an anonymous array.
 */
public class AnonymousArray_02 {

	public static void main(String[] args) {
		
	    int[] a = new int[3];
	    a = AnonymousArray_02.arithmeticOperation(10, 5);
	    System.out.println("Sum = "+a[0]);
	    System.out.println("Sub = "+a[1]);
	    System.out.println("mul = "+a[2]);
	  }

	  static int[] arithmeticOperation(int a, int b){
	    int add = a+b;
	    int sub = a-b;
	    int mul = a*b;
	    // return values using anonymous array
	    return (new int[]{add, sub, mul});
	  }
}
/*
Output:-

Sum = 15
Sub = 5
mul = 50

*/