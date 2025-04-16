package com.prajwaldarekar.firsttrainingproject;

public class Iterations {

	
/*
    // While Loop Example
    private void whileloop() {
        int i = 10;
        while (i >= 0) {
            System.out.println("Elements: " + i);
            i--;  // ✅ Decrement to avoid infinite loop
        }
    }
    
    */

    // For loop with Array
    public static void forWithArray() {
        String[] firstNameArray = { "Prajwal", "Ram", "Sham" };
//        System.out.println("Emp Count: " + firstNameArray.length);

        int count = 0;
        for (int i = 0; i < firstNameArray.length; i++) {
    //        System.out.println("Employee: " + firstNameArray[i]);
            
        	if (firstNameArray[i].equals("Prajwal")) {
            	count++;
            	System.out.println("Count: " + count);
            }
        }
    }

    public static void main(String[] args) {
/*
        // Multiplication Table
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        } 

        // Simple Incrementing Loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Element: " + i);
        }

        // Decrementing Loop
        for (int i = 10; i > 5; i--) {
            System.out.println("Element2: " + i);
        }

        // Loop with step of 2
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println("Element3: " + i);
        }

        // Sum and Average Calculation
        int sum = 0;
        float average = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
            System.out.println("Running Sum: " + sum);
        }
        System.out.println("Total Sum: " + sum);

        average = (float) sum / 10; // ✅ Cast to float to get decimal value
        System.out.println("Average: " + average);
        
        */

        // Call array loop
        forWithArray();
                
        
        
/*

        // Call while loop
        Iterations iterations = new Iterations();
        iterations.whileloop();
        
        */
    }
}
