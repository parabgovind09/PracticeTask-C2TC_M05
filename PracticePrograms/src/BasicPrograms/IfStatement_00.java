package BasicPrograms;

import java.util.Scanner;

public class IfStatement_00 {
	
	static void tables(Scanner sc) {
		int a = 0;
		System.out.println("Enter the Number: ");
		try {
			a = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Enter valid whole number as input");
			sc.close();
			System.exit(0);
		}
		for(int i = 1 ; i <= 10 ; i++) {
			if(i == 2) {
				break;
			}
			for(int j = 1 ; j <= 10 ; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		tables(sc);
	}
}
/*
Output:-

Enter the Number: 
5
1 * 1 = 1
1 * 2 = 2
1 * 3 = 3
1 * 4 = 4
1 * 5 = 5
1 * 6 = 6
1 * 7 = 7
1 * 8 = 8
1 * 9 = 9
1 * 10 = 10

*/