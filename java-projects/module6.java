/*Jackie Scott 2/6/24 Module 6
 * This program will create a floyd triangle, in a hill pattern, with the numbers both increasing and decreasing
 * The triangle will have 7 rows and 13 columns. 
 */

public class module6 {
    public static void main(String[] args) {
        // this will ultimately be how many times they program will run also determines
        // number of rows
        int n = 8;

        // first we create our outer loop for our rows
        for (int i = 1; i < n; i++) {
            int p = 1; // to increment our columns

            // the fors will now be our inner loops to create our columns and perform the
            // needed calculations
            for (int j = i; j <= n; j++) {
                System.out.print("  "); // this controls our spacing
            }

            // creates our increasing columns to the left side
            // we use the < to ensure our triangle has a peak by printing one less column
            for (int j = 1; j < i; j++) {
                System.out.print(p + " ");
                p *= 2;
            }

            // creates our decreasing columns to the right side
            for (int j = 1; j <= i; j++) {
                System.out.print(p + " ");
                p /= 2;
            }

            int spaceAfterNum = 10;
            for (int j = 1; j <= spaceAfterNum; j++) {
                System.out.print("   ");
                spaceAfterNum = spaceAfterNum - 1;
            }

            // this makes sure each line prints in it's own row
            // adding @ symbol at the end and added space with \n
            System.out.println("@\n");

        }
    }
}