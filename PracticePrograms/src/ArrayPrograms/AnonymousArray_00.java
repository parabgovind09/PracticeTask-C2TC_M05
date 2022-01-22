package ArrayPrograms;
/*
 * An array in Java without any name is known as an anonymous array.
 * It is an array just for creating and using instantly.
 * Using an anonymous array, we can pass an array with user values without the referenced variable.
 * For Anonymous array creation, do not mention size in []. The number of values passing inside {} will become the size.
 * Anonymous array is just create, initialize and use it, Since it doesn't have any name you can not reuse it.
 * Generally, an anonymous array is passed as an argument of a method.
 * Syntax:-
 * new <data type>[]{<list of values with comma separator>};
 */
public class AnonymousArray_00 {

	public static void main(String[] args)
	{
		// anonymous array
		sum(new String[]{ "India", "China", "Pakistan" });
	}

	public static void sum(String[] strings)
	{
		// using for-each loop
		for (String i : strings) {
			System.out.println("Country: " + i);
		}
	}
}
/*
Output:-

Country: India
Country: China
Country: Pakistan

*/