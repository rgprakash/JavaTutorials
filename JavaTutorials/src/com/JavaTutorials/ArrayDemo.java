package com.JavaTutorials;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//This new line of code is added to check the GIT Commit
		System.out.println("This is to check the GIT commit");
		int[] myIntArray1 = new int[5];
		
		for(int i=0;i<=4;i++)
		{
			myIntArray1[i]=i+5;
		}
		
		for(int j=0;j<5;j++)
		{
			//System.out.println("Value at index " + j + " is: " + myIntArray1[j] );
		}
		
		String[] myStringArray1 = new String[3];
		myStringArray1[0]="Maruthi";
		myStringArray1[1]="Suzuki";
		myStringArray1[2]="Honda";
		
		String myStringArray2[] = {"Tata","Nano","Hundai"};
		System.out.println(myStringArray2.length);
		for(int k=0;k<myStringArray2.length;k++)
		{
			System.out.println(myStringArray2[k]);
		}
		
		
	}

}
