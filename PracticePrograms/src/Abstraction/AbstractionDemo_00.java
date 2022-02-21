package Abstraction;

abstract class Bank{
	abstract float getRateOfInterest();
	void display() {
		System.out.println("Abstarct Class Base1");
	}
}
class SBI extends Bank{

	@Override
	float getRateOfInterest() {
		return 7.0f;
	}
}
class HDFC extends Bank{
	float getRateOfInterest() {
		return 6.8f;
	}
}
class ICICI extends Bank{
	float getRateOfInterest() {
		System.out.println("This is ICICI1 class");
		return 6.9f;
	}
}

public class AbstractionDemo_00 {

	public static void main(String[] args) {
		Bank obj1 = new SBI();
		System.out.println(obj1.getRateOfInterest());
		Bank obj2 = new ICICI();
		System.out.println(obj2.getRateOfInterest());
		SBI obj = new SBI();
		System.out.println(obj.getRateOfInterest());
	}

}
