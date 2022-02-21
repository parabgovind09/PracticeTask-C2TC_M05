package DateTimePrograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/*
Java LocalDateTime class is an immutable date-time object that represents a date-time, 
with the default format as yyyy-MM-dd-HH-mm-ss.zzz. 
It inherits object class and implements the ChronoLocalDateTime interface.

Java LocalDateTime class declaration
Let's see the declaration of java.time.LocalDateTime class.

public final class LocalDateTime extends Object   
implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable  
 */
public class LocalDateTime_00 {

	public static void main(String[] args) {
		
		LocalDateTime datetime1 = LocalDateTime.now();  
	    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	    String formatDateTime = datetime1.format(format);   
	    System.out.println("Current Date and Time in dd-MM-yyyy HH:mm:ss format is: "+formatDateTime);  
		
		LocalDateTime now = LocalDateTime.now();  
        System.out.println("Current Date and Time Before Formatting: " + now);  
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime1 = now.format(format1);  
        System.out.println("Current Date and Time After Formatting: " + formatDateTime1);
        
        LocalDateTime datetime11 = LocalDateTime.of(2022, 2, 2, 17, 8);  
        LocalDateTime datetime21 = datetime11.minusDays(100);  
        System.out.println("Before Formatting: " + datetime21);  
        DateTimeFormatter format11 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
        String formatDateTime11 = datetime21.format(format11);   
        System.out.println("After Formatting: " + formatDateTime11 );
        
        LocalDateTime a = LocalDateTime.of(2022, 2, 2, 17, 8);    
        System.out.println(a.get(ChronoField.DAY_OF_WEEK));  
        System.out.println(a.get(ChronoField.DAY_OF_YEAR));  
        System.out.println(a.get(ChronoField.DAY_OF_MONTH));  
        System.out.println(a.get(ChronoField.HOUR_OF_DAY));  
        System.out.println(a.get(ChronoField.MINUTE_OF_DAY));
		
        LocalDateTime datetime111 = LocalDateTime.of(2017, 1, 14, 10, 34);  
        LocalDateTime datetime211 = datetime111.plusDays(120);  
        System.out.println("Before Formatting: " + datetime211);  
        DateTimeFormatter format111 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
        String formatDateTime111 = datetime211.format(format111);   
        System.out.println("After Formatting: " + formatDateTime111 );
        
        System.out.println("Current Date and Time is: "+LocalDateTime.now());
        LocalDate localdate = LocalDateTime.now().toLocalDate();
        LocalTime localtime = LocalDateTime.now().toLocalTime();
        System.out.println("Current Date is: "+localdate);
        System.out.println("Current Time is: "+localtime);
        
        
	}

}
