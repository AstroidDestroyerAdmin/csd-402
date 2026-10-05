/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 10 Assignment
 *
 * InternationalDivision extends Division and adds
 * the country and language for an international division.
 */

public class InternationalDivision extends Division {

    private String country;
    private String language;

    // Constructor
    public InternationalDivision(String divisionName, int accountNumber,
                                 String country, String language) {

        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Implementation of the abstract display method
    @Override
    public void display() {
        System.out.println("International Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}