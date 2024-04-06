/*Jackie Scott 2/26/24 Module 9
 * This program will create and store a 20 elements.
 * We will use the 20 elements entered by the user to calculate,
 * The highest value entered.
 * The lowest value entered.
 * The average of the values entered.
 * The sum of the values entered.
 */


//First we import java scanner to be able to accept user input.
import java.util.Scanner;

public class module9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //create our array to store 20 elements.
        int[] numbers = new int[20];

        System.out.println("Enter 20 integers for our array");

//create for loop to have the user input 20 integers for our array.
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter integer " + (i + 1) + ": "); //this will increment the print statement to add a number every time it loops.
            numbers[i] = scanner.nextInt(); //storing user input in array.

        }

        //Initialize the variables for our calculations
        int highestValue = numbers[0];
        int lowestValue = numbers[0];
        int sum = numbers[0];

        //calculate the highest value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highestValue) {
                highestValue = numbers[i];
            }
        }

        System.out.println("The highest value entered: " + highestValue);

        //calculate the lowest value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowestValue) {
                lowestValue = numbers[i];
            }
        }
        System.out.println("The lowest value entered: " + lowestValue);

        //calculate the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The Sum is: " + sum);


        //calculate the average
        double average = (double) sum / numbers.length; //adding double otherwise calculation is slightly off
        System.out.println("The Average is: " + average);





    }
}