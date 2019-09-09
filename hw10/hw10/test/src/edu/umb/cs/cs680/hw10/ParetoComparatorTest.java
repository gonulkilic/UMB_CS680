package edu.umb.cs.cs680.hw10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ParetoComparatorTest {
	@Test
	public void ParetoCompare(){
		ArrayList<Car> usedCars = new ArrayList<Car>();
		usedCars.add(new Car(6000, 2004, 185000));
		usedCars.add(new Car(8000, 2002, 90000));
		usedCars.add(new Car(5000, 2003, 100000));
		usedCars.add(new Car(4000, 2009, 125000));
		Collections.sort(usedCars, new ParetoComparator(usedCars));
		assertEquals(8000, usedCars.get(0).getPrice());
		assertEquals(4000, usedCars.get(1).getPrice());
		assertEquals(5000, usedCars.get(2).getPrice());
		assertEquals(6000, usedCars.get(3).getPrice());
	}
}
