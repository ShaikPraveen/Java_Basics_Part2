package com.inheritance.concept;

public class TestBike
{
	public static void main(String[] args) {
		
		Bike b=new Bike();
		b.name="Glammar";
		b.color="Red";
		b.startBike();
		
		
		
		
		MakeHonda mh=new MakeHonda();
		mh.name="Suzuki";
		mh.color="Black";
		mh.startBike();//makehonda class(child)
		mh.tyreType();
		
		Bike b1=new MakeHonda();
		b1.startBike();
		b1.stopBike();
		
	}

}
