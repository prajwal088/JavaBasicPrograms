package com.prajwaldarekar.firsttrainingproject;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continueChoice;

        do {
            System.out.println("\nEnter choice (Addition / Sub / Mul / Div): ");
            String operation = scanner.next();

            int a = 10;
            int b = 5;

            switch (operation) {
                case "Addition":
                    System.out.println("Addition: " + (a + b));
                    break;
                case "Sub":
                    System.out.println("Subtraction: " + (a - b));
                    break;
                case "Mul":
                    System.out.println("Multiplication: " + (a * b));
                    break;
                case "Div":
                    if (b != 0) {
                        System.out.println("Division: " + (a / b));
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                default:
                    System.out.println("❌ Invalid operation! Try again.");
                    break;
            }

            // Input validation loop for continueChoice
            while (true) {
                System.out.print("\nDo you want to continue? (yes/no): ");
                continueChoice = scanner.next();

                if (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("❌ Invalid input! Please enter 'yes' or 'no'.");
                }
            }

        } while (continueChoice.equalsIgnoreCase("yes"));

        scanner.close();
        System.out.println("✅ Thanks for using the calculator!");
    }
}
