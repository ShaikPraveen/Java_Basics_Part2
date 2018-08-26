package com.java.basic.concepts;

public class DataTypes {

	public static void main(String[] args) 
	{
	   //These are Primitive data types defined by the progrmming language
		int i=123456789;
		float f=1.23456f;
		char ch='A';
		boolean b=true;
		double d=1.123456789245678546125364457891111122222222444444444444;
		String s="Java";
		long l=1234567896547l;
		
		DataTypes dt=new DataTypes();
	 //Here dt is Non- primitive data type -> defined by the programmer
		
		int praveenautomation;
		int praveenautomationtesting;
		int praveenseleniumautomationtesting;
		
		String ss=new String();
		ss="Praveen";
		
		String   s1="Praveen";
		String   s2="Selenium";
		String   s3="Testing";
		String   s4=s1+s2+s3;
		
		System.out.println(s4);
		System.out.println(s1+s2+s3);
		System.out.println("Praveen"+"Selenium"+"Testing");
		
		int num1=20;
		int num2=30;
		System.out.println("Adding both numbers are "+(num1+num2));
		
		System.out.println(!false); //true
		System.out.println(!true); //false
		// ! -> Logical Operator
		// % -> Remainder Operator
			
		/*    20 + 30 =>Operands
		 *    Unary Operator    => Single Operand
		 *    Binary Operator   => two Operand
		 *    Ternary Operator  =>3 Operand
		 */
	
		//Equality and Relational
		
		/*System.out.println(20<30);//true
		System.out.println(30<20);//false
		System.out.println(10==20);//false ->Equality Operator
		System.out.println(20==20);//true
		System.out.println(20<=30);//true
		System.out.println(30<=30);//true
		System.out.println(40<=30);//false
		System.out.println(40>40);//false
		System.out.println(40<40);//false
		System.out.println(40>=20);//true
		System.out.println(40>=40);//true
		System.out.println(40>=20);//true*/
		
		System.out.println("=====================");
		//Conditional Operator
		System.out.println(true && false);//false
		System.out.println(false && true);//false
		System.out.println(true && true);//true
		System.out.println(false && false);//false
		System.out.println((123==321) && (20==20));//false
		System.out.println((123==123) && (20<=20));//true
		System.out.println((123>=111) && (23<=26));//true
		
		System.out.println((123>=111) || (23<=26));//true
		
		System.out.println("***************");
		
		boolean bol=false;
		System.out.println(20<30); //true
		
		int first_no=20;
		int send_no=50;
		
		boolean bol1=first_no>send_no;
		System.out.println(bol1); //false
		
	}
}
