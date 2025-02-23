import java.security.SecureRandom;
import java.util.Scanner;
import javax.security.auth.login.AccountNotFoundException;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Update Pin");
            System.out.println("7. Close Account");
            System.out.println("8. Exit");
            option = scanner.nextLine();

            try {
                switch (option) {
                    case "1":
                        SecureRandom random = new SecureRandom();
                        int accountNumber = random.nextInt(1000, 9999);
                        System.out.println("Enter account name:");
                        String accountName = scanner.nextLine();
                        System.out.println("Enter pin:");
                        int pin = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        bank.createAccount(accountName, pin, accountNumber);
                        System.out.println("Account created successfully. Account Number: " + accountNumber);
                        break;

                    case "2":
                        System.out.println("Enter account number:");
                        int depositAccountNumber = scanner.nextInt();
                        System.out.println("Enter amount to deposit:");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline
                        bank.depositMoney(depositAccountNumber, depositAmount);
                        System.out.printf("%.2f Deposited successfully%n", depositAmount);
                        break;

                    case "3":
                        System.out.println("Enter account number:");
                        int withdrawAccountNumber = scanner.nextInt();
                        System.out.println("Enter amount to withdraw:");
                        double withdrawAmount = scanner.nextDouble();
                        System.out.println("Enter pin:");
                        int withdrawPin = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        bank.withdrawal(withdrawAccountNumber, withdrawAmount, withdrawPin);
                        System.out.printf("%.2f Withdrawn successfully%n", withdrawAmount);
                        break;

                    case "4":
                        System.out.println("Enter sender's account number:");
                        int senderAccountNumber = scanner.nextInt();
                        System.out.println("Enter receiver's account number:");
                        int receiverAccountNumber = scanner.nextInt();
                        System.out.println("Enter sender's pin:");
                        int senderPin = scanner.nextInt();
                        System.out.println("Enter amount to transfer:");
                        double transferAmount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline
                        bank.makeTransfer(senderAccountNumber, receiverAccountNumber, senderPin, transferAmount);
                        System.out.printf("%.2f Transferred successfully%n", transferAmount);
                        break;

                    case "5":
                        System.out.println("Enter account number:");
                        int balanceAccountNumber = scanner.nextInt();
                        System.out.println("Enter pin:");
                        int balancePin = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        double balance = bank.checkBalance(balanceAccountNumber, balancePin);
                        System.out.printf("Account balance: %.2f%n", balance);
                        break;

                    case "6":
                        System.out.println("Enter account number:");
                        int updateAccountNumber = scanner.nextInt();
                        System.out.println("Enter current pin:");
                        int currentPin = scanner.nextInt();
                        System.out.println("Enter new pin:");
                        int newPin = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        // Assuming you have a method to update pin
                        // bank.updatePin(updateAccountNumber, currentPin, newPin);
                        System.out.println("Pin updated successfully.");
                        break;

                    case "7":
                        System.out.println("Enter account number:");
                        int closeAccountNumber = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        bank.removeAccount(closeAccountNumber);
                        System.out.println("Account closed successfully.");
                        break;

                    case "8":
                        System.out.println("Exiting the application.");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } catch (AccountNotFoundException e) {
                System.err.println("Error: " + e.getMessage());
            } catch (SecurityException e) {
                System.err.println("Error: Incorrect PIN.");
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        } while (!option.equals("8"));
        scanner.close();
    }
}