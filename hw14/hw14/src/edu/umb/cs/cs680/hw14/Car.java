package edu.umb.cs.cs680.hw14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Car 
{
	private int price;
	private int year;
	private float mileage;
	private int DominationCount;
	private String name;

	public void setDominationCount(int dominationCount) {
		DominationCount = dominationCount;
	}
	public int getDominationCount() {
		return DominationCount;
	}
	public Car(String name,int price, int year, float mileage)
	{   this.name=name;
		this.price = price;
		this.year = year;
		this.mileage = mileage;

	}
	public int getPrice()
	{
		return price;
	}

	public int getYear()
	{
		return year;
	}
	public float getMileage()
	{
		return mileage;
	}
	public String getName()
	{
		return name;
	}

public static void main(String args[])
	{		
		ArrayList<Car> usedCars = new ArrayList<Car>();
		
		usedCars.add(new Car("Audi_Q8",30000,2017,20000));
		usedCars.add(new Car("BMW",5000,2013,1750000));
		usedCars.add(new Car("Swift",20000,2011,70000));
		usedCars.add(new Car("Accord",4000,2016,40000));
		usedCars.add(new Car("Camry",2000,2006,95000));
		usedCars.add(new Car("Audi_A7",800,2017,1500));
		
		for(Car u:usedCars)
		{
			int dominationCount=0;
			for(Car ui:usedCars) {
				if(u.getMileage() > ui.getMileage() && u.getPrice() > ui.getPrice() && u.getYear() < ui.getYear()) {
					dominationCount++;
				}else if(u.getMileage() == ui.getMileage() && u.getPrice() == ui.getPrice() && u.getYear() == ui.getYear()) {
					
				}else if((u.getMileage() > ui.getMileage() || u.getPrice() > ui.getPrice()) && u.getYear() == ui.getYear()) {
					dominationCount++;
				}else if((u.getMileage() > ui.getMileage() || u.getYear() < ui.getYear()) && u.getPrice() == ui.getPrice()) {
					dominationCount++;
				}else if(u.getMileage() == ui.getMileage() && (u.getPrice() > ui.getPrice() || u.getYear() < ui.getYear())) {
					dominationCount++;
				}
				
			}
			
			u.setDominationCount(dominationCount);
		}

		Collections.sort(usedCars, Comparator.comparing(
				(Car car)-> car.getYear()));
		System.out.println();
		System.out.println("Year:" );
		for(Car u:usedCars)
		{
			System.out.print(u.getYear()+" , ");
		}
		
		Collections.sort(usedCars, Comparator.comparing(
				(Car car)-> car.getYear()).reversed());
		System.out.println();
		System.out.println("Year in reverse order:" );
		for(Car u:usedCars)
		{
			System.out.print(u.getYear()+" , ");
		}


		Collections.sort(usedCars,Comparator.comparing(
				(Car car)-> car.getPrice()));
		System.out.println();
		System.out.println("Price:");
		for(Car u:usedCars)
		{
			System.out.print(u.getPrice()+" , ");
		}
		
		Collections.sort(usedCars,Comparator.comparing(Car::getPrice,
				Comparator.reverseOrder()));
		System.out.println();
		System.out.println("Price in reverse order:");
		for(Car u:usedCars)
		{
			System.out.print(u.getPrice()+" , ");
		}

		Collections.sort(usedCars, Comparator.comparing(
				(Car car)-> car.getMileage()));		
		System.out.println("Milage:");
		for(Car u:usedCars)
		{
			System.out.print(u.getMileage()+" , ");
		}
		Collections.sort(usedCars, Comparator.comparing(
				(Car car)-> car.getMileage()).reversed());		
		System.out.println("\n Milage in reverse order:");
		for(Car u:usedCars)
		{
			System.out.print(u.getMileage()+" , ");
		}
		
		Collections.sort(usedCars, Comparator.comparing(
		(Car car)-> car.getDominationCount()));
		System.out.println();
		System.out.println("Pareto:");
		for(Car u:usedCars)
		{
			System.out.println(u.getDominationCount()+" , "+u.getPrice()+" , "+u.getYear()+" , "+u.getMileage());
		}	
		
		
	}
}