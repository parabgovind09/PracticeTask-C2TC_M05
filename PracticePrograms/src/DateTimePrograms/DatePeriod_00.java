package DateTimePrograms;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

/*
 * Java Period class is used to measures time in years, months and days.
 * It inherits the Object class and implements the ChronoPeriod interface.
 */
public class DatePeriod_00 {

	public static void main(String[] args) {
		
		Period period = Period.of(2017,02,16);  
		System.out.println(period.toString());
		
		Period period1 = Period.ofMonths(4);   
	    Period period2 = period1.minus(Period.ofMonths(2));  
	    System.out.println(period2);  
	    
	    Period period11 = Period.ofMonths(4);   
	    Period period21 = period11.plus(Period.ofMonths(2));  
	    System.out.println(period21);
		  
		Period period3 = Period.ofDays(24);  
	    Temporal temp = period3.addTo(LocalDate.now());  
	    System.out.println(temp); 
	}

}
