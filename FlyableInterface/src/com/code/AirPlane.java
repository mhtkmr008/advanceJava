package com.code;

public class AirPlane implements Flyable {

	@Override
	public void FlyObject() {
		System.out.println("Inside AirPlane");
		//flyObject is in interface Flyable so all the methods in the interface
		//must be overiden
	}
	
	@Override
	public String toString()
	{
		return "This is Flyable toString";
		// overriding toString method of class String to display our required message
	}
	
	public static void AirPlaneSpecificMethod()
	{
		System.out.println("AirPlane Specific method");
	}
	
}
