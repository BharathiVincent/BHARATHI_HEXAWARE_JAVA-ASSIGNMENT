package task1;
import java.util.Scanner;
public class task2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance;
        int choice;

        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your current balance: ");
        currentBalance = scanner.nextDouble();

        do {
            System.out.println("\nATM Options:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: ₹" + String.format("%.2f", currentBalance));
                    break;
                case 2:
                    System.out.print("Enter the amount you want to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount > currentBalance) {
                        System.out.println("Insufficient balance. Withdrawal failed.");
                    } else if (withdrawAmount <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else if ((int)withdrawAmount % 100 != 0 && (int)withdrawAmount % 500 != 0) {
                        System.out.println("Withdrawal amount must be in multiples of 100 or 500.");
                    } else {
                        currentBalance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Remaining balance: ₹" + String.format("%.2f", currentBalance));
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount you want to deposit: ₹");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Invalid deposit amount.");
                    } else {
                        currentBalance += depositAmount;
                        System.out.println("Deposit successful. New balance: ₹" + String.format("%.2f", currentBalance));
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

