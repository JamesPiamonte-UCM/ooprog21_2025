public class Employee {
    private int employeeNumber;
    private double payRate;

    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_PAY_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER || employeeNumber < 1) {
            throw new IllegalArgumentException("Invalid employee number. Must be between 1 and " + MAX_EMPLOYEE_NUMBER);
        }
        if (payRate > MAX_PAY_RATE || payRate <= 0) {
            throw new IllegalArgumentException("Invalid pay rate. Must be between 0 and " + MAX_PAY_RATE);
        }
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public double calculateRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double calculateOvertimePay(double hoursWorked) {
        double overtimeHours = Math.max(hoursWorked - 40, 0);
        return overtimeHours * payRate * OVERTIME_MULTIPLIER;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }
}

