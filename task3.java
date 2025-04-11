package task1;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask for number of customers
        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();

        // 2. Loop through each customer
        for (int i = 1; i <= numCustomers; i++) {
            System.out.println("\n--- Customer " + i + " ---");

            // 3. Take input: balance, interest rate, years
            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();

            System.out.print("Enter annual interest rate (%): ");
            double interestRate = scanner.nextDouble();

            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            // 4. Calculate future balance using compound interest
            double futureBalance = initialBalance * Math.pow((1 + interestRate / 100), years);

            // 5. Show result
            System.out.printf("Future balance after %d years: $%.2f%n", years, futureBalance);
        }

        scanner.close();
    }
}

	


