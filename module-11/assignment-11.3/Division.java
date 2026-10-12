
/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 11.3 - Makeup Assignment
 * Redo of Module 10 - Abstract Classes and Inheritance
 *
 * Improved version:
 * - Uses private, final fields for encapsulation.
 * - Validates division names and account numbers.
 * - Provides getter methods for subclasses.
 * - Defines an abstract display() method.
 */

public abstract class Division {

    private final String divisionName;
    private final int accountNumber;

    // Constructor with input validation
    public Division(String divisionName, int accountNumber) {

        if (divisionName == null || divisionName.isBlank()) {
            throw new IllegalArgumentException(
                "Division name cannot be empty."
            );
        }

        if (accountNumber <= 0) {
            throw new IllegalArgumentException(
                "Account number must be greater than zero."
            );
        }

        this.divisionName = divisionName.trim();
        this.accountNumber = accountNumber;
    }

    // Getter methods protect the original fields
    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Helper method shared by both subclasses
    protected void displayBasicInfo() {
        System.out.println("Division Name: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
    }

    // Each subclass must provide its own display method
    public abstract void display();
}
