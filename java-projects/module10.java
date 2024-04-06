/*Jackie Scott 3/3/24 Module 10
*This program will have four overload methods that return the average of the array
*public static short average(short [] array)
*public static int average(int [] array)
*public static long average(long [] array)
*public static double average(double [] array)
 */

public class module10 {

    // creating our four methods
    // we will use a for loop to iterate through each value in the array entered
    // after this
    // we will return the sum of the array values

    public static short average(short[] array) {
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // create our arrays that are different lengths and values
    public static void main(String[] args) {
        short[] shortArray = { 3, 8, 10, 15, 22 };
        int[] intArray = { 2, 3, 7, 9, 15, 27, 35 };
        long[] longArray = { 500, 600, 800, 900 };
        double[] doubleArray = { 5.5, 8.2, 20.5 };

        /*
         * we will print out each array with a title, what the values are, and the
         * average
         * we will use a for loop to display the value otherwise we get unreadable
         * information
         */

        System.out.println("Short Array:");
        for (short num : shortArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nInt Array:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLong Array:");
        for (long num : longArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDouble Array:");
        for (double num : doubleArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(doubleArray));

    }

}
