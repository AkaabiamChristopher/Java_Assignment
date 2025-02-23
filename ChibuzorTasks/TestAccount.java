import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestAccount {

    @Test
    public void testAccountIsCreated() {
        Account account = new Account(1886246919,"Akaabiam",1234);


    }
    @Test
    public void testCheckBalance(){
        Account account = new Account(1886246919,"Akaabiam",1234);
        account.checkBalance();
        assertEquals(0,account.checkBalance());
    }
    @Test
    public void testdeposit(){
        Account account = new Account(1886246919,"Akaabiam",1234);
        account.deposit(1000);
        assertEquals(1000,account.checkBalance());
    }
    @Test
    public void testwithdraw(){
        Account account = new Account(1886246919,"Akaabiam",1234);
        account.deposit(2000);
        account.withdrawal (200);
        assertEquals(1800,account.checkBalance());
    }
   // @Test
    //public void testupdatePin() {
      //  Account account = new Account(1886246991, "Akaabiam", 1234);
        //boolean newPin = account.updatePin(1234, 2314);
       // assertTrue(newPin);

    }

