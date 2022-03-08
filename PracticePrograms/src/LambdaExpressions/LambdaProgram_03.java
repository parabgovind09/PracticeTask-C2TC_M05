package LambdaExpressions;

public class LambdaProgram_03 {

	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello World inside Runnable");
			}
			
		});
		th.run();
		
		
		Thread lambda1 = new Thread(() -> System.out.println("Hello World from Lambda Runnable"));
		lambda1.run();
	}

}
