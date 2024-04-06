/* Jackie Scott 2/16/24 Module 7 
 * This program will make sure that the user's passwords meets all requirements of
 * Must have at least eight characters
 * Must contain both letters and digits
 * Contain at least one uppercase character
 * Contain at least one lowercase character
 */

import java.util.Scanner;

public class passwordchecker {
    public static boolean isValidPassword(String password) {

        // this will enure that the password is at least the 8 characters long
        if (password.length() < 8) {
            return false;
        }

        // initialize boolean flags to false so that when they run through the for loop
        // they will return true
        boolean containsUpperLetter = false;
        boolean containsLowerLetter = false;
        boolean containsDigit = false;

        // create for loop to check each character entered by user
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i); // by adding this to the loop it will check all characters against the if
                                          // statements below

            if (Character.isUpperCase(ch)) {
                containsUpperLetter = true;
            }

            if (Character.isLowerCase(ch)) {
                containsLowerLetter = true;
            }

            if (Character.isDigit(ch)) {
                containsDigit = true;
            }

        }
        // if everything above is true, then password is valid
        return (containsUpperLetter && containsLowerLetter && containsDigit);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Please enter your password. Your password needs to be at least 8 characters long, contain at least one uppercase letter and lowercase letter, have at least one digit:");
        String userPassword = scanner.nextLine();

        // this if statement will check that the entered password meets the
        // isvalidpassword method requirements.
        if (isValidPassword(userPassword)) {
            System.out.println("Your password is valid.");
        } else {
            System.out.println("Your password is invalid.");
        }

    }
}
