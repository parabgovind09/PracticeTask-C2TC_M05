package ExceptionHandling.CustomException;

import java.util.Scanner;

public class UserDefinedException_00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter student id: ");
		int id=sc.nextInt();
		
		if(id>100)
		{
			System.out.println("Student found");
		}
		else
		{
			try
			{
				throw new StudentIDNotFoundException(id);
			}
			catch(StudentIDNotFoundException se)
			{
				System.out.println(se.toString());  //	System.out.println(se);
				System.out.println(se.getMessage());
			}
		}
	}
}
