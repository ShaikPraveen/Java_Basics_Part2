package com.java.basic.concepts;

public class OOPS_Static_Non_Static 
{
	public static int i=10; //Global static variable
	public int j=20;// Global non static variable
	
	
	//Static method
	public static void bike()
	{
		int abc=10;// abc is a Local variable
		System.out.println("This is Bike");
	}
	
	//Non-static method
     public void car() 
     {
    	 int xyz=20;//xyz is a local variable
    	 System.out.println("This is a Car");
     }
     
     
     public static void main(String[] args) {
		bike();
		
		OOPS_Static_Non_Static ops=new OOPS_Static_Non_Static();
		ops.car();	 
	}
	
	
	

}
