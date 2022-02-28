package Inheritance;

class ParentClass{
	void displayBase() {
		System.out.println("This is Base Class");
	}
}
class ChildClassOne extends ParentClass{
    void displDerivedClassOne() {
    	System.out.println("This is Derived Class 1");
    }
}
class ChildClassTwo extends ChildClassOne{
	void dispDerivedClassTwo() {
		System.out.println("This is Derived Class 2");
	}
}
public class MultiLevelInheritance_00 {

	public static void main(String[] args) {
		ChildClassTwo obj = new ChildClassTwo();
		obj.displayBase();
		obj.displDerivedClassOne();
		obj.dispDerivedClassTwo();
	}
}