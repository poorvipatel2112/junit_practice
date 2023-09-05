public class BankAccount {
    private String fName;
    private String lName;
    private double balance;

    public BankAccount(String fName, String lName, double balance) {
        this.fName = fName;
        this.lName = lName;
        this.balance = balance;
    }

    public double deposit(double amount , boolean branch){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount,boolean branch){
        balance -= amount;
        return balance;
    }

    public double balance(){
        return balance;
    }
}
