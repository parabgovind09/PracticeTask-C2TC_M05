package BasicPrograms;
/*
 * In a Java program, operations can be performed on methods, constructors and initialization blocks.
 * Instance Initialization Blocks or IIB are used to initialize instance variables .
 * So firstly, constructor is invoked and the java compiler copies the instance initializer block in the constructor after the first statement super().
 * They run each time when object of the class is created. 
 * Initialization blocks are executed whenever the class is initialized and before constructors are invoked.
 */
public class InstanceBlock_01 {
	
	static String name;
	int age;
	String home_city;
	
	{
		System.out.println("This is First Instance Block");
		name = "Govind Rama Parab";
	}
	{
		System.out.println("This is Second Instance Block");
		age = 21;
	}
	InstanceBlock_01(){
		System.out.println("This is Default Constructor");
		System.out.println("Name : "+name+"\nHome City : "+home_city+"\nAge : "+age);
	}
	{
		System.out.println("This is Third Instance Block");
		home_city = "Mumbai";
	}
	public InstanceBlock_01(String city) {
		System.out.println("This is Parameterized Constructor");
		this.home_city = city;
		System.out.println("Updated Home City As : "+home_city);
	}
	public static void main(String[] args) {
		InstanceBlock_01 obj = new InstanceBlock_01();
		InstanceBlock_01 obj1 = new InstanceBlock_01("Delhi");
	}
}
/*
Output:-
This is First Instance Block
This is Second Instance Block
This is Third Instance Block
This is Default Constructor
Name : Govind Rama Parab
Home City : Mumbai
Age : 21
This is First Instance Block
This is Second Instance Block
This is Third Instance Block
This is Parameterized Constructor
Updated Home City As : Delhi

*/