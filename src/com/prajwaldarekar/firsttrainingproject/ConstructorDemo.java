package com.prajwaldarekar.firsttrainingproject;

public class ConstructorDemo {
	
	int i = 10;
	
	//Default constructor
	ConstructorDemo(){
		i = 15;
		System.out.println("Default constructor: " +i);
	}
	
	//Parameterized constructor
		ConstructorDemo(String i, int j, double k){

			System.out.printf("Parameterized constructor: "+i, +j, +k);
		}
	

	public static void main(String[] args) {
		
		//Object creation and default call constructor
		ConstructorDemo constructorDefault = new ConstructorDemo();
		
		//Object creation and parameterized call constructor
		ConstructorDemo constructorParameterized = new ConstructorDemo("String: name", 10, 10000);

	}

}
