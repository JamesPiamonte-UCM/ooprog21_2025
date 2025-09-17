public class DemoGrossPay {

    // Define the standard hourly rate as a constant
    public static final double HOURLY_RATE = 22.75;

    // Method to calculate and display gross pay
    public static void calculateGross(double hoursWorked) {
        double grossPay = hoursWorked * HOURLY_RATE;
        System.out.println(hoursWorked + " hours at $" 
                           + HOURLY_RATE + " per hour is $" + grossPay);
    }

    // Main method
    public static void main(String[] args) {
        // Call calculateGross with different hours worked
        calculateGross(10.0);
        calculateGross(25.0);
        calculateGross(37.5);
    }
}
