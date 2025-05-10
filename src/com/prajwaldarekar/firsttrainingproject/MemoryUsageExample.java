package com.prajwaldarekar.firsttrainingproject;

public class MemoryUsageExample {
    public static void main(StringDemo[] args) {
        Runtime runtime = Runtime.getRuntime();

        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used Memory Before: " + usedMemoryBefore + " bytes");

        // Create a large number of objects
        int[] largeArray = new int[1000000]; // Allocating memory

        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used Memory After: " + usedMemoryAfter + " bytes");

        // Suggest Garbage Collection
        System.gc();

        long usedMemoryAfterGC = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used Memory After GC: " + usedMemoryAfterGC + " bytes");
    }
}

