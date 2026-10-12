
/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 11.3 - Makeup Assignment
 * Redo of Module 10 - Abstract Classes and Inheritance
 *
 * Improvements:
 * - Validates the state name.
 * - Uses private, final fields.
 * - Reuses the superclass displayBasicInfo() method.
 */

public class DomesticDivision extends Division {

    private final String state;

    // Constructor
    public DomesticDivision(String divisionName,
                            int accountNumber,
                            String state) {

        super(divisionName, accountNumber);

        if (state == null || state.isBlank()) {
            throw new IllegalArgumentException(
                "State cannot be empty."
            );
        }

        this.state = state.trim();
    }

    // Getter for the state
    public String getState() {
        return state;
    }

    // Override the abstract display method
    @Override
    public void display() {
        System.out.println("Domestic Division");
        displayBasicInfo();
        System.out.println("State: " + getState());
        System.out.println();
    }
}
