package com.java.basic.concepts;

public class Conditional_Statements_If {

	public static void main(String[] args) {
		
		int num1=100;
		int num2=400;
		int num3=300;
		
		if (num1>num2 && num1>num3)
		{
			System.out.println("First number is big "+num1);
			
		} else if (num2>num1 && num2>num3){ 
		{
             System.out.println("Second Number is big "+num2);
		}
		}else 
		{
			System.out.println("Third Number is big "+num3);
		}
	}

}
