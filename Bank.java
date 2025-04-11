package task1.task7;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Customer
        System.out.println("Enter Customer Details:");
        System.out.print("Customer ID: ");
        int custId = scanner.nextInt(); scanner.nextLine();
        System.out.print("First Name: ");
        String fName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lName = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(custId, fName, lName, email, phone, address);

        // Create Account
        System.out.println("\nEnter Account Details:");
        System.out.print("Account Number: ");
        int accNumber = scanner.nextInt(); scanner.nextLine();
        System.out.print("Account Type (Savings/Current): ");
        String accType = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double balance = scanner.nextDouble();

        Account account = new Account(accNumber, accType, balance);

        boolean running = true;

        while (running) {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Calculate Interest");
            System.out.println("4. View Customer Info");
            System.out.println("5. View Account Info");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    account.withdraw(withdraw);
                    break;
                case 3:
                    account.calculateInterest();
                    break;
                case 4:
                    customer.printCustomerInfo();
                    break;
                case 5:
                    account.printAccountInfo();
                    break;
                case 6:
                    running = false;
                    System.out.println("Thank you for using the bank system.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
