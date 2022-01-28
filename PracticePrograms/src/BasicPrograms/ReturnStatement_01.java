package BasicPrograms;

import java.util.Scanner;

public class ReturnStatement_01 {

	ReturnStatement_01(){
		System.out.println("This is Default Constructor");
	}
	
	double sum(double a, double b) {
		double add;
		add = a + b;
		return add;
	}
	
	static int CompareNum(Scanner sc)
    {   
        System.out.println("Enter the value of First Number: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of Second Number: ");
        int y = sc.nextInt();
        System.out.println("Value of x = " + x + "\nValue of y = " + y);  
        if(x>y)  
            return x;  
        else  
            return y;  
    }
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(new ReturnStatement_01().sum(5.5, 6.5));
		System.out.println("Largest Value is "+ReturnStatement_01.CompareNum(sc));
	}
}
/*
Output:-

This is Default Constructor
12.0
Enter the value of First Number: 
12
Enter the value of Second Number: 
15
Value of x = 12
Value of y = 15
Largest Value is 15


*/