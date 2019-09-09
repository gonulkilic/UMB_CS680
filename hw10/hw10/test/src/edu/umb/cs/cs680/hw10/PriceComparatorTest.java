package edu.umb.cs.cs680.hw10;

import java.util.ArrayList;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PriceComparatorTest {
	
	@Test
	public void PriceCompare(){
		ArrayList<Car> usedCars = new ArrayList<Car>();
		usedCars.add(new Car(7400, 2004, 920000));
		usedCars.add(new Car(5000, 2009, 735000));
		usedCars.add(new Car(9000, 2005, 500000));
		Collections.sort(usedCars, new PriceComparator());
		assertEquals(6000, usedCars.get(0).getPrice());
		assertEquals(7400, usedCars.get(1).getPrice());
		assertEquals(9000, usedCars.get(2).getPrice());
	}
}
