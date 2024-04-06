/*Jackie Scott 1/19/24 Module 2
*This program will calculate the engery needed to heat water from an initial temperature, inputed by user, to a final temperature. 
*First I will import Scanner so that we can accept user input needed for our calculations to store in variables
*/

import java.util.Scanner;

public class module2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create variables to store all the user input when we use Scanner, defining
        // the variables as a double will also help ensure only numbers are entered.
        double waterMassKG, initalTemp, finalTemp, energyNeed;

        System.out.print("Enter the amount of water in kilograms: ");
        // the next double waits for user to enter a valid double value before moving on
        // to the next line of code
        waterMassKG = input.nextDouble();
        System.out.print("Enter the inital temperature in celsius: ");
        initalTemp = input.nextDouble();
        System.out.print("Enter the final temperature, in celsius, that you would to achieve: ");
        finalTemp = input.nextDouble();

        energyNeed = waterMassKG * (finalTemp - initalTemp) * 4184;

        System.out.println("The engergy needed to achieve your final temperature is " + energyNeed + " joules");

    }

}