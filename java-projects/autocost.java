/*Jackie Scott 2/21/24 Module 8 
 * this program will have four methods all titled yearlyService.
 * Each method will calculate the cost of different services but will always add a standard fee of $300.
 * The second set of print statements will change the stored values used in the calculations without rewriting the initial variables.
*/

public class autocost {
    public static void main(String[] args) {
        double standardCharge = yearlyService(); // this will always return 300
        double withOil = yearlyService(75.00); // storing oil change fee as $75
        double addTires = yearlyService(75.00, 400.00); // storing oil change fee and tire rotation fee
        double minusCoupon = yearlyService(75.00, 400.00, 15.00); // storing oil change fee, tire rotation, and coupon

        System.out.println("\tTest One:");
        System.out.println("-------------------------");
        System.out.println("The standard service charge is: $" + standardCharge);
        System.out.println("If you add an oil change, your total is: $" + withOil);
        System.out.println("If you get an oil change and your tires rotated, your total is: $" + addTires);
        System.out.println(
                "If you use our $15 off coupon sent in the mail along with your oil change and tire rotation, your total is: $"
                        + minusCoupon);

        System.out.println("\n\n-------------------------\n\n");

        // instead of rewriting our variables we will call the main method and store the
        // costs for each service within the same println.
        System.out.println("\tTest Two:");
        System.out.println("-------------------------");
        System.out.println("The standard service charge is: $" + yearlyService());
        System.out.println("If you add an oil change, your total is: $" + yearlyService(50.00));
        System.out.println(
                "If you get an oil change and your tires rotated, your total is: $" + yearlyService(50.00, 500.00));
        System.out.println(
                "If you use our $15 off coupon sent in the mail along with your oil change and tire rotation, your total is: $"
                        + yearlyService(50.00, 500.00, 5));

    }

    // setting out return to always be $300 as it is the standard charge
    public static double yearlyService() {
        return 300.00;
    }

    // setting only one parameter to hold our oil change fee
    public static double yearlyService(double oil) {
        return yearlyService() + oil; // this will add whatever we set oil change fee to the $300 standard charge.
    }

    // setting two parameters to calculate our oil change fee plus tire rotation
    public static double yearlyService(double oil, double tires) {
        return yearlyService() + oil + tires;
    }

    // setting up three parameters to calculate our oil change fee + tire rotation
    // and subtract the use of a coupon
    public static double yearlyService(double oil, double tires, double coupon) {
        return yearlyService() + oil + tires - coupon;
    }

}