package edu.umb.cs.cs680.hw10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarTest {
	@Test
	public void carConstructor(){
		Car car = new Car(1000, 2018, 25000);
	}

	@Test
	public void getYearTest(){
		Car car = new Car(1000, 2018, 25000);
		int actual = car.getYear();
		int expected = 2018;
		assertEquals(actual,expected);
	}
	
	@Test
	public void getMileageTest(){
		Car car = new Car(1000, 2018, 25000);
		int actual = car.getMileage();
		int expected = 25000;
		assertEquals(actual,expected);
	}
	
	@Test
	public void getPriceTest(){
		Car car = new Car(1000, 2018, 25000);
		int actual = car.getPrice();
		int expected = 1000;
		assertEquals(actual,expected);
	}
	

	

	
}
