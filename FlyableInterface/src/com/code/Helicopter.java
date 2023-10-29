package com.code;

public class Helicopter implements Flyable{

	@Override
	public void FlyObject() {
		System.out.println("Inside helicopter");
		//flyObject is in interface Flyable so all the methods in the interface
		//must be overiden
	}
	
	@Override
	public String toString()
	{
		return "this is Helicopter toString";
		// overriding toString method of class String to display our required message
	}
	
	public static void HelicopterSpecificMethod()
	{
		System.out.println("Helicopter Specific method");
	}

}
