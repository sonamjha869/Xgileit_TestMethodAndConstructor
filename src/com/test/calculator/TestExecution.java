package com.test.calculator; //created package name is....

public class TestExecution { // created class name is TestExecution
	public static void main( String...args) { //main method for execution
		
		Calculator c = new Calculator(8,2); // created object using parameterized constructor. Passed value 8 and 2 
		//for setting  parameter.
		c.addition(); // calling method addition
		c.multiplication(); // calling method multiplication
		c.division(); // calling method division
		c.subtraction();// calling method subtraction
		Calculator c1 = new Calculator(); // created object using non arg constructor.
		
		
	}
	

}
