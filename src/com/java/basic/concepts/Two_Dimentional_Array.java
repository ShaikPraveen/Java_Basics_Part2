package com.java.basic.concepts;

public class Two_Dimentional_Array {

	public static void main(String[] args) {
		
		
		  int rows=3;
		  int cols=3;
		  
		  
		  int table[][]=new int[rows][cols];
		  table[0][0]=10;
		  table[0][1]=20;
		  table[0][2]=30;
		  
		  table[1][0]=40;
		  table[1][1]=50;
		  table[1][2]=60;
		  
		  table[2][0]=70;
		  table[2][1]=80;
		  table[2][2]=90;
		  
		  //System.out.println(table[0][2]);
		  //System.out.println(table[1][0]);
		  //System.out.println(table[2][0]);
		  
		  //Row Length
		  System.out.println("Number of Rows are :"+ table.length);
		  
		  //Col Length
		  System.out.println("Number of cols are "+table[0].length);
		  
		  //Print data in Rectangular Format
		  
		  for (int i = 0; i <rows ; i++) {
			  for (int j = 0; j < cols; j++)
			  {
				  System.out.println(" "+table[i][j]);	 
			   }  System.out.println(" ");
		}	
	}

}
