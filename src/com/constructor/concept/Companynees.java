package com.constructor.concept;

public class Companynees 
{
	String comp_name;
	String comp_address;
	int comp_emp_numer;
	
	public Companynees() //default constructor
	{
		System.out.println("Adding Companyness");
	}
	
	public Companynees(String comp_name, String comp_address, int comp_emp_numer)//Parametarized Constructor
	{
		this.comp_name=comp_name;
		this.comp_address=comp_address;
		this.comp_emp_numer=comp_emp_numer;
		
	}
	
	public static void main(String[] args) {
		
		Companynees cmp=new Companynees();
		cmp.comp_name="Infofactors";
		cmp.comp_address="Hyderabad";
		cmp.comp_emp_numer=1120;
		
		
		Companynees cmp1=new Companynees();
		cmp1.comp_name="TCS";
		cmp1.comp_address="Bangalore";
		cmp1.comp_emp_numer=1122;
		
 //Now you want add more company names and address we will use Constructor to overcome this creating new class objects
 //Now create Constructor above	
		
		Companynees cmp3=new Companynees("Wipro","Chennai",1125);
		System.out.println("Argumentd constructor name  :"+cmp3.comp_name);
		System.out.println("Argumented constructor address  :"+cmp3.comp_address);
		System.out.println("Argumented constructor number  :"+cmp3.comp_emp_numer);	
	}
}
