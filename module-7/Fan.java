/*
 * Name: Orlando Camacho
 * Date: 09/13/2026
 * Assignment: Module 7 Programming Assignment
 * Course: CSD-402 Java for Programmers
 *
 * This class represents a Fan object. It includes constants
 * for fan speeds, private data fields, constructors, getters,
 * setters, and uses the 'this' reference where appropriate.
 */

public class Fan {

    // Constants for fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private data fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter for speed
    public int getSpeed() {
        return this.speed;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter for on
    public boolean isOn() {
        return this.on;
    }

    // Setter for on
    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter for radius
    public double getRadius() {
        return this.radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return this.color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Kept from Module 6, but it will NOT be used
    // to display the fans in Module 7.
    @Override
    public String toString() {
        return "Fan [speed=" + this.speed
                + ", on=" + this.on
                + ", radius=" + this.radius
                + ", color=" + this.color + "]";
    }
}