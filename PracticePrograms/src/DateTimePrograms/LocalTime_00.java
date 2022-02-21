package DateTimePrograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
Java LocalTime class is an immutable class that represents time with a default format of hour-minute-second.
It inherits Object class and implements the Comparable interface.

Java LocalTime class declaration
The declaration of java.time.LocalTime class.

public final class LocalTime extends Object   
implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable  
 */
public class LocalTime_00 {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();  
	    System.out.println("The Current Time is: "+time); 
	    
	    LocalTime time1 = LocalTime.of(10,43,12);  
	    System.out.println("The Time is: "+time1); 
	      
	    LocalTime time2 = time.minusHours(2);  
	    LocalTime time3 = time.minusMinutes(34);  
	    System.out.println("Current Time is "+LocalTime.now()+" and time before 2hrs was: "+time2);
	    System.out.println("Current Time is "+LocalTime.now()+" and time before 34min was: "+time3); 
	    
	    
	    LocalTime time21 = time.plusHours(4);  
	    LocalTime time31 = time.plusMinutes(18);  
	    System.out.println("Current Time is "+LocalTime.now()+" and time after 4hrs will be: "+time21);
	    System.out.println("Current Time is "+LocalTime.now()+" and time after 18min will be: "+time31);
	    
	    
        LocalTime time331 = LocalTime.parse("09:32:42");
        LocalDate date331 = LocalDate.parse("2018-12-05");
        LocalDateTime local = time331.atDate(date331);
        System.out.println("Date and Time: "+ local.toString());
        
        
        LocalTime time001 = LocalTime.parse("17:52:49");
        LocalTime time002 = LocalTime.parse("13:08:00");
        int value001 = time001.compareTo(time002);
        if (value001 > 0)
            System.out.print("LocalTime1 is greater");
        else if (value001 == 0)
            System.out.print("LocalTime1 is equal to"+ " LocalTime2");
        else
            System.out.print("LocalTime2 is greater");
        System.out.print(" and Result Value Returned is:" + value001+"\n");
        
        
        LocalTime time01 = LocalTime.parse("07:12:29");
        LocalTime time02 = LocalTime.parse("13:08:00");
        int value01 = time01.compareTo(time02);
        if (value01 > 0)
            System.out.print("LocalTime1 is greater");
        else if (value01 == 0)
            System.out.print("LocalTime1 is equal to"+ " LocalTime2");
        else
            System.out.print("LocalTime2 is greater");
        System.out.print(" and Result Value Returned is:" + value01+"\n");
        
        
        LocalTime time111 = LocalTime.parse("13:08:00");
        LocalTime time222 = LocalTime.parse("13:08:00");
        int value = time111.compareTo(time222);
        if (value > 0)
            System.out.print("LocalTime1 is greater");
        else if (value == 0)
            System.out.print("LocalTime1 is equal to"+ " LocalTime2");
        else
            System.out.print("LocalTime2 is greater");
        System.out.print(" and Result Value Returned is:" + value+"\n");
        
        System.out.println("Max time is: "+LocalTime.MAX);
        System.out.println("Min time is: "+LocalTime.MIN);
        System.out.println("Noon time is: "+LocalTime.NOON);
        System.out.println("Mid Night time is: "+LocalTime.MIDNIGHT);
        
        boolean before = LocalTime.parse("09:30").isBefore(LocalTime.now());
        System.out.println("The Result is: "+before);
        
        boolean after = LocalTime.parse("09:30").isAfter(LocalTime.now());
        System.out.println("The Result is: "+after);
        
	}
}
