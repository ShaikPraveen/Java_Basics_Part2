package com.java.basic.concepts;

public class Looping_Statements {

	public static void main(String[] args) {
	
		//Looping statements are three types
		// 1.do while loop
		// 2.while loop
		// 3.for loop
		
		
		// 1.do while loop
		int i=1;
		do 
		{
			System.out.println("Values are :"+i);
			i++;	
		}while(i<=10);
		
		// 2.while loop
		   System.out.println("============");
		   
		   int j=0;
		   while (j<=10) 
		   {
			   System.out.println("Values are =>"+j);
			   j++;	
		}
		   System.out.println("************");
		   
		// 3.for loop
		   
		   for (int k=0; k<=10; k++) 
		   {
			   System.out.println("Values are :"+k);	
		}
	}

}
