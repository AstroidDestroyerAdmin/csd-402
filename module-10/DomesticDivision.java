/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 10 Assignment
 *
 * DomesticDivision extends Division and adds
 * the state where the domestic division is located.
 */

public class DomesticDivision extends Division {

    private String state;

    // Constructor
    public DomesticDivision(String divisionName, int accountNumber,
                            String state) {

        super(divisionName, accountNumber);
        this.state = state;
    }

    // Implementation of the abstract display method
    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}