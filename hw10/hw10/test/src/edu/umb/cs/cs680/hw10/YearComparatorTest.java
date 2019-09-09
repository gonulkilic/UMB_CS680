package edu.umb.cs.cs680.hw10;

import java.util.ArrayList;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class YearComparatorTest {
	
	@Test
	public void YearCompare(){
		ArrayList<Car> usedCars = new ArrayList<Car>();
		usedCars.add(new Car(9300, 2001, 130000));
		usedCars.add(new Car(6000, 2007, 145000));
		usedCars.add(new Car(3000, 2005, 170000));
		Collections.sort(usedCars, new YearComparator());
		assertEquals(2007, usedCars.get(0).getYear());
		assertEquals(2001, usedCars.get(1).getYear());
		assertEquals(2005, usedCars.get(2).getYear());
	}
}