package com.java.basic.concepts;

public class Bank 
{
	String name;
	int accountbalance;
	Employess em;
	
	public int interestgained(int increment) 
	{
		accountbalance=accountbalance+increment;
		return increment;
	}
	
	
	public Employess getbalance() 
	{
		return em;
	}

}
