/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 10 Assignment
 *
 * This program demonstrates abstract classes and inheritance.
 * The Division abstract class stores a company's division name
 * and account number.
 */

public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}