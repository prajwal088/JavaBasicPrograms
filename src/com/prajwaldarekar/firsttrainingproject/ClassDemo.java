package com.prajwaldarekar.firsttrainingproject;

public class ClassDemo {
	
	//static variable
	static int modelNo = 8;
	//instance variable
	String color = "white";
	
	//Method/function declaration
	public void breaking() {
	//Method implementation

		//local variable
		@SuppressWarnings("unused")
		int a = 10;
		System.out.println("add breaking logic");	
	
	}
	
	private void setModelName(String modelName) {
		
		System.out.println("Model Name: "+modelName);
		
	}
	
	public static void main(String[] args) {

		ClassDemo carObject = new ClassDemo();
		carObject.breaking();
		System.out.println(carObject.modelNo);
		System.out.println(carObject.color);
		carObject.setModelName("Smart Plus");	
	}

}
