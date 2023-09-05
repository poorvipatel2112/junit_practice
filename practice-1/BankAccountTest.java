import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("poorvi" , "patel" , 2000.00);
        double balance = account.deposit(500.00, true);
        assertEquals(2500.00, balance ,0);
        assertEquals(2500.00 , account.balance(),0);
    }

    @org.junit.Test
    public void withdraw() {
        BankAccount account = new BankAccount("poorvi", "lodhi" , 1000.00);
        double balance = account.withdraw(200.00,true);
        assertEquals(800.00 , balance , 0);
    }

    @org.junit.Test
    public void balance() {
        BankAccount account = new BankAccount("poorvi" , "patel" , 2000.00);
        account.deposit(500.00, true);
        assertEquals(2500.00 , account.balance(),0);
    }

}