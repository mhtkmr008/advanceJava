package com.code;

public class Truck extends Vehicle {//Inheritance
	
	public void TruckSpecificMethod()//Truck Specific method
	{
		System.out.println("This is Truck specific method");
	}
	@Override// Overriden toString method
public String toString()
{
	return "Truck has bad engine";
}
}
