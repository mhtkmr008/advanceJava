package com.tester;
import com.code.*;
import java.util.Scanner;
public class TestVehicle {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
		
		System.out.println("1:Car 2:Truck 3:Exit");
		System.out.println("Enter your choice");
		switch(sc.nextInt())//try with resources block A RESOURCE is an OBJECT that must be closed 
		//once it use has been done
		//we can pass any resource that impliments java.lang.AutoClosable(Interface)
		//For try-with-resources, if an exception is thrown in a try block and in a 
		//try-with-resources statement, then the method returns the exception thrown 
		//in the try block. The exceptions thrown by try-with-resources are suppressed, 
		//i.e. we can say that try-with-resources block throws suppressed exceptions.**
		//it can have single as well as multiple resource
		{
			case 1:
				System.out.println("Car Specific Details");
				Vehicle v=new Car();//upcasting
				System.out.println(v.toString());//calling toString method of String which has been overriden in Vehicle class
				//At compile time the compiler will allow to v(reference variable) of Class vehicle to call 
				//toString function of class Vehicle
				//but at runtime it will call the toString function of Car
				Car c=(Car)v;//Downcasting variable v of class Vehicle to Class Car since Vehicle class object can call its
				//class methods but it wont be able to call the specific methods of class Car
				c.carSpecificMethod();
				break;
			case 2:
				System.out.println("Vehicle Specific Details");
				Vehicle v1=new Truck();//upcasting assigning Truck object to Vehicle reference variable
				System.out.println(v1.toString());//Calling toString method v1 pointing to Vehicle Class toString 
				//which the compiler would allow since truck is subclass of vehicle(Upcasting)
				//at runtime the reference variable will point to overriden method toString method of Class truck 
				Truck t=(Truck)v1;//Since v1 is the Object of Vehicle class ie super class of truck 
				//the compiler wont allow v1 to access the truck class specific method till we downcast it
				t.TruckSpecificMethod();
				break;
				
			case 3:
				System.out.println("Exit");
				break;
			
				default:
					System.out.println("Enter Correct choice");
					break;
		}

	}catch(Exception e) {System.out.println("This is an Error message");}//Catch block
}
}
