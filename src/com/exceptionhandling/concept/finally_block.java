package com.exceptionhandling.concept;

public class finally_block 
{
	public static void main(String[] args) {
		
		
		try 
		{
			//DB Connection - Successfully
			//Executing some queries
			//Validating the data and comparing from websites
			//close DB the connection
			
			int i[]=new int[2];
			i[3]=10;
			System.out.println("Close DB Connection in Try Block");
			
			
		}catch(Throwable e) 
		{
			System.out.println("Error Occcured");
			
		}finally 
		{
			System.out.println("Closing DB Connection in Finally Block");
			
		}
		
		//Note-> Finally block will execute every time
	}

}
