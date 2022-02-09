package Polymorphism;

public class MethodOverloading_00 {
	
	//by changing the number of arguments
	//by changing the data type
	int add(int a, int b) {
	int sum = a+b;
		return sum;
	}
	float add(float a, float b) {
	    float sum = a+b;
    	return sum;
	}
	float add(int a, float b, int c) {
		float sum = a+b+c;
		return sum;
	}
	float add(float a, int b, int c) {
		float sum = a+b+c;
		return sum;
	}
		/*
		not possible by changing the return type of method only
		double add(float a, int b, int c) {
		float sum = a+b+c;
		return sum;
		}
		*/

	public void add(int a, float b) {
		System.out.println("Addition is: "+(a+b));
		}
	public void add(int a, double b) {
		System.out.println("ADdition is: "+(a+b));
	}
	static long add(long a,int b) {
		long sum = a+b;
		return sum;
	}
	static long add(long a,long b) {
		long sum = a+b;
		return sum;
	}
	public static void main(String[] args) {
		MethodOverloading_00 obj = new MethodOverloading_00();
		obj.add(10, 10.20d);
		obj.add(10, 30.2f);
		System.out.println("Addition is: "+obj.add(10, 20));
		System.out.println("Addition is: "+obj.add(3.45f, 5.67f));
		System.out.println("Addition is: "+obj.add(10, 20.22f, 67));
		System.out.println("Addition is: "+obj.add(24.67f, 20, 100));
		System.out.println("Addition is: "+add(20l, 100));
		System.out.println("Addition is: "+add(20l, 120l));
	}

}
