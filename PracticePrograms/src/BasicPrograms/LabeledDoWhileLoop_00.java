package BasicPrograms;

public class LabeledDoWhileLoop_00 {

	public static void main(String[] args) {
		int i = 5 ,j = 5; 
		loop1:do {
			i++;
			loop2:do {
				System.out.println("i = "+i+"\tj = "+j);
				j++;
				if(i==9) {
					break loop1;
				}
			}while(j < 10);
		}while(i < 10);
	}
}
/*
Output:-
i = 6	j = 5
i = 6	j = 6
i = 6	j = 7
i = 6	j = 8
i = 6	j = 9
i = 7	j = 10
i = 8	j = 11
i = 9	j = 12

*/