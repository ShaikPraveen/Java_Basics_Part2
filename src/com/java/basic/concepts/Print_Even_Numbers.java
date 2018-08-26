package com.java.basic.concepts;

public class Print_Even_Numbers {

	public static void main(String[] args) {
		
		
		for (int i = 2; i <=20; i=i+2)
		{
			System.out.println("Even Numbers are ::"+i);	
		}
		
		//Print table of 2
		//Method 1
		for (int k = 1; k <=10; k++) 
		{
			System.out.println("Second Table is :"+6*k);
			
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//Method 2
				for (int m = 0; m <=10; m++) 
				{
					System.out.println("Second Table is :"+"2*"+m+"="+2*m);
					
				}
	}

}
