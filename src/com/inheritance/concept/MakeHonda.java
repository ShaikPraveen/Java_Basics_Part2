package com.inheritance.concept;

public class MakeHonda extends Bike 
{
	public void tyreType() 
	{
		System.out.println("Tubless Tyres");
	}
	
	//Overriding Method ->@Overridden
	public void startBike() 
	{
		System.out.println("Self  start Bike");
	}

}
