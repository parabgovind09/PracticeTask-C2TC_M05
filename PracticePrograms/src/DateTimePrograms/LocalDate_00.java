package DateTimePrograms;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
/*
Java 8 under the package java.time introduced a new date-time API, most important classes among them are :  

Local : Simplified date-time API with no complexity of time-zone handling.
Zoned : Specialized date-time API to deal with various time-zones.
LocalDate/LocatTime and LocalDateTime API : Use it when time zones are NOT required.
 */
/*
 * Java LocalDate class is an immutable class that represents Date with a default format of YYYY-MM-DD.
 * It inherits Object class and implements the ChronoLocalDate interface
 */
/*
The declaration of java.time.LocalDate class:-

public final class LocalDate extends Object implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable
 */
public class LocalDate_00 {

	public static void main(String[] args) {
		
		 LocalDate date = LocalDate.now();
		 System.out.println("Today date: "+date);
		 
		 LocalDate yesterday = date.minusDays(1);
		 System.out.println("Yesterday date: "+yesterday); 
		 
		 LocalDate tomorrow = yesterday.plusDays(2);   
	     System.out.println("Tomorrow date: "+tomorrow); 
	     
	     boolean isLeapYear = LocalDate.now().isLeapYear();   
	     System.out.println("Is Current Year "+LocalDate.now()+" a Leap Year: "+isLeapYear); 
	     
	     LocalDate date1 = LocalDate.of(2017, 1, 13);    
	     System.out.println("Is This Year "+date1+" a Leap Year: "+date1.isLeapYear());  
	     
	     LocalDate date2 = LocalDate.of(2016, 9, 23);    
	     System.out.println("Is This Year "+date2+" a Leap Year: "+date2.isLeapYear());
	     
	     LocalDate afterOneMonth = LocalDate.now().plusMonths(1);
	     System.out.println("Date after one month from current date: "+afterOneMonth);

	     LocalDate beforeOneMonth = LocalDate.now().minusMonths(1);
	     System.out.println("Date before one month from current date: "+beforeOneMonth);
	     
	     LocalDate beforeOneYear = LocalDate.now().minusYears(1);
	     System.out.println("Date before one year from current date: "+beforeOneYear);
	     
	     LocalDate afterTwoYear = LocalDate.now().plusYears(2);
	     System.out.println("Date after two year from current date: "+afterTwoYear);
	     
	     DayOfWeek getDayOfCurrentWeek = LocalDate.now().getDayOfWeek();
	     System.out.println("Current Day is "+getDayOfCurrentWeek+" of this Week");
	     
	     int getDayOfCurrentMonth = LocalDate.now().getDayOfMonth();
	     System.out.println("Current Day is "+getDayOfCurrentMonth+" day of this Month");
	     
	     int getDayOfCurrentYear = LocalDate.now().getDayOfYear();
	     System.out.println("Current Day is "+getDayOfCurrentYear+" day of this Year");
	     
	     Month getCurrentMonth = LocalDate.now().getMonth();
	     System.out.println("Current Month is "+getCurrentMonth);
	     
	     int getCurrentMonthValue = LocalDate.now().getMonthValue();
	     System.out.println("Current Month Value is "+getCurrentMonthValue);
	     
	     int getCurrentYear = LocalDate.now().getYear();
	     System.out.println("Current Year is "+getCurrentYear);
	     
	     int getCurrentMonthLength = LocalDate.now().lengthOfMonth();
	     System.out.println("Current Month Consists of: "+getCurrentMonthLength+" days");
	     
	     int getCurrentYearLength = LocalDate.now().lengthOfYear();
	     System.out.println("Current Year consists of: "+getCurrentYearLength+" days");
	     
	     //local date to string
	     LocalDate d1 = LocalDate.now();   
	     LocalDate d2 = LocalDate.of(2002, 05, 01);
	     String d1Str = d1.format(DateTimeFormatter.ISO_DATE); 
	     String d2Str = d2.format(DateTimeFormatter.ISO_DATE);
	     System.out.println("Date1 in string :  " + d1Str); 
	     System.out.println("Date2 in string :  " + d2Str); 
	     
	     //string to local date
	     String dInStr = "2011-09-01";  
	     LocalDate d11 = LocalDate.parse(dInStr);  
	     System.out.println("String to LocalDate : " + d11);
	     
	     //atTime() method of LocalDate class.
	     LocalDate date11 = LocalDate.of(2017, 1, 13);  
	     LocalDateTime datetime = date11.atTime(1,50,9); 
	     System.out.println(datetime);   
	     
	     
	     //TemporalAdjuster : It is used to perform various date related operations.
	     
	     LocalDate date111 = LocalDate.now();
         System.out.println("the current date is "+date111);
  
         // to get the first day of next month
         LocalDate dayOfNextMonth = date111.with(TemporalAdjusters.firstDayOfNextMonth());
      
         System.out.println("firstDayOfNextMonth : " +dayOfNextMonth );
  
         // get the next saturday
         LocalDate nextSaturday = date111.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
          
         System.out.println("next saturday from now is "+nextSaturday);
  
         // first day of current month
         LocalDate firstDay = date111.with(TemporalAdjusters.firstDayOfMonth());
                                     
         System.out.println("firstDayOfMonth : " +firstDay);
  
         // last day of current month    
         LocalDate lastDay = date111.with(TemporalAdjusters.lastDayOfMonth());
          
         System.out.println("lastDayOfMonth : " +lastDay);
	}

}
