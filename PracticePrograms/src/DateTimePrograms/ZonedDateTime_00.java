package DateTimePrograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
Java ZonedDateTime class is an immutable representation of a date-time with a time-zone.
It inherits Object class and implements the ChronoZonedDateTime interface.

ZonedDateTime class is used to store all date and time fields, to a precision of nanoseconds,
and a time-zone with a zone offset used to handle ambiguous local date-times.
 */

public class ZonedDateTime_00 {
	
	static void display(String arr[]) {
		for(String i :arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) { 
		
		ZonedDateTime zone0= ZonedDateTime.now();
		System.out.println("Current Date and Time is: "+zone0);
		System.out.println("The current date and time displayed are from "+zone0.getZone()); 
		
		ZonedDateTime zone1= ZonedDateTime.now();  
	    ZonedDateTime m = zone1.minus(Period.ofDays(126));  
	    System.out.println("Date and Time after subtracting 126 days fromcureent date and time is: "+m);
		
		ZonedDateTime zone2= ZonedDateTime.now();  
	    ZonedDateTime p = zone2.plus(Period.ofDays(126));  
	    System.out.println("Date and Time after adding 126 days to current date and time is: "+p); 
	    
	    ZonedDateTime zone3 = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");  
	    System.out.println("Date and Time is: "+zone3); 
	    
	    ZonedDateTime zone4 = ZonedDateTime.of(LocalDate.now(),LocalTime.now(),ZoneId.systemDefault());
	    System.out.println("Current Date and Time of "+zone4.getZone()+" is: "+zone4);
	    
	    LocalDateTime  ldt = LocalDateTime.of(2017, Month.JANUARY,  19,   15,   26);  
	    ZoneId  india = ZoneId.of("Asia/Kolkata");   
	    ZonedDateTime zone11  = ZonedDateTime.of(ldt, india);   
	    System.out.println("In India Central Time Zone: " + zone11);  
	    ZoneId  tokyo = ZoneId.of("Asia/Tokyo");   
	    ZonedDateTime zone21   = zone11.withZoneSameInstant(tokyo);   
	    System.out.println("In Tokyo Central Time Zone:"  + zone21);
	    
	    display(new String[]{ZonedDateTime.now().toString(),ZonedDateTime.now().plusHours(1).toString(),ZonedDateTime.now().minusHours(2).toString()});
	}
}
