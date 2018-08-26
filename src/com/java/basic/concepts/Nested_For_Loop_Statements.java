package com.java.basic.concepts;

public class Nested_For_Loop_Statements {

	public static void main(String[] args) {
		
		
		for(int table=1; table<=10;table++)
		{
			System.out.println("Table of --> "+table);
			for (int i = 0; i<=10; i++) 
			{
				System.out.println(table+"*"+i+"="+table*i);	
			}
			if (table==5) //will print 5 tables 
			{
				break;	
			}	
		}
	}

}
