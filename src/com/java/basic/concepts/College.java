package com.java.basic.concepts;

public class College 
{
	public static void main(String[] args) {
		
		Student st=new Student();
		st.name="Praveen";
		st.roll_num=1120;
		st.stu_marks=55;
		
		st.studentJoin();
		st.student_roll();
		st.student_marks();
		
		System.out.println("Joined Student Name is "+st.name);
		System.out.println("Student Roll num is  "+st.roll_num);
		System.out.println("Student Marks are    "+st.stu_marks);
		
		Student st1=new Student();
		st1.name="Shaik";
		st1.roll_num=1121;
		st1.stu_marks=60;
		
		st1.studentJoin();
		st1.student_roll();
		st1.student_marks();
		
		System.out.println("Joined Student Name is "+st1.name);
		System.out.println("Student Roll num is  "+st1.roll_num);
		System.out.println("Student Marks are    "+st1.stu_marks);
		
		 Student.parent_name="Davaji";//Access static vairable
		 Student.student_progress();//Access static method
		 
		
	}

}
