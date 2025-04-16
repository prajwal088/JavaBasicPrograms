package com.prajwaldarekar.firsttrainingproject;

public class DiamondStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String i = "*";
//		System.out.println(i);
//		System.out.println(i+i);
//		System.out.println(i+i+i);
//		System.out.println(i+i+i+i);

		int n = 5;	// Number of lines
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");	// Spacing
			}
				for(int k = 1; k <= (2 * i - 1); k++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
