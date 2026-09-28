/*
 * Orlando Camacho
 * September 27, 2026
 * Assignment 9.2 - Exception Handling & Text I/O
 * Program 1
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CamachoArrayListTest {

    public static void main(String[] args) {

        // Create an ArrayList containing at least 10 Strings
        ArrayList<String> items = new ArrayList<>();

        items.add("Motorcycle");
        items.add("Computer");
        items.add("Phone");
        items.add("Camera");
        items.add("Backpack");
        items.add("Headphones");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Tablet");
        items.add("Charger");

        // Display the ArrayList using a for-each loop
        System.out.println("Items in the ArrayList:");
        System.out.println();

        int number = 0;

        for (String item : items) {
            System.out.println(number + ": " + item);
            number++;
        }

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the number of the element you would like to see again: ");

        String userInput = input.nextLine();

        try {
            // Convert the user's String input to an Integer object.
            // This demonstrates autoboxing.
            Integer selectedNumber = Integer.parseInt(userInput);

            // Integer is automatically converted to int when used as
            // the ArrayList index. This demonstrates auto-unboxing.
            String selectedItem = items.get(selectedNumber);

            System.out.println();
            System.out.println("You selected: " + selectedItem);

        } catch (IndexOutOfBoundsException | NumberFormatException e) {

            System.out.println();
            System.out.println("Exception has been thrown: Out of Bounds");
        }

        input.close();
    }
}