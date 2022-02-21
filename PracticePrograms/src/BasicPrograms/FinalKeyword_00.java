package BasicPrograms;

class Car{
	
	final int max_speed = 120;
	int max_speed1 = 130;
	
	void ControlSpeed() {
		//final variable can't be changed it will give you error
		//System.out.println(max_speed = 180);
		System.out.println(max_speed1 = 190);
	}
	
	final void run(){
		System.out.println("running");
	} 
}

final class Model extends Car{
	void display() {
		System.out.println("Hello from Model");
	}
	int cube(final int n){ 
		 //can't be changed as n is final 
	     //n=n+2; 
		 //n*n*n;  
		 return n; 
    }  
}

//class Tires extends Model{
	//shows error as final class cannot be extended
//}
public class FinalKeyword_00 {
	//static blank final variable 
	static final int data; 
    static{
    	data=50;
    	}  

	public static void main(String[] args) {
		
		System.out.println(FinalKeyword_00.data);
		
		Car obj = new Car();
		obj.ControlSpeed();
		obj.run();
		
		Model m = new Model();
		m.display();
		m.ControlSpeed();
		m.run();
		
		System.out.println(m.cube(4));
		
	}

}
