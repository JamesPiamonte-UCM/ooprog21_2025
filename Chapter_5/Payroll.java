import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int empNumber = scanner.nextInt();

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();
        
        System.out.print("Enter your regular pay rate? ");
        double rate = scanner.nextDouble();


        try {
            Employee employee = new Employee(empNumber, rate);

            double regularPay = employee.calculateRegularPay(hoursWorked);
            double overtimePay = employee.calculateOvertimePay(hoursWorked);

            System.out.println("\nEmployee #" + employee.getEmployeeNumber());
            System.out.printf("Regular pay is %.2f\n", regularPay);
            System.out.printf("Overtime pay is %.2f\n", overtimePay);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
