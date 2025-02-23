public class Account {
    private int accountNumber;
    private String accountName;
    private int pin;
    private double balance;

    public Account(int accountNumber, String accountName, int pin) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean pinIsCorrect(int pin) {
        return this.pin == pin;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }

}
