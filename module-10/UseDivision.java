/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 10 Assignment
 *
 * This application creates two InternationalDivision objects
 * and two DomesticDivision objects and displays their information.
 */

public class UseDivision {

    public static void main(String[] args) {

        // Create two international divisions
        InternationalDivision international1 =
                new InternationalDivision(
                        "European Operations",
                        1001,
                        "Germany",
                        "German");

        InternationalDivision international2 =
                new InternationalDivision(
                        "Latin American Operations",
                        1002,
                        "Mexico",
                        "Spanish");

        // Create two domestic divisions
        DomesticDivision domestic1 =
                new DomesticDivision(
                        "West Coast Operations",
                        2001,
                        "California");

        DomesticDivision domestic2 =
                new DomesticDivision(
                        "East Coast Operations",
                        2002,
                        "New York");

        // Display all division information
        international1.display();
        international2.display();
        domestic1.display();
        domestic2.display();
    }
}