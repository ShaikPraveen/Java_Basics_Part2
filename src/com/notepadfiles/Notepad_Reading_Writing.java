package com.notepadfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad_Reading_Writing {

	public static void main(String[] args) throws IOException {
		
     		
/*      //Create a Text File
      File fi=new File("D:\\Screenshot\\sample.txt");
      fi.createNewFile();
      
      //Writing the Text in a File
      FileWriter fw=new FileWriter("D:\\\\Screenshot\\\\sample.txt");
      BufferedWriter filewriter=new BufferedWriter(fw);
      filewriter.write("I am Performing Notepad Operations");
      filewriter.newLine();
      filewriter.write("Practising Notepad Operations");
      filewriter.flush(); */
      
      //Reading the Text data
      FileReader fr=new FileReader("D:\\Screenshot\\sample.txt");
	  BufferedReader filereader=new BufferedReader(fr);
	  
	   String i="";
	  /*System.out.println(filereader.readLine());
	  System.out.println(filereader.readLine());
	  System.out.println(filereader.readLine());
	  System.out.println(filereader.readLine());
	  System.out.println(filereader.readLine());	 
*/	    while ((i=filereader.readLine())!=null) 
          {
	        System.out.println(i);
         }
	}

}
