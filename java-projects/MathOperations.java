public class MathOperations {
    public static void main(String[] args) {
        // Variables to store the sums
        double sumSmallerToLarger = 0.0;
        double sumLargerToSmaller = 0.0;

        // Computing sum from smaller to larger using while loop
        double denominator = 3.0;
        while (denominator <= 99.0) {
            sumSmallerToLarger += 1.0 / denominator;
            denominator += 2.0;
        }

        // Computing sum from larger to smaller using while loop
        denominator = 99.0;
        while (denominator >= 3.0) {
            sumLargerToSmaller += 1.0 / denominator;
            denominator -= 2.0;
        }

        // Display the sums
        System.out.println("Sum from smaller to larger: " + sumSmallerToLarger);
        System.out.println("Sum from larger to smaller: " + sumLargerToSmaller);
    }
}
