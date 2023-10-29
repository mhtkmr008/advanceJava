package com.code;

public class Car extends Vehicle{
	
	
	
	//Car specific method
	public void carSpecificMethod()
	{
		System.out.println("This is car specific method");
	}

	@Override//annotation
	public String toString() {//Overriden To string method
		return "Car has good engine";		
	}
	

}
