package com.java.collections;

import java.util.Hashtable;

public class HashTable_Concept {

	public static void main(String[] args)
	{
		// In HashTable there is no index in the HashTable, It is Only call by the Key value
		// whenever we want to store large amount of data we will use HashTable
		Hashtable<String, String> ht=new Hashtable<String,String>();
		ht.put("Shaik", "Praveen");
		ht.put("Selenium", "Testing");
		ht.put("Manual", "Testing");
		
		System.out.println(ht.get("Selenium")); //Testing
		
		ht.put("Shaik", "Naveen"); //it will override the value
		
		System.out.println(ht.get("Shaik"));
		
	}

}
