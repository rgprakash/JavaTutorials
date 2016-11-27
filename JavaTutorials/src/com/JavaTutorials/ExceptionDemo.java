package com.JavaTutorials;

import java.lang.reflect.Array;

public class ExceptionDemo {
	
	int a=5;
	int b=7;
	int c=5;
	int d=b/c;
	
	public void getData()
	{
		System.out.println(d);
	}
	
	public void getArrayData()
	{
		int myArray[] = {2,4,6,8,10};
		System.out.println(myArray[8]);
	}
	
	public void getMessage()
	{
		System.out.println("Test message after the exception");
	}

	public static void main(String[] args) {
		
		ExceptionDemo ED = new ExceptionDemo();
		
		try
		{
			//ED.getData();
			ED.getArrayData();
		}
		
			
		
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic exception detected");
			//e.printStackTrace();
		}
		
		catch (IndexOutOfBoundsException e )
		{
			System.out.println("Index out of bound exception detected");
			//e.printStackTrace();
		}
		
		finally
		{
			//This finally block is executed irrespective of exception thrown or not
			ED.getMessage();
			System.out.println("Execution of script continues");
		}
		
		
		
	

	}

}
