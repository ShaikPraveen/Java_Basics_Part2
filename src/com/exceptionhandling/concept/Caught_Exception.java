package com.exceptionhandling.concept;

class Caught_Exception 
{
	public static void main(String[] args) throws InterruptedException  {
		
		int i[]=new int[2];
		i[2]=10;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		Thread.sleep(2000);
	}

}
