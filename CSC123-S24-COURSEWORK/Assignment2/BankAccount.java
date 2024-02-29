
public class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    private double balance;
    private boolean isOpen;

    public BankAccount(String ownerFirstName, String ownerLastName, double initialDepositAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.balance = initialDepositAmount;
        this.isOpen = true;
    }
    
    public boolean deposit(double amount) {
        if (isOpen && amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (isOpen && amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void close() {
        isOpen = false;
    }

    public String getOwnerFullName() {
        return ownerFirstName + " " + ownerLastName;
    }

    public double viewBalance() {
        if (isOpen) {
            return balance;
        }
        return 0.0;
    }

    public void viewAccountStatement() {
        if (isOpen) {
            System.out.println("Account Holder: " + getOwnerFullName());
            System.out.println("Balance: $" + viewBalance());
        } else {
            System.out.println("Account is closed.");
        }
    }
}

