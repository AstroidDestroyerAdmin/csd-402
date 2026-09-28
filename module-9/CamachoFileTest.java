/*
 * Orlando Camacho
 * September 27, 2026
 * Assignment 9.2 - Exception Handling & Text I/O
 * Program 2
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class CamachoFileTest {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();

        try {
            // Create the file if it does not already exist
            if (file.createNewFile()) {
                System.out.println("data.file was created.");
            } else {
                System.out.println("data.file already exists.");
            }

            // Open the file in append mode
            FileWriter writer = new FileWriter(file, true);

            System.out.println();
            System.out.println("Adding 10 random numbers to data.file...");

            // Generate and write 10 random integers
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100) + 1;
                writer.write(number + " ");
            }

            // Close the file after writing
            writer.close();

            System.out.println("Numbers successfully written to the file.");

            // Reopen the file and read its contents
            Scanner reader = new Scanner(file);

            System.out.println();
            System.out.println("Contents of data.file:");

            while (reader.hasNextInt()) {
                System.out.print(reader.nextInt() + " ");
            }

            System.out.println();

            // Close the file after reading
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
        }
    }
}