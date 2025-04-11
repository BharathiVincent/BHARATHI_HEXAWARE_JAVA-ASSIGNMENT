package task1;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Predefined account numbers and balances
        int[] accountNumbers = {101, 102, 103, 104, 105};
        double[] balances = {5000.0, 7200.5, 3300.75, 10000.0, 850.25};

        boolean valid = false;

        // Step 2: Use while loop to keep asking until a valid account number is entered
        while (!valid) {
            System.out.print("Enter your account number: ");
            int enteredAccount = scanner.nextInt();

            // Step 3: Validate account number
            boolean found = false;
            for (int i = 0; i < accountNumbers.length; i++) {
                if (enteredAccount == accountNumbers[i]) {
                    // Step 4: If valid, display balance
                    System.out.println("Account found. Your balance is: $" + balances[i]);
                    found = true;
                    valid = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Invalid account number. Please try again.");
            }
        }

        scanner.close();
    }
}



