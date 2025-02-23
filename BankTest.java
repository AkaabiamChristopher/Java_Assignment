import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    public void testThatAnAccountIsCreated() {
        Bank bank = new Bank("Uba Bank");
        Account account = new Account(100000001, "Chris", 25, 1234);
        bank.createAnAccount("Chris", 25, 2341);
        assertNotNull(account, "Account created");
    }
    @Test
   public void testThatMoneyIsDeposited() {
        Account account = new Account(100000001, "Chris", 25, 1234);
        account.deposit(5000);
        account.balance();
        assertEquals(5000,account.balance());
    }
    @Test
    public void testThatMoneyIsWithdrawn() {
        Account account = new Account(100000001, "Chris", 25, 1234);
        account.deposit(5000);
        account.withdraw(2000);
       assertEquals(3000,account.balance());




    }
}
