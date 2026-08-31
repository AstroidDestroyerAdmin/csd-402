/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 4 Programming Assignment
 * August 30, 2026
 *
 * This program uses overloaded methods to calculate
 * the average of short, int, long, and double arrays.
 * Each array contains a different number of elements.
 */

public class CamachoMod4 {

    // Calculates the average of a short array
    public static short average(short[] array) {
        short sum = 0;

        for (short number : array) {
            sum += number;
        }

        return (short) (sum / array.length);
    }

    // Calculates the average of an int array
    public static int average(int[] array) {
        int sum = 0;

        for (int number : array) {
            sum += number;
        }

        return sum / array.length;
    }

    // Calculates the average of a long array
    public static long average(long[] array) {
        long sum = 0;

        for (long number : array) {
            sum += number;
        }

        return sum / array.length;
    }

    // Calculates the average of a double array
    public static double average(double[] array) {
        double sum = 0;

        for (double number : array) {
            sum += number;
        }

        return sum / array.length;
    }

    public static void main(String[] args) {

        // Each array has a different size
        short[] shortArray = {10, 20, 30, 40};

        int[] intArray = {15, 25, 35, 45, 55};

        long[] longArray = {
            100L, 200L, 300L, 400L, 500L, 600L
        };

        double[] doubleArray = {
            5.5, 10.5, 15.5, 20.5, 25.5, 30.5, 35.5
        };

        System.out.println("======================================");
        System.out.println("         ARRAY AVERAGE PROGRAM");
        System.out.println("======================================");

        System.out.print("\nShort Array: ");
        displayArray(shortArray);
        System.out.println("Average: " + average(shortArray));

        System.out.print("\nInteger Array: ");
        displayArray(intArray);
        System.out.println("Average: " + average(intArray));

        System.out.print("\nLong Array: ");
        displayArray(longArray);
        System.out.println("Average: " + average(longArray));

        System.out.print("\nDouble Array: ");
        displayArray(doubleArray);
        System.out.printf("Average: %.2f%n", average(doubleArray));

        System.out.println("\n======================================");
    }

    // Displays the short array
    public static void displayArray(short[] array) {
        for (short number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Displays the int array
    public static void displayArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Displays the long array
    public static void displayArray(long[] array) {
        for (long number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Displays the double array
    public static void displayArray(double[] array) {
        for (double number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}