import java.util.ArrayList;
import java.util.List;

 public class Bank {
    private String bankName;
    private long accountNumberGenerated = 200000000L;

    List<Account> accounts = new ArrayList<Account>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public long createAnAccount(String accountName, int age, int pin) {
        long accountNumber = generatedAccount();
        Account newAccount = new Account(accountNumber, accountName, age, pin);
        accounts.add(newAccount);
        return accountNumber;
    }

    private long generatedAccount() {
       return accountNumberGenerated++;
    }

}