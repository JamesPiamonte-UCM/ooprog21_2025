import java.util.Scanner;

public class ForexExchangeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
        double[][] rates = new double[currencies.length][5];

        System.out.println("Enter exchange rates against PHP for each currency from Day 1 to Day 5:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);
            for (int j = 0; j < 5; j++) {
                System.out.print("Rate on Nov " + (j + 1) + ": ");
                rates[i][j] = scanner.nextDouble();
            }
        }
        
        System.out.println("\n==================== FOREX SUMMARY (Nov 1 - Nov 5) =====================");
        System.out.printf("%-8s", "Currency");
        for (int d = 1; d <= 5; d++) {
            System.out.printf(" Nov%d  ", d);
        }
        System.out.printf("Peak   Lowest\n");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < currencies.length; i++) {
            System.out.printf("%-8s", currencies[i]);
            double peak = rates[i][0];
            double lowest = rates[i][0];
            for (int j = 0; j < 5; j++) {
                System.out.printf(" %.2f  ", rates[i][j]);
                if (rates[i][j] > peak) peak = rates[i][j];
                if (rates[i][j] < lowest) lowest = rates[i][j];
            }
            System.out.printf("%.2f   %.2f\n", peak, lowest);
        }

        System.out.println("\n=== DAILY CHANGES (Comparison From Previous Day) ===");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);
            for (int j = 1; j < 5; j++) {
                System.out.print("Nov " + j + " -> Nov " + (j + 1) + ": ");
                if (rates[i][j] > rates[i][j - 1]) {
                    System.out.printf("+ %.2f\n", rates[i][j] - rates[i][j - 1]);
                } else if (rates[i][j] < rates[i][j - 1]) {
                    System.out.printf("- %.2f\n", rates[i][j - 1] - rates[i][j]);
                } else {
                    System.out.println("No Change");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
