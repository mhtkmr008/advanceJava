package com.code;

public interface Flyable {
	
	final static int a=1;//Interface can have data members which will be always public static and final
	final static int b=1;
	
	public abstract void FlyObject();//Methods will have no body and will always 
	//be public and abstract, its by default so we need not to assign public and abstract
	//class implimenting an interface must impliment all its methods
	
	//public:so that they can be accessed
	//abstract:its implimentation in sub classes is must
	
	//no to string because toString is a part of Object Class (Comming from String class)
	//And a method can be overriden only in concrete classes that impliments them but not
	//in the interface itself 
	
	//interfaces can define abstract method that the concrete classes must impliment 
	//interfaces can have abstract methods and variables. It cannot have a method body.
	
	
	//can be used to achive lose coupling**
	
	//When we decide on a type of entity by its behavior and 
	//not via attribute we should define it as an interface.
	//Interfaces represents the IS-A relationship.
	
	
	//total abstraction
	//helps in multiple inheritance
	//loose coupling
}

