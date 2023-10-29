package com.tester;
import com.code.*;
public class TestFlyable {
public static void main(String[] args)
{
	Flyable f1=new SpaceCraft();
	System.out.println();
	f1.FlyObject();
	f1.toString();
	
	SpaceCraft s=new SpaceCraft();
	s.FlyObject();
	s.toString();
	s.SpaceCraftSpecificMethod();

	Flyable f2=new AirPlane();
	f2.FlyObject();
	f2.toString();
	
	AirPlane a=new AirPlane();
	a.FlyObject();
	a.toString();
	a.AirPlaneSpecificMethod();

	Flyable f3=new Helicopter();
	f3.FlyObject();
	f3.toString();
	
	Helicopter h=new Helicopter();
	h.FlyObject();
	h.toString();
	h.HelicopterSpecificMethod();


}
}
