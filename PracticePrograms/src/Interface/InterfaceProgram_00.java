package Interface;

interface i1{
	void set(int x, int y);
}
interface i2{
	void disp();
}
class ImpClass implements i1,i2{
	int p =10;
	int q = 20;
	public int getP() {
		return p;
	}
	void incr() {
		p++;
		System.out.println("Incrementing value of p: "+p);
	}
	@Override
	public void disp() {
		System.out.println("implementing method of interface 2: disp method");
		System.out.println("Value of p is "+p);
		System.out.println("Value of q is "+q);
		
	}
	@Override
	public void set(int x, int y) {
		System.out.println("implementing method of interface 1: set method");
		this.p = x;
		this.q = y;
		System.out.println("p: "+p);
		System.out.println("q: "+q);
	}	
}
public class InterfaceProgram_00 {

	public static void main(String[] args) {
		ImpClass obj = new ImpClass();
		obj.set(100, 200);
		obj.disp();
		obj.incr();
		obj.disp();
	}

}
