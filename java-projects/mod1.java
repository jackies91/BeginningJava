/* Jackie Scott 1/13/24 Module One 
*This code will calculate two math expressions that are slightly formatted different. 
I will explain why I think the two expressions give two different answers at the end.
*/

public class mod1 {
    public static void main(String[] args) {

        System.out.println("4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ) = "
                + (4 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0)));

        System.out.println("4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 ) = "
                + (4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13)));

        double expression1 = 4 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0);
        System.out.println("4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ) = "
                + expression1);

        int expression2 = 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13);
        System.out.println("4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 ) = " + expression2);

    }
}

/*
 * The expressions resulted in two different answers. The first expression was
 * approx. 3.2837 while the second express is 4.
 * I think that the expressions resulted in two different answers because the
 * first expressions, decimal numbers, are seen as doubles while the whole
 * numbers are seen as int. I tested this theory by creating the second set of
 * code where I put the first expression as int but when I ran my code an error
 * of type mismatch occured.Once I made expression 1 as double I ended with the
 * same result as my first set of code. I also think that with expression one it
 * comes down to order of operators much like PEMAS. I think that the first
 * expression is best because for one this is the way math should be calculated
 * but also because we are not rounding numbers. We are getting exact more
 * accurate calculations.
 */