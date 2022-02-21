//thread program to print string passed by user
package ThreadPrograms;

import java.util.Scanner;

public class Thread_00 extends Thread{
	/*
	 * Java Thread class:-
	 * Java provides Thread class to achieve thread programming.
	 * Thread class provides constructors and methods to create and perform operations on a thread.
	 * Thread class extends Object class and implements Runnable interface.
	 */
	private static char arr[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "";
		try {
			System.out.println("Enter the message to be printed: ");
			message = sc.nextLine();
		}catch(Exception e) {
			
		}
		int length = message.length();
		arr = new char[length];
		arr = message.toCharArray();
		Thread_00 thread1 = new Thread_00();
		thread1.setName("thread1");
		thread1.start();
	}

	@Override
	public void run() {
		System.out.println("Printing the output for: "+Thread.currentThread().getName());
		for(int i = 0 ; i < arr.length ; i++) {
			try  
            {  
                Thread.sleep(500);  
            }
			catch(Exception e){
			}    
            System.out.print(arr[i]);        
		}
		System.out.println();
	}
}
/*
Output:-

Enter the message to be printed: 
Kite night
Printing the output for: thread1
Kite night
*/