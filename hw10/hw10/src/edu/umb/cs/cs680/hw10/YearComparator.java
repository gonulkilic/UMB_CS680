package edu.umb.cs.cs680.hw10;

import java.util.Comparator;

public class YearComparator implements Comparator<Car>{

	public int compare(Car car_1, Car car_2) {
		return car_2.getYear() - car_1.getYear();
	}

}
