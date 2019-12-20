package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class TestRunner {
	@Test
	public void multiplicationOfZeroIntegerShouldReturnZero()
	{
		TestJUnit testJUnit=new TestJUnit();
		assertEquals(0, testJUnit.multiply(0,5), "Multiply with 0 is always 0");
		assertEquals(0, testJUnit.multiply(5,0), "Multiply with 0 is always 0");
		assertEquals(0, testJUnit.multiply(0,0), "Multiply with 0 is always 0");
	}
	
}
