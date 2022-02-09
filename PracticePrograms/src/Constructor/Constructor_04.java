package Constructor;

class Student
{
	int id;
	String name;
	String course;
	String email;	
	Student()
	{	
	}
	public Student(int id, String name, String course, String email) {
		
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
	}
	
	public void display()
	{
		System.out.println("Student information:");
		System.out.println("Student ID = "+id+"\n"+"Student Name = "+name+"\n"+"Student Course = "+course+"\n"+"Student Email = "+email);
	}
}

public class Constructor_04 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=1;
		s1.name="Govind";
		s1.course="JAVA";
		s1.email="parabgovind0909@gmail.com";
		s1.display();
		
		Student s2 = new Student(2,"Vishnu","C++","vishnuparab0909@gmail.com");
		s2.display();
	}

}