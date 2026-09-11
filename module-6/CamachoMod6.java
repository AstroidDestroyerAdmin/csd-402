/*
 * Orlando Camacho
 * CSD-402 Java for Programmers
 * Module 6.2 Assignment
 * Fan Class
 */

class Fan {

    // Fan speed constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and setter for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Returns a description of the fan
    @Override
    public String toString() {
        return "Fan Speed: " + speed
                + "\nFan On: " + on
                + "\nRadius: " + radius
                + "\nColor: " + color;
    }
}

public class CamachoMod6 {

    public static void main(String[] args) {

        // Create Fan using default constructor
        Fan fan1 = new Fan();

        System.out.println("Default Fan");
        System.out.println("-----------");
        System.out.println(fan1);

        // Create Fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        System.out.println();
        System.out.println("Custom Fan");
        System.out.println("----------");
        System.out.println(fan2);

        // Test setter methods
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("black");

        System.out.println();
        System.out.println("Updated Default Fan");
        System.out.println("-------------------");
        System.out.println(fan1);

        // Test getter methods
        System.out.println();
        System.out.println("Testing Getter Methods");
        System.out.println("----------------------");
        System.out.println("Speed: " + fan2.getSpeed());
        System.out.println("On: " + fan2.isOn());
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());
    }
}