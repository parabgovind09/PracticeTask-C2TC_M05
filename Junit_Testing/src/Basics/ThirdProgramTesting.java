package Basics;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

//assumption examples
public class ThirdProgramTesting {
	
	@Test
	void testOnDev() {
		System.setProperty("ENV", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}
	
	@Test
	void testOnProd() {
		System.setProperty("ENV", "PROD");
		//Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), ThirdProgramTesting::message);
		//Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")), ThirdProgramTesting::message);
		Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")), ThirdProgramTesting::message);
	}
	private static String message() {
		return "TEST EXECUTION FAILED :: ";
	}	
}
