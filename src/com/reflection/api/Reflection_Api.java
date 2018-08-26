package com.reflection.api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection_Api 
{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String st="click";
		
		Method method=Reflection_Api.class.getMethod(st, String.class);
		method.invoke(method, "Hi, Praveen");
		
	}
	
	public static void click(String x) 
	{
		System.out.println("Executing the Script :: "+x);
		
	}

}
