package Basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
//assertEquals() example included
//@Disabled  //can be applied on entire class
//@Test <- can't be applied on entire class as it is a unit testing
public class SecondProgramTesting {

	@Test
	public void simple() {
		int result = 1;
		int expected = 1;
		assertEquals(result,expected);
	}
	@Test
	public void simple1() {
		int result = 1;
		int expected = 3;
		assertEquals(result,expected);
	}
	@Disabled
	@Test
	public void simple2() {
		int result = 5;
		int expected = 1;
		assertEquals(result,expected);
	}
}