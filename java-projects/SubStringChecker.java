/*Jackie Scott 2/1/24 Module 4
 * This program will will check two strings entered by the user to see if they are substrings of one another. 
 * First, I will input Scanner so we may accept user input. 
 */

import java.util.Scanner;

public class SubStringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Check if one string is a substring of the other
        if (firstString.contains(secondString)) {
            System.out.println(
                    "The second string, " + secondString + ",is a substring of the first string: " + firstString);
        } else if (secondString.contains(firstString)) {
            System.out.println(
                    "The first string, " + firstString + ",is a substring of the second string: " + secondString);
        } else {
            System.out.println("Neither string is a substring of the other.");
        }
    }
}
