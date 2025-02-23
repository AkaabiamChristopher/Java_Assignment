import java.util.ArrayList;
import java.util.List;
import javax.security.auth.login.AccountNotFoundException;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public int createAccount(String accountName, int pin, int accountNumber) {
        Account account = new Account(accountNumber, accountName, pin);
        accounts.add(account);
        return account.getAccountNumber();
    }

    public void removeAccount(int accountNumber) throws AccountNotFoundException {
        Account account = findAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
        } else {
            throw new AccountNotFoundException("Account not found.");
        }
    }

    public void depositMoney(int accountNumber, double amount) throws AccountNotFoundException {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            throw new AccountNotFoundException("Account not found.");
        }
    }

    public void withdrawal(int accountNumber, double amount, int pin) throws AccountNotFoundException, SecurityException {
        Account account = findAccount(accountNumber);
        if (account != null && account.pinIsCorrect(pin)) {
            account.withdrawal(amount);
        } else if (account == null) {
            throw new AccountNotFoundException("Account not found.");
        } else {
            throw new SecurityException("Incorrect PIN.");
        }
    }

    public double checkBalance(int accountNumber, int pin) throws AccountNotFoundException, SecurityException {
        Account account = findAccount(accountNumber);
        if (account != null && account.pinIsCorrect(pin)) {
            return account.checkBalance();
        } else if (account == null) {
            throw new AccountNotFoundException("Account not found.");
        } else {
            throw new SecurityException("Incorrect PIN.");
        }
    }

    public void makeTransfer(int senderAccountNumber, int receiverAccountNumber, int senderPin, double amount) throws AccountNotFoundException, SecurityException {
        Account sender = findAccount(senderAccountNumber);
        Account receiver = findAccount(receiverAccountNumber);
        if (sender == null || receiver == null) {
            throw new AccountNotFoundException("One or both accounts not found.");
        }
        if (!sender.pinIsCorrect(senderPin)) {
            throw new SecurityException("Incorrect PIN for sender account.");
        }
        sender.withdrawal(amount);
        receiver.deposit(amount);
    }

    public int getAccountSize() {
        return accounts.size();
    }

    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
