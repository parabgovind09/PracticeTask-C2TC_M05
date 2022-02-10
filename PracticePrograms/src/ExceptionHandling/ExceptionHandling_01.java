package ExceptionHandling;

public class ExceptionHandling_01 {

	public static void main(String[] args) {
		int arr[] = new int[4];
		try {
			arr[3] = 35;
			System.out.println("In try block");
		}
		catch(ArrayIndexOutOfBoundsException ae){
			ae.printStackTrace();
			System.out.println("Exception in try block");
		}
		catch(ArithmeticException ae){
		System.out.println("Exception in try block");
		}
		finally {
			System.out.println("In finally block");
		}
		System.out.println("In the class");
	}
}
