package LambdaExpressions;
//without lambda
interface Greeting{
	void display();
	void print();
}

interface Greeting1{
	void show();
}

class A {
	void greet(Greeting greeting) {
		greeting.display();
		greeting.print();
	}
}


class B {
	void greet1(Greeting1 greeting1) {
		greeting1.show();
	}
}

class ShowWorld implements Greeting1{

	@Override
	public void show() {
		System.out.println("Show Hello World");
	}
	
}

class HelloWorld implements Greeting{

	@Override
	public void display() {
		System.out.println("Display Hello World");
	}

	@Override
	public void print() {
		System.out.println("Print Hello World");
	}
}
public class LambdaProgram_00{

	public static void main(String[] args) {
		A a = new A();
		HelloWorld obj1 = new HelloWorld();
		a.greet(obj1);
		
		ShowWorld obj2 = new ShowWorld();
		B b = new B();
		b.greet1(obj2);
	}
}
