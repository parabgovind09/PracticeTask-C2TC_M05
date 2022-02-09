package ArrayPrograms;

class InfoStudent{
	String name;
	int roll_number;
	
	public InfoStudent(int roll_number, String name) {
		this.name = name;
		this.roll_number = roll_number;
	}
	
}
public class ArrayOfObject_00 {

	public static void main(String[] args) {
		// declares an Array of integers.
		InfoStudent[] arr;
		// allocating memory for 5 objects of type Student.
		arr = new InfoStudent[5];
		// initialize the first elements of the array
		arr[0] = new InfoStudent(1,"aman");
		// initialize the second elements of the array
		arr[1] = new InfoStudent(2,"vaibhav");
		// so on...
		arr[2] = new InfoStudent(3,"shikar");
		arr[3] = new InfoStudent(4,"dharmesh");
		arr[4] = new InfoStudent(5,"mohit");
		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
		System.out.println("Element at " + i + " : " +
		arr[i].roll_number +" "+ arr[i].name);
		
	}

}
