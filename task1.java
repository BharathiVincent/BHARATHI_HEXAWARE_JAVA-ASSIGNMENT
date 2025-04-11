package task1;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking credit score input
        System.out.print("Enter the customer's credit score: ");
        int creditScore = scanner.nextInt();

        // Taking annual income input
        System.out.print("Enter the customer's annual income in dollars: ");
        double annualIncome = scanner.nextDouble();

        // Step 2 & 3: Check eligibility using if-else and display message
        if (creditScore > 700 && annualIncome >= 50000) {
            System.out.println("The customer is eligible for a loan.");
        } else {
            System.out.println("The customer is not eligible for a loan.");
        }

        // Close the scanner
        scanner.close();
    }
}
