package CollectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class VectorProgram_00 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Initial Capacity = "+v.capacity());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		v.add(90);
		v.add(100);
		System.out.println("Till tenth element vector capacity = "+v.capacity());
		v.add(110);
		System.out.println("After tenth element vector capacity = "+v.capacity());
		v.remove((Integer)60);
		v.removeElementAt(4);
		System.out.println(v);
		
		
		Vector v1 = new Vector<>();
		v1.add("Govind");
		v1.addAll(v);
		v1.addElement("Parab");
		System.out.println(v1);
		System.out.println("Size = "+v1.size());
		v.clear();
		System.out.println(v);
		System.out.println(v.isEmpty());
		
		Vector v2 = new Vector<>(v1);
		v2.add(5, 100);
		System.out.println(v2);
		System.out.println(v2.firstElement());
		System.out.println(v2.get(5));
		System.out.println(v2.indexOf(100));
		System.out.println(v2.lastElement());
		System.out.println(v2.lastIndexOf(100));
		v1.removeAll(v1);
		System.out.println(v1);
		v2.set(2,"Govind");
		
		Iterator i = v2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
