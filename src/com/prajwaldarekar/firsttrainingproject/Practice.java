package com.prajwaldarekar.firsttrainingproject;

public class Practice {

    public void customPattern() {
        // Row 1: print numbers 1 to 6
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            System.out.print((2 * i) + " ");
        }
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            System.out.print((3 * i) + " ");
        }
        System.out.println();

        // Row 4: multiples of 4 → 4, 8, 12, 16
        for (int i = 1; i <= 6; i++) {
            System.out.print((4 * i) + " ");
        }
        System.out.println();
    }

    public static void main(StringDemo[] args) {
        Practice practice = new Practice();
        practice.customPattern();
    }
}
