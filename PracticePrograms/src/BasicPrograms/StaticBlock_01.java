package BasicPrograms;

public class StaticBlock_01 {

	int a = 10;
	int b;
	static int c = 25;
	void func1() {
		System.out.println("The values are: ");
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);
		System.out.println("c value is: "+c);
	}
	static void func2() {
		int d = 19;
		c = 30;
		//since the static method cannot use non static data member or call non static method directly the below two lines
		//System.out.println("a value is: "+a); //will show error
		//System.out.println("a value is: "+b); //will show error
		System.out.println("d value is: "+d);
		System.out.println("c value is: "+c);
	}
	static {
		System.out.println("Hii im a static block");
		//System.exit(0);
	}

	public static void main(String[] args) {
		System.out.println("From main method : c value is "+StaticBlock_01.c);
		StaticBlock_01 obj = new StaticBlock_01();
		obj.func1();
		StaticBlock_01.func2();
	}

}
/*
Output:-

Hii im a static block
From main method : c value is 25
The values are: 
a value is: 10
b value is: 0
c value is: 25
d value is: 19
c value is: 30

*/