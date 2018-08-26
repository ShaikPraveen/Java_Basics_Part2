package com.exceptionhandling.concept;

public class Exceptions
{
	public static void main(String[] args) 
	{
		
		System.out.println("Before Try Block");
		
		try 
		{
		System.out.println("====Starting=====");
		int i=10/0;
		System.out.println(i);
		System.out.println("Ending");
		}catch(ArithmeticException e) 
		{
			System.out.println("Error Occured");
			System.out.println(e.getMessage());// -> / by zero
			//e.printStackTrace();
		}
		
		System.out.println("After Catch Block");	
	}
	  
//Explanation First it will check any exception in Try block then go to catch block and execute the catch block

}
