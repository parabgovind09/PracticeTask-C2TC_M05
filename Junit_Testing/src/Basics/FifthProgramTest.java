package Basics;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

class MyExecutable implements Executable{

	@Override
	public void execute() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	}
	
}

public class FifthProgramTest {
	
	@TestFactory
	Collection<DynamicTest> dynamicTests(){
		return Arrays.asList(
				dynamicTest("Simple dynamic test", () -> assertTrue(true)),
				dynamicTest("My executable class", new MyExecutable()),
				dynamicTest("Exception Executable", () -> {throw new Exception("Exception Handling Example");}),
				dynamicTest("Simple Dynamic Test 2", () -> assertTrue(true)));
	}
}
