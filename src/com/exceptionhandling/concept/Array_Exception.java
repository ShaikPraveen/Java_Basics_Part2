package com.exceptionhandling.concept;

public class Array_Exception 
{
	public static void main(String[] args) {
		
		System.out.println("Before Try Block");
		try {
		int i[]=new int[4];
		i[5]=10;//out of range
		
		System.out.println("After Try Block");
		}catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Error Occured");
			System.out.println(e.getMessage());//5
		}
		System.out.println("After Catch Block");
	}

}
