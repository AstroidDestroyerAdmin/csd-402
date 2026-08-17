/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 1 Assignment
 * August 15, 2026
 *
 * This program calculates the amount of energy needed
 * to heat water from an initial temperature to a final
 * temperature.
 */

import java.util.Scanner;

public class WaterHeating {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for the amount of water.
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Ask the user for the initial temperature.
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // Ask the user for the final temperature.
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate the energy needed in joules.
        double energy = waterMass
                * (finalTemperature - initialTemperature)
                * 4184;

        // Display the result.
        System.out.println();
        System.out.println("The energy needed is "
                + energy + " joules.");

        input.close();
    }
}