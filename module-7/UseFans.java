/*
 * Name: Orlando Camacho
 * Date: 09/13/2026
 * Assignment: Module 7 Programming Assignment
 * Course: CSD-402 Java for Programmers
 *
 * This program creates a collection of Fan objects.
 * It includes methods for displaying a single Fan
 * and a collection of Fans without using the
 * toString() method.
 */

import java.util.ArrayList;

public class UseFans {

    /*
     * Displays the information for one Fan object.
     * This method does not use toString().
     */
    public static void displayFan(Fan fan) {

        System.out.println("Fan Information");
        System.out.println("--------------------");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println();
    }

    /*
     * Displays all Fan objects inside the collection.
     * This method does not use toString().
     */
    public static void displayFans(ArrayList<Fan> fans) {

        System.out.println("===== FAN COLLECTION =====");
        System.out.println();

        for (int i = 0; i < fans.size(); i++) {

            System.out.println("Fan #" + (i + 1));
            System.out.println("--------------------");

            Fan fan = fans.get(i);

            System.out.println("Speed: " + fan.getSpeed());
            System.out.println("On: " + fan.isOn());
            System.out.println("Radius: " + fan.getRadius());
            System.out.println("Color: " + fan.getColor());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create a collection to store Fan objects
        ArrayList<Fan> fans = new ArrayList<>();

        // Create several Fan objects
        Fan fan1 = new Fan();

        Fan fan2 = new Fan(
                Fan.SLOW,
                true,
                8,
                "blue"
        );

        Fan fan3 = new Fan(
                Fan.MEDIUM,
                true,
                10,
                "black"
        );

        Fan fan4 = new Fan(
                Fan.FAST,
                true,
                12,
                "red"
        );

        // Add the Fan objects to the collection
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);

        // Display a single Fan
        System.out.println("DISPLAYING ONE FAN");
        System.out.println();

        displayFan(fan2);

        // Display every Fan in the collection
        displayFans(fans);
    }
}