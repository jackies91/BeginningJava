/*Jackie Scott 3/6/24 Module 11
*This program will have four methods that returns a one-dimensional array
*with the largest values from each subarrays
*public static int [] locateLargest (double [][] arrayParam)
*public static int [] locateLargest (int [][] arrayParam)
*public static int [] locateSmallest (double [][] arrayParam)
*public static int [] locateSmallest (int [][] arrayParam)
*The program will call each of these four methods with different two-dimensional arrays
 */

public class module11 {

    // Method to find the largest values in each array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] largestValues = new int[arrayParam.length];
        for (int i = 0; i < arrayParam.length; i++) {
            int max = arrayParam[i][0];
            for (int j = 1; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                }
            }
            largestValues[i] = max;
        }
        return largestValues;
    }

    // Method to find the largest values in each array
    public static double[] locateLargest(double[][] arrayParam) {
        double[] largestValues = new double[arrayParam.length];
        for (int i = 0; i < arrayParam.length; i++) {
            double max = arrayParam[i][0];
            for (int j = 1; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                }
            }
            largestValues[i] = max;
        }
        return largestValues;
    }

    // Method to find the smallest values in each array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] smallestValues = new int[arrayParam.length];
        for (int i = 0; i < arrayParam.length; i++) {
            int min = arrayParam[i][0];
            for (int j = 1; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                }
            }
            smallestValues[i] = min;
        }
        return smallestValues;
    }

    // Method to find the smallest values in each array
    public static double[] locateSmallest(double[][] arrayParam) {
        double[] smallestValues = new double[arrayParam.length];
        for (int i = 0; i < arrayParam.length; i++) {
            double min = arrayParam[i][0];
            for (int j = 1; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                }
            }
            smallestValues[i] = min;
        }
        return smallestValues;
    }

    // Sample main method to test the methods
    public static void main(String[] args) {
        // Sample arrays
        int[][] numbers1 = { { 3, 5, 9, 15, 17 }, { 300, 70, 80 }, { 25, 35, 45, 55, 65 } };
        double[][] numbers2 = { { 1.5, 3.5, 5.9, 7.1, 10.3 }, { 100.5, 99.7, 110.3 }, { 15.8, 22.7, 89.6, 1.7, 7.7 } };

        // print results
        System.out.println("Largest Numbers: " + java.util.Arrays.toString(locateLargest(numbers1)));
        System.out.println("Largest Doubles: " + java.util.Arrays.toString(locateLargest(numbers2)));
        System.out.println("Smallest Numbers: " + java.util.Arrays.toString(locateSmallest(numbers1)));
        System.out.println("Smallest Doubles: " + java.util.Arrays.toString(locateSmallest(numbers2)));
    }
}
