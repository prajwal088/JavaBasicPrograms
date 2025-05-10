package com.prajwaldarekar.firsttrainingproject;

/*public class FinalKeyword {
	
	// Final keyword is used to define constant.
	//Only variables and methods can be final.
	final static int i = 10;
	

	public static void main(String[] args) {

		System.out.println("Final keyword value: " +i);
		
	}*/

public class FinalKeyword {
	
	final int age = 25;
//	age = 30; // ❌ Error: Cannot change final variable

	class Parent {
	    final void display() {
	        System.out.println("This is a final method.");
	    }
	}

	class Child extends Parent {
	    // void display() {} // ❌ Error: Cannot override final method
	}

	final class Animal {}

	// class Dog extends Animal {} // ❌ Error: Cannot extend final class

	
	public static void main(String[] args ) {
		
	}


}
