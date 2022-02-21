package AnnotationExamples;

import java.lang.annotation.Annotation;

@SmartPhone(os = "Android", version=6)
class Nokia_series{
	String model;
	int screensize;
	public Nokia_series(String model, int screensize) {
		super();
		this.model = model;
		this.screensize = screensize;
	}
	
}
public class AnnotationDemo_00 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Nokia_series obj = new Nokia_series("Fire",4);
		System.out.println(obj.model);
		System.out.println(obj.screensize);
		Class c  = obj.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os());
		System.out.println(s.version());
	}

}
