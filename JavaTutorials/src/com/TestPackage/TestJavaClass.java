package com.TestPackage;

import com.JavaTutorials.ArrayExample;

public class TestJavaClass extends ArrayExample {
	
	public int x=100;
	public void abc()
	{
		System.out.println("Dummy method abc");
	}
	
	public static void main(String[] args) {
		
	/*	ArrayExample AE = new ArrayExample();
		System.out.println(AE.Y);
		AE.testMethod();*/
	
		TestJavaClass TJC = new TestJavaClass();
		System.out.println(TJC.Y);
		TJC.testMethod();

	}

}
