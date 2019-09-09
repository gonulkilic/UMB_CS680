package edu.umb.cs.cs680.hw10;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MileageComparatorTest {
	
	@Test
	public void MileageCompare(){
		ArrayList<Car> usedCars = new ArrayList<Car>();
		usedCars.add(new Car(2000, 2006, 185000));
		usedCars.add(new Car(3600, 2005, 100000));
		usedCars.add(new Car(4000, 2004, 155000));
		Collections.sort(usedCars, new MileageComparator());
		assertEquals(100000, usedCars.get(0).getMileage());
		assertEquals(185000, usedCars.get(1).getMileage());
		assertEquals(155000, usedCars.get(2).getMileage());
	}
}
