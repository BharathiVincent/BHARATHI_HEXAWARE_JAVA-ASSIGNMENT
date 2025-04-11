package task1;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a password
        System.out.print("Create a password for your bank account: ");
        String password = scanner.nextLine();

        boolean hasUppercase = false;
        boolean hasDigit = false;

        // Check if password length is at least 8 characters
        if (password.length() >= 8) {
            // Loop through characters to check for uppercase and digit
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUppercase = true;
                }

                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }

            // Final validation
            if (hasUppercase && hasDigit) {
                System.out.println("Password is valid!");
            } else {
                if (!hasUppercase) {
                    System.out.println("Invalid password: Must contain at least one uppercase letter.");
                }
                if (!hasDigit) {
                    System.out.println("Invalid password: Must contain at least one digit.");
                }
            }

        } else {
            System.out.println("Invalid password: Must be at least 8 characters long.");
        }

        scanner.close();
    }
}



