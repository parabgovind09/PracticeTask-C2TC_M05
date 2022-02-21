package ThreadPrograms;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		
		Thread_01 thread1 = new Thread_01("First", 2000);
		Thread_01 thread2 = new Thread_01("Second", 4000);

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		}

		catch (Exception e) {

		}

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println("main" + i);
		}
	}

}