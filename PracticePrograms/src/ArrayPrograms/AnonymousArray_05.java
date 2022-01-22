//taking input from console
package ArrayPrograms;

import java.util.Scanner;

class Student{
	String name;
	int roll_no;
	
	public Student(Scanner sc) {
		System.out.println("Enter Student Name: ");
		this.name = sc.nextLine();
		System.out.println("Enter Student Roll Number: ");
		this.roll_no = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Student name = " + name + ", roll_no = " + roll_no;
	}
}

class Teacher{
	String name;
	String subject;
	
	public Teacher(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter Teacher name: ");
		this.name = sc.nextLine();
		System.out.println("Enter Subject Name: ");
		this.subject = sc.nextLine();
	}

	@Override
	public String toString() {
		return "Teacher name = " + name + ", subject = " + subject;
	}
}

public class AnonymousArray_05 {
	
	void display(Object o[]) {
		for(Object i : o) {
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		AnonymousArray_05 obj = new AnonymousArray_05();
		Student obj1 = new Student(sc);
		Teacher obj2 = new Teacher(sc);
	    obj.display(new Object[] {obj1,obj2});
	}
}
/*
Output:-

Enter Student Name: 
Govind Rama Parab
Enter Student Roll Number: 
30
Enter Teacher name: 
Ankita Kale
Enter Subject Name: 
Database Management System
Student name = Govind Rama Parab, roll_no = 30
Teacher name = Ankita Kale, subject = Database Management System

*/