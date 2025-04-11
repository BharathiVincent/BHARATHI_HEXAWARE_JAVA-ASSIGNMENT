package task1;
import java.util.ArrayList;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> transactions = new ArrayList<>();
        boolean running = true;

        System.out.println("Welcome to the Bank Transaction System!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit and view transaction history");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    transactions.add("Deposited: $" + deposit);
                    System.out.println("Deposit successful.");
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawal = scanner.nextDouble();
                    transactions.add("Withdrew: $" + withdrawal);
                    System.out.println("Withdrawal successful.");
                    break;

                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }

        // Display transaction history
        System.out.println("\n--- Transaction History ---");
        if (transactions.isEmpty()) {
            System.out.println("No transactions performed.");
        } else {
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }

        scanner.close();
    }
}


