package edu.umb.cs.cs680.hw14;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarLambdaExTest {

	@Test
	public void priceComparator()

	{
		ArrayList<Car> usedCars = new ArrayList<Car>();
		
		int expected[] = {700 , 1000 , 4000 , 20000 , 3000 , 10000};
		int i=0;
		Collections.sort(usedCars, Comparator.comparing(
				(Car car)-> car.getPrice()));
		System.out.println("Price:"+expected[i]);
        
		for(Car u:usedCars)
		{
			System.out.print(u.getPrice()+" , ");
			assertEquals(expected[i],u.getPrice());
			i++;
		}
		
	}
	@Test
	public void priceComparatorReversed()	
	{
		ArrayList<Car> usedCars = new ArrayList<Car>();
		int expected[] = {10000 , 3000 , 20000 , 4000 , 1000 , 700};
		int i=0;
		Collections.sort(usedCars, Comparator.comparing(Car::getPrice,
				Comparator.reverseOrder()));
		
		System.out.println("Reversed Price:"+expected[i]);
		for(Car u:usedCars)
		{
			System.out.print(u.getPrice()+" , ");
			assertEquals(expected[i],u.getPrice());
			i++;
		}
				
	}
	
	@Test
	public void yearComparator()
	{
		ArrayList<Car> usedCars = new ArrayList<Car>();
		
		int expected[] = {2016 , 2012 , 2010 , 2014 , 2005 , 2016};
		int i=0;
		Collections.sort(usedCars,Comparator.comparing(
				(Car car)-> car.getYear()));
		
		System.out.println("Year:"+expected[i]);
		for(Car u:usedCars)
		{
			System.out.print(u.getYear()+" , ");
			assertEquals(expected[i],u.getYear());
			i++;
		}
	}
	@Test
	public void yearComparatorReversed()
	{
		ArrayList<Car> usedCars = new ArrayList<Car>();
		int expected[] = {2016 , 2005 , 2014 , 2010 , 2012 , 2016};
		int i=0;
		Collections.sort(usedCars,Comparator.comparing(
				(Car car)-> car.getYear()).reversed());
		System.out.println("Reversed Year:"+expected[i]);
		for(Car u:usedCars)
		{
			System.out.print(u.getYear()+" , ");
			assertEquals(expected[i],u.getPrice());
			i++;
		}
				
	}
	@Test
	public void milageComparator()
	{
		ArrayList<Car> usedCars = new ArrayList<Car>();
		float expected[] = {10000 , 1850000, 85000, 60000, 50000, 1500};
		int i=0;
		Collections.sort(usedCars, Comparator.comparing(
				(Car car)-> car.getMileage()));
		
		System.out.println("Milage:"+expected[i]);
		for(Car u:usedCars)
		{
			System.out.print(u.getMileage()+" , ");
			assertEquals(expected[i],u.getMileage());
			i++;
		}
				
	}
	@Test
	public void milageComparatorReversed()
	{	
		ArrayList<Car> usedCars = new ArrayList<Car>();
		float expected[] = {1500 , 50000, 60000, 85000, 1850000, 10000};
		int i=0;
		Collections.sort(usedCars, Comparator.comparing(
				(Car car)-> car.getMileage()).reversed());
		
		System.out.println("Reversed Milage:"+expected[i]);
		for(Car u:usedCars)
		{
			System.out.print(u.getMileage()+" , ");
			assertEquals(expected[i],u.getMileage());
			i++;
		}
				
	}
	
	@Test
	public void paretoComparator()
	{
		ArrayList<Car> usedCars = new ArrayList<Car>();
		int expected[] = {0,1,1,1,2,2};
		int i=0;
		Collections.sort(usedCars, Comparator.comparing(
				(Car car)-> car.getDominationCount()));
		
		System.out.println("Pareto:"+expected[i]+" indicates the best optimum car.");
		for(Car u:usedCars)
		{
			System.out.print(u.getDominationCount()+" , ");
			assertEquals(expected[i],u.getDominationCount());
			i++;
		}
				
	}
	@Test
	public void paretoComparatorReversed()
	{
		ArrayList<Car> usedCars = new ArrayList<Car>();
		
		int expected[] = {2,2,1,1,1,0};
		int i=0;
		Collections.sort(usedCars, Comparator.comparing(
				(Car car)-> car.getDominationCount()).reversed());
		
		System.out.println("Reversed Pareto:"+expected[i]);
		for(Car u:usedCars)
		{
			System.out.print(u.getDominationCount()+" , ");
			assertEquals(expected[i],u.getDominationCount());
			i++;
			
		}
				
	}

}
