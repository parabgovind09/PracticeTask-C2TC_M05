package LambdaExpressions;
//functional interface -> the one which has only one method
interface ia{
	void dis();
}

interface ib{
	int add(int a);
}

interface ic{
	void mul(int b);
}

interface id{
	float add(float c, float d, int e);
}

interface ie{
	int disp(String f);
}

public class LambdaProgram_02 {

	public static void main(String[] args) {
		
		
		ia lambda1 = () -> System.out.println("Hello World");
		lambda1.dis();
		System.out.println("-------------------------------------------------------------------------------");
		ib lambda2 = (int a) -> a+a;
		System.out.println("Addition is: "+lambda2.add(5));
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Multiplication Table is: ");
		ic lambda3 = (int b) -> {
			for(int i = 1 ; i <= 10 ; i++) {
				System.out.println(b+" * "+i+" = "+i*b);
			}
		};
		lambda3.mul(5);
		System.out.println("-------------------------------------------------------------------------------");
		id lambda4 = (float c, float d,int e) -> {
			return c+d+e;
		};
		System.out.println("Addition is : "+lambda4.add(5f, 6f, 10));
		System.out.println("-------------------------------------------------------------------------------");
		ie lambda5 = (String f) -> f.length();
		System.out.println("String length is: "+lambda5.disp("Govind Rama Parab"));
	}
}