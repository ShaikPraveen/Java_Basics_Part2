package com.java.collections;

import java.util.Hashtable;

public class HashTable_Concept_Method2
{
	public static void main(String[] args) {
		
		Hashtable<String, String> ht1=new Hashtable<String,String>();
		ht1.put("Course1", "Manual Testing");
		ht1.put("Course2", "Automation Testing");
		
		Hashtable<String, String> ht2=new Hashtable<String,String>();
		ht2.put("Location1", "Hyderabad");
		ht2.put("Location2", "Bangalore");
		
		Hashtable<String, Hashtable<String,String>> ht3=new Hashtable<String, Hashtable<String,String>>();
		ht3.put("Institue", ht1);
		ht3.put("Country", ht2);
		
		System.out.println(ht3.get("Institue").get("Course1")); //Manual Testing
		System.out.println(ht3.get("Country").get("Location2"));//Hyderabad
	}

}
