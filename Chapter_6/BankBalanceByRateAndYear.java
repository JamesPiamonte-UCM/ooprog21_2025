import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();
        
        double[] interestRates = {0.02, 0.03, 0.04, 0.05};

        for (int i = 0; i < interestRates.length; i++) {
            double rate = interestRates[i];
            double newBalance = balance;

            System.out.println();
            System.out.println("With an initial balance of $" + balance + 
                               " at an interest rate of " + rate);

            for (int year = 1; year <= 4; year++) {
                newBalance = newBalance * (1 + rate);
                System.out.printf("After year %d balance is $%.4f%n", year, newBalance);
            }
        }

        input.close();
    }
}
