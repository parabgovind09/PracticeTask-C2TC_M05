package AnnotationExamples;

import java.lang.annotation.Annotation;

@Animals(name = "Tiger", legs=4)
class Carnivorous_Animal{
	String name;
	int legs;
	String food[];
	public Carnivorous_Animal(String name, int legs, String food[]) {
		super();
		this.name = name;
		this.legs = legs;
		this.food = food;
	}
	
}

public class AnnotationDemo_01 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Carnivorous_Animal obj = new Carnivorous_Animal("Leopard",4,new String[]{"Rabbit","Donkey","Monkey","Zebra"});
		System.out.println("Name of Animal is "+obj.name);
		System.out.println(obj.name+" has "+obj.legs+" legs");
		for(String i : obj.food) {
			System.out.println(obj.name+" eats "+i+" to fullfill his stomach");
		}
		Class c  = obj.getClass();
		Annotation an = c.getAnnotation(Animals.class);
		Animals a = (Animals)an;
		System.out.println("Name of Animal is "+a.name());
		System.out.println(a.name()+" has "+a.legs()+" legs");
		for(String i : a.food()) {
			System.out.println(a.name()+" eats "+i+" to fullfill his stomach");
		}
	}

}
