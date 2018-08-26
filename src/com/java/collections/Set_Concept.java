package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Concept
{
	public static void main(String[] args) {
		
		//Set is same like a ArrayList, but only difference is that
		//1. ArrayList we have duplicate values inside 
		//2. Set can store only unique values
		// Set is an Interface
		//HashSet is a Class
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);//will give 1 ->output will 1 and 3
		set.add(3);
		
		Iterator<Integer> it= set.iterator();
		/*System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
*/
        while (it.hasNext()) 
        {
        	System.out.println(it.next());	
		}	
	}
	
	

}
