package edu.umb.cs.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void multiply3by4() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(3, 4);
		float expected = 12;
		assertEquals(actual,expected);
	}
	@Test
	public void divide34by2() {
		Calculator cut = new Calculator();
		float actual = cut.divide(34, 2);
		float expected = 17;
		assertEquals(actual,expected);
	}
	@Test
	public void divide5by0() {
		Calculator cut = new Calculator();
		try{
		cut.divide(5, 0);
		}
		catch(IllegalArgumentException ex) {
		assertEquals(ex.getMessage(),"division by zero");
		}
		}
	public void divide3_5by5_0() {
		Calculator cut = new  Calculator();
		float actual=cut.divide(3_5,5_0);
		float expected=0_7;
		assertEquals(actual,expected);
	}
		
	@Test
	public void add32by4() {
		Calculator cut = new Calculator();
		float actual = cut.add(32, 4);
		float expected = 36;
		assertEquals(actual,expected);
	}
	@Test
	public void sub35by5() {
		Calculator cut = new Calculator();
		float actual = cut.sub(35,5);
		float expected = 30;
		assertEquals(actual,expected);
	}

}