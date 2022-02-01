package BasicPrograms;
/*
In Java, type casting is a method or process that converts a data type into another data type in both ways manually
and automatically. The automatic conversion is done by the compiler and manual conversion performed by the programmer.
 */
/*
Converting a lower data type into a higher one is called widening type casting.
It is also known as implicit conversion or casting down. It is done automatically.
It is safe because there is no chance to lose data. It takes place when:

Both data types must be compatible with each other.

The target type must be larger than the source type.

byte -> short -> char -> int -> long -> float -> double  
 */
public class WideningCasting_00 {

	public static void main(String[] args)  
	{  
	int x = 7;  
	//automatically converts the integer type into long type  
	long y = x;  
	//automatically converts the long type into float type  
	float z = y;  
	System.out.println("Before conversion, int value "+x);  
	System.out.println("After conversion, long value "+y);  
	System.out.println("After conversion, float value "+z);  
	}
}
/*
 * Output:-

Before conversion, int value 7
After conversion, long value 7
After conversion, float value 7.0

*/