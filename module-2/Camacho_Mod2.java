/*
 * Name: Orlando Camacho
 * Assignment: Module 2 - Rock Paper Scissors
 * Course: CSD-402 Java for Programmers
 *
 * This program plays a game of Rock-Paper-Scissors.
 * The computer randomly selects Rock, Paper, or Scissors.
 * The user enters a number from 1 to 3, and the program
 * displays both selections and determines the winner.
 */

import java.util.Scanner;

public class Camacho_Mod2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Generate a random number from 1 to 3.
        int computerChoice = (int) (Math.random() * 3) + 1;

        // Display the choices and ask the user to make a selection.
        System.out.println("Rock-Paper-Scissors");
        System.out.println("-------------------");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice (1, 2, or 3): ");

        int userChoice = input.nextInt();

        // Make sure the user entered a valid number.
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid selection. Please enter 1, 2, or 3.");
            input.close();
            return;
        }

        String computerSelection = "";
        String userSelection = "";

        // Convert the computer's number into Rock, Paper, or Scissors.
        switch (computerChoice) {
            case 1:
                computerSelection = "Rock";
                break;
            case 2:
                computerSelection = "Paper";
                break;
            case 3:
                computerSelection = "Scissors";
                break;
        }

        // Convert the user's number into Rock, Paper, or Scissors.
        switch (userChoice) {
            case 1:
                userSelection = "Rock";
                break;
            case 2:
                userSelection = "Paper";
                break;
            case 3:
                userSelection = "Scissors";
                break;
        }

        // Display both selections.
        System.out.println();
        System.out.println("Computer selected: " + computerSelection);
        System.out.println("You selected: " + userSelection);
        System.out.println();

        // Determine the winner.
        if (userChoice == computerChoice) {
            System.out.println("Result: It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3)
                || (userChoice == 2 && computerChoice == 1)
                || (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        input.close();
    }
}