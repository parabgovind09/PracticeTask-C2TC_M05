package ArrayPrograms;

public class OneDimensionalArray_01 {

	public static void main(String[] args) {
		//declaration and instantiation
		String arr[] = new String[4];
		
		//traversing array before initializing the values by using advanced for loop
		for(String i : arr) {
			    System.out.print(i+"\t");
			}
			System.out.println("\n");
		
		//initialization
		arr[0] = "India";
		arr[1] = "China";
		arr[2] = "Nepal";
		arr[3] = "Bhutan";
		
		//traversing array after initializing the values by using advanced for loop
		for(String i : arr) {
			    System.out.print(i+"\t");
			}
			System.out.println("\n");
	}
}
/*
Output:-

null	null	null	null	

India	China	Nepal	Bhutan	

*/