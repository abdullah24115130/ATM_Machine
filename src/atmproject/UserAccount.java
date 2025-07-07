package atmproject;

public class UserAccount {

    private int pin = 2001;
    private double balance = 1000.37;

    //// Method to verify if the user has entered the correct PIN.
    public boolean chakpin(int enteredPin) {
        return enteredPin == pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("It's not posible.Tray aggine");
        }

    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

}
