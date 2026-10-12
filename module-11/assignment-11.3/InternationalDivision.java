
/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 11.3 - Makeup Assignment
 * Redo of Module 10 - Abstract Classes and Inheritance
 *
 * Improvements:
 * - Validates country and language information.
 * - Uses private, final fields.
 * - Reuses the superclass displayBasicInfo() method.
 */

public class InternationalDivision extends Division {

    private final String country;
    private final String language;

    // Constructor
    public InternationalDivision(String divisionName,
                                 int accountNumber,
                                 String country,
                                 String language) {

        super(divisionName, accountNumber);

        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException(
                "Country cannot be empty."
            );
        }

        if (language == null || language.isBlank()) {
            throw new IllegalArgumentException(
                "Language cannot be empty."
            );
        }

        this.country = country.trim();
        this.language = language.trim();
    }

    // Getter methods
    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    // Override the abstract display method
    @Override
    public void display() {
        System.out.println("International Division");
        displayBasicInfo();
        System.out.println("Country: " + getCountry());
        System.out.println("Language: " + getLanguage());
        System.out.println();
    }
}
