package com.code;

public class SpaceCraft implements Flyable {

	@Override
	public void FlyObject() {
		//flyObject is in interface Flyable so all the methods in the interface
		//must be overiden
		System.out.println("In SpaceCraft");
		
	}

	@Override
	// overriding toString method of class String to display our required message
	public String toString() {
		return "SpaceCraft toString";
	}
	
	public static void SpaceCraftSpecificMethod()
	{
		System.out.println("SpaceCraft Specific method");
	}

	
}
