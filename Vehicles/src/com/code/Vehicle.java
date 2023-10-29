package com.code;

abstract public class Vehicle {//Abstract class since we have to just impliment the class behaviours
// an abstract class can have absrtract as well as non abstract method
	//it can't be instenciated
	//we can have an abstract class without any abstract method,but if we have any abstract method 
	//then the class must be declared abstract,Static methods are also allowed
	//constructors are allowed
	//we cant have a method that is both final and abstract(Final and abstract has opp meanings)
	//if child class doesnt provide any concrete application of the abstrac class 
	//then the clild class must also be declared abstract and then its child will impliment the method 
	private int wheels;//(data members can be public private protected default)
	private int streanigs;
	
	public Vehicle()
	{
		this.wheels=4;
		this.streanigs=1;
	}
	
	
	public void Vehicle(int wheels,int streanigs)
	{
		this.wheels=wheels;
		this.streanigs=streanigs;
	}
	
	@Override	//annotation 
	public String toString() //in built method of java.lang
	//the default toString method of Object class print FullyQuallified name and 
	//hash code seperate via @ so everytime we try to call toString method it will return
	// string representation of the object 
	{
		return "Vehicle Engine";
		
	}
}
