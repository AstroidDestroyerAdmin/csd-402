/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 3 Programming Assignment
 * August 30, 2026
 *
 * This program uses nested for loops to display
 * powers of two in the required pyramid pattern.
 */

public class CamachoMod3 {

    public static void main(String[] args) {

        int totalRows = 7;

        for (int row = 0; row < totalRows; row++) {

            // Prints spaces before the numbers
            for (int space = row; space < totalRows - 1; space++) {
                System.out.print("   ");
            }

            // Prints the numbers going up
            for (int i = 0; i <= row; i++) {
                System.out.print((int) Math.pow(2, i) + " ");
            }

            // Prints the numbers going back down
            for (int i = row - 1; i >= 0; i--) {
                System.out.print((int) Math.pow(2, i) + " ");
            }

            // Prints @ at the end of every line
            System.out.println("@");
        }
    }
}