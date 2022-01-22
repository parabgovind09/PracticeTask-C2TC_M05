package ArrayPrograms;

class Order{
	String order_name;
	int order_number;
	
	
	public Order(String order_name, int order_number) {
		this.order_name = order_name;
		this.order_number = order_number;
	}


	@Override
	public String toString() {
		return "order_name = " + order_name + ", order_number=" + order_number;
	}
}

class Customer{
	String customer_name;
	String customer_address;
	
	public Customer(String customer_name, String customer_address) {
		this.customer_name = customer_name;
		this.customer_address = customer_address;
	}

	@Override
	public String toString() {
		return "customer_name = " + customer_name + ", customer_address=" + customer_address;
	}
}

public class AnonymousArray_04 {
	
	void display(Object o[]) {
		for(Object i : o) {
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		AnonymousArray_04 obj = new AnonymousArray_04();
		Order obj1 = new Order("Veg Soup",101);
		Customer obj2 = new Customer("Govind","Mumbai");
		obj.display(new Integer[] {10,20,30,40,50});
		System.out.println("\n");
	    obj.display(new Object[] {obj1,obj2});
	}
}
/*
Output:-

10
20
30
40
50


order_name = Veg Soup, order_number=101
customer_name = Govind, customer_address=Mumbai

*/