package com.java.basic.concepts;

public class Class_And_Objects { //Start of the body

	public static void main(String[] args) 
	{
	  //src ->Folder maintain .java files 
	  //bin ->Folder maintain .class files
	  //Class is a Keyword 
		
		
	 //Access Methods Non Static Methods -Class Object Reference
		Class_And_Objects ca=new Class_And_Objects();
		ca.first();
		ca.second();
		
	//Access Methods Static Methods -> Directly Call
		first1();
		secon1(); 
	}
	    // Non-static Methods
	    public void first() 
	    {
	    	System.out.println("This is My First Non-Static Method");
	    }
	    
	    public void second() 
	    {
	    	System.out.println("This is My Second Non-Static Method");
	    }
	    
	    
	    //Static methods  
	    public static void first1() 
	    {
	    	System.out.println("This is My First Static Method");
	    }
	    
	    public static void secon1() 
	    {
	    	System.out.println("This is My Second static Method");
	    }

}// end of the body
