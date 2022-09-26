package com.test.calculator; //created  package name is....

public class Calculator { //created class Calculator
	int x ; // declare variable x
	int y; //declare variable y
	public Calculator() { //created default constructor which prints one line.
		System.out.println("No arg constructor") ; //	
	}
	
	public Calculator(int a, int b) { //created overloaded parameterized constructor which prints one line 
		// And set value of x and y.
		System.out.println("Parameterized constructor") ;
		x = a; // setting value for x
		y = b; //setting value for y
	}
	void addition() { // created method addition which add x and y, store value in sum and prints the value of sum.
		int sum = x+y;
		System.out.println("Addition result is "+ sum );
	}
	void multiplication() { //created method multiplication which multiply x and y, store value in multiply 
		//And prints the value of multiply.
		int multiply = x*y;
		System.out.println("Multiplication result is "+ multiply );	
	}
	void division() { //created method division which divide x and y, store value in div 
		//And prints the value of div
		int div = x/y;
		System.out.println("Division result is "+ div );			
	}
	void subtraction() { //created method subtraction which subtract x and y, store value in subtract 
		//And prints the value of subtact
		int subtract = x-y;
		System.out.println("subtraction result is "+ subtract );	
	}
	

}
