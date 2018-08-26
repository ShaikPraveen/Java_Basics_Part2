package com.java.basic.concepts;

public class Student 
{
	//Combination Classes -> Student + College
	
	//Non static Global variables
	String  name;
	int roll_num;
	int stu_marks;
	public static String parent_name;
	
	
	  //Non static methods
	   public void studentJoin() 
	   {
		   System.out.println("Student Joined");
	   }
	   
	   public  void student_roll() 
	   {
		   System.out.println("Student Roll Number");
	   }
	 
	   public  void student_marks() 
	   {
		   System.out.println("Student Marks");
	   }
	   
	   //Non static method
	   
	   public static void student_progress() 
	   {
		   System.out.println("Student Performance");
	   }
}
