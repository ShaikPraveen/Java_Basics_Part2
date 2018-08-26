package com.java.basic.concepts;

public class Swapnumbers
{
	int p;
	int q;
	
	public static void swap(int a, int b) //Pass by value
	{
		int temp=a;
		a=b;
		b=temp;	
	}
	
	public static void swap(Swapnumbers m) //Pass by reference
	{
		int temp=m.p;
            m.p=m.q;
            m.q=temp;	
	}

	  public static void main(String[] args) {
		
		  Swapnumbers sw=new Swapnumbers();
		  sw.p=10;
		  sw.q=20;
		  swap(sw.p,sw.q);//Pass by value
		  System.out.println("Pass by value p is "+sw.p);
		  System.out.println("Pass by value q is "+sw.q);
		  
		  //Pass by reference
		  swap(sw);
		  System.out.println("Pass by reference value p is "+sw.p);
		  System.out.println("Pass by reference value q is "+sw.q);
	  }
	  
	//Note:- Java does not support Call by value for swapping two numbers which is called as Call by Reference
}
