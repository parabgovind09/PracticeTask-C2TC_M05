package LambdaExpressions;
//without lambda
interface in{
	public void dis();
	public void show();
}

class Z {
	public void getdis(in i) {
		i.dis();
		i.show();
	}
}

public class LambdaProgram_01 {

	public static void main(String[] args) {
		Z z = new Z();
		z.getdis(new in() {

			@Override
			public void show() {
				System.out.println("Show World");
				
			}

			@Override
			public void dis() {
				System.out.println("Display World");
			}
		});
	}

}
