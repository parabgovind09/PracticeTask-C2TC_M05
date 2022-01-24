//Array of object or [Array of references] using method
package ArrayPrograms;
/*
 * In this program, we have an Employee class that has employee Id (empId) and employee name (name)
 * as fields and ‘setData’ & ‘showData’ as methods that assign data to employee objects and display the
 * contents of employee objects respectively.
 * In the main method of the program, we first define an array of Employee objects.
 * Note that this is an array of references and not actual objects.
 * Then using the default constructor, we create actual objects for the Employee class.
 * Next, the objects are assigned data using the setData method.
 * Lastly, objects invoke the showData method to display the contents of the Employee class objects.
 */
//Employee class with empId and name as attributes
class Employee1{
  int empId;
  String name;
  public void setData(int c,String d){
      empId=c;
      name=d;
   }
  public void showData(){
      System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
      System.out.println();
   }
}

public class OneDimensionalArray_05 {

	public static void main(String[] args) {
		//create array of employee object  
	     Employee1[] obj = new Employee1[2] ;
	 
	     //create actual employee object
	     obj[0] = new Employee1();
	     obj[1] = new Employee1();
	 
	     //assign data to employee objects
	     obj[0].setData(100,"ABC");
	     obj[1].setData(200,"XYZ");
	 
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