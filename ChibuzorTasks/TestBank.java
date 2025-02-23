import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.security.auth.login.AccountNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class TestBank {

    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
    }

    @Test
    public void testThatAccountIsCreated() throws AccountNotFoundException {
        int account1 = bank.createAccount("1234", 1234, 123);
        int account2 = bank.createAccount("12345", 1235, 124);
        assertNotEquals(0, account1); // Ensure account numbers are valid
        assertNotEquals(0, account2);
    }

    @Test
    public void testAddAccount() throws AccountNotFoundException {
        int pin = 1234;
        bank.createAccount("chris", pin, 1234);
        assertEquals(1, bank.getAccountSize());
    }

    @Test
    public void testRemoveAccount() throws AccountNotFoundException {
        int pin = 1234;
        int account1 = bank.createAccount("Akaabiam", pin, 1234);
        int account2 = bank.createAccount("chris", pin, 4321);
        bank.removeAccount(account1);
        assertEquals(1, bank.getAccountSize());
    }

    @Test
    public void testDeposit() throws AccountNotFoundException {
        int pin = 1234;
        int account1 = bank.createAccount("Akaabiam", pin, 1234);
        bank.depositMoney(account1, 200);
        assertEquals(200, bank.checkBalance(account1, pin));
    }

    @Test
    public void testWithdrawal() throws AccountNotFoundException {
        int pin = 4321;
        int account2 = bank.createAccount("Chris", pin, 4321);
        bank.depositMoney(account2, 200);
        bank.withdrawal(account2, 100, pin);
        assertEquals(100, bank.checkBalance(account2, pin));
    }

    @Test
    public void testCheckBalance() throws AccountNotFoundException {
        int pin = 4321;
        int account2 = bank.createAccount("Chris", pin, 4321);
        bank.depositMoney(account2, 200);
        bank.withdrawal(account2, 100, pin);
        bank.withdrawal(account2, 100, pin);
        assertEquals(0, bank.checkBalance(account2, pin));
    }

    @Test
    public void testTransfer() throws AccountNotFoundException {
        int pin1 = 1234;
        int pin2 = 4321;
        int account1 = bank.createAccount("Akaabiam", pin1, 1234);
        int account2 = bank.createAccount("Chris", pin2, 4321);
        bank.depositMoney(account1, 100);
        bank.makeTransfer(account1, account2, pin1, 100);
        assertEquals(0, bank.checkBalance(account1, pin1)); // Account1 should have 0 after transfer
        assertEquals(100, bank.checkBalance(account2, pin2)); // Account2 should have 100 after transfer
    }

    @Test
    public void testCloseAccount() throws AccountNotFoundException {
        int pin = 1234;
        int account1 = bank.createAccount("Akaabiam", pin, 1234);
        int account2 = bank.createAccount("chris", pin, 4321);
        bank.removeAccount(account1);
        assertEquals(1, bank.getAccountSize());
    }

    @Test
    public void testWithdrawalWithInsufficientFunds() throws AccountNotFoundException {
        int pin = 4321;
        int account2 = bank.createAccount("Chris", pin, 4321);
        bank.depositMoney(account2, 50);
        assertThrows(IllegalArgumentException.class, () -> {
            bank.withdrawal(account2, 100, pin);
        });
    }

    @Test
    public void testTransferToNonExistentAccount() throws AccountNotFoundException {
        int pin1 = 1234;
        int account1 = bank.createAccount("Akaabiam", pin1, 1234);
        bank.depositMoney(account1, 100);
        assertThrows(AccountNotFoundException.class, () -> {
            bank.makeTransfer(account1, 9999, pin1, 100);
        });
    }
}
