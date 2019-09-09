package edu.umb.cs.cs680.hw04;


public class Car 
{
	private String year;
	private String model;
	private String make;
	private int mileage;
	private float price;

	
	public Car(String make,String model, int mileage, String year, float price)
	{   this.year = year;
		this.model = model;
		this.make=make;
		this.mileage = mileage;
        this.price = price;
	}
	

	public String getYear()
	{
		return year;
	}
	public String getModel()
	{
		return model;
	}
	public String getMake()
	{
		return make;
	}
	
	public int getMileage()
	{
		return mileage;
	}

	public float getPrice()
	{
		return price;
	}
	
}


	