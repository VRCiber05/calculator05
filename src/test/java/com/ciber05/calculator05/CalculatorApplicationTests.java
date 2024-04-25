package com.ciber05.calculator05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {
	private Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
	}
	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}

}
