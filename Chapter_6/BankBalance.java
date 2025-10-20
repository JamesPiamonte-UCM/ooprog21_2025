import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double balance;
        final double INTEREST_RATE = 0.03;
        int choice;
        int year = 1;
        
        // Input initial balance
        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();
        
        // Loop to calculate yearly balance
        System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
        choice = input.nextInt();
        
        while (choice == 1) {
            balance = balance + (balance * INTEREST_RATE);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f\n", year, INTEREST_RATE, balance);
            year++;
            
            System.out.print("\nDo you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
        }
        
        System.out.println("\n---- jGRASP: Operation complete.");
        
        input.close();
    }
}