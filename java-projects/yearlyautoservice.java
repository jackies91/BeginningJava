public class yearlyautoservice {
    
    // Method to calculate the standard service charge
    public static double yearlyService() {
        return 200.0; // Standard service charge
    }

    // Method to calculate the service charge with an added oil change fee
    public static double yearlyService(double oilChangeFee) {
        return yearlyService() + oilChangeFee;
    }

    // Method to calculate the service charge with an added oil change fee and tire rotation charge
    public static double yearlyService(double oilChangeFee, double tireRotationCharge) {
        return yearlyService(oilChangeFee) + tireRotationCharge;
    }

    // Method to calculate the service charge with an added oil change fee, tire rotation charge, and coupon deduction
    public static double yearlyService(double oilChangeFee, double tireRotationCharge, double couponAmount) {
        return yearlyService(oilChangeFee, tireRotationCharge) - couponAmount;
    }

    // Main method to test the yearlyService methods
    public static void main(String[] args) {
        // Test case 1
        System.out.println("Test Case 1:");
        System.out.println("Yearly Service Charge: $" + yearlyService());
        System.out.println("Yearly Service Charge with Oil Change: $" + yearlyService(50.0));
        System.out.println("Yearly Service Charge with Oil Change and Tire Rotation: $" + yearlyService(50.0, 30.0));
        System.out.println("Yearly Service Charge with Oil Change, Tire Rotation, and Coupon Deduction: $" + yearlyService(50.0, 30.0, 20.0));

        // Test case 2
        System.out.println("\nTest Case 2:");
        System.out.println("Yearly Service Charge: $" + yearlyService());
        System.out.println("Yearly Service Charge with Oil Change: $" + yearlyService(60.0));
        System.out.println("Yearly Service Charge with Oil Change and Tire Rotation: $" + yearlyService(60.0, 40.0));
        System.out.println("Yearly Service Charge with Oil Change, Tire Rotation, and Coupon Deduction: $" + yearlyService(60.0, 40.0, 25.0));
    }
}
