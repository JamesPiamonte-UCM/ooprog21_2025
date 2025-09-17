public class DemoGrossPay {
    public static final double HOURLY_RATE = 22.75;

    public static void calculateGross(double hoursWorked) {
        double grossPay = hoursWorked * HOURLY_RATE;
        System.out.println(hoursWorked 
                                      + " hours at $" 
                                      + HOURLY_RATE 
                                      + " per hour is $" 
                                      + grossPay);
    }

    public static void main(String[] args) {
        calculateGross(10.0);
        calculateGross(25.0);
        calculateGross(37.5);
    }
}
