package BasicPrograms;

public class LabeledWhileLoop_00 {

	public static void main(String[] args) {
		int i = 0, j =0;
		loop1:while(i < 5) {
			System.out.println("i = "+i);
			i++;
			loop2:while(j < 5) {
				if(j == 3) {
					break loop1;
				}
				System.out.println("j = "+j);
				j++;
			}
		}
	}
}
/*
Output:-
i = 0
j = 0
j = 1
j = 2
*/