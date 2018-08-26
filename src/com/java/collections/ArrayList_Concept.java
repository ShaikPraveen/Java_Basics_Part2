package com.java.collections;

import java.util.ArrayList;

public class ArrayList_Concept 
{
	public static void main(String[] args)
	{
		ArrayList<String> mylist=new ArrayList<String>();
		mylist.add("praveen");//0
		mylist.add("shaik");  //1
		mylist.add("selenium");//2 
		mylist.add("shaik");// duplicate value
		
		System.out.println(mylist.size()); 
		System.out.println(mylist.get(1));
		
		for (int i = 0; i < mylist.size(); i++) 
		{
			System.out.println(mylist.get(i));	
		}
		
    //Where we use in ArrayList, Suppose in my project i have 100 Checkboxes are and using some of 
    //check boxes common properties and based on the index i will be checking the particular checkbox using for loop in single logic
	}

}
