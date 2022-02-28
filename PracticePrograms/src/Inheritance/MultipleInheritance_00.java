package Inheritance;

interface Product{
	public void pro_name();
	public void pro_price();
}

interface Customer{
	public void cust_name();
	public void cust_gmail();
}


public class MultipleInheritance_00 implements Product, Customer{

	public static void main(String[] args) {
		MultipleInheritance_00 obj = new MultipleInheritance_00();
		obj.cust_name();
		obj.cust_gmail();
		obj.pro_name();
		obj.pro_price();
	}

	@Override
	public void cust_name() {
		System.out.println("Govind");
	}

	@Override
	public void cust_gmail() {
		System.out.println("parabgovind0909@gmail.com");
	}

	@Override
	public void pro_name() {
		System.out.println("Boat Headphone");
	}

	@Override
	public void pro_price() {
		System.out.println("900/-");
	}

}
