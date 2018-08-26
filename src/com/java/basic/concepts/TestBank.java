package com.java.basic.concepts;

public class TestBank {

	public static void main(String[] args) {
		
		Bank b1=new Bank();
		b1.name="SBI";
		b1.accountbalance=20000;
		b1.interestgained(5000);
		System.out.println(b1.accountbalance);
		
		
		//Create object of Employees Class
		Employess emp=new Employess();
		emp.name="Praveen";
		emp.address="Hyderabad, Sr Nagar";
		
		b1.em=emp;
		System.out.println(b1.em.name);
		System.out.println(b1.em.address);
		
		System.out.println("==============");
		
		Bank b2=new Bank();
		b2.name="HDFC";
		b2.accountbalance=10000;
		b2.interestgained(2000);
		System.out.println(b2.accountbalance);
		
		b2.em=new Employess();
		b2.em.name="Shaik";
		b2.em.address="Ch.pet";
		System.out.println(b2.em.name);
		System.out.println(b2.em.address);
		
		System.out.println("=======&&&&&==========");
		
		b2.getbalance();
		Employess emp1=b2.getbalance();
		emp1.deposit();
		emp1.withdrawl();
		
		b2.getbalance().deposit();
		b2.getbalance().withdrawl();
		
	}
}
