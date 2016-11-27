package com.JavaTutorials;

import com.TestPackage.TestJavaClass;

public class AccessModifiersExample {

	public static void main(String[] args) {
		
		/* Four types of Access modifiers
		 * 1. Public
		 * 2. Private
		 * 3. Protected
		 * 4. Default
		 */
		
		//If no access modifier is given, java treats it as default. 
		//Default: Can be accessed anywhere in the package
		//This method cannot be used outside the package despite we import it externally
		//Example void printEmployeeSalaryDetails()
		
		//DEFAULT: Can access anywhere only in package
		//PUBLIC: If variable/method is public, it can be accessed anywhere
		//PRIVATE: If variable/method is public, it cannot be accessed outside the class
		//PROTECTED: If variable/method is protected, it can be accessed only by subclasses
		
		
	/*	TestJavaClass TJC = new TestJavaClass();
		TJC.abc();
		System.out.println(TJC.x);*/
		
	/*	ArrayExample AE = new ArrayExample();
		System.out.println(AE.Y);
		AE.testMethod();*/
	
		/*AccessModifiersExample AME = new AccessModifiersExample();
		System.out.println(AME.Y);
		AME.testMethod();*/
		
	}

}
