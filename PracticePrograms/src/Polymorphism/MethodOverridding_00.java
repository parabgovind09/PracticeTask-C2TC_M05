package Polymorphism;

class Bank{
	float getRateOfInterest() {
		System.out.println("This is base class");
		return 6.7f;
	}
}
class SBI extends Bank{
	float getRateOfInterest() {
		System.out.println("This is SBI class");
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
		System.out.println("This is ICICI class");
		return 6.9f;
	}
}

public class MethodOverridding_00 {

	public static void main(String[] args) {
		SBI obj = new SBI();
		System.out.println(obj.getRateOfInterest());
		Bank obj1 = new SBI();
		System.out.println(obj1.getRateOfInterest());
		Bank obj2 = new ICICI();//dynamic binding
		System.out.println(obj2.getRateOfInterest());
	}

}
