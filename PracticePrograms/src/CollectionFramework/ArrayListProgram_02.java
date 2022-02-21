package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

class Car
{
	int model_no;
	String modal_name;
	int model_version;
	
	public Car(int no, String name, int version)
	{
		this.model_no = no;
		this.modal_name = name;
		this.model_version = version;
	}
	public String toString()
	{
		String str="Student is ["+model_no+","+modal_name+","+model_version+"]";
		return str;
		
	}
}

class Employee
{
	int id;
	String name;
	String email;
	Float salary;
	
	public Employee(int id, String name, String email, Float salary) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public String toString()
	{
		String str="("+id+","+name+","+email+","+salary+")";
		return str;
	}
}


public class ArrayListProgram_02 {

	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		
		Car s1=new Car(101,"Honda",1);
		Car s2=new Car(102,"Nano",2);
		Integer i=new Integer(100);
		String s="Collection Exmaple";
		Float f=new Float(22.22f);
		Character ch=new Character('C');
		Employee e1=new Employee(101,"Govind","parabgovind0909@gmail.com",40000.0f);
		Employee e2=new Employee(102,"Touhid","sayyedtouhid@gmail.com",41000.0f);
		Employee e3=new Employee(103,"Suraj","prajapatisuraj@gmail.com",45000.0f);
		Employee e4=new Employee(104,"Sahil","parabsahil@gmail.com",40000.0f);
		
		ArrayList  al1=new ArrayList();
		al1.add(0, i);
		al1.add(1, s);
		al1.add(s1);
		al1.add(s2);
		
		System.out.println("Size:" +al1.size());
		
		ArrayList  al2=new ArrayList(al1);
		al2.add(e1);
		al2.add(e2);
		al2.add(e3);
		al2.add(e4);
		al2.addAll(al1);
		
		System.out.println("Size:" +al2.size());
			
		Iterator i1=al2.iterator();
		while(i1.hasNext())
		{
			Object o=i1.next();
			System.out.println(o);	
		}	
	}
}
