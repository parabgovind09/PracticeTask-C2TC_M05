package Polymorphism;

class Base{
	int x;
	Base(int x){
		this.x = x;
	}
	void display() {
		System.out.println("From Base Class x = "+x);
	}
}
class Child extends Base{
	int y;
	Child(int x, int y) {
		super(x);
		super.display();
		this.y = y;
	}
	void dispaly() {
		System.out.println("From child class x = "+x);
		System.out.println("from child class y = "+y);
	}
	
}
public class MethodOverridding_02 {

	public static void main(String[] args) {
		Base ob = new Base(90);
		ob.display();
		System.out.println();
		
		Child obj = new Child(10,20);
		obj.dispaly();
		//obj.display();
		System.out.println();
		
		Base obj1 = new Child(20,30);//dynamic binding
		obj1.display();
	}

}
