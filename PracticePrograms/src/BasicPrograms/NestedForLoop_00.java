package BasicPrograms;

public class NestedForLoop_00 {

	public static void main(String[] args) {
		System.out.println("Program to demonstrate the working of Nested For Loop: ");
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 10 ; j < 12; j++) {
				System.out.println("i = "+i+"\tj = "+j);
			}
		}
	}
}
/*
Output:-

Program to demonstrate the working of Nested For Loop: 
i = 0	j = 10
i = 0	j = 11
i = 1	j = 10
i = 1	j = 11
i = 2	j = 10
i = 2	j = 11
i = 3	j = 10
i = 3	j = 11

*/