/*Jackie Scott 2/4/2024 Module 5
 * This program will use a while loop to calculate, starting at 1/3.0 all the way to 1/99.0, first increasing then decreasing 
 */

public class Module5 {
    public static void main(String[] args) {

        // Initialize for denominator increasing and decreasing
        double totalIncrease = 0.0;
        double totalDecrease = 0.0;

        // Increasing from 3.0 to 99.0
        double i = 3.0;
        while (i <= 99.0) {
            // Print the fraction first part of the string is the fraction then we add the
            // double 3.0-99.0
            System.out.print("1/" + (double) i);

            // this will help make sure the + doesn't print at the end so we don't have an
            // extra +
            if (i < 99.0) {
                System.out.print(" + ");
            }

            // Add the current "i" fraction to the totalIncrease for SUM
            totalIncrease += 1.0 / i;
            // increase by 2 since we need odd numbers, and to make sure we don't make an
            // infinite loop.We can't use ++ since that only increments by one.
            i += 2.0;
        }
        // Print everything on one line the fractions, the calculation, thats why we
        // created the variable totalIncrease, to make one long statement
        System.out.println(" = " + totalIncrease);

        // reversing by starting at 99.0 instead of 3.0
        i = 99.0;
        while (i >= 3.0) {
            System.out.print("1/" + (double) i);
            if (i > 3.0) {
                System.out.print(" + ");
            }
            totalDecrease += 1.0 / i;
            i -= 2.0;
        }
        System.out.println(" = " + totalDecrease);
    }
}
