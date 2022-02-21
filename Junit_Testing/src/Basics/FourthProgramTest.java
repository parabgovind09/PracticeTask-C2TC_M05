package Basics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import java.util.logging.Logger;

//test lifecycle example with repeat test annotation
@TestInstance(Lifecycle.PER_CLASS)
interface TestLifecycle{
	
	@BeforeAll
	default void beforeAllTests() {
		System.out.println("Before All Tests");
	}
	
	@AfterAll
	default void afterAllTests() {
		System.out.println("After All Tests");
	}
	
	@Test
	default void testMethod() {
		System.out.println("This is test method");
	}
	
}
public class FourthProgramTest implements TestLifecycle{
	@Test
	@RepeatedTest(5)
	void test() {
		System.out.println("First Test Case");
	}
}
