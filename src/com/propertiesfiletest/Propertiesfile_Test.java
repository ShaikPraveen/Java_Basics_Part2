package com.propertiesfiletest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile_Test 
{
	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\readingpropertiesFiles\\objects.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("course"));
		System.out.println(prop.getProperty("salary"));
	   //System.out.println(System.getProperty("user.dir"));
		
		
	}

}