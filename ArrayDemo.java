package com.prajwaldarekar.firsttrainingproject;

public class ArrayDemo {

	public static void main(String[] args) {

		String firstname = "Prajwal";
		String[] firstnamearray = { "Prajwal", "safdvsdv", "sadvafv", "dfvasdfvv" };
		
		float [] floatArray = { 3.5f, 4.5f};
		
		int[] intArray = {1, 2, 3, 4, 6, 7};
		
		int[] array = new int[] {4,5,5,6};
		
		
		System.out.println("firstnamearray: " + firstnamearray[0]);
		System.out.println("firstnamearray01: " + firstname);
		System.out.println("firstnamearray02: " + floatArray[1]);
		System.out.println("firstnamearray03: " + intArray[5]);
		System.out.println("firstnamearray04: " + array[4-1]);
	
		for (int i = 0; i < firstnamearray.length; i++) {
			System.out.println(firstnamearray[i]);
		}
	}
}