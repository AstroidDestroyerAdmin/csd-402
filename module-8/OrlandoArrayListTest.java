/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 8 Assignment
 * ArrayList Test
 *
 * This program accepts integers from the user and stores them
 * in an ArrayList. Input continues until the user enters 0.
 * The program then finds and displays the largest value.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class OrlandoArrayListTest {

    // Returns the largest Integer in the ArrayList.
    // If the ArrayList is empty, the method returns 0.
    public static Integer max(ArrayList list) {

        if (list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);

            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers one at a time.");
        System.out.println("Enter 0 when you are finished.");

        int number;

        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();

            // Add every number, including 0, to the ArrayList
            numbers.add(number);

        } while (number != 0);

        // Send the ArrayList to the max method
        Integer largest = max(numbers);

        System.out.println();
        System.out.println("Numbers entered: " + numbers);
        System.out.println("The largest value is: " + largest);

        // Additional test required by the assignment
        ArrayList<Integer> emptyList = new ArrayList<>();

        System.out.println();
        System.out.println("Empty ArrayList test:");
        System.out.println("Returned value: " + max(emptyList));

        input.close();
    }
}