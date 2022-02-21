//Basic input types
package ScannerPrograms;

import java.util.Scanner;

public class Scanner_00 {
	
	static void nextByte(Scanner sc) {
		System.out.println("This is nextByte() example");
		try {
			byte a = sc.nextByte();
			System.out.println("You entered : "+a);
		}catch(Exception e) {
			System.out.println("Please enter valid input");
			sc.nextLine();;
		}
	}
	
	static void nextInt(Scanner sc) {
		System.out.println("This is nextInt() example");
		try {
			int b = sc.nextInt();
			System.out.println("You entered : "+b);
		}catch(Exception e) {
			System.out.println("Please enter valid input");
			sc.nextLine();
		}
	}

	static void nextFloat(Scanner sc) {
		System.out.println("This is nextFloat() example");
		try {
	        System.out.println("Enter the amount: ");  
	        float amount = sc.nextFloat();  
	        System.out.println("Enter the Total Balance: ");  
	        float balance = sc.nextFloat();  
	        //Reduce amount+fee from balance  
	        balance = (float) (balance-(amount + 0.50));  
	        //Print new balance  
	        System.out.println("New Balance is: "+balance);  
		}catch(Exception e) {
			System.out.println("Please enter valid input");
			sc.nextLine();
		}
	}
	
	static void nextDouble(Scanner sc) {
		System.out.println("This is nextDouble() example");
		try {
	        System.out.println("Enter the first number to be added: ");  
	        double num1 = sc.nextDouble();  
	        System.out.println("Enter the second number to be added: ");  
	        double num2 = sc.nextDouble();  
	        double add = num1 + num2;  
	        System.out.println("Addition of two number is: "+add);  
		}catch(Exception e) {
			System.out.println("Please enter valid input");
			sc.nextLine();
		}
	}
	
	static void nextBoolean(Scanner sc) {
		System.out.println("This is nextBoolean() example");
		boolean truth;
		do {
			truth = false;
			try {
				System.out.println("Are you human ?");
				boolean c = sc.nextBoolean();
				System.out.println(c);
			}catch(Exception e) {
				System.out.println("Please enter bool value either true or false");
				truth = true;
				sc.nextLine();
			}
		}while(truth);
	}
	
	static void nextLong(Scanner sc) {
		System.out.println("This is nextLong() example");
		try {
			long l = sc.nextLong();
			System.out.println("You entered : "+l);
		}catch(Exception e) {
			System.out.println("Please enter valid input");
			sc.nextLine();;
		}
	}
	
	static void nextShort(Scanner sc) {
		System.out.println("This is nextShort() example");
		try {
			short s = sc.nextShort();
			System.out.println("You entered : "+s);
		}catch(Exception e) {
			System.out.println("Please enter valid input");
			sc.nextLine();;
		}
	}
	
	static void next(Scanner sc) {
		System.out.println("This is next() example");
		try {
			System.out.println("Enter your First name: ");
			String fname = sc.next();
			System.out.println("Your First name is stored as: "+fname);
			sc.nextLine();
		}catch(Exception e) {
			System.out.println("Please enter valid input");
			sc.nextLine();
		}
	}
	
	static void nextLine(Scanner sc) {
		System.out.println("This is nextLine() example");
		try {
			System.out.println("Enter your Full name: ");
			String fullname = sc.nextLine();
			System.out.println("Your Full name is stored as: "+fullname);
		}catch(Exception e) {
			System.out.println("Please enter valid input");
			sc.nextLine();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner_00.nextByte(sc);
		Scanner_00.nextInt(sc);
		Scanner_00.nextFloat(sc);
		Scanner_00.nextDouble(sc);
		Scanner_00.nextBoolean(sc);
		Scanner_00.nextLong(sc);
		Scanner_00.nextShort(sc);
		Scanner_00.next(sc);
		Scanner_00.nextLine(sc);
	}
}
