package ArrayPrograms;
/*
 * Best use of anonymous array is to implement variable argument method which can be invoked with a different number
 * on arguments. these methods accept an array type and when code invokes this method it creates an anonymous array
 * of different length and pass to a method for processing.
 */
public class AnonymousArray_01 {

	public static void main(String[] args) {
		    //calling method with anonymous array argument
	        System.out.println("first total of numbers: " + sum(new int[]{ 1, 2,3,4}));
	        System.out.println("second total of numbers: " + sum(new int[]{ 1, 2,3,4,5,6,}));
	    }
	    //method which takes an array as argument
	    public static int sum(int[] numbers){
	        int total = 0;
	        for(int i: numbers){
	            total = total + i;
	        }
	        return total;
	}
}
/*
Output:-

first total of numbers: 10
second total of numbers: 21

*/