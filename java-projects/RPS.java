/*Jackie Scott 1/27/24 Module 3
 * This program is scripted to play the classic game rock, paper, scissors. 
 * The program randomly generates the number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors. 
 * Then, the program is to prompt the user to enter a value of 1, 2, or 3. 
 * Next, the program displays a clear readable message displaying both the computer’s selection, the user’s selection, and the results.
 */

/*First I will import Scanner, accept user input. Then, I will import random so that we can obtain the random number 1-3 */

import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        // create a scanner to accept user input
        Scanner scanner = new Scanner(System.in);

        // random number generate between 1-3 for our rock,paper,scissors
        int computerChoice = new Random().nextInt(3) + 1;

        // ask user for their choice for the game
        System.out.println("Enter your play using, (1 for Rock, 2 for Paper, 3 for Scissors):");
        int playerChoice = scanner.nextInt();

        // this will show the computer's pick
        System.out.print("Computer's choice: ");
        displayChoice(computerChoice);

        // Determine the winner
        determineWinner(computerChoice, playerChoice);

        // Close the scanner
        scanner.close();
    }

    // Method with a switch block vs a long if, to display the choice of Rock,
    // Paper, or Scissors
    public static void displayChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissors");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // compare the computer and player choice to determine winner or a tie
    public static void determineWinner(int computerChoice, int playerChoice) {
        if (computerChoice == playerChoice) {
            System.out.println("It's a tie!");
        } else if ((computerChoice == 1 && playerChoice == 3) ||
                (computerChoice == 2 && playerChoice == 1) ||
                (computerChoice == 3 && playerChoice == 2)) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("You win!");
        }
    }
}
