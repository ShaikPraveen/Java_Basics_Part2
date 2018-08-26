package com.interfacs.concept;

public class Department implements Employee
{

	@Override
	public void salary() 
	{
		System.out.println("Salary Granted this month");	
	}

	@Override
	public void hr_policy() 
	{
		System.out.println("HR Policies Applied");	
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Department();
		emp.salary();
		emp.hr_policy();
	}
}
