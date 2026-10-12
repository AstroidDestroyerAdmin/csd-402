
/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 11.3 - Makeup Assignment
 * Redo of Module 10 - Abstract Classes and Inheritance
 *
 * Improvements:
 * - Demonstrates polymorphism using a Division array.
 * - Uses a loop instead of repeated display calls.
 * - Tests input validation with exception handling.
 */

public class UseDivision {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("    COMPANY DIVISION DIRECTORY");
        System.out.println("==================================");
        System.out.println();

        // Create four division objects.
        Division[] divisions = {
            new InternationalDivision(
                "European Operations", 1001,
                "Germany", "German"
            ),

            new InternationalDivision(
                "Latin American Operations", 1002,
                "Mexico", "Spanish"
            ),

            new DomesticDivision(
                "West Coast Operations", 2001,
                "California"
            ),

            new DomesticDivision(
                "East Coast Operations", 2002,
                "New York"
            )
        };

        // Polymorphism: each object uses its own display() method.
        for (Division division : divisions) {
            division.display();
        }

        System.out.println("Total divisions: " + divisions.length);

        // Test validation with an invalid account number.
        System.out.println();
        System.out.println("Testing input validation:");

        try {
            Division invalidDivision = new DomesticDivision(
                "Test Division", -5, "California"
            );

            invalidDivision.display();

        } catch (IllegalArgumentException e) {
            System.out.println("Validation successful: "
                + e.getMessage());
        }

        System.out.println();
        System.out.println("Program completed successfully.");
    }
}
