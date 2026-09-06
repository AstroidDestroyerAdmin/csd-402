/*
 * Orlando Camacho
 * Module 5.2 Programming Assignment
 * CSD-402 Java for Programmers
 * September 4, 2026
 *
 * This program uses overloaded methods to locate the largest
 * and smallest elements in two-dimensional int and double arrays.
 */

public class CamachoMod5 {

    public static void main(String[] args) {

        int[][] intArray = {
            {4, 8, 2},
            {7, 1, 9},
            {5, 3, 6}
        };

        double[][] doubleArray = {
            {2.5, 7.8, 1.2},
            {9.4, 3.6, 5.1},
            {4.7, 0.8, 6.3}
        };

        int[] intLargest = locateLargest(intArray);
        int[] intSmallest = locateSmallest(intArray);

        int[] doubleLargest = locateLargest(doubleArray);
        int[] doubleSmallest = locateSmallest(doubleArray);

        System.out.println("Integer Array:");
        System.out.println("Largest element location: [" +
                intLargest[0] + "][" + intLargest[1] + "]");
        System.out.println("Smallest element location: [" +
                intSmallest[0] + "][" + intSmallest[1] + "]");

        System.out.println();

        System.out.println("Double Array:");
        System.out.println("Largest element location: [" +
                doubleLargest[0] + "][" + doubleLargest[1] + "]");
        System.out.println("Smallest element location: [" +
                doubleSmallest[0] + "][" + doubleSmallest[1] + "]");
    }

    public static int[] locateLargest(double[][] arrayParam) {

        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] >
                        arrayParam[location[0]][location[1]]) {

                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {

        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] >
                        arrayParam[location[0]][location[1]]) {

                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {

        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] <
                        arrayParam[location[0]][location[1]]) {

                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {

        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] <
                        arrayParam[location[0]][location[1]]) {

                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }
}