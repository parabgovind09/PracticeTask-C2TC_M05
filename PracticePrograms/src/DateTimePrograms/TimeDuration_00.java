package DateTimePrograms;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
 * Java Duration class is used to measures time in seconds and nanoseconds.
 * It inherits the Object class and implements the Comparable interface.
 */
public class TimeDuration_00 {

	public static void main(String[] args) {
		
		Duration d1 = Duration.between(LocalTime.MAX,LocalTime.NOON);  
	    System.out.println(d1.isNegative());  
	    Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d2.isNegative());
	    Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d.get(ChronoUnit.SECONDS));   
		Duration d11 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d11.get(ChronoUnit.SECONDS));
	    Duration d111 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d111.getSeconds());  
	    Duration d211 = d111.minus(d111);  
	    System.out.println(d211.getSeconds()); 
	    Duration d12 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d12.getSeconds());  
	    Duration d22 = d12.plus(d12);  
	    System.out.println(d22.getSeconds());
	}

}
