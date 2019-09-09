package edu.umb.cs.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CarTest {
    private String[] carToStringArray(Car g) {
		String[] carInfo= {g.getMake(),g.getModel(),g.getYear()};
		return carInfo;
	}
	
	@Test
	public void verifyCarEqualityWithMakeModelYear() {
		String[] expected= {"BMW", "i5", "2005"};
		Car actual= new Car("BMW", "i5", 5000, "2005", 4000);
		assertArrayEquals(expected,carToStringArray(actual) );
		}
	
	@Test
	public void verifyCarEqualityWithMakeModelYear2() {
		String[] expected= {"Ferrari", "abc", "2007"};
		Car actual= new Car("Ferrari", "abc", 3500, "2007", 2300);
		assertArrayEquals(expected,carToStringArray(actual) );
		}
	
	
}
