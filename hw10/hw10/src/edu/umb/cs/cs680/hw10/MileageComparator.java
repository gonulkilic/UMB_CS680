package edu.umb.cs.cs680.hw10;

import java.util.Comparator;

public class MileageComparator implements Comparator<Car>{

	public int compare(Car car_1, Car car_2) {
		return car_1.getMileage() - car_2.getMileage();
	}

}
