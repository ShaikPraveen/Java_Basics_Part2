package com.java.basic.concepts;

public class Pre_And_Post_Incremental_Operators {

	public static void main(String[] args)
	{
		//There are two incremental operators
		//1. Pre-incremental  operator
		//2. Post-incremental operator
		
	   //1. Pre-incremental  operator	
	   int p=1;
	   System.out.println(++p);//2
	   
	  //2. Post-incremental operator
	   int q=2;
	   System.out.println(q++);//2
	   System.out.println(q);//3
	   
	}

}
