//Array of objects or [Array of references] using constructor
package ArrayPrograms;
/*
 * When we require a single object to store in our program we do it with a variable of type Object.
 * But when we deal with numerous objects, then it is preferred to use an Array of Objects.
 * The array of Objects the name itself suggests that it stores an array of objects.
 * Unlike the traditional array stores values like String, integer, Boolean, etc an Array of Objects stores objects
 * that mean objects are stored as elements of an array.
 * Java allows us to store objects in an array. In Java, the class is also a user-defined data type.
 * An array that conations class type elements are known as an array of objects.
 * It stores the reference variable of the object.
 * Note that when we say Array of Objects it is not the object itself that is stored in the array
 * but the reference of the object.
 */

/*
 * An array of objects is created using the ‘Object’ class.
 * The following statement creates an Array of Objects.
 * Class_name [] objArray;
 * Alternatively, you can also declare an Array of Objects as shown below:
 * Class_nameobjArray[];
 * Both the above declarations imply that objArray is an array of objects.
 */

/*
 * So, if you have a class ‘Employee’ then you can create an array of Employee objects as given below:
 * Employee[] empObjects;
 * OR
 * Employee empObjects[];
 * The declarations of the array of objects above will need to be instantiated using ‘new’ before being used in the program.
 * You can declare and instantiate the array of objects as shown below:
 * Employee[] empObjects = new Employee[2];
 * Note that once an array of objects is instantiated like above,
 * the individual elements of the array of objects need to be created using new.
 * The above statement will create an array of objects ‘empObjects’ with 2 elements/object references.
 * Initialize Array Of Objects
 * Once the array of objects is instantiated, you have to initialize it with values.
 * As the array of objects is different from an array of primitive types,
 * you cannot initialize the array in the way you do with primitive types.
 * In the case of an array of objects, each element of array i.e. an object needs to be initialized.
 * We already discussed that an array of objects contains references to the actual class objects.
 * Thus, once the array of objects is declared and instantiated, you have to create actual objects of the class.
 * One way to initialize the array of objects is by using the constructors.
 * When you create actual objects, you can assign initial values to each of the objects by passing values to the constructor.
 * You can also have a separate member method in a class that will assign data to the objects.
 */

/*
 * Here we have used the class Employee.
 * The class has a constructor that takes in two parameters i.e. employee name and employee Id.
 * In the main function, after an array of employees is created, we go ahead and create individual objects of the class employee.
 * Then we pass initial values to each of the objects using the constructor.
 */
//Employee class with empId and name as attributes
class Employee{
	int empId;
	String name;
    //Employee class constructor
	Employee(int eid, String n){
		empId = eid;
		name = n;
		}
	public void showData(){

		System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
		System.out.println();
	}
}

public class OneDimensionalArray_04 {

	public static void main(String[] args) {
		//create array of employee object  
	    Employee[] obj = new Employee[2] ;
	 
	     //create & initialize actual employee objects using constructor
	     obj[0] = new Employee(100,"ABC");
	     obj[1] = new Employee(200,"XYZ");
	 
	     //display the employee object data
	     System.out.println("Employee Object 1:");
	     obj[0].showData();
	     System.out.println("Employee Object 2:");
	     obj[1].showData();
	     }
}
/*
Output:-

Employee Object 1:
EmpId = 100   Employee Name = ABC
Employee Object 2:
EmpId = 200   Employee Name = XYZ

*/