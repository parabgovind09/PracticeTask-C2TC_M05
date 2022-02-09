package Constructor;

public class Constructor_00 {
	String fname,lname, subject;
	int age, marks;
	char grade;
	public Constructor_00() {
		System.out.println("This is non-parameterized constructor");
		this.fname = "Govind";
	}
	
	public Constructor_00(String lname, int age) {
		this();
		System.out.println("This is parameterized constructor");
		this.lname=lname;
		this.age=age;
	}
	
	public Constructor_00(String subject, int marks, char grade) {
		this("Parab",21);
		System.out.println("This is parameterized constructor");
		this.subject=subject;
		this.marks=marks;
		System.out.println("First Name is: "+fname);
		System.out.println("Last Name is: "+lname);
		System.out.println("Age is: "+age);
		System.out.println("Subject Name is: "+subject);
		System.out.println("Marks are: "+marks);
		System.out.println("Grade is: "+grade);
	}

	public static void main(String[] args) {
		Constructor_00 obj = new Constructor_00("Maths",85,'B');
		System.out.println("Updatings values and printing final result: ");
		obj.marks=90;
		obj.grade='A';
		System.out.println();
		System.out.println("First Name is: "+obj.fname);
		System.out.println("Last Name is: "+obj.lname);
		System.out.println("Age is: "+obj.age);
		System.out.println("Subject Name is: "+obj.subject);
		System.out.println("Marks are: "+obj.marks);
		System.out.println("Grade is: "+obj.grade);
	}
}
