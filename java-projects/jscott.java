public class jscott {
    public static void main(String[] args) {
        // First expression with floating-point literals
        double result1 = 4 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0);
        System.out.println("Result 1: " + result1);

        // Second expression with integer literals
        double result2 = 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13);
        System.out.println("Result 2: " + result2);

        // Discussion on the difference between the two outputs
        System.out.println("\nDiscussion:");
        System.out.println("The difference arises from the use of integer literals in the second expression.");
        System.out.println(
                "In the second expression, all divisions are performed using integer arithmetic, which truncates");
        System.out.println("the fractional part, leading to less accurate results compared to the first expression.");
        System.out.println(
                "Floating-point literals in the first expression allow for more precision in the calculations.");

        // Which is best? Why?
        System.out.println("\nWhich is best? Why?");
        System.out.println("The first expression is generally better because it uses floating-point literals,");
        System.out.println(
                "resulting in more accurate calculations. Floating-point arithmetic provides a higher level of precision");
        System.out.println(
                "when dealing with fractional numbers. It is important to use the appropriate data types to ensure");
        System.out.println("accuracy in mathematical calculations, especially when working with real numbers.");

    }
}
